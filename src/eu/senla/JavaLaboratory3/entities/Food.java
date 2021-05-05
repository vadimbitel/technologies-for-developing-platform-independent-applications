package eu.senla.JavaLaboratory3.entities;

import lombok.Data;

@Data
public class Food extends Product {
    private int shelfLife;

    private int numberOfKilocalories;

    public Food(double weight, int occupiedSlots, double price, int shelfLife, int numberOfKilocalories) {
        super(ProductClasses.FOOD, weight, occupiedSlots, price);
        this.shelfLife = shelfLife;
        this.numberOfKilocalories = numberOfKilocalories;
    }
}
