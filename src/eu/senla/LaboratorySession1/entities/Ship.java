package eu.senla.LaboratorySession1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {
    public Ship(String shipName, Deck[] decks) {
        this.shipName = shipName;
        this.decks = decks;
    }

    private String shipName;
    private Deck[] decks;

    public int getAmountOfWater() {
        int amountOfWater = 0;
        Container[] containers;
        for (int i = 0; i < 2; i++) {
            containers = decks[i].getContainers();
            amountOfWater += containers[0] != null ? containers[0].getCapacity() : 0;
            amountOfWater += containers[1] != null ? containers[1].getCapacity() : 0;
        }
        return amountOfWater;
    }

    private String getDecksString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < decks.length; i++) {
            builder.append("Ярус №").append(i + 1).append(": ").append(decks[i]).append('\n');
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "Название корабля: " + shipName + '\n' + getDecksString();
    }
}
