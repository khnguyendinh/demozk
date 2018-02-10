package khoand.demozk.controllers.chapter3;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.*;

import java.util.Set;

/**
 * Created by quantri on 07/02/2018.
 */
public class ProfileViewController extends SelectorComposer<Component>{
    //wire components
    @Wire
    Label account;
    @Wire
    Textbox fullName;
    @Wire
    Textbox email;
    @Wire
    Datebox birthday;
    @Wire
    Listbox country;
    @Wire
    Textbox bio;
    //services
    AuthenticationService authService = new AuthenticationServiceChapter3Impl();
    UserInfoService userInfoService = new UserInfoServiceChapter3Impl();

    @Override
    public void doAfterCompose(Component comp) throws Exception{
        super.doAfterCompose(comp);

        ListModelList<String> countryModel = new ListModelList<String>(CommonInfoService.getCountryList());
        System.out.println("size "+countryModel.size());
        country.setModel(countryModel);
//        clearInput();
    }
    private void refreshProfileView() {
        UserCredential cre = authService.getUserCredential();
        if(userInfoService.getUserList().size() > 0){
            cre.setfName(userInfoService.getUserList().get(userInfoService.getUserList().size() - 1).getFullName());
        }
        User user = userInfoService.findUser(cre.getfName());
        if(user==null){
            return;
        }
        System.out.println("user "+user.toString());
        //apply bean value to UI components
//        account.setValue(user.getAccount());
        fullName.setValue(user.getFullName());
        email.setValue(user.getEmail());
        birthday.setValue(user.getBirthday());
        bio.setValue(user.getBio());

        ((ListModelList)country.getModel()).addToSelection(user.getCountry());
    }
    @Listen("onClick=#saveProfile")
    public void doSaveProfile(){
        UserCredential cre = authService.getUserCredential();
        cre.setfName(fullName.getValue());
        User user = new User();


        //apply component value to bean
        user.setFullName(fullName.getValue());
        user.setEmail(email.getValue());
        user.setBirthday(birthday.getValue());
        user.setBio(bio.getValue());

        Set<String> selection = ((ListModelList)country.getModel()).getSelection();
        if(!selection.isEmpty()){
            user.setCountry(selection.iterator().next());
        }else{
            user.setCountry(null);
        }
        if(userInfoService.findUser(cre.getfName()) == null){
            userInfoService.addUser(user);
            Clients.showNotification("You add one Profile");
        }else{
            userInfoService.updateUser(user);
            Clients.showNotification("Your profile is updated");
        }
        clearInput();
    }
    @Listen("onClick=#reloadProfile")
    public void doReloadProfile(){
        refreshProfileView();
    }
    void clearInput(){
        fullName.setValue("");
        email.setValue("");
        country.clearSelection();
        bio.setValue("");
        birthday.setText(null);
    }
}
