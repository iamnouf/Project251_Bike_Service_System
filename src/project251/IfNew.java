/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

/**
 *
 * @author AmalA
 */
public class IfNew extends javax.swing.JFrame {

    /**
     * Creates new form IfNew
     */
    public IfNew() {
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
        emText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Email *");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 30, 55, 22);

        emText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emTextActionPerformed(evt);
            }
        });
        getContentPane().add(emText);
        emText.setBounds(70, 60, 317, 26);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Username *");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 100, 87, 22);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(70, 130, 317, 26);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Password *");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 170, 84, 22);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(70, 200, 317, 26);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Confirm Password *");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 240, 149, 22);
        getContentPane().add(confirmPassword);
        confirmPassword.setBounds(70, 270, 317, 26);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("First Name *");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 310, 94, 22);
        getContentPane().add(Fname);
        Fname.setBounds(70, 340, 317, 26);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Last Name *");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 380, 93, 22);
        getContentPane().add(Lname);
        Lname.setBounds(70, 410, 317, 26);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 440, 58, 22);
        getContentPane().add(addressText);
        addressText.setBounds(70, 470, 317, 26);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Phone");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 500, 46, 22);
        getContentPane().add(phoneNumber);
        phoneNumber.setBounds(70, 530, 317, 26);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 590, 123, 31);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\AmalA\\Downloads\\PHOTO-2020-10-31-16-51-32.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1, 0, 760, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emTextActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    // Sign up
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Email = emText.getText();
        String userName = username.getText();
        String Password = password.getText();
        String conPassword = confirmPassword.getText();
        String firstName = Fname.getText();
        String lastName = Lname.getText();
        String Address = addressText.getText();
        String phoneNum = phoneNumber.getText();

        if (lastName.contains("Al-") && Email.contains("A") && userName.contains("aA") && Password.contains("1") && conPassword.contains("7") && firstName.contains("AB")
                && Address.contains("Jeddah") && phoneNum.matches("^(?=(?:[8-9]){1})(?=[0-9]{8}).*")) {

            BookBike signUp = new BookBike();
            signUp.setVisible(true);
        } else {
            emText.setText(null);
            username.setText(null);
            confirmPassword.setText(null);
            Fname.setText(null);
            Lname.setText(null);
            addressText.setText(null);
            phoneNumber.setText(null);
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
            java.util.logging.Logger.getLogger(IfNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IfNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IfNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IfNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IfNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField confirmPassword;
    private javax.swing.JTextField emText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
