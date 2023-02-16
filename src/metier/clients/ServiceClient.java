package metier.clients;

import presentation.modele.Compte;

public class ServiceClient implements IServiceClient{


    @Override
    public boolean versement(Double montant, Compte c) {
        Double solde=c.getSolde();
        solde += montant;
        System.out.println("Solde :\t"+ solde);
        return true;
    }

    @Override
    public boolean retrait(Double montant, Compte c) {
        Double solde=c.getSolde();
        solde -= montant;
        System.out.println("Solde :\t"+ solde);
        return true;

    }



    @Override
    public boolean retrait(int choixRetrait) {
        return false;
    }

    @Override
    public boolean virement(Double montant, Compte src, Compte des) {
        Double soldesrc=src.getSolde();
        Double soldedes=des.getSolde();
        soldesrc -= montant;
        soldedes += montant;
        System.out.println("Solde source:\t"+ src.getSolde());
        System.out.println("Solde destination:\t"+ des.getSolde());
        return true;
    }



    @Override
    public boolean modifierProfile(int choixModification) {
        return false;
    }

    @Override
    public void dernièresOpérations() {

    }

    @Override
    public Double afficherSolde() {
        return null;
    }

    @Override
    public Compte choisirCompte() {
        return null;
    }

    @Override
    public void afficherTicket() {

    }
}
