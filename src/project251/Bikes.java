/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author AmalA
 */
public class Bikes {
     ArrayList<String> BikeList;
     ArrayList<String> FixList;
    private Date date = new Date();
    private double time;
    private double price;
    
  

   
    public Bikes (ArrayList<String> BikeList,Date date,double time,double price){
        this.BikeList = new ArrayList<String>();
        this.FixList = new ArrayList<String>();
        this.date =date;
        this.price=time;
        this.time=price;
    }

    public ArrayList<String> getFixList() {
         FixList.add("Tight Brakes");
         FixList.add("Air Filter");
         FixList.add("Low engine Oil");
         FixList.add("Chain Slack");
         FixList.add("Drum Brakes");
        return FixList;
    }

    public void setFixList(ArrayList<String> FixList) {
        this.FixList = FixList;
    }

    Bikes() {
    }

    public ArrayList<String> getBikeList() {
        BikeList.add("Street Bike");
        BikeList.add("Sport Bike");
        BikeList.add("Naked Bike");
        BikeList.add("Cruiser Bike");
        BikeList.add("Commuter Bike");
        return BikeList;
    }

//    public ArrayList<String> getFixList() {
//        BikeList.add("Street Bike");
//        BikeList.add("Sport Bike");
//        BikeList.add("Naked Bike");
//        BikeList.add("Cruiser Bike");
//        BikeList.add("Commuter Bike");
//        return FixList;
//    }
    public void setBikeList(ArrayList<String> BikeList) {
        this.BikeList = BikeList;
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
      public Double totalCost(Double price){
        Double totalCost = price*0.5; 
        Double Total=price+totalCost;
        return Total;
    }
}
