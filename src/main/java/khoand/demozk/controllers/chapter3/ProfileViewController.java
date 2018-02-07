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
        country.setModel(countryModel);

        refreshProfileView();
    }
    private void refreshProfileView() {
        UserCredential cre = authService.getUserCredential();
        User user = userInfoService.findUser(cre.getAccount());
        if(user==null){
            //TODO handle un-authenticated access
            return;
        }

        //apply bean value to UI components
        account.setValue(user.getAccount());
        fullName.setValue(user.getFullName());
        email.setValue(user.getEmail());
        birthday.setValue(user.getBirthday());
        bio.setValue(user.getBio());

        ((ListModelList)country.getModel()).addToSelection(user.getCountry());
    }
    @Listen("onClick=#saveProfile")
    public void doSaveProfile(){
        UserCredential cre = authService.getUserCredential();
        User user = userInfoService.findUser(cre.getAccount());
        if(user==null){
            //TODO handle un-authenticated access
            return;
        }

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

        userInfoService.updateUser(user);

        Clients.showNotification("Your profile is updated");
    }
    @Listen("onClick=#reloadProfile")
    public void doReloadProfile(){
        refreshProfileView();
    }
}
