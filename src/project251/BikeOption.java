/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.awt.Color;
import project251.Thanku;
/**
 *
 * @author AmalA
 */
public class BikeOption extends javax.swing.JFrame {

    /**
     * Creates new form BikeOption
     */
    public BikeOption() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DateTime = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(333, 592));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("The Type of bike:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 90, 131, 21);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Quantity:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 220, 68, 21);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Rental Hours");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 290, 96, 21);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Date & Time");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 360, 120, 21);

        DateTime.setForeground(new java.awt.Color(204, 204, 204));
        DateTime.setText("Nov 7 at 7:30 PM");
        DateTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DateTimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DateTimeFocusLost(evt);
            }
        });
        DateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTimeActionPerformed(evt);
            }
        });
        getContentPane().add(DateTime);
        DateTime.setBounds(30, 390, 282, 26);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 480, 79, 29);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-60, 440, 790, 610);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 30, 97, 29);

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 10, 50, 40);

        jComboBox3.setMaximumRowCount(24);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 hour", "2 hours", "3 hours", "4 hours", "5 hours", "6 hours", "7 hours", "8 hours", "9 hours", "10 hours", "11 hours", "12 hours", "24 hours" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(30, 320, 112, 27);

        jCheckBox1.setText("Street Bike");
        jCheckBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox1FocusGained(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(30, 110, 240, 23);

        jCheckBox2.setText("Sport Bike");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(30, 130, 95, 23);

        jCheckBox3.setText("Naked Bike");
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(30, 150, 102, 23);

        jCheckBox4.setText("Cruiser Bike");
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(30, 170, 107, 23);

        jCheckBox5.setText("Commuter Bike");
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(30, 190, 140, 23);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(40, 250, 40, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         BookBike main = new BookBike();
            main.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DateTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateTimeFocusGained
        // TODO add your handling code here:
          if (DateTime.getText().equals("Nov 7 at 7:30 PM")) {
            DateTime.setText("");
            DateTime.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_DateTimeFocusGained

    private void DateTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateTimeFocusLost
        // TODO add your handling code here:
         if (DateTime.getText().equals("")) {
            DateTime.setText("Nov 7 at 7:30 PM");
            DateTime.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_DateTimeFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  
        PayInterface pay = new PayInterface();
            pay.setVisible(true);


            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTimeActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox1FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox1FocusGained

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
            java.util.logging.Logger.getLogger(BikeOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BikeOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BikeOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BikeOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BikeOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateTime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
