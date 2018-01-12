package Bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class BankAntrian extends javax.swing.JFrame {
    LinkedList antrian = new LinkedList();
            
    public BankAntrian() {
        initComponents();
    }

    void input() {
        String input = tf_input.getText();
        antrian.add(input);
        ta1.append(input + "\n");
        tf_input.setText(null);
        tf_input.requestFocus();
    }
    
    public String getTanggal()
    {
        DateFormat dateFormat = new SimpleDateFormat("H:mm:ss dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    void move(){
        ta2.append(antrian.peek() + "\n");
        antrian.poll();
        ta1.setText(antrian + "");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_input = new javax.swing.JTextField();
        bt_input = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        bt_layani = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        bt_move1 = new javax.swing.JButton();
        tanggal1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(tf_input);
        tf_input.setBounds(140, 120, 170, 30);

        bt_input.setText("Input");
        bt_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inputActionPerformed(evt);
            }
        });
        getContentPane().add(bt_input);
        bt_input.setBounds(320, 120, 90, 30);

        ta1.setEditable(false);
        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        ta1.setLineWrap(true);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 130, 116);

        ta2.setEditable(false);
        ta2.setColumns(20);
        ta2.setRows(5);
        jScrollPane2.setViewportView(ta2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(280, 170, 130, 116);

        bt_layani.setLabel("Layani");
        bt_layani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_layaniActionPerformed(evt);
            }
        });
        getContentPane().add(bt_layani);
        bt_layani.setBounds(170, 170, 90, 30);

        bt_exit.setText("Exit");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });
        getContentPane().add(bt_exit);
        bt_exit.setBounds(40, 320, 70, 30);

        bt_move1.setLabel("Selesai");
        bt_move1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_move1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_move1);
        bt_move1.setBounds(420, 170, 100, 30);

        tanggal1.setText(getTanggal());
        getContentPane().add(tanggal1);
        tanggal1.setBounds(10, 10, 108, 25);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("BANK MANDIRI PENS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 50, 210, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("SELAMAT DATANG DI ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 10, 220, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("MANDIRI CALL HANYA DI 14000");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 310, 200, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ATAU 021-33012839");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 330, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bank/img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 390);

        setSize(new java.awt.Dimension(556, 409));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inputActionPerformed
        // TODO add your handling code here:
        input();
    }//GEN-LAST:event_bt_inputActionPerformed

    private void bt_layaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_layaniActionPerformed
        // TODO add your handling code here:
        new BankTeller().show();
    }//GEN-LAST:event_bt_layaniActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_move1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_move1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_move1ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankAntrian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_input;
    private javax.swing.JButton bt_layani;
    private javax.swing.JButton bt_move1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    private javax.swing.JLabel tanggal1;
    private javax.swing.JTextField tf_input;
    // End of variables declaration//GEN-END:variables

    private void add(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
