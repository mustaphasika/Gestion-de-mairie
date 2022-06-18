package view;

import Main.main;
import classes.Mairie;
import javax.swing.*;
import java.awt.*;

public class window extends JFrame {

  public window() {
    initComponents();
  }

  public static class jPanelGradiant extends JPanel {
    protected void paintComponent(Graphics g) {
      Graphics2D g2d = (Graphics2D) g;
      int width = getWidth();
      int height = getHeight();

      Color color1 = new Color(125, 0, 101);
      Color color2 = new Color(6, 194, 217);
      GradientPaint gp = new GradientPaint(100, 50, color1, 180, height, color2);
      g2d.setPaint(gp);
      g2d.fillRect(0, 0, width, height);
    }
  }

  private void initComponents() {

    jPanel1 = new jPanelGradiant();
    divorce = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    naissance = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    mariage = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    saisirpers = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    afficheretat = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    afficherlist = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Menu");
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(153, 153, 255));
    jPanel1.setName(""); // NOI18N

    divorce.setBackground(new java.awt.Color(255, 255, 204));
    divorce.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            divorceMouseClicked(evt);
          }

          public void mouseEntered(java.awt.event.MouseEvent evt) {
            divorceMouseEntered(evt);
          }

          public void mouseExited(java.awt.event.MouseEvent evt) {
            divorceMouseExited(evt);
          }
        });

    jLabel4.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
    jLabel4.setText("Divorce");

    javax.swing.GroupLayout divorceLayout = new javax.swing.GroupLayout(divorce);
    divorce.setLayout(divorceLayout);
    divorceLayout.setHorizontalGroup(
        divorceLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                divorceLayout
                    .createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel4)
                    .addContainerGap(80, Short.MAX_VALUE)));
    divorceLayout.setVerticalGroup(
        divorceLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                divorceLayout
                    .createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel4)
                    .addContainerGap(41, Short.MAX_VALUE)));

    jPanel1.add(divorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 230, 100));

    naissance.setBackground(new java.awt.Color(255, 255, 204));
    naissance.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            naissanceMouseClicked(evt);
          }

          public void mouseEntered(java.awt.event.MouseEvent evt) {
            naissanceMouseEntered(evt);
          }

          public void mouseExited(java.awt.event.MouseEvent evt) {
            naissanceMouseExited(evt);
          }
        });

    jLabel3.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Naissance");

    javax.swing.GroupLayout naissanceLayout = new javax.swing.GroupLayout(naissance);
    naissance.setLayout(naissanceLayout);
    naissanceLayout.setHorizontalGroup(
        naissanceLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                naissanceLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                        jLabel3,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        198,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)));
    naissanceLayout.setVerticalGroup(
        naissanceLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                naissanceLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                        jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addContainerGap()));

    jPanel1.add(naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, 100));

    mariage.setBackground(new java.awt.Color(255, 255, 204));
    mariage.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            mariageMouseClicked(evt);
          }

          public void mouseEntered(java.awt.event.MouseEvent evt) {
            mariageMouseEntered(evt);
          }

          public void mouseExited(java.awt.event.MouseEvent evt) {
            mariageMouseExited(evt);
          }
        });

    jLabel1.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Mariage");

    javax.swing.GroupLayout mariageLayout = new javax.swing.GroupLayout(mariage);
    mariage.setLayout(mariageLayout);
    mariageLayout.setHorizontalGroup(
        mariageLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                mariageLayout
                    .createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(
                        jLabel1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        94,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)));
    mariageLayout.setVerticalGroup(
        mariageLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                mariageLayout
                    .createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel1)
                    .addContainerGap(43, Short.MAX_VALUE)));

    jPanel1.add(mariage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 230, 100));

    saisirpers.setBackground(new java.awt.Color(255, 255, 204));
    saisirpers.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            saisirpersMouseClicked(evt);
          }

          public void mouseEntered(java.awt.event.MouseEvent evt) {
            saisirpersMouseEntered(evt);
          }

          public void mouseExited(java.awt.event.MouseEvent evt) {
            saisirpersMouseExited(evt);
          }
        });

    jLabel2.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Saisir Personne");

    javax.swing.GroupLayout saisirpersLayout = new javax.swing.GroupLayout(saisirpers);
    saisirpers.setLayout(saisirpersLayout);
    saisirpersLayout.setHorizontalGroup(
        saisirpersLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                saisirpersLayout
                    .createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel2)
                    .addContainerGap(38, Short.MAX_VALUE)));
    saisirpersLayout.setVerticalGroup(
        saisirpersLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                saisirpersLayout
                    .createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel2)
                    .addContainerGap(43, Short.MAX_VALUE)));

    jPanel1.add(saisirpers, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 230, 100));

    afficheretat.setBackground(new java.awt.Color(255, 255, 204));
    afficheretat.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            afficheretatMouseClicked(evt);
          }

          public void mouseEntered(java.awt.event.MouseEvent evt) {
            afficheretatMouseEntered(evt);
          }

          public void mouseExited(java.awt.event.MouseEvent evt) {
            afficheretatMouseExited(evt);
          }
        });

    jLabel6.setFont(new java.awt.Font("FreeMono", 1, 15)); // NOI18N
    jLabel6.setText("Afficher etat personne");

    javax.swing.GroupLayout afficheretatLayout = new javax.swing.GroupLayout(afficheretat);
    afficheretat.setLayout(afficheretatLayout);
    afficheretatLayout.setHorizontalGroup(
        afficheretatLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                afficheretatLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6)
                    .addContainerGap(20, Short.MAX_VALUE)));
    afficheretatLayout.setVerticalGroup(
        afficheretatLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                afficheretatLayout
                    .createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabel6)
                    .addContainerGap(42, Short.MAX_VALUE)));

    jPanel1.add(afficheretat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 230, 100));

    afficherlist.setBackground(new java.awt.Color(255, 255, 204));
    afficherlist.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            afficherlistMouseClicked(evt);
          }

          public void mouseEntered(java.awt.event.MouseEvent evt) {
            afficherlistMouseEntered(evt);
          }

          public void mouseExited(java.awt.event.MouseEvent evt) {
            afficherlistMouseExited(evt);
          }
        });

    jLabel5.setFont(new java.awt.Font("FreeMono", 1, 15)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("Afficher liste personne");
    jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    javax.swing.GroupLayout afficherlistLayout = new javax.swing.GroupLayout(afficherlist);
    afficherlist.setLayout(afficherlistLayout);
    afficherlistLayout.setHorizontalGroup(
        afficherlistLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                afficherlistLayout
                    .createSequentialGroup()
                    .addComponent(
                        jLabel5,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        229,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)));
    afficherlistLayout.setVerticalGroup(
        afficherlistLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                afficherlistLayout
                    .createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jLabel5)
                    .addContainerGap(43, Short.MAX_VALUE)));

    jPanel1.add(
        afficherlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 230, 100));

    jLabel7.setFont(new java.awt.Font("FreeMono", 1, 52)); // NOI18N
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7.setText("MENU ");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 350, 60));

    getContentPane()
        .add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 530));

    pack();
    setLocationRelativeTo(null);
  }
  private void afficheretatMouseClicked(
      java.awt.event.MouseEvent evt) {
    etatpersonnegui e = new etatpersonnegui();
    e.setVisible(true);
  }

  private void afficherlistMouseClicked(
      java.awt.event.MouseEvent evt) {
    listpersonnegui l = new listpersonnegui();
    main.m.listpersonne();
    l.setVisible(true);
  }

  private void afficheretatMouseEntered(
      java.awt.event.MouseEvent evt) {
    setcolor1(afficheretat);
  }

  private void afficheretatMouseExited(
      java.awt.event.MouseEvent evt) {
    setcolor2(afficheretat);
  }

  private void afficherlistMouseEntered(
      java.awt.event.MouseEvent evt) {
    setcolor1(afficherlist);
  }

  private void afficherlistMouseExited(
      java.awt.event.MouseEvent evt) {
    setcolor2(afficherlist);
  }

  private void divorceMouseEntered(
      java.awt.event.MouseEvent evt) {
    setcolor1(divorce);
  }

  private void divorceMouseExited(
      java.awt.event.MouseEvent evt) {
    setcolor2(divorce);
  }

  private void saisirpersMouseClicked(
      java.awt.event.MouseEvent evt) {
    saisirperseonnegui m = new saisirperseonnegui();
    m.show();
  }

  private void saisirpersMouseEntered(
      java.awt.event.MouseEvent evt) {
    setcolor1(saisirpers);
  }

  private void saisirpersMouseExited(
      java.awt.event.MouseEvent evt) {
    setcolor2(saisirpers);
  }
  private void naissanceMouseEntered(
      java.awt.event.MouseEvent evt) {
    setcolor1(naissance);
  }

  private void naissanceMouseExited(
      java.awt.event.MouseEvent evt) {
    setcolor2(naissance);
  }

  private void naissanceMouseClicked(
      java.awt.event.MouseEvent evt) {
    naissancegui n = new naissancegui();
    n.setVisible(true);
  }

  private void divorceMouseClicked(
      java.awt.event.MouseEvent evt) {
    divorcegui d = new divorcegui();
    d.setVisible(true);
  }

  private void mariageMouseEntered(
      java.awt.event.MouseEvent evt) {
    setcolor1(mariage);
  }

  private void mariageMouseExited(
      java.awt.event.MouseEvent evt) {
    setcolor2(mariage);
  }

  private void mariageMouseClicked(
      java.awt.event.MouseEvent evt) {
    mariagegui m = new mariagegui();
    m.show();
  }

  public void setcolor1(JPanel p) {
    p.setBackground(new Color(137, 137, 137));
  }

  public void setcolor2(JPanel p) {
    p.setBackground(new Color(255, 255, 204));
  }

  public static void main(String args[]) {
    EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new window().setVisible(true);
          }
        });
  }

  private javax.swing.JPanel afficheretat;
  private javax.swing.JPanel afficherlist;
  private javax.swing.JPanel divorce;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel mariage;
  private javax.swing.JPanel naissance;
  private javax.swing.JPanel saisirpers;
}
