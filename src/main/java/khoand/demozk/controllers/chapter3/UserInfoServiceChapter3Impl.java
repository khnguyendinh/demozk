package khoand.demozk.controllers.chapter3;

import java.util.Date;

/**
 * Created by quantri on 07/02/2018.
 */
public class UserInfoServiceChapter3Impl implements UserInfoService {
    public User findUser(String account) {
        User user = new User();
        user.setAccount("khoa");
        user.setBio("bio");
        user.setBirthday(new Date());
        user.setCountry("Viet nammm");
        user.setEmail("khnguyendinh@gmail.com");
        user.setFullName("nguyen dinh khoa");
        return user;
    }

    public void updateUser(User user) {

    }
}
