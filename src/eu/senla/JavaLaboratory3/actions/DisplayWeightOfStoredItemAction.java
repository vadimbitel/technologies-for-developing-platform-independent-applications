package eu.senla.JavaLaboratory3.actions;

import eu.senla.JavaLaboratory3.services.TaskTwoService;

public class DisplayWeightOfStoredItemAction implements Action {
    @Override
    public void invoke(int index) {
        System.out.println("Weight of the stored item: " + Math.ceil(TaskTwoService.getWeightOfStoredItem()) +
                " kg.\n");
    }
}
