package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meat extends Material<Material> {
    private double weight;

    public Meat() {

    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate date = getManufacturingDate();
        return date.plus(7, ChronoUnit.DAYS);
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                '}';
    }
}
