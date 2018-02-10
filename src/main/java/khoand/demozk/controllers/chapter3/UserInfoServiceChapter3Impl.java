package khoand.demozk.controllers.chapter3;

import java.util.Date;
import java.util.List;

/**
 * Created by quantri on 07/02/2018.
 */
public class UserInfoServiceChapter3Impl implements UserInfoService {
    public User findUser(String account) {
//        User user1 = new User();
//        user.setfName("khoa");
//        user.setBio("bio");
//        user.setBirthday(new Date());
//        user.setCountry("Viet nammm");
//        user.setEmail("khnguyendinh@gmail.com");
//        user.setfName("nguyen dinh khoa");
        if(userList.size() == 0){
            return null;
        }
        for (User user: userList ) {
            if(user.getFullName() != null && user.getFullName().equals(account)){
                return user;
            }
        }
        return null;
    }

    public void updateUser(User user) {
        for (User user1: userList ) {
            if(user1.getFullName() != null && user1.getFullName().equals(user.getFullName())){
                userList.remove(user1);
                userList.add(user);
                return;
            }
        }
    }

    public boolean addUser(User user) {
        for (User user1: userList ) {
            if(user1.getFullName() != null && user1.getFullName().equals(user.getFullName())){
                return false;
            }
        }
        userList.add(user);
        return true;
    }

    public List<User> getUserList() {
        return userList;
    }

}
