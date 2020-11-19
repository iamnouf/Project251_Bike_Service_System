/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.text.NumberFormat;
import java.util.Date;

/**
 *
 * @author AmalA
 */
public class Bikes {
    private String BikeType;
    private Date date = new Date();
    private double time;
    private double price;
  
   
    public Bikes (String BikeType,Date date,double time,double price){
        this.BikeType =BikeType ;
        this.date =date;
        this.price=time;
        this.time=price;
    }

    
      public String getBikeType() {
        return BikeType;
        
    }

    /**
     * @param BikeType the BikeType to set
     */
    public void setBikeType(String[] BikeType) {
        this.setBikeType(BikeType);
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public double getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(double time) {
        this.time = time;
    }

   

    /**
     * @return the price
     */
    public double getPrice() {
        
       Double price;
        if (this.BikeType == "Street Bike"){
            return price = 30.0;
        }
        else if (this.BikeType == "Sport Bike"){
            return price = 30.0;
        }
        else if (this.BikeType == "Naked Bike"){
            return price = 25.0;
        }
         else if (this.BikeType == "Cruiser Bike"){
            return price = 20.0;
        }
          else if (this.BikeType == "Commuter Bike"){
            return price = 20.0;
        }
        else {
            return price = 0.0;
        }    }
    
    public String Cost (){
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        
        /*This creates the full pizza string with prices */
        String priceOfBikes = "";
        priceOfBikes += this.BikeType + String.valueOf(formatter.format(getPrice()));

        return priceOfBikes;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
      public Double totalCost(){
        /*This adds up the whole cost for the pizza */
        Double totalCost = getPrice()*0.5; 
        Double Total=getPrice()+totalCost;
        return Total;
    }
}
