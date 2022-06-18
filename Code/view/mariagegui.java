package view;

import classes.Mairie;
import Main.main;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import controller.ajoutermariage;

public class mariagegui extends javax.swing.JFrame {

  public mariagegui() {
    initComponents();
     }

    private void initComponents() {

        jPanel1 = new window.jPanelGradiant();
        lieumar = new javax.swing.JTextField();
        id1 = new javax.swing.JTextField();
        ajouter = new javax.swing.JButton();
        id2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);


        jPanel1.setBackground(new java.awt.Color(204, 0, 0));


        lieumar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(lieumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 180, 50));

        id1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 180, 50));

        ajouter.setText("Ajouter");
        ajoutermariage c = new ajoutermariage();
        ajouter.addActionListener(c);
        jPanel1.add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        id2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 180, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Lieu de mariage");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ID1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ID2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("FreeMono", 1, 48)); // NOI18N
        jLabel4.setText("Ajout De Mariage");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 410));

        pack();
        setLocationRelativeTo(null);
    }
public static void emptyfields(){
      id1.setText(null);
      id2.setText(null);
      lieumar.setText(null);
    }
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new mariagegui().setVisible(true);
          }
        });
  }


    private javax.swing.JButton ajouter;
    public static javax.swing.JTextField id1;
    public static javax.swing.JTextField id2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField lieumar;


}
