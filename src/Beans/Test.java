package Beans;

public class Test {
    public static void main(String[] args) {
            Budget budget = new Budget(12000,0);
            Departemet d1 = new Departemet("departement1",budget);
            Demande demande = new Demande(2000);
            demande.setDepartemet(d1);
            demande.addObserver(budget);
            ServiceComptable serviceComptable = new ServiceComptable();
            serviceComptable.handelRequest(demande);
            System.out.println(budget.toString());
            ServicePatrimoine servicePatrimoine = new ServicePatrimoine();
            servicePatrimoine.handelRequest(demande);
            System.out.println(budget.toString());

    }
}
