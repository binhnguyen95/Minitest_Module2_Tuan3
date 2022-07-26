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
        return weight * this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusWeeks(1);
    }

    @Override
    public String toString() {
        return "Meat{" +
                "id= '" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", manufacturingDate=" + getManufacturingDate() +
                ", expireDate=" + getExpiryDate() +
                ", cost=" + super.getCost() +
                " weight=" + weight +
                '}';
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        LocalDate timeline1 = getExpiryDate().minusDays(5);
        if (timeline1.isAfter(now)) {
            return getAmount() / 10 * 9;
        } else {
            return getAmount() / 10 * 7;
        }




    }
}