package metier.forms;

import dao.IDao;
import dao.IUtilisateurDAO;
import metier.InteractiveConsole;
import presentation.modele.entitesDeLaBanque.Admin;
import presentation.modele.entitesDeLaBanque.Client;
import presentation.modele.entitesDeLaBanque.Utilisateur;
import presentation.vue.viewAPIs.Colors;

import java.util.HashMap;
import java.util.Map;

public class LoginFormValidator implements InteractiveConsole , Colors {

    private static final String FIELD_LOGIN =" login", FIELD_PASS = "pass";


    private Map<String , String> errors = new HashMap<>();
    private String resultMsg;
    private IDao<Utilisateur, Long> userDao;


    public LoginFormValidator(){}
    public LoginFormValidator(IDao<Utilisateur, Long> dao){

        this.userDao = dao;
    }
    public Map<String, String> Errors() {
        return errors;
    }
    public void setError(String fieldName, String errorMsg) {
        Errors().put(fieldName, errorMsg);
    }

    public String ResultMsg() {
        return resultMsg;
    }
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
    public IDao<Utilisateur, Long> getUserDao() {
        return userDao;
    }
    public void setUserDao(IDao<Utilisateur, Long> userDao) {
        this.userDao = userDao;
    }


    // fonctions de verification
    private void verifierLogin(String login) throws FormException{
        if(login!= null && login.trim().length()!=0){
            if(login.trim().length()<4)
                throw new FormException("Login must have more than 4 chars !!!");
        }else{
            throw new FormException("Login is Required !!!");
        }
    }
    private void verifierPass(String pass) throws FormException{
        if(pass!= null && pass.trim().length()!=0){
            if(pass.trim().length()<4)
                throw new FormException("Password must have more than 4 chars !!!");
        }else{
            throw new FormException("Password is Required !!!");
        }
    }

    // fonctions de validation
    public boolean validerLogin(String login){

        try {
            verifierLogin(login);
            return true;

        } catch (FormException e) {
            setError(FIELD_LOGIN, e.getMessage());
            return false;
        }
    }
    public boolean validerPass(String pass){

        try {
            verifierPass(pass);
            return true;

        } catch (FormException e) {
            setError(FIELD_PASS, e.getMessage());
            return false;
        }
    }

    // fonction de validation de formulaire
    public Utilisateur validerSession(String login, String password){

        errors.clear();
        Utilisateur session = null;


        validerLogin(login);
        validerPass(password);

       /**if(Errors().isEmpty()){

            session = ((IUtilisateurDAO)userDao).findByLoginAndPass(login, password);
            if(session!= null){
                if(session instanceof Admin)
                    setResultMsg("Successfully Connected [ADMIN] " + session.getNomComplet());
                else if (session instanceof Client) {
                    setResultMsg("Successfully Connected [CLIENT] " + session.getNomComplet());
                }
            }

            else {
                setResultMsg("Connection Failed :( ");
            }
        }**/


        return session;
    }


}


