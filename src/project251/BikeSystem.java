/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatima
 */
public class BikeSystem {
    public static void main (String args []){
    Double priceBooking;
     ArrayList<String> BikeList = new ArrayList<String>() ;
          BookBikeJ type = new BookBikeJ ();
         PriceList(type ,priceBooking );
    }
    
    public static Double PriceList(BookBikeJ type,Double priceBooking) {

        if (type.getBikeList().get(0) == "Street Bike") {
            Double cost = 30.0;
            return cost;
        } else if (type.getBikeList().get(1) == "Sport Bike") {
            Double cost = 30.0;
            return cost;
        } else if (type.getBikeList().get(2)== "Naked Bike") {
            Double cost = 25.0;
            return cost;
        } else if (type.getBikeList().get(3) == "Cruiser Bike") {
            Double cost = 20.0;
            return cost;
        } else if (type.getBikeList().get(4) == "Commuter Bike") {
            Double cost = 20.0;
            return cost;
        } else {
            Double cost;
            return cost = 0.0;
        }
    }

}
