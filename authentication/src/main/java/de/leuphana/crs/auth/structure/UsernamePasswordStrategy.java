package de.leuphana.crs.auth.structure;

public class UsernamePasswordStrategy implements Authenticator {

    private Credentials credentials;

    public UsernamePasswordStrategy(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public Boolean authenticate(Credentials credentialsToValidate) {
        return this.credentials.getUsername().equals(credentialsToValidate.getUsername()) &&
                this.credentials.getPassword().equals(credentialsToValidate.getPassword());
    }
}
