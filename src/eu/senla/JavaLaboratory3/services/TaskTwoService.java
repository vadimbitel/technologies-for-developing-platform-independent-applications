package eu.senla.JavaLaboratory3.services;

import eu.senla.JavaLaboratory3.context.Context;
import eu.senla.JavaLaboratory3.entities.*;

public class TaskTwoService {
    public static void fillStorage() {

        int slots;
        while (Context.storage.getAmountOfSlots() > 0) {
            slots = Math.min(Context.random.nextInt(10), Context.storage.getAmountOfSlots());
            switch (Context.random.nextInt(3)) {
                case 0 -> Context.storage.getProducts().add(new Food(Context.random.nextDouble() * 100.0, slots,
                        Context.random.nextDouble() * 100.0, Context.random.nextInt(365),
                        Context.random.nextInt(50)));
                case 1 -> Context.storage.getProducts().add(new Drugs(Context.random.nextDouble() * 100.0, slots,
                        Context.random.nextDouble() * 100.0,
                        Drugs.TypesOfDrugs.values()[Context.random.nextInt(4)]));
                case 2 -> Context.storage.getProducts().add(new Clothes(Context.random.nextDouble() * 100.0, slots,
                        Context.random.nextDouble() * 100.0,
                        Clothes.TypesOfClothing.values()[Context.random.nextInt(2)]));
            }
            Context.storage.setAmountOfSlots(Context.storage.getAmountOfSlots() - slots);
        }
    }

    public static double getWeightOfStoredItem() {
        double weight = 0;
        for (Product product : Context.storage.getProducts()) {
            weight += product.getWeight();
        }
        return weight;
    }

    public static void clearStorage(){
        Context.storage.setAmountOfSlots(100);
        Context.storage.getProducts().clear();
    }
}
