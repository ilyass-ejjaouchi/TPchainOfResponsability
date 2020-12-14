package Beans;

public class ServiceComptable extends OrderHandler{
    @Override
    public void handelRequest(Demande demande) {
        if (demande.getMontant() < demande.getDepartemet().getBuget().getMontant())
            {
             demande.setStatus(Etat.APPROUVEE);
            }
        else
            demande.setStatus(Etat.ECHOUEE);
    }
}
