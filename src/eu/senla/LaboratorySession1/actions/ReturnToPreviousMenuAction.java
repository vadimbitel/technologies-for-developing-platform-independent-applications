package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.services.MenuService;

public class ReturnToPreviousMenuAction implements Action {

    @Override
    public void doAction(int index) {
        MenuService.goToPreviousMenu();
    }
}
