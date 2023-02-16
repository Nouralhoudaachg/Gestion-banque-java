package SWING;

import presentation.modele.Sexe;
import presentation.modele.entitesDeLaBanque.Client;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientForm extends JFrame{
    private Container myViewContainer;
    private JPanel titlePanel,formPanel,buttonsPannel;
    private JLabel lbl_title,lbl_login,lbl_pass,lbl_email,lbl_tel,lbl_cin,lbl_sexe,lbl_nom,lbl_prenom,lbl_confirm;
    private JTextField txt_login,txt_email,txt_tel,txt_cin,txt_nom,txt_prenom;
    private JPasswordField txt_pass,txt_confirm;

    String[] sexe = {"Feminin", "Masculin"};
    JComboBox<String> comboBox = new JComboBox<>(sexe);
    private JButton btn_add,btn_cancel,btn_delete;

    ClassLoader cl = getClass().getClassLoader();



    //constructeur
    public ClientForm(String title){
        //initialisation du conteneur principale
        initContainer();
        //titre
        setTitle(title);
        //dimensionner
        setSize(600,600);
        //la mettre au milieu
        setLocationRelativeTo(null);
        //fermer l application en fermant la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fixer la taille de la fenetre
        setResizable(false);
        //rendre la fenetre visible
        setVisible(true);
    }





    //init container
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




    //initpanels
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
    //ajouter titre au centre
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
    westPannel.setLayout(new GridLayout(9,1,5,5));
    westPannel.setBorder(new EmptyBorder(0,0,0,20));
    westPannel.add(lbl_nom);
    westPannel.add(lbl_prenom);
    westPannel.add(lbl_login);
    westPannel.add(lbl_pass);
    westPannel.add(lbl_confirm);
    westPannel.add(lbl_cin);
    westPannel.add(lbl_email);
    westPannel.add(lbl_tel);
    westPannel.add(lbl_sexe);

    JPanel centerPannel=new JPanel();
    centerPannel.setBackground(new Color(255,255,255));
    centerPannel.setLayout(new GridLayout(9,1,5,5));
    centerPannel.add(txt_nom);
    centerPannel.add(txt_prenom);
    centerPannel.add(txt_login);
    centerPannel.add(txt_pass);
    centerPannel.add(txt_confirm);
    centerPannel.add(txt_cin);
    centerPannel.add(txt_email);
    centerPannel.add(txt_tel);
    centerPannel.add(comboBox);

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
    buttonsPannel.add(btn_add);
    buttonsPannel.add(btn_delete);
    buttonsPannel.add(btn_cancel);

}
    //inittextfields

    private void initTextFields() {
        //---------------text login-------------
        //initialisation du label tTitre
        txt_login = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_login.setFont(new Font("optima", Font.BOLD, 14));
        //modif de la couleur du texte
        txt_login.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_login.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));


        //---------------text pass-------------
        //initialisation du label tTitre
        txt_pass = new JPasswordField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_pass.setFont(new Font("optima", Font.BOLD, 14));
        //modif de la couleur du texte
        txt_pass.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_pass.setHorizontalAlignment(JPasswordField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));


        //---------------text  confirm pass-------------
        //initialisation du label tTitre
        txt_confirm = new JPasswordField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_confirm.setFont(new Font("optima", Font.BOLD, 14));
        //modif de la couleur du texte
        txt_confirm.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_confirm.setHorizontalAlignment(JPasswordField.CENTER);
        //ajout icone
        //txt_confirm.setIcon(new ImageIcon(""));


        //---------------text cin-------------
        //initialisation du label tTitre
        txt_cin = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_cin.setFont(new Font("optima", Font.BOLD, 14));
        //modif de la couleur du texte
        txt_cin.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_cin.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));


        //---------------text email-------------
        //initialisation du label tTitre
        txt_email = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_email.setFont(new Font("optima", Font.BOLD, 14));
        //modif de la couleur du texte
        txt_email.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_email.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text tel-------------
        //initialisation du label tTitre
        txt_tel = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_tel.setFont(new Font("optima", Font.BOLD, 14));
        //modif de la couleur du texte
        txt_tel.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_tel.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text nom-------------
        //initialisation du label tTitre
        txt_nom = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_nom.setFont(new Font("optima", Font.BOLD, 14));
        //modif de la couleur du texte
        txt_nom.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_nom.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //txt_nom.setIcon(new ImageIcon(""));



        //---------------text prenom-------------
        //initialisation du label tTitre
        txt_prenom = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_prenom.setFont(new Font("optima", Font.BOLD, 14));
        //modif de la couleur du texte
        txt_prenom.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_prenom.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //txt_prenom.setIcon(new ImageIcon(""));

    }




    //initlabels
    public void initLabels(){
    //---------------Label Titre-------------
    //initialisation du label tTitre
    lbl_title = new JLabel("Formulaire Client");

    //personnalisation du label titre
    //modif de la police du texte
        lbl_title.setFont(new Font("optima", Font.BOLD, 30));
    //modif de la couleur du texte
        lbl_title.setForeground(new Color(0, 0, 0));
    //alignement du texte au label au centre
        lbl_title.setHorizontalAlignment(JLabel.CENTER);
        lbl_title.setIcon(new ImageIcon(cl.getResource("images/icons/iconeuser64.png")));


    //---------------Label login-------------
    //initialisation du label tTitre
    lbl_login = new JLabel("Login");
    //cgpt
        /**ImageIcon icon = new ImageIcon("\\images\\icons\\usericon.png");
        lbl_login.setIcon(icon);**/
        //cgpt
    //personnalisation du label login
    //modif de la police du texte
        lbl_login.setFont(new Font("optima", Font.BOLD, 17));
    //modif de la couleur du texte
        lbl_login.setForeground(new Color(0, 0, 0));
    //alignement du texte au label au centre
        lbl_login.setHorizontalAlignment(JLabel.CENTER);
    //ajout icone

        // }




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
        //lbl_pass.setIcon(new ImageIcon(""));



        //---------------Label confirm  password-------------
        //initialisation du label tTitre
        lbl_confirm = new JLabel("Confirmer mdp");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_confirm.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_confirm.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_confirm.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_confirm.setIcon(new ImageIcon(""));



        //---------------Label cin-------------
        //initialisation du label tTitre
        lbl_cin = new JLabel("CIN");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_cin.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_cin.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_cin.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_pass.setIcon(new ImageIcon(""));



        //---------------Label email-------------
        //initialisation du label tTitre
        lbl_email = new JLabel("Email");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_email.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_email.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_email.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_pass.setIcon(new ImageIcon(""));


        //---------------Label tel-------------
        //initialisation du label tTitre
        lbl_tel = new JLabel("Telephone");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_tel.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_tel.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_tel.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_pass.setIcon(new ImageIcon(""));


        //---------------Label nom-------------
        //initialisation du label tTitre
        lbl_nom = new JLabel("Nom");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_nom.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_nom.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_nom.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_nom.setIcon(new ImageIcon(""));


        //---------------Label prenom-------------
        //initialisation du label tTitre
        lbl_prenom = new JLabel("Prenom");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_prenom.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_prenom.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_prenom.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_prenom.setIcon(new ImageIcon(""));


        //---------------Label sexe-------------
        //initialisation du label tTitre
        lbl_sexe = new JLabel("Sexe");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_sexe.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_sexe.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_sexe.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_sexe.setIcon(new ImageIcon(""));
    }








        //initbuttons
    private void initButtons(){

        //---------------btn add-------------
        //initialisation du bouton login
        btn_add= new JButton("Ajouter");
        //personnalisation du label titre
        //modif de la police du texte
        btn_add.setFont(new Font("optima",Font.BOLD,17));
        //modif de la couleur du texte
        btn_add.setForeground(new Color(0,0,0));
        //alignement du texte au label au centre
        btn_add.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //btn_add.setIcon(new ImageIcon("/images/icons/addHover.png"));

        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login=txt_login.getText();
                String mdp=txt_pass.getText();
                String conf=txt_confirm.getText();
                String nom=txt_nom.getText();
                String prenom=txt_prenom.getText();
                String email=txt_email.getText();
                String cin=txt_cin.getText();
                String tel=txt_tel.getText();
               // String sexe=  comboBox.getName();

                Client client=new Client(login,mdp,nom,prenom,email,cin,tel);

                System.out.println("Client ajouté avec succes");
                dispose();
            }
        });

        //---------------btn delete-------------
        //initialisation du bouton login
        btn_delete= new JButton("Effacer");
        //personnalisation du label titre
        //modif de la police du texte
        btn_delete.setFont(new Font("optima",Font.BOLD,17));
        //modif de la couleur du texte
        btn_delete.setForeground(new Color(0,0,0));
        //alignement du texte au label au centre
        btn_delete.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //btn_delete.setIcon(new ImageIcon("images/crud/delete"));
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_login.setText("");
                txt_pass.setText("");
                txt_confirm.setText("");
                txt_cin.setText("");
                txt_email.setText("");
                txt_tel.setText("");
                txt_nom.setText("");
                txt_prenom.setText("");

                txt_nom.requestFocus();
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

    public static void main(String[] args) {
       new ClientForm("Client");
    }





}
