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
public class TellerTf extends javax.swing.JFrame {
    public String[][] nasabah = {{"1400012","1400013","1400014","1400015"},{"Rizka","Rahayu","Sasmita", "Adam"},{"5000000","600000","1900000", "26000000"}};
    public boolean status = false;
    private int saldoAkhir;

    /**
     * Creates new form TellerTf
     */
    public TellerTf() {
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

        rekening = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        nama = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        inputSaldo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Selesai = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        rekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekeningActionPerformed(evt);
            }
        });
        getContentPane().add(rekening);
        rekening.setBounds(140, 120, 130, 30);

        cari.setText("Rekening");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari);
        cari.setBounds(310, 120, 77, 30);

        nama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(nama);
        nama.setBounds(150, 200, 120, 30);

        saldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(saldo);
        saldo.setBounds(340, 200, 120, 30);
        getContentPane().add(input);
        input.setBounds(140, 240, 140, 30);

        inputSaldo.setText("Input");
        inputSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(inputSaldo);
        inputSaldo.setBounds(310, 240, 80, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("No Rekening :");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 170, 150, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Masukkan Nomor Rekening");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 80, 210, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setText(" Nama :");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 170, 150, 30);

        Selesai.setText("Selesai");
        Selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(Selesai);
        Selesai.setBounds(400, 280, 100, 30);

        kembali.setText("Kembali");
        getContentPane().add(kembali);
        kembali.setBounds(50, 280, 100, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("SELAMAT DATANG DI ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 10, 220, 40);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("BANK MANDIRI PENS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 50, 210, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("MANDIRI CALL HANYA DI 14000");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 320, 210, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ATAU 021-33012839");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 340, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bank/img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        String no_rek = rekening.getText();
        for(int i=0; i<5; i++){
        if(no_rek.equalsIgnoreCase(nasabah[0][i])){
           nama.setText(nasabah[1][i]);
           saldo.setText(nasabah[2][i]);
            break;
        }
        }
       //if(status==false){
        //    JOptionPane.showMessageDialog(rootPane, "Nomor Rekening Tidak Terdaftar");
        //}
    }//GEN-LAST:event_cariActionPerformed

    private void inputSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSaldoActionPerformed
        // TODO add your handling code here:
        String no_rek = rekening.getText();
        
        for(int i=0; i<5; i++){
            if(no_rek.equals(nasabah[0][i])){
            nama.setText(nasabah[1][i]);
            saldo.setText(nasabah[2][i]);
            int saldot = Integer.parseInt(saldo.getText());
            int jumlaht = Integer.parseInt(input.getText());
            saldoAkhir = saldot + jumlaht;
            break;
            }
        }
        JOptionPane.showMessageDialog(rootPane, 
                "Sukses !!" + "\n" + "No Rekening : " + no_rek + "\n" + 
                "Atas Nama : " + nama.getText() + "\n" + "Jumlah Deposit : " + saldo.getText() +
                "\n" + "Saldo Akhir : " + saldoAkhir);
       
    }//GEN-LAST:event_inputSaldoActionPerformed

    private void rekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekeningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rekeningActionPerformed

    private void SelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelesaiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SelesaiActionPerformed

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
            java.util.logging.Logger.getLogger(TellerTf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TellerTf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TellerTf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TellerTf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TellerTf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Selesai;
    private javax.swing.JButton cari;
    private javax.swing.JTextField input;
    private javax.swing.JButton inputSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel nama;
    private javax.swing.JTextField rekening;
    private javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}
