package project251;


import java.util.ArrayList;
import java.util.Date;
import project251.Bikes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AmalA
 */
 public class FixBike extends Bikes {
    Bikes s = new Bikes();
    private String description;

   
      public Double problem(ArrayList<String> FixList) {
        
        Double cost;
        if (FixList.get(0) =="Tight Brakes"){
             cost = 100.0;
             
          return s.totalCost(cost);
        }
        else if (BikeList.get(1) == "Air Filter"){
             cost = 50.0;
             return s.totalCost(cost);
        }
        else if (BikeList.get(2) == "Low engine Oil"){
             cost = 123.0;
                 return s.totalCost(cost);
        } else if (BikeList.get(3) == "Chain Slack"){
             cost = 60.0;
                 return s.totalCost(cost);
        } else if (BikeList.get(4) == "Drum Brakes"){
             cost = 75.0;
                 return s.totalCost(cost);
        }
        else {
            return cost = 0.0;
        }
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
