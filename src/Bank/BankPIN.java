/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import javax.swing.JOptionPane;

/**
 *
 * @author Rizka RS
 */
public class BankPIN extends javax.swing.JFrame {

    public BankPIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label8 = new java.awt.Label();
        cancel = new java.awt.Button();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label5 = new java.awt.Label();
        benar = new javax.swing.JButton();
        pin = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setText("Tekan Cancel Untuk Batal");
        getContentPane().add(label8);
        label8.setBounds(20, 270, 146, 20);

        cancel.setLabel("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(40, 300, 52, 24);

        label9.setText("MANDIRI CALL HANYA DI 14000");
        getContentPane().add(label9);
        label9.setBounds(330, 270, 181, 20);

        label10.setText("ATAU 021-33012839");
        getContentPane().add(label10);
        label10.setBounds(400, 300, 118, 20);

        label5.setText("Masukkan PIN Anda");
        getContentPane().add(label5);
        label5.setBounds(210, 130, 114, 20);

        benar.setText("Benar");
        benar.setActionCommand("benar");
        benar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benarActionPerformed(evt);
            }
        });
        getContentPane().add(benar);
        benar.setBounds(230, 210, 61, 23);

        pin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pinKeyTyped(evt);
            }
        });
        getContentPane().add(pin);
        pin.setBounds(170, 160, 196, 39);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("ATM MANDIRI PENS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 50, 210, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("SELAMAT DATANG DI ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 10, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bank/img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void benarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benarActionPerformed
        // TODO add your handling code here:
        String pass = "123456";
        if(pass.equalsIgnoreCase(pin.getText())){
            new BankATM().show();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Password Salah, Silahkan Coba Lagi");
        }
    }//GEN-LAST:event_benarActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        //pin.setPassword("");
    }//GEN-LAST:event_cancelActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void pinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyPressed
   
    }//GEN-LAST:event_pinKeyPressed

    private void pinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pinKeyTyped

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
            java.util.logging.Logger.getLogger(BankPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankPIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton benar;
    private java.awt.Button cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label10;
    private java.awt.Label label5;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JPasswordField pin;
    // End of variables declaration//GEN-END:variables
}
