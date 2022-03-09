package de.leuphana.crs.booking.structure;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Head {

    private final String name;
    private final String address;
    private final String email;

    public Head(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "name: " + name + '\n' +
                "address: " + address + '\n' +
                "email: " + email + '\n';
    }
}
