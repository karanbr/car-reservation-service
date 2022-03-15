package de.leuphana.crs.auth.behavior;

import de.leuphana.crs.auth.structure.Authenticator;
import de.leuphana.crs.auth.structure.Credentials;

public class AuthenticationServiceImpl implements AuthenticationService{

    private Authenticator authenticator;

    @Override
    public Boolean authenticateSubject(Credentials credentials) {
        return authenticator.authenticate(credentials);
    }

    @Override
    public Boolean authenticateSubjectWithUsernameAndPassword() {
        return null;
    }

    @Override
    public void setAuthenticator(Authenticator authenticator) {
       this.authenticator = authenticator;
    }
}
