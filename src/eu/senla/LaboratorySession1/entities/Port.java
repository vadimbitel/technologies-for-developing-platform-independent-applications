package eu.senla.LaboratorySession1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Port {
    private List<Ship> ships;
    private int amountOfWater;

    private String getShipsString() {
        int i = 1;
        StringBuilder builder = new StringBuilder();
        for (Ship ship : ships) {
            builder.append(i++).append(". ").append(ship);
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "Порт: " + (getShipsString().length() == 0 ? "Пусто\n" : '\n' + getShipsString()) + "Всего воды в порту: " + getAmountOfWater() + " л.\n";
    }
}
