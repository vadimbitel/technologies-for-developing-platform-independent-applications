package eu.senla.JavaLaboratory3.entities;

import lombok.Data;

@Data
public class Clothes extends Product {
    public enum TypesOfClothing {
        outerwear,
        underwear
    }

    private TypesOfClothing type;

    public Clothes(double weight, int occupiedSlots, double price, TypesOfClothing type) {
        super(ProductClasses.CLOTHES, weight, occupiedSlots, price);
        this.type = type;
    }
}