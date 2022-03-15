package de.leuphana.crs.auth.structure;

public interface Authenticator {

    Boolean authenticate(Credentials credentials);

}
