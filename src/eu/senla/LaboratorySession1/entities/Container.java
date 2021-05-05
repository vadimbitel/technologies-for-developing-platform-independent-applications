package eu.senla.LaboratorySession1.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Container {
    public Container(int capacity, boolean isBig) {
        this.capacity = capacity;
        this.isBig = isBig;
    }

    private int capacity;
    private boolean isBig;

    @Override
    public String toString() {
        return (isBig ? "большой контейнер" : "маленький контейнер") + "(" + capacity + " л.)";
    }
}
