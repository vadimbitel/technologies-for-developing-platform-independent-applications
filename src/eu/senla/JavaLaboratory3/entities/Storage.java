package eu.senla.JavaLaboratory3.entities;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Storage {
    ArrayList<Product> products;

    private int amountOfSlots;

    public Storage(ArrayList<Product> products, int amountOfSlots) {
        this.products = products;
        this.amountOfSlots = amountOfSlots;
    }
}
