/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author AmalA
 */
public class BookBikeJ extends Bikes {
   
    private double rentalHours;
    private int Qty;
<<<<<<< HEAD
    private double priceBooking;
=======
    private ArrayList<Double> priceBooking;
    private ArrayList<String> BikeList;

    public BookBikeJ(String BikeType, Date date, double time, double price,double rentalHours,int Qty,double priceBooking) {
        super(BikeType, date, time, price);
         this.BikeList = new ArrayList<String>();
         this.Qty=Qty;
         this.rentalHours=rentalHours;
         this.priceBooking=new ArrayList<Double>() ;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public ArrayList<Double> getPriceBooking() {
        return priceBooking;
    }

    public void setPriceBooking(ArrayList<Double> priceBooking) {
        this.priceBooking = priceBooking;
    }

    public ArrayList<String> getBikeList() {
        return BikeList;
    }

    public void setBikeList(ArrayList<String> BikeList) {
        this.BikeList = BikeList;
    }
       public String wholeOrder(){
        String completeOrder = "";
        for (int i=0;i < BikeList.size();i++)
        {
          completeOrder += this.BikeList.get(i);
        }
        return completeOrder;
    }
    
    /*Creates a single prices for the wole order by adding all the pizzas cost together. */
    public Double orderCost(){
        Double orderCost = 0.0;
        for (int i=0;i < priceBooking.size();i++)
        {
          orderCost += this.priceBooking.get(i);
        }
        return orderCost;
    } 
    /*removes the passed pizza from the pizza array and cost array. */
    public void removePizza(int pizzaToRemove){
        BikeList.remove(pizzaToRemove);
        priceBooking.remove(pizzaToRemove);
    }
>>>>>>> 26764dbb4b3e46aa6c4e626607999cde02ff6c1d

    /**
     * @return the BikeType
     */
  

    /**
     * @return the rentalHours
     */
    public double getRentalHours() {
        return rentalHours;
    }

    /**
     * @param rentalHours the rentalHours to set
     */
    public void setRentalHours(double rentalHours) {
        this.rentalHours = rentalHours;
    }

<<<<<<< HEAD
    /**
     * @return the price
     */
    public double getPrice() {
        return getPriceBooking();
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double priceBooking) {
        this.setPriceBooking(priceBooking);
    }

    /**
     * @return the Qty
     */
    public int getQty() {
        return Qty;
    }

    /**
     * @param Qty the Qty to set
     */
    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    /**
     * @return the priceBooking
     */
    public double getPriceBooking() {
        return priceBooking;
    }

    /**
     * @param priceBooking the priceBooking to set
     */
    public void setPriceBooking(double priceBooking) {
        this.priceBooking = priceBooking;
    }
    
=======
  
 
>>>>>>> 26764dbb4b3e46aa6c4e626607999cde02ff6c1d
    
}
