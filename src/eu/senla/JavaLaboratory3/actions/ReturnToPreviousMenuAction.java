package eu.senla.JavaLaboratory3.actions;

import eu.senla.JavaLaboratory3.services.MenuService;

public class ReturnToPreviousMenuAction implements Action {
    @Override
    public void invoke(int index) {
        MenuService.goToPreviousMenu();
    }
}
