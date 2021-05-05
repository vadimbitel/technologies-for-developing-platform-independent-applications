package eu.senla.JavaLaboratory3.services;

import eu.senla.JavaLaboratory3.menu.MenuContext;

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
