package metier.authentification;

import presentation.modele.entitesDeLaBanque.Admin;
import presentation.modele.entitesDeLaBanque.Client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Auth implements IAuth{

    public static boolean checkCredentials(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("clients.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials[0].equals(username) && credentials[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public void seConnecter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nom utilisateur: ");
        String username = scanner.nextLine();
        System.out.print("Mot de passe: ");
        String password = scanner.nextLine();

        if (checkCredentials(username, password)) {
            System.out.println("Connexion réussie !!");
            Client cl=new Client();
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe est invalide");
        }

    }

    @Override
    public void SeDéconnecter() {
      Client  cl=null;
        System.out.println("Session déconnectée,à la prochaine!");

    }
}
