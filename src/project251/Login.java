/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
    ArrayList<String> fileList = new ArrayList<>();

    public Login(String Email, String userName, String Password) {
        this.Email = Email;
        this.userName = userName;
        this.Password = Password;
    }

    Login() {
    }
    
    public ArrayList<String> EmailsList (){
        try {
            Scanner read = new Scanner(new File("userData.txt"));
            //  String line;
            while (read.hasNext()) {
                String [] line = read.nextLine().split(" ");
                fileList.add(line[0]); 
                
               
            }
                            read.close();

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileList;
    }
    
       public ArrayList<String> PasswordList (){
        try {
            Scanner read = new Scanner(new File("userData.txt"));
            //  String line;
            while (read.hasNext()) {
                String [] line = read.nextLine().split(" ");
                fileList.add(line[4]);
               
            }
                            read.close();

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileList;
    }
       
              public ArrayList<String> userNameList (){
        try {
            Scanner read = new Scanner(new File("userData.txt"));
            //  String line;
            while (read.hasNext()) {
                String [] line = read.nextLine().split(" ");
                fileList.add(line[3]);
               
            }
                            read.close();

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileList;
    }


    public String getEmail() {

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
