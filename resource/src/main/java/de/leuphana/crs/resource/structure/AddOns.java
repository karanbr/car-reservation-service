package de.leuphana.crs.resource.structure;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class AddOns {

    private List<AddOnType> addOns;

    public AddOns(AddOnType... addOns) {
        this.addOns = Arrays.asList(addOns);
    }

    public Double addOnsAdditionalCostPerDay() {
        double extraPrice = 0D;
        for (AddOnType addOnType : addOns) {
            if (addOnType.equals(AddOnType.CHILD_SEAT)) extraPrice += 15D;
            if (addOnType.equals(AddOnType.SET_TOP_BOX)) extraPrice += 25D;
            if (addOnType.equals(AddOnType.TRAILER_HITCH)) extraPrice += 30D;
        }
        return extraPrice;
    }

}
