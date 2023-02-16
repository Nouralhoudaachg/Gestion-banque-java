package metier;

import presentation.modele.entitesDeLaBanque.Admin;

public interface Verifiable {

    default boolean isNumeric(String value){
        try {
            Integer.parseInt(value);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    default boolean isDecimal(String value){
        try {
            Double.parseDouble(value);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    default boolean isAdmin(String login,String pass){
        Admin admin=Admin.getInstance();
        if(login.equals(admin.getLogin()) && pass.equals(admin.getMotDePasse()))
            return true;
        else return false;
    }


   /** default Client isClient(String lg, String pass, Banque banque){
        return ;
    }**/
}
