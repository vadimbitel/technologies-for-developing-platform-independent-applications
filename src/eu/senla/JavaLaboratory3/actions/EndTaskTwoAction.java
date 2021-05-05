package eu.senla.JavaLaboratory3.actions;

import eu.senla.JavaLaboratory3.services.*;

public class EndTaskTwoAction implements Action {
    @Override
    public void invoke(int index) {
        TaskTwoService.clearStorage();
        MenuService.goToPreviousMenu();
    }
}
