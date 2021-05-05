package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.services.PortService;

public class AmountOfWaterInPortAction implements Action {

    @Override
    public void doAction(int index) {
        PortService.displayAmountOfWater();
    }
}
