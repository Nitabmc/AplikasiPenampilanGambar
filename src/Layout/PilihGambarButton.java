/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import java.awt.CardLayout;

/**
 *
 * @author ASUS
 */
public class PilihGambarButton extends javax.swing.JFrame {

    static Object getSelectItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPanel1 = new javax.swing.JPanel();
        btnGlassfish = new javax.swing.JButton();
        btnJavaEE = new javax.swing.JButton();
        btnPostgreSQL = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        Glassfish = new javax.swing.JLabel();
        JavaEE = new javax.swing.JLabel();
        PostgreSQL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGlassfish.setText("Glassfish");
        btnGlassfish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlassfishActionPerformed(evt);
            }
        });
        ButtonPanel1.add(btnGlassfish);

        btnJavaEE.setText("JavaEE");
        btnJavaEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJavaEEActionPerformed(evt);
            }
        });
        ButtonPanel1.add(btnJavaEE);

        btnPostgreSQL.setText("PostgreSQL");
        btnPostgreSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostgreSQLActionPerformed(evt);
            }
        });
        ButtonPanel1.add(btnPostgreSQL);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        ButtonPanel1.add(btnExit);

        getContentPane().add(ButtonPanel1, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        Glassfish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Glassfish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Layout/c.jpg"))); // NOI18N
        imagePanel.add(Glassfish, "0");

        JavaEE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JavaEE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Layout/download.jpg"))); // NOI18N
        imagePanel.add(JavaEE, "1");

        PostgreSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Layout/download (1).jpg"))); // NOI18N
        imagePanel.add(PostgreSQL, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJavaEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJavaEEActionPerformed
        // TODO add your handling code here:
         CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_btnJavaEEActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGlassfishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlassfishActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_btnGlassfishActionPerformed

    private void btnPostgreSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostgreSQLActionPerformed
        // TODO add your handling code here:
         CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_btnPostgreSQLActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel1;
    private javax.swing.JLabel Glassfish;
    private javax.swing.JLabel JavaEE;
    private javax.swing.JLabel PostgreSQL;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGlassfish;
    private javax.swing.JButton btnJavaEE;
    private javax.swing.JButton btnPostgreSQL;
    private javax.swing.JPanel imagePanel;
    // End of variables declaration//GEN-END:variables
}
