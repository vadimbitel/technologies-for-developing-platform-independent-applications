package eu.senla.JavaLaboratory3.entities;

import lombok.Data;

@Data
public abstract class Product {
    public enum ProductClasses {
        FOOD,
        DRUGS,
        CLOTHES
    }

    private ProductClasses productType;

    private double weight;

    private int occupiedSlots;

    private double price;

    public Product() {

    }

    public Product(ProductClasses type, double weight, int occupiedSlots, double price) {
        this.productType = type;
        this.weight = weight;
        this.occupiedSlots = occupiedSlots;
        this.price = price;
    }
}