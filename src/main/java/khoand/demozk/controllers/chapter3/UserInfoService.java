package khoand.demozk.controllers.chapter3;

/**
 * Created by quantri on 07/02/2018.
 */
public interface UserInfoService {
    User findUser(String account);

    void updateUser(User user);
}
