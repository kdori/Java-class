/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jatek;

import java.util.Random;

/**
 *
 * @author kutas
 */
public class Jatek extends javax.swing.JFrame {

    /**
     * Creates new form Jatek
     */
    public Jatek() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        btnKo = new javax.swing.JRadioButton();
        btnPapir = new javax.swing.JRadioButton();
        btnOllo = new javax.swing.JRadioButton();
        lblCim = new javax.swing.JLabel();
        btnJatek = new javax.swing.JButton();
        lblEredmeny = new javax.swing.JLabel();
        lblGep = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnKo.setBackground(new java.awt.Color(0, 0, 0));
        btnKo.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        btnKo.setForeground(new java.awt.Color(204, 255, 204));
        btnKo.setText("kő");
        btnKo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKoMouseClicked(evt);
            }
        });
        btnKo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKoActionPerformed(evt);
            }
        });

        btnPapir.setBackground(new java.awt.Color(0, 0, 0));
        btnPapir.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        btnPapir.setForeground(new java.awt.Color(204, 255, 204));
        btnPapir.setText("papír");
        btnPapir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPapirMouseClicked(evt);
            }
        });

        btnOllo.setBackground(new java.awt.Color(0, 0, 0));
        btnOllo.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        btnOllo.setForeground(new java.awt.Color(204, 255, 204));
        btnOllo.setText("olló");
        btnOllo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOlloMouseClicked(evt);
            }
        });

        lblCim.setText("Kő, papír,olló");

        btnJatek.setBackground(new java.awt.Color(102, 0, 102));
        btnJatek.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        btnJatek.setForeground(new java.awt.Color(204, 255, 204));
        btnJatek.setLabel("JÁTÉK!");
        btnJatek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJatekMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPapir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOllo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(lblCim))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnJatek, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblGep)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblCim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPapir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOllo))
                            .addComponent(btnJatek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 32, Short.MAX_VALUE)
                        .addComponent(lblEredmeny)
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGep)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKoActionPerformed

    private void btnKoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKoMouseClicked
        
        this.btnKo.setSelected(true);
        this.btnPapir.setSelected(false);
        this.btnOllo.setSelected(false);
        this.btnJatek.setEnabled(true);
    }//GEN-LAST:event_btnKoMouseClicked

    private void btnPapirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPapirMouseClicked
        
        this.btnPapir.setSelected(true);
        this.btnOllo.setSelected(false);
        this.btnKo.setSelected(false);
        this.btnJatek.setEnabled(true);
    }//GEN-LAST:event_btnPapirMouseClicked

    private void btnOlloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOlloMouseClicked
        
        this.btnOllo.setSelected(true);
        this.btnPapir.setSelected(false);
        this.btnKo.setSelected(false);
        this.btnJatek.setEnabled(true);
        
    }//GEN-LAST:event_btnOlloMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.btnJatek.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnJatekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJatekMouseClicked
        if(this.btnJatek.isEnabled()){
            
            Random rnd = new Random();
            Integer gep = rnd.nextInt(3);
            //ko - 0, papir - 1, ollo - 2
            Integer ember = null;
            if (this.btnKo.isSelected()) { ember = 0;}
            if (this.btnPapir.isSelected()) { ember = 1;}
            if (this.btnOllo.isSelected()) {ember = 2;}
            if (ember == gep) {
                this.lblEredmeny.setText("Döntetlen " + gep);
            }
            if (ember - gep == 1) {
                this.lblEredmeny.setText("Ember nyert " + gep);
            }
            if (gep - ember == 1) {
                this.lblEredmeny.setText("Gép nyert "  + gep);
            }
            if (ember - gep == 2) {
                this.lblEredmeny.setText("Gép nyert " + gep);
            }
            if (gep - ember == 2) {
                this.lblEredmeny.setText("Ember nyert " + gep);
            }
            if(gep == 0){this.lblGep.setText("Gép: Kő");}
            if(gep == 1){this.lblGep.setText("Gép: Papír");}
            if(gep == 2){this.lblGep.setText("Gép: Olló");}
            
        }
    }//GEN-LAST:event_btnJatekMouseClicked

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
            java.util.logging.Logger.getLogger(Jatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jatek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jatek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJatek;
    private javax.swing.JRadioButton btnKo;
    private javax.swing.JRadioButton btnOllo;
    private javax.swing.JRadioButton btnPapir;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblGep;
    // End of variables declaration//GEN-END:variables
}
