package eu.senla.LaboratorySession1.services;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.entities.Container;
import eu.senla.LaboratorySession1.entities.Deck;
import eu.senla.LaboratorySession1.entities.Ship;
import eu.senla.LaboratorySession1.exceptions.SpaceException;

import java.util.Random;

public class PortService {
    public static void displayShipsInfo() {
        for (var ship : Context.getPort().getShips()) {
            System.out.print(Context.getPort().getShips().indexOf(ship) + 1 + ". " + ship.toString());
        }
    }

    public static int getNumberOfShips() {
        return Context.getPort().getShips().size();
    }

    public static void removeShip(int index) {
        Context.getPort().getShips().remove(index);
    }

    public static void addShip(Ship dockingShip) {
        Context.getPort().getShips().add(dockingShip);
    }

    public static void displayAmountOfWater() {
        System.out.println("В порту " + Context.getPort().getAmountOfWater() + " л.\n");
    }

    public static void unloadTheShip(int index) {
        Context.getPort().setAmountOfWater(Context.getPort().getShips().get(index).getAmountOfWater() + Context.getPort().getAmountOfWater());
        Container[] containers;
        for (int i = 0; i < 2; i++) {
            containers = Context.getPort().getShips().get(index).getDecks()[i].getContainers();
            containers[0] = null;
            containers[1] = null;
        }
        Context.getPort().getShips().get(index).getDecks()[0].setOccupiedSlots(0);
        Context.getPort().getShips().get(index).getDecks()[1].setOccupiedSlots(0);
    }

    public static Ship getRandomShip() {
        String shipName = "AutoShip - " + new Random().nextInt(1001);
        Deck[] decks = new Deck[2];
        for (int i = 0; i < 2; i++) {
            decks[i] = new Deck();
            decks[i].setOccupiedSlots(0);
            decks[i].setContainers(new Container[]{null, null});
            Container container;
            boolean isBig;
            int amountOfContainers = new Random().nextInt(3);
            for (int j = 0; j < amountOfContainers; j++) {
                isBig = new Random().nextBoolean();
                if (isBig) {
                    container = new Container(1000, true);
                } else {
                    container = new Container(450, false);
                }
                addContainer(decks[i], container);
            }
        }
        return new Ship(shipName, decks);
    }

    private static void addContainer(Deck deck, Container container) {
        if (container.isBig() && deck.getOccupiedSlots() == 0) {
            deck.getContainers()[0] = container;
            deck.setOccupiedSlots(2);
        } else if (!container.isBig() && (deck.getOccupiedSlots() == 0 || deck.getOccupiedSlots() == 1)) {
            deck.getContainers()[deck.getOccupiedSlots()] = container;
            deck.setOccupiedSlots(deck.getOccupiedSlots() + 1);
        }
    }

    public static void addBigContainer() throws SpaceException {
        Deck deck = ((Ship)Context.getTempEntities().get("Строящийся корабль")).getDecks()[(int)Context.getTempEntities().get("Номер заполняемой палубы")];
        if (deck.getOccupiedSlots() == 0) {
            deck.getContainers()[0] = new Container(1000, true);
            deck.getContainers()[1] = null;
            deck.setOccupiedSlots(2);
        } else {
            throw new SpaceException("Недостаточно места!\n");
        }
    }

    public static void addSmallContainer() throws SpaceException {
        Deck deck = ((Ship)Context.getTempEntities().get("Строящийся корабль")).getDecks()[(int)Context.getTempEntities().get("Номер заполняемой палубы")];
        if (deck.getOccupiedSlots() == 0 || deck.getOccupiedSlots() == 1) {
            deck.getContainers()[deck.getOccupiedSlots()] = new Container(450, false);
            deck.setOccupiedSlots(deck.getOccupiedSlots() + 1);
        } else {
            throw new SpaceException("Недостаточно места!\n");
        }
    }
}
