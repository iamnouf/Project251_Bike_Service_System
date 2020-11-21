/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import project251.BookBike;
import project251.MainInerface;

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
        jLabel4 = new javax.swing.JLabel();
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
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Email ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 80, 60, 21);

        emText.setForeground(new java.awt.Color(204, 204, 204));
        emText.setText("someone@example.com");
        emText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emTextFocusLost(evt);
            }
        });
        emText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emTextActionPerformed(evt);
            }
        });
        getContentPane().add(emText);
        emText.setBounds(40, 110, 270, 26);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Username ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 250, 100, 21);

        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setText("Contain characters and numbers");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(40, 270, 270, 26);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Password ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 300, 90, 21);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Confirm Password ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 390, 160, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("First Name ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 140, 110, 21);

        Fname.setForeground(new java.awt.Color(204, 204, 204));
        Fname.setText("First Name");
        Fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FnameFocusLost(evt);
            }
        });
        getContentPane().add(Fname);
        Fname.setBounds(40, 160, 270, 26);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Last Name ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 190, 100, 21);

        Lname.setForeground(new java.awt.Color(204, 204, 204));
        Lname.setText("Last Name");
        Lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LnameFocusLost(evt);
            }
        });
        getContentPane().add(Lname);
        Lname.setBounds(40, 210, 270, 26);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 440, 70, 21);

        addressText.setForeground(new java.awt.Color(204, 204, 204));
        addressText.setText("Building number , street name ...etc");
        addressText.setToolTipText("");
        addressText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressTextFocusLost(evt);
            }
        });
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });
        getContentPane().add(addressText);
        addressText.setBounds(40, 460, 270, 26);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Phone");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 450, 0, 21);

        phoneNumber.setForeground(new java.awt.Color(204, 204, 204));
        phoneNumber.setText("05xxxxxxxx");
        phoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumberFocusLost(evt);
            }
        });
        getContentPane().add(phoneNumber);
        phoneNumber.setBounds(40, 510, 270, 26);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 570, 130, 29);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(280, 570, 760, 740);

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 50, 50);

        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("***************");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(40, 320, 270, 26);

        confirmPassword.setForeground(new java.awt.Color(204, 204, 204));
        confirmPassword.setText("***************");
        confirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordFocusLost(evt);
            }
        });
        confirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(confirmPassword);
        confirmPassword.setBounds(40, 410, 270, 26);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Phone Number");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 490, 140, 21);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(93, 80, 50, 16);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 140, 53, 16);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(130, 190, 53, 16);

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(123, 250, 50, 16);

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(190, 390, 9, 22);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(170, 410, 9, 30);

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(110, 440, 9, 22);

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(120, 300, 9, 22);

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(160, 490, 10, 22);

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("- The password must be at least 8 characters long");
        jLabel20.setToolTipText("");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(40, 350, 380, 10);

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("- one alpha character [a-zA-Z]");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(40, 360, 170, 10);

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("- one numeric character [0-9]");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(40, 370, 160, 10);

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("- contain at least on symbol ");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(40, 380, 170, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emTextActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    // Sign up
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           BookBike main = new BookBike();
            main.setVisible(true);
            Login log=new Login();
            
        String Email = emText.getText();
        String firstName = Fname.getText();
        String lastName = Lname.getText();
        String userName = username.getText();
        String Password = password.getText();
        String conPassword = confirmPassword.getText();
        String Address = addressText.getText();
        String phoneNum = phoneNumber.getText();
        

              /* 
    - The password must be at least 8 characters long.
    - The password must contain at least:
    - one alpha character [a-zA-Z]
    - one numeric character [0-9]
    - one character that is not alpha or numeric, such as ! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' " , < . > / ?
    - The password must not contain spaces
        */
        String upperCase = "(.*[A-Z].*)";
        String LowUpperCase = "(.*[a-zA-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[ ! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?].*)";
        String space = "(.*[   ].*)";

        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher email = p.matcher(Email);

        if (lastName.matches(LowUpperCase) && email.matches() && userName.matches(LowUpperCase) && userName.matches(numbers) && Password.matches(upperCase) && Password.matches(numbers) && Password.matches(specialChars) && !Password.matches(space) && Password.length() > 8 && conPassword.equals(Password) && firstName.matches(LowUpperCase)
                && Address.matches(LowUpperCase) && Address.matches(numbers) && phoneNum.matches("[0-9]{10}")) {

            BookBike signUp = new BookBike();
            signUp.setVisible(true);

//        }
//        
//        if(log.EmailsList().contains(Email)){
//           JOptionPane.showMessageDialog(null, "Email Already Exists" );  
//            emText.setText(null);
//
//        }else if(log.userNameList().contains(userName)){
//                          JOptionPane.showMessageDialog(null, "Username Already Exists" );  
//            username.setText(null);

        }else if (Email.isEmpty() && userName.isEmpty() && Password.isEmpty() && conPassword.isEmpty() && firstName.isEmpty() && lastName.isEmpty() && Address.isEmpty() && phoneNum.isEmpty()) {
              JOptionPane.showMessageDialog(null, "Invalid Register Detalis !" );  

        } else  {
              JOptionPane.showMessageDialog(null, "Invalid Register Detalis !" );  
            emText.setText(null);
            Fname.setText(null);
            Lname.setText(null);
            username.setText(null);
            password.setText(null);
            confirmPassword.setText(null);
            addressText.setText(null);
            phoneNumber.setText(null);

        }
        
        JFrame frame = new JFrame("Demo");
        frame.setLayout(new FlowLayout());
 
        JTextField emText = new JTextField();
        emText.setText(Email);

        JTextField Fname = new JTextField();
        Fname.setText(firstName);

        JTextField Lname = new JTextField();
        Lname.setText(lastName);
        
        JTextField username = new JTextField();
        username.setText(userName);

        JTextField password = new JTextField();
        password.setText(Password);

        JTextField confirmPassword = new JTextField();
        confirmPassword.setText(conPassword);

        JTextField addressText = new JTextField();
        addressText.setText(Address);

        JTextField phoneNumber = new JTextField();
        phoneNumber.setText(phoneNum);

        String file = "userData.txt";
        try{
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file,true));
                
            emText.write(fileWriter);
            fileWriter.write(" ");
            Fname.write(fileWriter);
            fileWriter.write(" ");
            Lname.write(fileWriter);
            fileWriter.write(" ");
            username.write(fileWriter);
            fileWriter.write(" ");
            password.write(fileWriter);
            fileWriter.write(" ");
            confirmPassword.write(fileWriter);
            fileWriter.write(" ");
            addressText.write(fileWriter);
            fileWriter.write(" ");
            phoneNumber.write(fileWriter);
            fileWriter.newLine();

            fileWriter.close();
                
            
         
        } catch (IOException ex) {
           
           }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        MainInerface main = new MainInerface();
            main.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void emTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emTextFocusGained
        // TODO add your handling code here:
           if(emText.getText().equals("someone@example.com"))
        {
            emText.setText("");
            emText.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emTextFocusGained

    private void emTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emTextFocusLost
        // TODO add your handling code here:
           if(emText.getText().equals(""))
        {
            emText.setText("someone@example.com");
            emText.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emTextFocusLost

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
             if(username.getText().equals("Contain characters and numbers"))
        {
            username.setText("");
            username.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
               if(username.getText().equals(""))
        {
            username.setText("Contain characters and numbers");
            username.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
          if(password.getText().equals("***************"))
        {
            password.setText("");
            password.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // TODO add your handling code here:
               if(password.getText().equals(""))
        {
            password.setText("***************");
            password.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_passwordFocusLost

    private void confirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFocusGained
        // TODO add your handling code here:
           if(confirmPassword.getText().equals("***************"))
        {
            confirmPassword.setText("");
            confirmPassword.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_confirmPasswordFocusGained

    private void confirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFocusLost
        // TODO add your handling code here:
             if(confirmPassword.getText().equals("***************"))
        {
            confirmPassword.setText("");
            confirmPassword.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_confirmPasswordFocusLost

    private void FnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FnameFocusGained
        // TODO add your handling code here:
             if(Fname.getText().equals("First Name"))
        {
            Fname.setText("");
            Fname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_FnameFocusGained

    private void FnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FnameFocusLost
        // TODO add your handling code here:
              if(Fname.getText().equals(""))
        {
            Fname.setText("First Name");
            Fname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_FnameFocusLost

    private void LnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LnameFocusGained
        // TODO add your handling code here:
               if(Lname.getText().equals("Last Name"))
        {
            Lname.setText("");
            Lname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_LnameFocusGained

    private void LnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LnameFocusLost
        // TODO add your handling code here:
               if(Lname.getText().equals(""))
        {
            Lname.setText("Last Name");
            Lname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_LnameFocusLost

    private void addressTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTextFocusGained
        // TODO add your handling code here: 
               if(addressText.getText().equals("Building number , street name ...etc"))
        {
            addressText.setText("");
            addressText.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_addressTextFocusGained

    private void addressTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTextFocusLost
        // TODO add your handling code here:
                  if(addressText.getText().equals(""))
        {
            addressText.setText("Building number , street name ...etc");
            addressText.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_addressTextFocusLost

    private void phoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusGained
        // TODO add your handling code here:
                       if(phoneNumber.getText().equals("05xxxxxxxx"))
        {
            phoneNumber.setText("");
            phoneNumber.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_phoneNumberFocusGained

    private void phoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFocusLost
        // TODO add your handling code here:
        if(phoneNumber.getText().equals(""))
        {
            phoneNumber.setText("05xxxxxxxx");
            phoneNumber.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_phoneNumberFocusLost

    private void confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
    public static javax.swing.JTextField Fname;
    public static javax.swing.JTextField Lname;
    public static javax.swing.JTextField addressText;
    private javax.swing.JPasswordField confirmPassword;
    public static javax.swing.JTextField emText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPasswordField password;
    public static javax.swing.JTextField phoneNumber;
    public static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
