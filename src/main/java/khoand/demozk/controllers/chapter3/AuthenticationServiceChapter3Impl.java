package khoand.demozk.controllers.chapter3;

/**
 * Created by quantri on 07/02/2018.
 */
public class AuthenticationServiceChapter3Impl implements AuthenticationService {
    UserCredential userCredential = new UserCredential();

    public UserCredential getUserCredential() {
        return userCredential;
    }
}
