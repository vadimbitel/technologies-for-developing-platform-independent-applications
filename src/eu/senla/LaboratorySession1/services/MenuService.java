package eu.senla.LaboratorySession1.services;

import eu.senla.LaboratorySession1.menu.MenuContext;

public class MenuService {
    public static void exitProgram() {
        System.exit(0);
    }

    public static void goToPreviousMenu() {
        MenuContext.setCurrentMenu(MenuContext.getCurrentMenu().getPreviousMenu());
    }

    public static void goToSubmenu(int index) {
        MenuContext.setCurrentMenu(MenuContext.getCurrentMenu().getItems().get(index).getSubmenu());
    }
}
