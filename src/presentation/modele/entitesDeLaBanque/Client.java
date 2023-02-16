package presentation.modele.entitesDeLaBanque;

import presentation.modele.Compte;
import presentation.modele.Sexe;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Client extends Utilisateur {
    private String email, cin, tel;
    private Sexe sexe;
    private List<Compte> comptesClient;




    //getters
    public String       getCin() {
        return cin;
    }
    public String       getTel() {
        return tel;
    }
    public String       getEmail() {
        return email;
    }
    public List<Compte> getComptesClient() {
        return comptesClient;
    }
    public Sexe getSexe() {
        return sexe;
    }


    //setters
    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }
    public void         setEmail(String email) {
        this.email = email;
    }
    public void         setTel(String tel) {
        this.tel = tel;
    }
    public void         setCin(String cin) {
        this.cin = cin;
    }
    public void         setComptesClient(List<Compte> comptesClient) {
        this.comptesClient = comptesClient;
    }

    //constructeurs
    public Client(){

        comptesClient = new ArrayList<>();
    }

//my constructor
    public Client(String login, String mdp, String nom, String prenom, String email, String cin, String tel) {
        super(login, mdp, "Client");
        setNom(nom);
        setPrenom(prenom);
        setTel(tel);
        setEmail(email);
        setCin(cin);
        comptesClient = new ArrayList<Compte>();
    }
    public Client(String login, String pass){
        super(login, pass, "Client");
        comptesClient = new ArrayList<>();
    }

    public Client(String login, String pass, String n, String p){
        super(login, pass, "Client");
        setNom(n);
        setPrenom(p);
        comptesClient = new ArrayList<>();
    }
    public Client(String login, String pass, String n, String p, String mail, String cin, String tel, Sexe sexe){
        super(login, pass, "Client");
        setNom(n);
        setPrenom(p);
        setTel(tel);
        setEmail(mail);
        setCin(cin);
        setSexe(sexe);
        comptesClient = new ArrayList<Compte>();
    }


    @Override
    public String toString() {

        String      clientStr  = "------------------------------------------------------\n";
        clientStr += "| Identifiant du Client     : "   + this.id        + "\n";
        clientStr += "| Nom Complet               : "   + this.getNomComplet() + "\n" ;
        clientStr += "| Adresse email             : "   + this.email     + "\n" ;
        clientStr += "| Numéro téléphone          : "   + this.tel       + "\n" ;
        clientStr += "| Numéro de CIN             : "   + this.cin       + "\n" ;
        clientStr += "------------------------------------------------------\n";

        return clientStr;
    }

    //verifier email
    public static String validateEmail(String email){

        if(email==null||email.isEmpty()){
            return" Email Invalid";
        }
        String emailRegex= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern= Pattern.compile(emailRegex);
        if(pattern.matcher(email).matches()){
            return " Email Valid";
        }
        else{
            return " Email Invalid";
        }}





}
