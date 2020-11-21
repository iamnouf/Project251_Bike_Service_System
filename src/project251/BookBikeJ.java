/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AmalA
 */
public class BookBikeJ extends Bikes {

    private int Qty;
    ArrayList<String> rentalHours ;
    Bikes total = new Bikes();
    
  

    public BookBikeJ(ArrayList<String> BikeList, Date date, double time, double price, double rentalHours, int Qty, Double priceBooking) {
        super(BikeList, date, time, price);
        this.Qty = Qty;
        this.rentalHours = new ArrayList<String>();
        
    }

    BookBikeJ() {
    }

     
    public int getQty() {
       
        return Qty;
    }

  
    public Double getPriceBooking(ArrayList<String> BikeList,int qty,int hours) {
        
        Double cost;
        if (BikeList.get(0) =="Street Bike"){
             cost = 30.0*hours*qty;
             
          return total.totalCost(cost);

        }
        else if (BikeList.get(1) == "Sport Bike"){
             cost = 30.0*hours*qty;
             return total.totalCost(cost);
        }
        else if (BikeList.get(2) == "Naked Bike"){
             cost = 25.0*hours*qty;
                 return total.totalCost(cost);
        } else if (BikeList.get(3) == "Cruiser Bike"){
             cost = 20.0*hours*qty;
                 return total.totalCost(cost);
        } else if (BikeList.get(4) == "Commuter Bike"){
             cost = 20.0*hours*qty;
                 return total.totalCost(cost);
        }
        else {
            return cost = 0.0;
        }
    }

    




    public void setQty(int Qty) {
        this.Qty = Qty;
    }



    public ArrayList<String> getRentalHours() {
        
        rentalHours.add("2 hours");
        rentalHours.add("3 hours");
        rentalHours.add("4 hours");
        rentalHours.add("5 hours");
        rentalHours.add("6 hours");
        rentalHours.add("7 hours");
        rentalHours.add("8 hours");
        rentalHours.add("9 hours");
        rentalHours.add("10 hours");
        rentalHours.add("11 hours");
        rentalHours.add("12 hours");
        rentalHours.add("24 hours");
        
        return rentalHours;
    }

    public void setRentalHours(ArrayList<String> rentalHours) {
        this.rentalHours = rentalHours;
    }

}
