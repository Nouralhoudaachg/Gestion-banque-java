package metier.admin;

import presentation.modele.Banque;
import presentation.modele.Compte;
import presentation.modele.TableauDeBord;
import presentation.modele.entitesDeLaBanque.Client;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static presentation.modele.Banque.validateEmail;

public class ServiceAdmin implements IServiceAdmin {
    //Attributs
    Banque banque=new Banque();
    Client cl;
    @Override
    public Client nouveauClient() {

        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrer votre login");
        String votrelogin = clavier.next();
        System.out.println("Entrer votre mdp");
        String votremdp = clavier.next();
        System.out.println("Entrer votre nom");
        String votrenom = clavier.next();
        System.out.println("Entrer votre prenom");
        String votreprenom = clavier.next();
        System.out.println("Entrer votre mail");
        String votremail = clavier.next();
        System.out.println(validateEmail(votremail));
        System.out.println("Entrer votre cin");
        String votrecin = clavier.next();
        System.out.println("Entrer votre numero de telephone");
        String votretel = clavier.next();


        Client c = new Client(votrelogin, votremdp, votrenom, votreprenom, votremail, votrecin,votretel);


        if (banque.getClientsDeBanque().contains(c))
            System.err.println("Erreur,l'ajout du Client n°" + c.getId() + " a echoué, un Client avec le même contenue existe déjà dans la liste");
        else {
            banque.getClientsDeBanque().add(c);
            System.out.println("Client n°" + c.getId() + " added successfully");
        }

        return c;
    }

    @Override
    public Client nouveauCompteClientExistant() {
        return null;
    }

    @Override
    public Client chercherClientParId(Long id) {
        Client c = new Client();
        for (Client indice : banque.getClientsDeBanque()) {
            if (indice.getId().equals(id)) {
                c = indice;
                System.out.println("indice du client"+c);
            }
        }
        return c;

    }

    @Override
    public List<Client> chercherClientParNom(String nom) {
        List<Client> c = new ArrayList<>();
        for (Client indice : banque.getClientsDeBanque()) {
            if (indice.getNom().equals(nom)) {
                c.add(indice);
            }
        }
        return c;
    }

    @Override
    public List<Client> chercherClientParPrénom(String prenom) {
        return null;
    }

    @Override
    public Client chercherClientParCin(String cin) {
        Client c = new Client();
        for (Client indice : banque.getClientsDeBanque()) {
            if (indice.getCin().equals(cin)) {
                c = indice;
            }
        }
        return c;
    }

    @Override
    public Client chercherClientParEmail(String email) {
        Client c = new Client();
        for (Client indice : banque.getClientsDeBanque()) {
            if (indice.getEmail().equals(email)) {
                c = indice;
            }
        }
        return c;
    }

    @Override
    public Compte chercherCompteParId(Long idCompte) {
        Compte cpt = new Compte();
        for (Compte ind : cl.getComptesClient()) {
            if (ind.getNumeroCompte().equals(idCompte)) {
                cpt = ind;
            }
        }
        return cpt;
    }

    @Override
    public List<Compte> chercherCompteParSolde(double solde) {
        List<Compte> cpt = new ArrayList<>();
        for (Compte ind : cl.getComptesClient()) {
            if (ind.getSolde().equals(solde)) {
                cpt.add(ind);
            }
        }
        return cpt;
    }

    @Override
    public List<Compte> chercherCompteParDateCreation(LocalDateTime date) {
        List<Compte> cpt = new ArrayList<>();

        for (Compte ind : cl.getComptesClient()) {
            if (ind.getDateCreation().equals(date)) {
                cpt.add(ind);
            }
        }
        return cpt;
    }

    @Override
    public List<Compte> chercherCompteParPropriétaire(Client propriétaire) {
        List<Compte> cpt = new ArrayList<>();
        for (Compte ind : cl.getComptesClient()) {
            if (ind.getPropriétaire().equals(propriétaire)) {
                cpt.add(ind);
            }
        }
        return cpt;
    }

    @Override
    public Client modifierClient(String filtre) {
        return null;
    }

    @Override
    public boolean supprimerClient(Long id) {
        for (Client indi : banque.getClientsDeBanque()) {
            if (indi.getId().equals(id)) {
                banque.getClientsDeBanque().remove(indi);
            }
        }
        return false;
    }

    @Override
    public TableauDeBord calculerEtAfficherStatistiques() {
        return null;
    }

    @Override
    public List<Client> trierClientParNom() {
        List<Client> cl = new ArrayList<>();
        Collections.sort(banque.getClientsDeBanque(), (cl1, cl2) -> cl2.getNom().compareTo(cl1.getNom()));
        return cl;
    }

    @Override
    public List<Client> trierClientParCin() {
        List<Client> cl = new ArrayList<>();
        Collections.sort(banque.getClientsDeBanque(), (cl1, cl2) -> cl2.getCin().compareTo(cl1.getCin()));
        return cl;
    }

    @Override
    public List<Client> trierClientParEmail() {
        List<Client> cl = new ArrayList<>();
        Collections.sort(banque.getClientsDeBanque(), (cl1, cl2) -> cl2.getEmail().compareTo(cl1.getEmail()));
        return cl;
    }

    @Override
    public List<Client> trierClientParAdresse() {
          return  null;
    }

    @Override
    public List<Client> trierClientParSoldeCompte() {
          return null;
    }

    @Override
    public List<Compte> trierComptesParSolde() {
        List<Compte> co = new ArrayList<>();
        Collections.sort(cl.getComptesClient(), (co1, co2) -> co2.getSolde().compareTo(co1.getSolde()));
        return co;
    }

    @Override
    public List<Compte> trierComptesParDateDeCreation() {
        List<Compte> co = new ArrayList<>();
        Collections.sort(cl.getComptesClient(), (co1, co2) -> co2.getDateCreation().compareTo(co1.getDateCreation()));
        return co;
    }

    @Override
    public List<Compte> trierComptesParNomPropriétaire() {
       return null;
    }

    @Override
    public void AfficherListeClients() {

        System.out.println("\n\n=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*==*=*==*=*=*=*=*=*=*=*=*=*=*=*=**=*");
        System.out.println("=*=*=*=*                           Liste des clients [Clients]                           *=*=*=*==*=**=*");
        System.out.println("=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*==*=*==*=*=*=*=*=*=*=*=*=*=*=*=**=*");
        System.out.println("=*=                                                                                 =*=*=*=*=*");
        banque.getClientsDeBanque().forEach(cl -> System.out.println("=*= " + cl.toString() + " =*="));
        System.out.println("=*=                                                                                 =*=*=*=*=*");
        System.out.println("=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*==*=*==*=*=*=*=*=*=*=*=*=*=*=*=**=*");

    }

    @Override
    public void AfficherListeComptes() {


        System.out.println("\n\n=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*==*=*==*=*=*=*=*=*=*=*=*=*=*=*=**=*");
        System.out.println("=*=*=*=*                           Liste des comptes [Comptes]                           *=*=*=*==*=**=*");
        System.out.println("=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*==*=*==*=*=*=*=*=*=*=*=*=*=*=*=**=*");
        System.out.println("=*=                                                                                 =*=*=*=*=*");
        cl.getComptesClient().forEach(compte -> System.out.println("=*= " + compte.toString()+ " =*="));
        System.out.println("=*=                                                                                 =*=*=*=*=*");
        System.out.println("=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*==*=*=*=*==*=*==*=*=*=*=*=*=*=*=*=*=*=*=**=*");

    }
}
