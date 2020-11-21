/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

/**
 *
 * @author fatima
 */
public class Register {

    private String Email;
    private String userName;
    private String Password;
    private String conPassword;
    private String firstName;
    private String lastName;
    private String Address;
    private String phoneNum;

    public Register (String Email,String userName,String Password,String conPassword, String firstName,String lastName,String Address,String phoneNum){
        this.Email = Email;
        this.userName = userName;
        this.Password = Password;
        this.conPassword = conPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address = Address;
        this.phoneNum = phoneNum;

    }

    Register() {
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

    public String getConPassword() {
        return conPassword;
    }

    public void setConPassword(String conPassword) {
        this.conPassword = conPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    

}
