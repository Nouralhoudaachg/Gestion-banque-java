package metier.authentification;

import metier.admin.IServiceIHMAdmin;
import metier.admin.ServiceIHMAdmin;
import metier.clients.IServiceIHMClient;
import metier.clients.ServicdeIHMClient;

import java.util.Scanner;

public class ServiceIHM implements IServiceIHM{
    public static IServiceIHMAdmin serviceihmadmin;
    public static IServiceIHMClient serviceihmclient;

    @Override
    public int menuGlobal() {

        Scanner s = new Scanner(System.in);
        int ch = 0;
        serviceihmadmin=new ServiceIHMAdmin();
        serviceihmclient=new ServicdeIHMClient();

        do {

            System.out.println("Tapez 1 pour menu admin ");
            System.out.println("Tapez 2 pour menu client ");
            System.out.println("Tapez 3 pour sortir du menu global");

            ch = s.nextInt();

            switch (ch) {
                case 1:
                    int chaine=0;
                    do {
                        System.out.println("Tapez 1 pour menu modification ");
                        System.out.println("Tapez 2 pour menu ajout ");
                        System.out.println("Tapez 3 pour menu comptabilité ");
                        System.out.println("Tapez 4 pour menu recherche ");
                        System.out.println("Tapez 5 pour menu suppression ");
                        System.out.println("Tapez 6 pour menu tri ");
                        System.out.println("Tapez 7 pour sortir du menu admin");

                        chaine = s.nextInt();
                        switch (chaine) {
                            case 1:
                                serviceihmadmin.menuModification();
                                break;
                            case 2:
                                serviceihmadmin.menuAjout();
                                break;
                            case 3:
                                serviceihmadmin.menuComptabilité();
                                break;
                            case 4:
                                serviceihmadmin.menuRecherche();
                                break;
                            case 5:
                                serviceihmadmin.menuSuppression();
                                break;
                            case 6:
                                serviceihmadmin.menuTrie();
                                break;
                        }
                    } while (chaine != 0);

                    break;
                case 2:
                    int c=0;
                    do {
                        System.out.println("Tapez 1 pour menu modification ");
                        System.out.println("Tapez 2 pour menu retrait ");
                        System.out.println("Tapez 3 pour menu informations ");
                        System.out.println("Tapez 4 pour sortir du menu client");

                        serviceihmclient=new ServicdeIHMClient();
                        c = s.nextInt();
                        switch (c) {
                            case 1:
                                serviceihmclient.menuModification();
                                break;
                            case 2:
                                serviceihmclient.menuRetrait();
                                break;
                            case 3:
                                serviceihmclient.menuInformations();
                                break;
                        }
                    } while (c != 0);

                    break;



                case 3:
                    System.exit(0);

                    break;


            }}while (ch != 0);


        return 0;
    }
}
