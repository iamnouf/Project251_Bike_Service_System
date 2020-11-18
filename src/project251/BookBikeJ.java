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
public class BookBikeJ extends Bikes {
   
    private double rentalHours;
    //Qty
    private double priceBooking;

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

    /**
     * @return the price
     */
    public double getPrice() {
        return priceBooking;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double priceBooking) {
        this.priceBooking = priceBooking;
    }
    
    
}
