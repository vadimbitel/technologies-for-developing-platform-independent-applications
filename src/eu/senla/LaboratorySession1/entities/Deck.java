package eu.senla.LaboratorySession1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Deck {
    private int occupiedSlots;
    private Container[] containers;

    private String getContainersString() {
        StringBuilder builder = new StringBuilder();
        for (Container container : containers) {
            builder.append(container != null ? container + "; " : "");
        }
        return builder.length() == 0 ? "Пусто" : builder.toString();
    }

    @Override
    public String toString() {
        return "Свободно слотов:" + (2 - occupiedSlots) + " Содержимое: " + getContainersString();
    }
}


