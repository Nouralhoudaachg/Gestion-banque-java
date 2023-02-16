package SWING;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bankoperations extends JFrame {
    private Container myViewContainer;
    private JButton btn_Withdrawall,btn_payment;
    private JTextField txt_mt;
    private JLabel lbl_mt,lbl_title;
    private JPanel titlePanel,formPanel,buttonsPannel;

    private double solde = 100.00;
    ClassLoader cl = getClass().getClassLoader();

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
public void initPanels(){
    initLabels();
    initTextFields();
    //-----------Panneau titre--------------

    titlePanel= new JPanel();
    //changer la couleur du fond de mon panneau
    titlePanel.setBackground(new Color(51,153,255));
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
    westPannel.setLayout(new GridLayout(8,1,5,5));
    westPannel.setBorder(new EmptyBorder(0,0,0,20));
    westPannel.add(lbl_mt);


    JPanel centerPannel=new JPanel();
    centerPannel.setBackground(new Color(255,255,255));
    centerPannel.setLayout(new GridLayout(8,1,5,5));
    centerPannel.add(txt_mt);


    formPanel.add(westPannel,BorderLayout.WEST);
    formPanel.add(centerPannel,BorderLayout.CENTER);

    //-----------Panneau buttons--------------
    initButtons();
    buttonsPannel= new JPanel();
    //changer la couleur du fond de mon panneau
    buttonsPannel.setBackground(new Color(255,255,255));
    //ajouter un padding(10,0,10,0)
    buttonsPannel.setBorder(new EmptyBorder(10,0,10,0));
    //affecter un flowLayout
    buttonsPannel.setLayout(new FlowLayout(FlowLayout.RIGHT));
    //ajouter titre au centre
    buttonsPannel.add(btn_Withdrawall);
    buttonsPannel.add(btn_payment);
    }

    private void initTextFields() {
        //---------------text mt-------------
        //initialisation du label tTitre
        txt_mt = new JTextField("");
        //personnalisation du label mt
        //modif de la police du texte
        txt_mt.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        txt_mt.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        txt_mt.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        }

    //constructeur
    public Bankoperations(String title){
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

    //initlabels
    public void initLabels(){
        //---------------Label Titre-------------
        //initialisation du label tTitre
        lbl_title = new JLabel("Operations bancaires");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_title.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        lbl_title.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_title.setHorizontalAlignment(JLabel.CENTER);
        lbl_title.setIcon(new ImageIcon(cl.getResource("images/icons/bankopeiconee1.png")));


        //titlePanel.add(lbl_title);




        //---------------Label mt-------------
        //initialisation du label mt
        lbl_mt = new JLabel("Montant");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_mt.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        lbl_mt.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        lbl_mt.setHorizontalAlignment(JLabel.CENTER);


}

    private void initButtons() {

        //---------------btn btn_Withdrawall-------------
        //initialisation du bouton btn_Withdrawall
        btn_Withdrawall = new JButton("Retrait");
        //personnalisation du label titre
        //modif de la police du texte
        btn_Withdrawall.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        btn_Withdrawall.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        btn_Withdrawall.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));}
        btn_Withdrawall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(txt_mt.getText());
                if (amount <= solde) {
                    solde -= amount;
                    lbl_mt.setText("Solde: " + solde);
                } else {
                    JOptionPane.showMessageDialog(null, "Montant insuffisant.");
                }
                txt_mt.setText("");
            }
            });



        //---------------btn btn_payment-------------
        //initialisation du bouton btn_payment
        btn_payment = new JButton("Versement");
        //personnalisation du label titre
        //modif de la police du texte
        btn_payment.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        btn_payment.setForeground(new Color(0, 0, 0));
        //alignement du texte au label au centre
        btn_payment.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));}
        btn_payment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(txt_mt.getText());
                solde += amount;
                lbl_mt.setText("Balance: " + solde);

            }
        });
    }


    public static void main(String[] args) {
        new Bankoperations("Operations bancaires");
    }}