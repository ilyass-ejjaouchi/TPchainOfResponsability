package Beans;

import java.util.Observable;

public class Demande extends Observable {
    private int id;
    private double montant;
    private String status;
    private Departemet departemet;

    public Demande(double montant) {
        this.montant = montant;
    }

    public Demande() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        setChanged();
        switch (status){
            case Etat.APPROUVEE:
                notifyObservers(montant);
                break;
            case Etat.TRAITEE:
                notifyObservers(0.0);
                break;
        }
    }

    public Departemet getDepartemet() {
        return departemet;
    }

    public void setDepartemet(Departemet departemet) {
        this.departemet = departemet;
    }

    @Override
    public String toString() {
        return "Demande{" +
                "id=" + id +
                ", montant=" + montant +
                ", status='" + status + '\'' +
                ", departemet=" + departemet +
                '}';
    }
}
