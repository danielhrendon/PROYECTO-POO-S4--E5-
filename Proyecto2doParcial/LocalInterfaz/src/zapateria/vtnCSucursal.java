/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;

import static zapateria.vtnPrincipal.obj;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class vtnCSucursal extends javax.swing.JFrame
{

    /**
     * Creates new form vtnASucu
     */
    public vtnCSucursal()
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        posSucu = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JPanel();
        aceptar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        cancelar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        muestraA = new javax.swing.JTextPane();
        logo = new javax.swing.JLabel();
        btnAceptar1 = new javax.swing.JPanel();
        aceptar1 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JPanel();
        cancelar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar información");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 290, 30));

        posSucu.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        posSucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posSucuActionPerformed(evt);
            }
        });
        posSucu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                posSucuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                posSucuKeyTyped(evt);
            }
        });
        jPanel1.add(posSucu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 50, 30));

        btnAceptar.setBackground(new java.awt.Color(0, 204, 51));
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
        });
        btnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAceptarKeyPressed(evt);
            }
        });

        aceptar.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aceptar.setText("ACEPTAR");
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnAceptarLayout = new javax.swing.GroupLayout(btnAceptar);
        btnAceptar.setLayout(btnAceptarLayout);
        btnAceptarLayout.setHorizontalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        btnAceptarLayout.setVerticalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAceptarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 40));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelar.setText("CERRAR");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 240, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Digite la posición de la sucursal :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 410, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 120));

        jScrollPane1.setViewportView(muestraA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 370, 310));
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 70, 30));

        btnAceptar1.setBackground(new java.awt.Color(0, 204, 51));
        btnAceptar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnAceptar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptar1MouseExited(evt);
            }
        });
        btnAceptar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAceptar1KeyPressed(evt);
            }
        });

        aceptar1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        aceptar1.setForeground(new java.awt.Color(255, 255, 255));
        aceptar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aceptar1.setText("ACEPTAR");
        aceptar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aceptar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAceptar1Layout = new javax.swing.GroupLayout(btnAceptar1);
        btnAceptar1.setLayout(btnAceptar1Layout);
        btnAceptar1Layout.setHorizontalGroup(
            btnAceptar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aceptar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        btnAceptar1Layout.setVerticalGroup(
            btnAceptar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAceptar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 40));

        btnCancelar1.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar1MouseExited(evt);
            }
        });
        btnCancelar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelar1KeyPressed(evt);
            }
        });

        cancelar1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        cancelar1.setForeground(new java.awt.Color(255, 255, 255));
        cancelar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelar1.setText("CANCELAR");
        cancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelar1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCancelar1Layout = new javax.swing.GroupLayout(btnCancelar1);
        btnCancelar1.setLayout(btnCancelar1Layout);
        btnCancelar1Layout.setHorizontalGroup(
            btnCancelar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        btnCancelar1Layout.setVerticalGroup(
            btnCancelar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void posSucuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_posSucuActionPerformed
    {//GEN-HEADEREND:event_posSucuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posSucuActionPerformed

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cancelarMouseClicked
    {//GEN-HEADEREND:event_cancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptarKeyPressed
    {//GEN-HEADEREND:event_btnAceptarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void aceptarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_aceptarMouseClicked
    {//GEN-HEADEREND:event_aceptarMouseClicked
        try
        {
            if (!"".equals(posSucu.getText()))
            {
                if (Integer.parseInt(posSucu.getText()) < obj.getAutoServicios().size() && Integer.parseInt(posSucu.getText()) >= 0)
                {
                    muestraA.setText(obj.consultaAgen(Integer.parseInt(posSucu.getText())));

                } else
                {
                    Mensaje.error(this, "No existe esa posición de sucursal.");
                }
            } else
            {
                Mensaje.error(this, "Debe teclear la posición de una sucursal. Para salir, presione cancelar.");
            }

        } catch (Exception e)
        {
            Mensaje.error(this, "Se esperaba un número entero");
        }


    }//GEN-LAST:event_aceptarMouseClicked

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnCancelarKeyPressed
    {//GEN-HEADEREND:event_btnCancelarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void posSucuKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_posSucuKeyTyped
    {//GEN-HEADEREND:event_posSucuKeyTyped
        Validaciones.validaEntero(evt, 3, posSucu.getText());
    }//GEN-LAST:event_posSucuKeyTyped

    private void posSucuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_posSucuKeyPressed
    {//GEN-HEADEREND:event_posSucuKeyPressed
        Validaciones.enter(this, evt, new JTextField());
        if (evt.getKeyChar() == '\n')
        {
            if (!"".equals(posSucu.getText()))
            {
                if (Integer.parseInt(posSucu.getText()) < obj.getAutoServicios().size() && Integer.parseInt(posSucu.getText()) >= 0)
                {
                    muestraA.setText(obj.consultaAgen(Integer.parseInt(posSucu.getText())));
                } else
                {
                    Mensaje.error(this, "No existe esa posición de sucursal.");
                }
            } else
            {
                Mensaje.error(this, "Debe teclear la posición de una sucursal. Para salir, presione cancelar.");
            }
        }

    }//GEN-LAST:event_posSucuKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void aceptarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_aceptarMouseEntered
    {//GEN-HEADEREND:event_aceptarMouseEntered
        btnAceptar.setVisible(false);
    }//GEN-LAST:event_aceptarMouseEntered

    private void aceptar1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_aceptar1MouseClicked
    {//GEN-HEADEREND:event_aceptar1MouseClicked
        try
        {
            if (!"".equals(posSucu.getText()))
            {
                if (Integer.parseInt(posSucu.getText()) < obj.getAutoServicios().size() && Integer.parseInt(posSucu.getText()) >= 0)
                {
                    muestraA.setText(obj.consultaAgen(Integer.parseInt(posSucu.getText())));

                } else
                {
                    Mensaje.error(this, "No existe esa posición de sucursal.");
                }
            } else
            {
                Mensaje.error(this, "Debe teclear la posición de una sucursal. Para salir, presione cancelar.");
            }

        } catch (Exception e)
        {
            Mensaje.error(this, "Se esperaba un número entero");
        }


    }//GEN-LAST:event_aceptar1MouseClicked

    private void aceptar1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_aceptar1MouseEntered
    {//GEN-HEADEREND:event_aceptar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptar1MouseEntered

    private void btnAceptar1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptar1KeyPressed
    {//GEN-HEADEREND:event_btnAceptar1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptar1KeyPressed

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAceptarMouseEntered
    {//GEN-HEADEREND:event_btnAceptarMouseEntered
        btnAceptar.setVisible(false);
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptar1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnAceptar1MouseExited
    {//GEN-HEADEREND:event_btnAceptar1MouseExited
        btnAceptar.setVisible(true);
    }//GEN-LAST:event_btnAceptar1MouseExited

    private void cancelar1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cancelar1MouseClicked
    {//GEN-HEADEREND:event_cancelar1MouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelar1MouseClicked

    private void btnCancelar1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnCancelar1KeyPressed
    {//GEN-HEADEREND:event_btnCancelar1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar1KeyPressed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnCancelarMouseEntered
    {//GEN-HEADEREND:event_btnCancelarMouseEntered
        btnCancelar.setVisible(false);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelar1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnCancelar1MouseExited
    {//GEN-HEADEREND:event_btnCancelar1MouseExited
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnCancelar1MouseExited

    private void aceptar1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_aceptar1MouseExited
    {//GEN-HEADEREND:event_aceptar1MouseExited
        btnAceptar.setVisible(true);
    }//GEN-LAST:event_aceptar1MouseExited

    private void cancelarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cancelarMouseEntered
    {//GEN-HEADEREND:event_cancelarMouseEntered
        btnCancelar.setVisible(false);
    }//GEN-LAST:event_cancelarMouseEntered

    private void cancelar1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cancelar1MouseExited
    {//GEN-HEADEREND:event_cancelar1MouseExited
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_cancelar1MouseExited

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
            java.util.logging.Logger.getLogger(vtnCSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(vtnCSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(vtnCSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(vtnCSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new vtnCSucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptar;
    private javax.swing.JLabel aceptar1;
    private javax.swing.JPanel btnAceptar;
    private javax.swing.JPanel btnAceptar1;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnCancelar1;
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel cancelar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextPane muestraA;
    private javax.swing.JTextField posSucu;
    // End of variables declaration//GEN-END:variables
}
