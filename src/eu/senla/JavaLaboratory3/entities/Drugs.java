package eu.senla.JavaLaboratory3.entities;

import lombok.Data;

@Data
public class Drugs extends Product {
    public enum TypesOfDrugs {
        ointment,
        syrup,
        pills,
        capsules
    }

    private TypesOfDrugs drugsType;

    public Drugs(double weight, int occupiedSlots, double price, TypesOfDrugs type) {
        super(ProductClasses.DRUGS, weight, occupiedSlots, price);
        this.drugsType = type;
    }
}
