package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrispyFlour extends Material<Material>{
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        LocalDate timeline1 = getExpiryDate().minusDays(120);
        LocalDate timeline2 = getExpiryDate().minusDays(60);
        if (timeline2.isAfter(now)) {
            if (timeline1.isAfter(now)) return getAmount() / 10*9.5;
            return getAmount() / 10*8;
        }
        else {
            return getAmount() / 10*6;
        }

    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", manufacturingDate=" + getManufacturingDate() +
                ", expireDate=" + getExpiryDate() +
                ", cost=" + super.getCost() +
                " quantity=" + quantity +
                '}';
    }


}
