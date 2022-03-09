package de.leuphana.crs.resource.bahavior;

import de.leuphana.crs.resource.structure.AddOns;
import de.leuphana.crs.resource.structure.Car;

public class ResourceServiceImpl implements ResourceService{

    @Override
    public Double getTotalPricePerDay(Car car, AddOns addOns) {
        return car.getBasePricePerDay() + addOns.addOnsAdditionalCostPerDay();
    }
}
