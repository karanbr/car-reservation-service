package de.leuphana.crs.resource;

import de.leuphana.crs.resource.bahavior.ResourceService;
import de.leuphana.crs.resource.bahavior.ResourceServiceImpl;
import de.leuphana.crs.resource.structure.AddOnType;
import de.leuphana.crs.resource.structure.AddOns;
import de.leuphana.crs.resource.structure.Car;
import de.leuphana.crs.resource.structure.CarType;

public class ResourceTest {

    public static void main(String[] args) {
        ResourceService resourceService = new ResourceServiceImpl();
        System.out.println(resourceService.getTotalPricePerDay(
                new Car(CarType.SUV),
                new AddOns(AddOnType.CHILD_SEAT, AddOnType.TRAILER_HITCH)
        ));
    }
}
