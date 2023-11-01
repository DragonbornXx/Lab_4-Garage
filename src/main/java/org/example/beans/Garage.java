package org.example.beans;

public class Garage {
    private Mechanic mechanic;

    public Garage(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    @Override
    public String toString() {
        return "Garage [mechanic=" + mechanic + "]";
    }
}
