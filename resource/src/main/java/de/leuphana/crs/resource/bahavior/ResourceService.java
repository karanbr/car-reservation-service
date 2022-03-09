package de.leuphana.crs.resource.bahavior;

import de.leuphana.crs.resource.structure.AddOns;
import de.leuphana.crs.resource.structure.Car;

public interface ResourceService {

    Double getTotalPricePerDay(Car car, AddOns addOns);
}
