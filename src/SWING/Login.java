package SWING;

import presentation.modele.entitesDeLaBanque.Admin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends  JFrame {

    //declarer
    private Container myViewContainer;
    private JPanel titlePanel,formPanel,buttonsPannel;

    private JLabel lbl_title,lbl_login,lbl_pass;

    private JButton btn_login,btn_cancel;

    private JTextField txt_login;
    private JPasswordField txt_pass;

    ClassLoader cl = getClass().getClassLoader();

    //initialiser

    private void initLabels() {
        //---------------Label Titre-------------
        //initialisation du label tTitre
        lbl_title = new JLabel("C O N N E X I O N");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_title.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        lbl_title.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_title.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        lbl_title.setIcon(new ImageIcon(cl.getResource("images/icons/connect1.jpg")));


        //---------------Label login-------------
        //initialisation du label tTitre
        lbl_login = new JLabel("Nom utilisateur");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_login.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_login.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_login.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
       lbl_login.setIcon(new ImageIcon(cl.getResource("images/icons/usericone1.jpg")));


        //---------------Label password-------------
        //initialisation du label tTitre
        lbl_pass = new JLabel("Mot De Passe");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_pass.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_pass.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_pass.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        lbl_pass.setIcon(new ImageIcon(cl.getResource("images/icons/password2.jpg")));
    }

    private void initTextFields() {
        //---------------text login-------------
        //initialisation du label tTitre
        txt_login = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_login.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        txt_login.setForeground(new Color(0,0,0));
        //alignement du texte au label au centre
        txt_login.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text pass-------------
        //initialisation du label tTitre
        txt_pass = new JPasswordField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_pass.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        txt_pass.setForeground(new Color(0,0,0));
        //alignement du texte au label au centre
        txt_pass.setHorizontalAlignment(JPasswordField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));


    }
    private void initButtons(){
        //---------------btn login-------------
        //initialisation du bouton login
        btn_login= new JButton("Se connecter");
        //personnalisation du label titre
        //modif de la police du texte
        btn_login.setFont(new Font("optima",Font.BOLD,17));
        //modif de la couleur du texte
        btn_login.setForeground(new Color(0,0,0));
        //alignement du texte au label au centre
        btn_login.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txt_login.getText();
                String password = txt_pass.getText();
                Admin admin=Admin.getInstance();
                if(username.equals(admin.getLogin()) && password.equals(admin.getMotDePasse())){
                    setVisible(false);
                    dispose();
                    System.out.println("Bienvenue Admin");
                }

                else {
                    System.out.println("Bienvenue User");
                    dispose();
                };
            }
        });


        //---------------btn cancel-------------
        //initialisation du bouton login
        btn_cancel= new JButton("Annuler");
        //personnalisation du label titre
        //modif de la police du texte
        btn_cancel.setFont(new Font("optima",Font.BOLD,17));
        //modif de la couleur du texte
        btn_cancel.setForeground(new Color(0,0,0));
        //alignement du texte au label au centre
        btn_cancel.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        btn_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    private void initPanels(){
        initLabels();
        initTextFields();
        //-----------Panneau titre--------------

        titlePanel= new JPanel();
        //changer la couleur du fond de mon panneau
        titlePanel.setBackground(new Color(	51,153,255));
        //ajouter un padding(10,0,10,0)
        titlePanel.setBorder(new EmptyBorder(10,0,10,0));
        //affecter un FlowLayout a notre titlePannel pour ajouter les elements sous forme d un flux horizontal
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //ajouter titre au cebntre
        titlePanel.add(lbl_title);
        //-----------Panneau formulaire--------------

        formPanel= new JPanel();
        //changer la couleur du fond de mon panneau
        formPanel.setBackground(new Color(255,255,255));
        formPanel.setLayout(new BorderLayout());
        formPanel.setBorder(new EmptyBorder(100,40,100,40));
        //ajouter un padding(10,0,10,0)
        //  titlePanel.setBorder(new EmptyBorder(10,0,10,0));
        JPanel westPannel=new JPanel();
        westPannel.setBackground(new Color(255,255,255));
        westPannel.setLayout(new GridLayout(2,1,5,5));
        westPannel.setBorder(new EmptyBorder(0,0,0,20));
        westPannel.add(lbl_login);
        westPannel.add(lbl_pass);

        JPanel centerPannel=new JPanel();
        centerPannel.setBackground(new Color(255,255,255));
        centerPannel.setLayout(new GridLayout(2,1,5,5));
        centerPannel.add(txt_login);
        centerPannel.add(txt_pass);

        formPanel.add(westPannel,BorderLayout.WEST);
        formPanel.add(centerPannel,BorderLayout.CENTER);




        //-----------Panneau buttons--------------
        initButtons();
        buttonsPannel= new JPanel();
        //changer la couleur du fond de mon panneau
        buttonsPannel.setBackground(new Color(51,153,255));
        //ajouter un padding(10,0,10,0)
        buttonsPannel.setBorder(new EmptyBorder(10,0,10,0));
        //affecter un flowLayout
        buttonsPannel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //ajouter titre au centre
        buttonsPannel.add(btn_login);
        buttonsPannel.add(btn_cancel);

    }





    public void initContainer(){
        //referencer ou attacher notre conteneur de base par la reference myViewContainer
        this.myViewContainer=this.getContentPane();
        //personnalisation de notre conteneur
        //affecter un BorderLayout a notre conteneur pour le decouper sous forme de Bords
        myViewContainer.setLayout(new BorderLayout());
        //ajouter les panneaux aux bords correspondants
        //initialiser et ajouter les panneaux aux bords correspondants
        initPanels();
        myViewContainer.add(titlePanel,BorderLayout.NORTH);
        myViewContainer.add(formPanel,BorderLayout.CENTER);

        myViewContainer.add(buttonsPannel,BorderLayout.SOUTH);



    }



    public Login(String title){
        //initialisation du conteneur principale
        initContainer();
        //titre
        setTitle(title);
        //dimensionner
        setSize(400,500);
        //la mettre au milieu
        setLocationRelativeTo(null);
        //fermer l application en fermant la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fixer la taille de la fenetre
        setResizable(false);
        //rendre la fenetre visible
        setVisible(true);
    }

   public static void main(String[] args) {
        new Login("Connexion");
    }


}
