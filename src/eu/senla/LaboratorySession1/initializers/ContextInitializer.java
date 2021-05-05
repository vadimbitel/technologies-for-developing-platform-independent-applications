package eu.senla.LaboratorySession1.initializers;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.entities.Harbor;
import eu.senla.LaboratorySession1.entities.Port;

import java.util.ArrayList;
import java.util.HashMap;

public class ContextInitializer {
    public static void initContext() {
        Port port = new Port();
        port.setAmountOfWater(0);
        port.setShips(new ArrayList<>());
        Context.setPort(port);

        Harbor harbor = new Harbor();
        harbor.setShips(new ArrayList<>());
        Context.setHarbor(harbor);

        Context.setTempEntities(new HashMap<>());
    }
}
