/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ajouterdivorce;
import Main.main;

public class divorcegui extends javax.swing.JFrame {

  public divorcegui() {
    initComponents();
  }

  private void initComponents() {

    jPanel1 = new window.jPanelGradiant();
    jLabel1 = new javax.swing.JLabel();
    divorce = new javax.swing.JButton();
    id = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    ddivorce = new com.toedter.calendar.JDateChooser();
    jLabel3 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setResizable(false);




    jLabel1.setText("ID");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 20, 20));

    divorce.setText("Divorcer");
    ajouterdivorce c = new ajouterdivorce();
    divorce.addActionListener(c);
    jPanel1.add(divorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));
    jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, 30));

    jLabel2.setText("Date de divorce");
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 20));
    jPanel1.add(ddivorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 100, 30));

    jLabel3.setFont(new java.awt.Font("FreeMono", 1, 48)); // NOI18N
    jLabel3.setText("Ajout De Divorce");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

    getContentPane()
        .add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 320));

    pack();
    setLocationRelativeTo(null);
  }

  public static void emptyfields() {
    id.setText(null);
    ddivorce.setDate(null);
  }

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new divorcegui().setVisible(true);
          }
        });
  }

  public static com.toedter.calendar.JDateChooser ddivorce;
  private javax.swing.JButton divorce;
  public static javax.swing.JTextField id;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
}
