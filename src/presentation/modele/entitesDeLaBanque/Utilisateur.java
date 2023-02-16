package presentation.modele.entitesDeLaBanque;

import java.util.Objects;

public class Utilisateur {
    protected static long compteur = 1;
    protected Long id;
    protected String prenom, nom;
    protected String login, motDePasse, role;

  //getters
    public Long         getId() {
        return id;
    }
    public String       getNomComplet() {
        return prenom + " " + nom;
    }
    public String       getNom() {
        return nom;
    }
    public String       getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public String getRole() {
        return role;
    }


    //setters


    public void         setId() {
        this.id = compteur++;
    }
    public void         setNom(String nom) {
        this.nom = nom;
    }
    public void         setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //constructeurs
    public  Utilisateur(){setId();}

    public  Utilisateur(String login, String pass, String role){
        setId();
        this.login          = login;
        this.motDePasse     = pass;
        this.role           = role;
    }


    @Override
    public boolean equals(Object other) {
        if (other instanceof Utilisateur) {
            return Objects.equals(this.getId(), ((Utilisateur) other).getId());}
        else
            return false;
    }

}
