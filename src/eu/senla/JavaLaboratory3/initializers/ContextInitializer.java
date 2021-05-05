package eu.senla.JavaLaboratory3.initializers;

import eu.senla.JavaLaboratory3.context.Context;
import eu.senla.JavaLaboratory3.entities.Storage;

import java.util.ArrayList;
import java.util.Random;

public class ContextInitializer {
    public static void init() {
        Context.random = new Random();
        Context.storage = new Storage(new ArrayList<>(), 100);
    }

}
