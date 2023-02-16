package SWING;

import presentation.modele.Banque;
import presentation.modele.entitesDeLaBanque.Client;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankForm extends JFrame{
    private Container myViewContainer;
    private JPanel titlePanel,formPanel,buttonsPannel;
    private JLabel lbl_title,lbl_adress,lbl_tel,lbl_email,lbl_titlepan;
    private JTextField txt_title,txt_email,txt_tel,txt_adress;
    private JButton btn_add,btn_cancel,btn_delete;
    ClassLoader cl = getClass().getClassLoader();



    //constructeur
    public BankForm(String title){
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
        titlePanel.add(lbl_titlepan);

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
        westPannel.setLayout(new GridLayout(5,1,5,5));
        westPannel.setBorder(new EmptyBorder(0,0,0,20));
        westPannel.add(lbl_title);
        westPannel.add(lbl_adress);
        westPannel.add(lbl_email);
        westPannel.add(lbl_tel);

        JPanel centerPannel=new JPanel();
        centerPannel.setBackground(new Color(255,255,255));
        centerPannel.setLayout(new GridLayout(5,1,5,5));
        centerPannel.add(txt_title);
        centerPannel.add(txt_adress);
        centerPannel.add(txt_email);
        centerPannel.add(txt_tel);

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
        //---------------text title-------------
        //initialisation du label tTitre
        txt_title = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_title.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        txt_title.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_title.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text adress-------------
        //initialisation du label tTitre
        txt_adress = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_adress.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        txt_adress.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_adress.setHorizontalAlignment(JPasswordField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));


        //---------------text email-------------
        //initialisation du label tTitre
        txt_email = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_email.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        txt_email.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_email.setHorizontalAlignment(JPasswordField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));


        //---------------text tel-------------
        //initialisation du label tTitre
        txt_tel = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_tel.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        txt_tel.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_tel.setHorizontalAlignment(JPasswordField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));



    }




    //initlabels
    public void initLabels(){
        //---------------Label Titre-------------
        //initialisation du label Titre
        lbl_titlepan = new JLabel("Formulaire Banque");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_titlepan.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        lbl_titlepan.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_titlepan.setHorizontalAlignment(JLabel.CENTER);
        lbl_titlepan.setIcon(new ImageIcon(cl.getResource("images/icons/bankicon1.png")));

        //---------------Label add-------------
        //initialisation du label tTitre
        lbl_title = new JLabel("Nom");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_title.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_title.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_title.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        // }




        //---------------Label adress-------------
        //initialisation du label tTitre
        lbl_adress = new JLabel("Adresse");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_adress.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_adress.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_adress.setHorizontalAlignment(JLabel.CENTER);
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
        //lbl_title.setIcon(new ImageIcon(""));
        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom=txt_title.getText();
                String adresse=txt_adress.getText();
                String tel=txt_tel.getText();
                String email=txt_email.getText();

                // String sexe=  comboBox.getName();

                Banque banque=new Banque(nom,adresse,tel,email);

                System.out.println("Banque ajoutée avec succes");
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
        //lbl_title.setIcon(new ImageIcon(""));
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_title.setText("");
                txt_adress.setText("");
                txt_email.setText("");
                txt_tel.setText("");

                txt_title.requestFocus();
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
        new BankForm("Banque");
    }
}
