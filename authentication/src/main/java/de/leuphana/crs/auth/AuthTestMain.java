package de.leuphana.crs.auth;

import de.leuphana.crs.auth.behavior.AuthenticationService;
import de.leuphana.crs.auth.behavior.AuthenticationServiceImpl;
import de.leuphana.crs.auth.structure.Credentials;
import de.leuphana.crs.auth.structure.UsernamePasswordStrategy;

public class AuthTestMain {

    public static void main(String[] args) {

        AuthenticationService authService = new AuthenticationServiceImpl();
        authService.setAuthenticator(new UsernamePasswordStrategy(new Credentials("Hans", "1234")));
        boolean success = authService.authenticateSubject(new Credentials("Hans", "1234"));
        System.out.println(success);
    }

}
