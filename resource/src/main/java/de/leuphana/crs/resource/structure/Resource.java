package de.leuphana.crs.resource.structure;

import lombok.Data;

import java.util.List;

@Data
public abstract class Resource {

    private Car car;
    private List<?> addOns;

    abstract Double returnPricePerDay();

}
