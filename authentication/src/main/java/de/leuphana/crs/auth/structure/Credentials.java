package de.leuphana.crs.auth.structure;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Credentials {

    private String username;
    private String password;
}
