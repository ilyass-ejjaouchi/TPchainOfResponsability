package Beans;

public class ServicePatrimoine extends OrderHandler{
    @Override
    public void handelRequest(Demande demande) {
        if (demande.getStatus().equals(Etat.APPROUVEE)) {
            demande.setStatus(Etat.TRAITEE);
        }
    }
}
