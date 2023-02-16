package presentation.modele.entitesDeLaBanque;

public class Admin extends Utilisateur {

    private static  Admin ADMIN = new Admin();

    private Admin(){

        login       = "admin";
        motDePasse  = "1234";
        role        = "Admin";
        nom         =  "Admin";
        prenom      = "Omar";

    }


    public static Admin getInstance(){

        return ADMIN;
    }
//equals
   /**  public  boolean equals(Object o){
        if(o instanceof Utilisateur){
            return this.getLogin().equals(((Utilisateur)o).getLogin()) && this.getMotDePasse().equals(((Utilisateur)o).getMotDePasse());
       }
        else{
            return false;
        }
}**/
}
