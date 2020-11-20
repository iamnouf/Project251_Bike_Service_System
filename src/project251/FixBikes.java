/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author fatima
 */
public class FixBikes extends javax.swing.JFrame {

    /**
     * Creates new form FixBikes
     */
    public FixBikes() {
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        DateTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bike Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Street Bike", "Sport Bike", "Naked Bike", "Cruiser Bike", "Commuter Bike" }));

        jLabel2.setText("Date & Time");

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

        jLabel3.setText("What Kinds of Problem ? ");

        jCheckBox1.setText("Tight Brakes");

        jCheckBox2.setText("Air Filter");

        jCheckBox3.setText("Low engine Oil");

        jCheckBox4.setText("Chain Slack");

        jCheckBox5.setText("Drum Brakes");

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox2)
                                .addComponent(jCheckBox1)
                                .addComponent(jCheckBox3)
                                .addComponent(jCheckBox4)
                                .addComponent(jCheckBox5))
                            .addGap(24, 24, 24)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        //Bike type
        String[] bikeTypes = new String[]{"Street Bike", "Sport Bike",
            "Naked Bike", "Cruiser Bike", "Commuter Bike"};
        JComboBox<String> bikeList = new JComboBox<>(bikeTypes);
          // get the selected types:
        String selectedBike = (String) bikeList.getSelectedItem();
        System.out.println("Bike Type: " + selectedBike);
        //Date
        String dateTime = DateTime.getText();
        //Problems
        String problem1 = jCheckBox1.getText();
        String problem2 = jCheckBox2.getText();
        String problem3 = jCheckBox3.getText();
        String problem4 = jCheckBox4.getText();
        String problem5 = jCheckBox5.getText();

        String fixBikefile = "fixBikefile.txt";
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fixBikefile, true));

            if (jCheckBox1.isSelected()) {
                fileWriter.write("Problem: " + problem1);

            } else if (jCheckBox2.isSelected()) {
                fileWriter.write("Problem: " + problem2);
            } else if (jCheckBox3.isSelected()) {
                fileWriter.write("Problem: " + problem3);
            } else if (jCheckBox4.isSelected()) {
                fileWriter.write("Problem: " + problem4);
            } else if (jCheckBox5.isSelected()) {
                fileWriter.write("Problem: " + problem5);
            } else if (jCheckBox1.isSelected() && jCheckBox2.isSelected()) {
                fileWriter.write("Problem: " + problem1 + " , " + problem2);

            } else if (jCheckBox1.isSelected() && jCheckBox3.isSelected()) {
                fileWriter.write("Problem: " + problem1 + " , " + problem3);

            } else if (jCheckBox1.isSelected() && jCheckBox4.isSelected()) {
                fileWriter.write("Problem: " + problem1 + " , " + problem4);

            } else if (jCheckBox1.isSelected() && jCheckBox5.isSelected()) {
                fileWriter.write("Problem: " + problem1 + " , " + problem5);

            } else if (jCheckBox2.isSelected() && jCheckBox3.isSelected()) {
                fileWriter.write("Problem: " + problem2 + " , " + problem3);

            } else if (jCheckBox2.isSelected() && jCheckBox4.isSelected()) {
                fileWriter.write("Problem: " + problem2 + " , " + problem4);

            } else if (jCheckBox2.isSelected() && jCheckBox5.isSelected()) {
                fileWriter.write("Problem: " + problem2 + " , " + problem5);

            } else if (jCheckBox3.isSelected() && jCheckBox4.isSelected()) {
                fileWriter.write("Problem: " + problem3 + " , " + problem4);

            } else if (jCheckBox3.isSelected() && jCheckBox5.isSelected()) {
                fileWriter.write("Problem: " + problem3 + " , " + problem5);

            } else if (jCheckBox4.isSelected() && jCheckBox5.isSelected()) {
                fileWriter.write("Problem: " + problem4 + " , " + problem5);

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Detalis !");

            }
            fileWriter.write(" ");
            fileWriter.write("Date: " + dateTime);
            fileWriter.newLine();
            fileWriter.close();
        } catch (IOException ex) {

        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FixBikes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FixBikes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FixBikes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FixBikes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FixBikes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateTime;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
