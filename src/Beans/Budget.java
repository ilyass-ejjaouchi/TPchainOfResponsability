package Beans;

import java.util.Observable;
import java.util.Observer;

public class Budget implements Observer {
    private int id;
    private double montant;
    private double montantBloque;

    @Override
    public void update(Observable o, Object montant) {
        if ((Double)montant == 0) this.setMontant(this.montant - montantBloque);
        this.setMontantBloque((Double) montant);
    }

    public Budget(double montant, double montantBloque) {
        this.montant = montant;
        this.montantBloque = montantBloque;
    }

    public Budget() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMontantBloque() {
        return montantBloque;
    }

    public void setMontantBloque(double montantBloque) {
        this.montantBloque = montantBloque;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "id=" + id +
                ", montant=" + montant +
                ", montantBloque=" + montantBloque +
                '}';
    }
}
