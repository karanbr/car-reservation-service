package de.leuphana.crs.auth.behavior;

import de.leuphana.crs.auth.structure.Authenticator;
import de.leuphana.crs.auth.structure.Credentials;

public interface AuthenticationService {

    Boolean authenticateSubject(Credentials credentials);
    Boolean authenticateSubjectWithUsernameAndPassword();
    void setAuthenticator(Authenticator authenticator);
}
