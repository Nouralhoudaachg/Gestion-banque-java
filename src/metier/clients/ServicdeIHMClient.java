package metier.clients;

import presentation.modele.AffichageInfos;
import presentation.modele.Afficherinformations;
import presentation.modele.entitesDeLaBanque.Client;

import java.util.Scanner;

public class ServicdeIHMClient implements IServiceIHMClient{
    public static AffichageInfos affiche;
    @Override
    public int menuGlobal() {


     Client cl=new Client();

        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {

            System.out.println("Tapez 1 pour menu modification  ");
            System.out.println("Tapez 2 pour menu retrait");
            System.out.println("Tapez 3 pour menu informations ");
            System.out.println("Tapez 4 pour sortir du menu du client");

            ch = s.nextInt();

            switch (ch) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;
                case 4:

                    System.exit(0);


                    break;

            }}while (ch != 0);


        return 0;
    }


    @Override
    public int menuModification() {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {

            System.out.println("Tapez 1 pour modifier profile  Client");
            System.out.println(" Tapez 2 pour sortir du menu modification");
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
    public int menuRetrait() {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {

            System.out.println("Tapez 1 pour effectuer un retrait");
            System.out.println(" Tapez 2 pour choisir le retrait");
            System.out.println(" Tapez 3 pour sortir du menu du  retrait");
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
    public int menuInformations() {

        Scanner s = new Scanner(System.in);

        int ch = 0;
        do {

            System.out.println("Tapez 1 pour afficher les informations");
            System.out.println(" Tapez 2 pour afficher le ticket");
            System.out.println(" Tapez 3 pour sortir du menu d'affichage");
            affiche=new Afficherinformations();
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    int cc=0;
                    do {
                        System.out.println("Tapez 1 pour afficher bref ");
                        System.out.println("Tapez 2 pour afficher les logs ");
                        System.out.println("Tapez 3 pour afficher les informations");
                        System.out.println("Tapez 4 pour afficher les informations détaillées");
                        System.out.println("Tapez 5 pour sortir du menu admin");

                        cc = s.nextInt();
                        switch (cc) {
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

                        }
                    } while (cc != 0);

                    break;
                case 2:

                    break;

                case 3:
                    System.exit(0);


                    break;
            }}while (ch != 0);



        return 0;
    }
}
