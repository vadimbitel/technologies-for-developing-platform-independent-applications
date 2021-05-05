package eu.senla.LaboratorySession1.main;

import eu.senla.LaboratorySession1.menu.MenuContext;

public class Client {
    public static void userInterface() {
        while(true) {
            for(int i = 0; i < MenuContext.getCurrentMenu().getItems().size(); i++) {
                System.out.println( (i + 1) + "." + MenuContext.getCurrentMenu().getItems().get(i).getText());
            }
            System.out.print("Ваш выбор: ");
            MenuContext.getCurrentMenu().executeSelectedFunction();
        }
    }
}
