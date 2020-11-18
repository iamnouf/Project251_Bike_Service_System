/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.util.Date;

/**
 *
 * @author AmalA
 */
public class Bikes {
    private String BikeType[];
    private Date date = new Date();
    private double time;
    private double price;
  
   
    
      public String[] getBikeType() {
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
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
