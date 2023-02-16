package metier.clients;

import presentation.modele.Compte;

public interface IServiceClient {
    boolean versement(Double montant, Compte c);
    boolean retrait  (Double montant, Compte c);

    boolean retrait  (int choixRetrait);
    boolean virement (Double montant, Compte src, Compte des);
    boolean modifierProfile(int choixModification);
    void dernièresOpérations();
    Double afficherSolde();
    Compte choisirCompte();

    void afficherTicket();
}
