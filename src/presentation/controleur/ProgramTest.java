package presentation.controleur;

import metier.authentification.IServiceIHM;
import metier.authentification.ServiceIHM;


public class ProgramTest {

   public static IServiceIHM serviceihm;

    public static void main(String[] args) {

        serviceihm=new ServiceIHM();

        serviceihm.menuGlobal();
    }


}
