package khoand.demozk.controllers.chapter3.mvvm;

import khoand.demozk.controllers.chapter3.*;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.util.Clients;

import java.io.Serializable;
import java.util.List;

public class ProfileViewModel implements Serializable {
    //service
    AuthenticationService authService = new AuthenticationServiceChapter3Impl();
    UserInfoService userInfoService = new UserInfoServiceChapter3Impl();
    //data for view
    User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }
    public List<String> getCountryList(){
        return CommonInfoService.getCountryList();
    }
    @Init//annotation init method
    public void init(){
        UserCredential cre = authService.getUserCredential();
        currentUser = userInfoService.findUser(cre.getAccount());
        if(currentUser == null){
            return;
        }
    }
    @Command
    @NotifyChange("currentUser")
    public void save(){
        currentUser = userInfoService.updateUser(currentUser);
        Clients.showNotification("Your profile is updated");
    }
    @Command
    @NotifyChange("currentUser")
    public void reload(){
        UserCredential cre = authService.getUserCredential();
        currentUser = userInfoService.findUser(cre.getAccount());
    }
}
