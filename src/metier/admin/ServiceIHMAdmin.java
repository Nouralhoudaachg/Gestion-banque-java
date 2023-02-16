package metier.admin;

import metier.clients.ServiceClient;
import presentation.modele.entitesDeLaBanque.Client;

import java.util.Scanner;

public class ServiceIHMAdmin implements IServiceIHMAdmin{


    @Override
    public int menuModification() {

        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {

            System.out.println("Tapez 1 pour modifier  client ");
            System.out.println("Tapez 2 pour sortir du menu de modification");
            ch = s.nextInt();

            switch (ch) {
                case 1:

                    break;
                case 2:
                    System.exit(0);

                    break;

            }}while (ch != 0);
        return 0;
    }

    @Override
    public int menuRecherche() {


        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {

            System.out.println(" Tapez 1 pour chercher Client Par Id ");
            System.out.println(" Tapez 2 pour chercher Client Par Nom");
            System.out.println(" Tapez 3 pour chercher Client Par  Prenom");
            System.out.println(" Tapez 4 pour chercher Client Par CIN");
            System.out.println(" Tapez 5 pour chercher Client Par Email");
            System.out.println(" Tapez 6 pour chercher Compte Par Id");
            System.out.println(" Tapez 7 pour chercher Compte Par Solde");
            System.out.println(" Tapez 8 pour chercher Compte Par Date De Creation");
            System.out.println(" Tapez 9 pour chercher Compte Par Proprietaire");
            System.out.println(" Tapez 10 pour sortir du menu de la recherche");
            ch = s.nextInt();

            switch (ch) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:
                    System.exit(0);


                    break;
            }}while (ch != 0);
        return 0;
    }

    @Override
    public int menuInformations() {


        return 0;
    }

    @Override
    public int menuAjout() {

        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("Tapez 1 pour ajouter  client ");
            System.out.println(" Tapez 2 pour ajouter compte de client deja existant ");
            System.out.println(" Tapez 3 pour sortir du menu de l'ajout ");

            ch = s.nextInt();

            switch (ch) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:
                    System.exit(0);


                    break;

            }}while (ch != 0);


        return 0;
    }

    @Override
    public int menuSuppression() {

        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("Tapez 1 pour supprimer  client ");
            System.out.println(" Tapez 2 pour sortir du menu de suppression");

            ch = s.nextInt();

            switch (ch) {
                case 1:

                    break;
                case 2:
                    System.exit(0);

                    break;


            }}while (ch != 0);
        return 0;
    }

    @Override
    public int tableauDeBord() {

        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("Tapez 1 pour calculer et afficher statistiques");
            System.out.println(" Tapez 3 pour sortir du menu des statistiques ");

            ch = s.nextInt();

            switch (ch) {
                case 1:

                    break;
                case 2:
                    System.exit(0);

                    break;


            }}while (ch != 0);
        return 0;
    }

    @Override
    public int menuTrie() {


        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println(" Tapez 1 pour trier client par nom");
            System.out.println(" Tapez 2 pour trier client par cin ");
            System.out.println(" Tapez 3 pour trier client par email");
            System.out.println(" Tapez 4 pour trier client par adresse");
            System.out.println(" Tapez 5 pour trier client par solde du compte  ");
            System.out.println(" Tapez 6 pour trier compte par solde  ");
            System.out.println(" Tapez 7 pour trier compte par date de creation ");
            System.out.println(" Tapez 8 pour trier compte par nom  du proprietaire ");
            System.out.println(" Tapez 9 pour sortir du menu de tri ");

            ch = s.nextInt();

            switch (ch) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.exit(0);

                    break;
            }}while (ch != 0);
        return 0;
    }

    @Override
    public int menuComptabilité() {
        return 0;
    }


    @Override
    public int menuGlobal() {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {

            System.out.println("Tapez 1 pour menu modification  ");
            System.out.println("Tapez 2 pour menu recherche ");
            System.out.println("Tapez 3 pour menu informations ");
            System.out.println("Tapez 4 pour menu ajout");
            System.out.println("Tapez 5 pour menu suppression");
            System.out.println("Tapez 6 pour menu tableau de bord");
            System.out.println("Tapez 7 pour menu tri");
            System.out.println("Tapez 8 pour menu comptabilite");
            System.out.println("Tapez 9 pour sortir du  menu admin");

            ch = s.nextInt();

            switch (ch) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;
                case 4:

                    break;

                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.exit(0);

                    break;
            }}while (ch != 0);



        return 0;
    }

}
