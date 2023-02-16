package SWING;

import presentation.modele.Banque;
import presentation.modele.Compte;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class AccountForm extends JFrame {
    private Container myViewContainer;
    private JPanel titlePanel,formPanel,buttonsPannel;
    private JLabel lbl_title,lbl_solde,lbl_prop;
    private JTextField txt_solde,txt_prop;
    private JButton btn_add,btn_cancel,btn_delete;
    ClassLoader cl = getClass().getClassLoader();



    //constructeur
    public AccountForm(String title){
        //initialisation du conteneur principale
        initContainer();
        //titre
        setTitle(title);
        //dimensionner
        setSize(600,500);
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
        //affecter un FlowLayout a notre titlePannel pour ajouter les elements sous forme d uFForn flux horizontal
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
        westPannel.setLayout(new GridLayout(2,1,5,5));
        westPannel.setBorder(new EmptyBorder(0,0,0,20));
        westPannel.add(lbl_solde);
        westPannel.add(lbl_prop);

        JPanel centerPannel=new JPanel();
        centerPannel.setBackground(new Color(255,255,255));
        centerPannel.setLayout(new GridLayout(2,1,5,5));
        centerPannel.add(txt_solde);
        centerPannel.add(txt_prop);


        formPanel.add(westPannel,BorderLayout.WEST);
        formPanel.add(centerPannel,BorderLayout.CENTER);




        //-----------Panneau buttons--------------
        initButtons();
        buttonsPannel= new JPanel();
        //changer la couleur du fond de mon panneau
        buttonsPannel.setBackground(new Color(	51,153,255));
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
        //---------------text solde-------------
        //initialisation du label tTitre
        txt_solde = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_solde.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        txt_solde.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_solde.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //txt_solde.setIcon(new ImageIcon(""));

        //---------------text proprietaire-------------
        //initialisation du label tTitre
        txt_prop = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_prop.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        txt_prop.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_prop.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //txt_prop.setIcon(new ImageIcon(""));



    }




    //initlabels
    public void initLabels(){
        //---------------Label Titre-------------
        //initialisation du label tTitre
        lbl_title = new JLabel("COMPTE BANCAIRE");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_title.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        lbl_title.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_title.setHorizontalAlignment(JLabel.CENTER);
        lbl_title.setIcon(new ImageIcon(cl.getResource("images/icons/bqacc11.png")));


        //---------------Label solde-------------
        //initialisation du label tTitre
        lbl_solde = new JLabel("Proprietaire");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_solde.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_solde.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_solde.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        // }




        //---------------Label proprietaire-------------
        //initialisation du label tTitre
        lbl_prop = new JLabel("Solde");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_prop.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_prop.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_prop.setHorizontalAlignment(JLabel.CENTER);
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
        btn_add.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        btn_add.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String proprietaire=txt_prop.getText();
                float solde= txt_solde.getAlignmentX();




                Compte cp=new Compte(proprietaire,solde);

                System.out.println("Compte ajouté avec succes");
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
        btn_delete.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        btn_delete.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_prop.setText("");
                txt_solde.setText("");

                txt_solde.requestFocus();
            }
        });




        //---------------btn cancel-------------
        //initialisation du bouton login
        btn_cancel= new JButton("Annuler");
        //personnalisation du label titre
        //modif de la police du texte
        btn_cancel.setFont(new Font("optima",Font.BOLD,17));
        //modif de la couleur du texte
        btn_cancel.setForeground(new Color(0, 0, 0));
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
        new AccountForm("Compte client");
    }
}
