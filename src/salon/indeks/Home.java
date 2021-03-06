/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon.indeks;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Muhammad Husni Farid
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        Panel.add(flayanan);
        Panel.add(ppegawai);
        Panel.add(fregistrasi);
        Panel.add(llaporan);
        Panel.add(member1);
    }

    
    
    private layanan flayanan = new layanan();
    private pgwai ppegawai = new pgwai();
    private regist fregistrasi = new regist();
    private laporan llaporan = new laporan();
    private member member1 = new member();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new usu.widget.glass.PanelGlass();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuLayanan = new javax.swing.JMenuItem();
        menupegawai = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuLogout = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mitemregist = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnlaporan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEM INFORMASI QUEEN SALON");
        setMinimumSize(new java.awt.Dimension(500, 500));

        Panel.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/gambar/background2.jpg"))); // NOI18N
        Panel.setMinimumSize(new java.awt.Dimension(720, 480));
        Panel.setLayout(new java.awt.GridBagLayout());

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 51));
        jMenuBar1.setFocusCycleRoot(true);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setRequestFocusEnabled(false);

        jMenu1.setText("File");

        MenuLayanan.setText("Layanan");
        MenuLayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLayananActionPerformed(evt);
            }
        });
        jMenu1.add(MenuLayanan);

        menupegawai.setText("Pegawai");
        menupegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupegawaiActionPerformed(evt);
            }
        });
        jMenu1.add(menupegawai);

        jMenuItem3.setText("Member");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        MenuLogout.setText("Log Out");
        MenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLogoutActionPerformed(evt);
            }
        });
        MenuLogout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MenuLogoutKeyPressed(evt);
            }
        });
        jMenu1.add(MenuLogout);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Transaksi");

        mitemregist.setText("Registrasi");
        mitemregist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemregistActionPerformed(evt);
            }
        });
        jMenu3.add(mitemregist);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Laporan");

        mnlaporan.setText("Laporan Transaksi");
        mnlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnlaporanActionPerformed(evt);
            }
        });
        jMenu2.add(mnlaporan);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLayananActionPerformed
        flayanan.setVisible(true);
    }//GEN-LAST:event_MenuLayananActionPerformed

    private void menupegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupegawaiActionPerformed
        ppegawai.setVisible(true);
    }//GEN-LAST:event_menupegawaiActionPerformed

    private void MenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        loginView logout = new loginView();
        logout.setLocationRelativeTo(null);
        logout.setVisible(true);
    }//GEN-LAST:event_MenuLogoutActionPerformed

    private void MenuLogoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MenuLogoutKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuLogoutKeyPressed

    private void mitemregistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemregistActionPerformed
        // TODO add your handling code here:
        fregistrasi.setVisible(true);    
    }//GEN-LAST:event_mitemregistActionPerformed

    private void mnlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnlaporanActionPerformed
        // TODO add your handling code here:
            llaporan.setVisible(true);
    }//GEN-LAST:event_mnlaporanActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        member1.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home mn=new Home();
                mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
                mn.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuLayanan;
    private javax.swing.JMenuItem MenuLogout;
    private usu.widget.glass.PanelGlass Panel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menupegawai;
    private javax.swing.JMenuItem mitemregist;
    private javax.swing.JMenuItem mnlaporan;
    // End of variables declaration//GEN-END:variables
}
