package eu.senla.LaboratorySession1.initializers;

import eu.senla.LaboratorySession1.main.Client;

public class MainInitializer {
    public static void init() {
        ContextInitializer.initContext();
        MenuInitializer.initMenuContext();
        Client.userInterface();
    }
}
