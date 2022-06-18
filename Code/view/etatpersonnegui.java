/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.etatpersonne;
import Main.main;

public class etatpersonnegui extends javax.swing.JFrame {

  /** Creates new form etatpersonne */
  public etatpersonnegui() {
    initComponents();
  }

  private void initComponents() {

    jPanel2 = new window.jPanelGradiant();
    id = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    afficher = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setResizable(false);

    jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 97, 32));

    jLabel1.setText("ID");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

    afficher.setText("Afficher etat");
    etatpersonne c = new etatpersonne();
    afficher.addActionListener(c);
    jPanel2.add(afficher, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

    table.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {
              "ID",
              "Nom",
              "Prénom",
              "Sexe",
              "Date de Naissance",
              "Nom du Conjoint",
              "Prénom du Conjoint"
            }) {
          boolean[] canEdit = new boolean[] {false, false, false, false, false, false, false};

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    jScrollPane1.setViewportView(table);
    if (table.getColumnModel().getColumnCount() > 0) {
      table.getColumnModel().getColumn(0).setMinWidth(30);
      table.getColumnModel().getColumn(0).setPreferredWidth(30);
      table.getColumnModel().getColumn(0).setMaxWidth(30);
      table.getColumnModel().getColumn(3).setMinWidth(70);
      table.getColumnModel().getColumn(3).setPreferredWidth(70);
      table.getColumnModel().getColumn(3).setMaxWidth(70);
    }

    jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 780, 450));

    getContentPane()
        .add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 530));

    pack();
    setLocationRelativeTo(null);
  }

  public static void emptyfields() {
    id.setText(null);
  }

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new etatpersonnegui().setVisible(true);
          }
        });
  }

  public static javax.swing.JButton afficher;
  public static javax.swing.JTextField id;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  public static javax.swing.JTable table;
}
