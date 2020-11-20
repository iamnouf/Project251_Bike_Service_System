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

    public Login(String Email, String userName, String Password) {
        this.Email = Email;
        this.userName = userName;
        this.Password = Password;
    }

    Login() {
    }

    public String getEmail() {
        ArrayList<String> fileList = new ArrayList<>();

//            Scanner read = new Scanner(new File("userData.txt"));
//            ArrayList al = new ArrayList();
//            System.out.println("All elements:       " + al);
//            System.out.println("Number of elements: " + al.size() + "\n");
//         //   System.out.println(read.hasNext());
//            while (read.hasNext()) {
//                     al.remove("A");
//            }
        try {
            Scanner read = new Scanner(new File("userData.txt"));
            //  String line;
            while (read.hasNext()) {
                String[] line = read.nextLine().split(" ");
                fileList.add(line[0]);
                System.out.println(fileList);

            }
            read.close();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
//            }
//            while (sc.hasNext()) {
//                String[] line = sc.nextLine().split(" ");
//                Email = line[0];
//                System.out.println(line[0]);
//            }
//              for(int i =0; line.length >i; i++){
//            // String str = "Amalalsefri@gmail.com ";
//              int firstSpace = line[i].indexOf(" ");
//              String firstWord = line[i].substring(0, firstSpace);
//              String lastWord = line[i].substring(line[i].lastIndexOf(" ")+1);
//              System.out.println(firstWord);
//              System.out.println("--------------");
//              System.out.println(lastWord);
//              }
//             for (int i =0; line.length >= i ; i++){
//                  String [] line = sc.next().split(" ");
//                  Email = line[0];
//                  System.out.println(line[0]);
//              }

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
        ArrayList<String> fileList = new ArrayList<>();
        try {
            Scanner read = new Scanner(new File("userData.txt"));
            //  String line;
            while (read.hasNext()) {
                String[] line = read.nextLine().split(" ");
                fileList.add(line[4]);
                System.out.println(fileList);

            }
            read.close();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
