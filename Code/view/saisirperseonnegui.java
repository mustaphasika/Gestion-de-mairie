package view;

import Main.main;
import controller.ajouterpersonne;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class saisirperseonnegui extends javax.swing.JFrame {

  public saisirperseonnegui() {
    initComponents();
    sexe.setSelectedItem(null);
    etatc.setSelectedItem(null);
  }

    private void initComponents() {

        jPanel1 = new window.jPanelGradiant();
        adr = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        prénom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ajouter = new javax.swing.JButton();
        dnaissance = new com.toedter.calendar.JDateChooser();
        sexe = new javax.swing.JComboBox<>();
        etatc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jPanel1.add(adr, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 100, 40));
        adr.getAccessibleContext().setAccessibleName("");

        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, 40));
        nom.getAccessibleContext().setAccessibleName("");

        jPanel1.add(prénom, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 100, 40));
        prénom.getAccessibleContext().setAccessibleName("");

        jLabel1.setText("nom");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel2.setText("prénom");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jLabel3.setText("sexe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel4.setText("date de naissance");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jLabel5.setText("etat civile");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel6.setText("adresse");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        ajouter.setText("Ajouter");
        ajouterpersonne c = new ajouterpersonne();
        ajouter.addActionListener(c);
        jPanel1.add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));
        jPanel1.add(dnaissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 100, 40));

        sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));
        jPanel1.add(sexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 100, 40));

        etatc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Célibataire", "Marié(e)", "Divorcé(e)" }));
        jPanel1.add(etatc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 100, 40));

        jLabel7.setFont(new java.awt.Font("FreeMono", 1, 52)); // NOI18N
        jLabel7.setText("Saisir Personne");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

  public static void emptyfields() {
    nom.setText(null);
    prénom.setText(null);
    adr.setText(null);
    sexe.setSelectedItem(null);
    dnaissance.setDate(null);
    etatc.setSelectedItem(null);
  }

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new saisirperseonnegui().setVisible(true);
          }
        });
  }

    public static javax.swing.JTextField adr;
    public static javax.swing.JButton ajouter;
    public static com.toedter.calendar.JDateChooser dnaissance;
    public static javax.swing.JComboBox<String> etatc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField nom;
    public static javax.swing.JTextField prénom;
    public static javax.swing.JComboBox<String> sexe;
}
