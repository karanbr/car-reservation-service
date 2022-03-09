package de.leuphana.crs.resource.structure;

import lombok.Data;

@Data
public class Car {

    private CarType carType;
    private Double basePricePerDay;

    public Car(CarType carType) {
        this.carType = carType;

        if (carType.equals(CarType.SMALL)) basePricePerDay = 70D;
        else if (carType.equals(CarType.SEDAN)) basePricePerDay = 100D;
        else if (carType.equals(CarType.ESTATE)) basePricePerDay = 110D;
        else if (carType.equals(CarType.CONVERTIBLE)) basePricePerDay = 120D;
        else if (carType.equals(CarType.MINIVAN)) basePricePerDay = 140D;
        else if (carType.equals(CarType.SUV)) basePricePerDay = 180D;
        else if (carType.equals(CarType.LUXURY)) basePricePerDay = 250D;
    }
}
