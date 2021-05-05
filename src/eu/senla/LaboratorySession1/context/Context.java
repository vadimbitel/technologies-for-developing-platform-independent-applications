package eu.senla.LaboratorySession1.context;

import eu.senla.LaboratorySession1.entities.Harbor;
import eu.senla.LaboratorySession1.entities.Port;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

public class Context {
    @Setter
    @Getter
    private static Port port;

    @Setter
    @Getter
    private static Harbor harbor;

    @Setter
    @Getter
    private static HashMap<String, Object> tempEntities;
}
