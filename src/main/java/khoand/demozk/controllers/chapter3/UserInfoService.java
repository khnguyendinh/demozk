package khoand.demozk.controllers.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quantri on 07/02/2018.
 */
public interface UserInfoService {
    List<User> userList = new ArrayList<User>();
    User findUser(String account);

    void updateUser(User user);

    boolean addUser(User user);
    List<User> getUserList();
}
