package Beans;

public class Departemet {
    private int id;
    private String nom;
    private Budget buget;

    public Departemet(String nom, Budget buget) {
        this.nom = nom;
        this.buget = buget;
    }

    public Departemet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Budget getBuget() {
        return buget;
    }

    public void setBuget(Budget buget) {
        this.buget = buget;
    }
}
