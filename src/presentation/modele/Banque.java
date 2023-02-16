package presentation.modele;

import presentation.modele.entitesDeLaBanque.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Banque {
//attributs
    private static long          compteur = 1;
    private Long                 idBanque;
    private String              nomBanque;
    private String              adresseBanque;
    private String              telBanque;
    private String              emailBanque;
    private List<Client>        clientsDeBanque = new ArrayList<>();
//constructeurs
    public Banque()
    {
        idBanque = compteur++;
    }
    public Banque(String nom, String adresse, String tel, String mail)
    {
        idBanque        = compteur++;
        nomBanque       = nom;
        telBanque       = tel;
        adresseBanque   = adresse;
        emailBanque     = mail;
    }
//getters
    public Long             getIdBanque() {
        return idBanque;
    }
    public String           getNomBanque() {
        return nomBanque;
    }
    public String           getEmailBanque() {
        return emailBanque;
    }
    public String           getTelBanque() {
        return telBanque;
    }
    public String           getAdresseBanque() {
        return adresseBanque;
    }
    public List<Client>     getClientsDeBanque() {
        return clientsDeBanque;
    }

    //setters

    public void             setIdBanque(Long idBanque) {
        this.idBanque = idBanque;
    }
    public void             setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
    public void             setEmailBanque(String emailBanque) {
        this.emailBanque = emailBanque;
    }
    public void             setAdresseBanque(String adresseBanque) {
        this.adresseBanque = adresseBanque;
    }
    public void             setTelBanque(String telBanque) {
        this.telBanque = telBanque;
    }
    public void             setClientsDeBanque(List<Client> clientsDeBanque) {
        this.clientsDeBanque = clientsDeBanque;
    }

    //methodes



    public String toString() {
        String Bankvar= "***************************** \n";

        Bankvar += "Bank ID : " +this.idBanque +"\n";
        Bankvar +="Agency name : "+this.nomBanque+"\n";
        Bankvar +="Agency email : "+this.emailBanque +"\n";
        Bankvar +="Agency adress : "+this.adresseBanque+"\n";
        Bankvar +="Agency tel:     "+this.telBanque +"\n";


        return Bankvar;

    }
    //validate email

    public static String validateEmail(String email){

        if(email==null||email.isEmpty()){
            return"Email Invalid";
        }
        String emailRegex= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern= Pattern.compile(emailRegex);
        if(pattern.matcher(email).matches()){
            return "Email Valid";
        }
        else{
            return "Email Invalid";
        }}


  //equals
    @Override
    public boolean equals(Object other) {
        if (other instanceof Banque) {
            return Objects.equals(this.getIdBanque(), ((Banque) other).getIdBanque());}
        else
            return false;
    }




}
