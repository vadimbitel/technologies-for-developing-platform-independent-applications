package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.exceptions.SpaceException;

public interface Action {
    void doAction(int index) throws SpaceException;
}
