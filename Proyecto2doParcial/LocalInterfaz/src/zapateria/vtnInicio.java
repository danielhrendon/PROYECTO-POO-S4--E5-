/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author User
 */
public class vtnInicio extends javax.swing.JFrame
{

    /**
     * Creates new form vtnInicio
     */
    public vtnInicio()
    {
        initComponents();
        setIconImage(getIconImage());
    }

    //Icono del jframe
    @Override
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));

        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        btnFondo = new javax.swing.JPanel();
        btnFranjaSup = new javax.swing.JPanel();
        btnInicioSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnInicioSesion1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnRegistrarse1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnInformateAqui = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnInfoExtra = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInformateAqui1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnFondo.setBackground(new java.awt.Color(255, 255, 255));
        btnFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFondoMouseClicked(evt);
            }
        });
        btnFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFranjaSup.setBackground(new java.awt.Color(34, 22, 217));
        btnFranjaSup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFranjaSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFranjaSupMouseClicked(evt);
            }
        });
        btnFranjaSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicioSesion.setBackground(new java.awt.Color(0, 153, 204));
        btnInicioSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioSesionMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar sesión");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInicioSesionLayout = new javax.swing.GroupLayout(btnInicioSesion);
        btnInicioSesion.setLayout(btnInicioSesionLayout);
        btnInicioSesionLayout.setHorizontalGroup(
            btnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioSesionLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );
        btnInicioSesionLayout.setVerticalGroup(
            btnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        btnFranjaSup.add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 150, 30));

        btnRegistrarse.setBackground(new java.awt.Color(0, 204, 51));
        btnRegistrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registrarse");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarseLayout = new javax.swing.GroupLayout(btnRegistrarse);
        btnRegistrarse.setLayout(btnRegistrarseLayout);
        btnRegistrarseLayout.setHorizontalGroup(
            btnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarseLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(43, 43, 43))
        );
        btnRegistrarseLayout.setVerticalGroup(
            btnRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        btnFranjaSup.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 160, 30));

        btnInicioSesion1.setBackground(new java.awt.Color(0, 102, 255));
        btnInicioSesion1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnInicioSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicioSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioSesion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioSesion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioSesion1MouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Iniciar sesión");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInicioSesion1Layout = new javax.swing.GroupLayout(btnInicioSesion1);
        btnInicioSesion1.setLayout(btnInicioSesion1Layout);
        btnInicioSesion1Layout.setHorizontalGroup(
            btnInicioSesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioSesion1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(25, 25, 25))
        );
        btnInicioSesion1Layout.setVerticalGroup(
            btnInicioSesion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        btnFranjaSup.add(btnInicioSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 150, 30));

        btnRegistrarse1.setBackground(new java.awt.Color(51, 153, 0));
        btnRegistrarse1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnRegistrarse1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarse1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarse1MouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Registrarse");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarse1Layout = new javax.swing.GroupLayout(btnRegistrarse1);
        btnRegistrarse1.setLayout(btnRegistrarse1Layout);
        btnRegistrarse1Layout.setHorizontalGroup(
            btnRegistrarse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarse1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(43, 43, 43))
        );
        btnRegistrarse1Layout.setVerticalGroup(
            btnRegistrarse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        btnFranjaSup.add(btnRegistrarse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 160, 30));

        btnFondo.add(btnFranjaSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 546, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("El");
        btnFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 312, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("mejor");
        btnFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 309, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("en la comodidad de tu pie");
        btnFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 312, -1, -1));

        btnInformateAqui.setBackground(new java.awt.Color(51, 51, 255));
        btnInformateAqui.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnInformateAqui.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInformateAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformateAquiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInformateAquiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInformateAquiMouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 51, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("   Contamos con");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(">");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInformateAquiLayout = new javax.swing.GroupLayout(btnInformateAqui);
        btnInformateAqui.setLayout(btnInformateAquiLayout);
        btnInformateAquiLayout.setHorizontalGroup(
            btnInformateAquiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInformateAquiLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnInformateAquiLayout.setVerticalGroup(
            btnInformateAquiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInformateAquiLayout.createSequentialGroup()
                .addGroup(btnInformateAquiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnFondo.add(btnInformateAqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        btnInfoExtra.setBackground(new java.awt.Color(51, 51, 255));
        btnInfoExtra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("-Caballero");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("-Dama");

        javax.swing.GroupLayout btnInfoExtraLayout = new javax.swing.GroupLayout(btnInfoExtra);
        btnInfoExtra.setLayout(btnInfoExtraLayout);
        btnInfoExtraLayout.setHorizontalGroup(
            btnInfoExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInfoExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnInfoExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnInfoExtraLayout.setVerticalGroup(
            btnInfoExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInfoExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFondo.add(btnInfoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 110, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/4.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 250, 140));

        btnInformateAqui1.setBackground(new java.awt.Color(51, 51, 255));
        btnInformateAqui1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnInformateAqui1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInformateAqui1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformateAqui1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInformateAqui1MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contamos con");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(">");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInformateAqui1Layout = new javax.swing.GroupLayout(btnInformateAqui1);
        btnInformateAqui1.setLayout(btnInformateAqui1Layout);
        btnInformateAqui1Layout.setHorizontalGroup(
            btnInformateAqui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInformateAqui1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(6, 6, 6))
        );
        btnInformateAqui1Layout.setVerticalGroup(
            btnInformateAqui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInformateAqui1Layout.createSequentialGroup()
                .addGroup(btnInformateAqui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnFondo.add(btnInformateAqui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel8MouseClicked
    {//GEN-HEADEREND:event_jLabel8MouseClicked
        btnInfoExtra.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnFondoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnFondoMouseClicked
    {//GEN-HEADEREND:event_btnFondoMouseClicked
        this.btnInfoExtra.setVisible(false);
    }//GEN-LAST:event_btnFondoMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        new vtnIniciarSesion().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnInicioSesionMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInicioSesionMouseClicked
    {//GEN-HEADEREND:event_btnInicioSesionMouseClicked
        new vtnIniciarSesion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioSesionMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel3MouseClicked
    {//GEN-HEADEREND:event_jLabel3MouseClicked
        new vtnRegistrarse().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnRegistrarseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnRegistrarseMouseClicked
    {//GEN-HEADEREND:event_btnRegistrarseMouseClicked
        new vtnRegistrarse().setVisible(true);
    }//GEN-LAST:event_btnRegistrarseMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        this.btnInfoExtra.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnInformateAquiMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInformateAquiMouseClicked
    {//GEN-HEADEREND:event_btnInformateAquiMouseClicked
        btnInfoExtra.setVisible(true);
    }//GEN-LAST:event_btnInformateAquiMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel6MouseClicked
    {//GEN-HEADEREND:event_jLabel6MouseClicked
        this.btnInfoExtra.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnFranjaSupMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnFranjaSupMouseClicked
    {//GEN-HEADEREND:event_btnFranjaSupMouseClicked
        this.btnInfoExtra.setVisible(false);
    }//GEN-LAST:event_btnFranjaSupMouseClicked

    private void btnInicioSesionMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInicioSesionMouseEntered
    {//GEN-HEADEREND:event_btnInicioSesionMouseEntered
        btnInicioSesion.setVisible(false);
    }//GEN-LAST:event_btnInicioSesionMouseEntered

    private void btnInicioSesionMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInicioSesionMouseExited
    {//GEN-HEADEREND:event_btnInicioSesionMouseExited
        btnInicioSesion1.setVisible(true);
    }//GEN-LAST:event_btnInicioSesionMouseExited

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseExited
    {//GEN-HEADEREND:event_jLabel1MouseExited
        btnInicioSesion1.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel12MouseClicked
    {//GEN-HEADEREND:event_jLabel12MouseClicked
        new vtnIniciarSesion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel12MouseExited
    {//GEN-HEADEREND:event_jLabel12MouseExited
        btnInicioSesion.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseExited

    private void btnInicioSesion1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInicioSesion1MouseClicked
    {//GEN-HEADEREND:event_btnInicioSesion1MouseClicked
        new vtnIniciarSesion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioSesion1MouseClicked

    private void btnInicioSesion1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInicioSesion1MouseEntered
    {//GEN-HEADEREND:event_btnInicioSesion1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioSesion1MouseEntered

    private void btnInicioSesion1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInicioSesion1MouseExited
    {//GEN-HEADEREND:event_btnInicioSesion1MouseExited
        btnInicioSesion.setVisible(true);
    }//GEN-LAST:event_btnInicioSesion1MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel13MouseClicked
    {//GEN-HEADEREND:event_jLabel13MouseClicked
        new vtnRegistrarse().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void btnRegistrarse1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnRegistrarse1MouseClicked
    {//GEN-HEADEREND:event_btnRegistrarse1MouseClicked
        new vtnRegistrarse().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarse1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseEntered
    {//GEN-HEADEREND:event_jLabel1MouseEntered
        btnInicioSesion.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void btnRegistrarseMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnRegistrarseMouseEntered
    {//GEN-HEADEREND:event_btnRegistrarseMouseEntered
        btnRegistrarse.setVisible(false);
    }//GEN-LAST:event_btnRegistrarseMouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel3MouseEntered
    {//GEN-HEADEREND:event_jLabel3MouseEntered
        btnRegistrarse.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void btnRegistrarse1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnRegistrarse1MouseExited
    {//GEN-HEADEREND:event_btnRegistrarse1MouseExited
        btnRegistrarse.setVisible(true);
    }//GEN-LAST:event_btnRegistrarse1MouseExited

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel13MouseExited
    {//GEN-HEADEREND:event_jLabel13MouseExited
        btnRegistrarse.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel14MouseClicked
    {//GEN-HEADEREND:event_jLabel14MouseClicked
        this.btnInfoExtra.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel15MouseClicked
    {//GEN-HEADEREND:event_jLabel15MouseClicked
        this.btnInfoExtra.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btnInformateAqui1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInformateAqui1MouseClicked
    {//GEN-HEADEREND:event_btnInformateAqui1MouseClicked
        this.btnInfoExtra.setVisible(true);
    }//GEN-LAST:event_btnInformateAqui1MouseClicked

    private void btnInformateAquiMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInformateAquiMouseEntered
    {//GEN-HEADEREND:event_btnInformateAquiMouseEntered
        btnInformateAqui.setVisible(false);
        btnInfoExtra.setVisible(true);
    }//GEN-LAST:event_btnInformateAquiMouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel8MouseEntered
    {//GEN-HEADEREND:event_jLabel8MouseEntered
        btnInformateAqui.setVisible(false);
        btnInfoExtra.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel6MouseEntered
    {//GEN-HEADEREND:event_jLabel6MouseEntered
        btnInformateAqui.setVisible(false);
        btnInfoExtra.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void btnInformateAqui1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInformateAqui1MouseExited
    {//GEN-HEADEREND:event_btnInformateAqui1MouseExited
        btnInformateAqui.setVisible(true);
    }//GEN-LAST:event_btnInformateAqui1MouseExited

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel14MouseExited
    {//GEN-HEADEREND:event_jLabel14MouseExited
        btnInformateAqui.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel15MouseExited
    {//GEN-HEADEREND:event_jLabel15MouseExited
        btnInformateAqui.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseExited

    private void btnInformateAquiMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnInformateAquiMouseExited
    {//GEN-HEADEREND:event_btnInformateAquiMouseExited
        btnInfoExtra.setVisible(false);
    }//GEN-LAST:event_btnInformateAquiMouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel8MouseExited
    {//GEN-HEADEREND:event_jLabel8MouseExited
        btnInfoExtra.setVisible(false);
        btnInfoExtra.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel6MouseExited
    {//GEN-HEADEREND:event_jLabel6MouseExited
        btnInfoExtra.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(vtnInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(vtnInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(vtnInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(vtnInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new vtnInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnFondo;
    private javax.swing.JPanel btnFranjaSup;
    private javax.swing.JPanel btnInfoExtra;
    private javax.swing.JPanel btnInformateAqui;
    private javax.swing.JPanel btnInformateAqui1;
    private javax.swing.JPanel btnInicioSesion;
    private javax.swing.JPanel btnInicioSesion1;
    private javax.swing.JPanel btnRegistrarse;
    private javax.swing.JPanel btnRegistrarse1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}