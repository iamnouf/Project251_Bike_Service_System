/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatima
 */
public class Login {
      private String Email;
    private String userName;
    private String Password;

    public Login (String Email,String userName,String Password){
          this.Email = Email;
        this.userName = userName;
        this.Password = Password;
    }

    Login() {
    }
    public String getEmail() {
          try {
              Scanner sc = new Scanner (new File ("userData.txt"));
              String [] line = sc.next().split(" ");

              for (int i =0; line.length >= i ; i++){
                  Email += line[i];
                  System.out.println(Email);
              }
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
          }
                            return Email;

    }

    public void setEmail(String Email) {
        this.Email = Email;
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
