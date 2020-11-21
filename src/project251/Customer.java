package project251;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author AmalA
 */
public class Customer {
    ArrayList<String> fileList = new ArrayList<>();

    
    // CancelOrder
     public ArrayList<String> cancelOrder (){
        try {
            Scanner read = new Scanner(new File("RentInfo.txt"));
            //  String line;
            while (read.hasNext()) {
                String [] line = read.nextLine().split(" ");
                fileList.add(line[0]); 
    

               
            }
                            read.close();

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileList;
    }
//    public void cancelOrder(JButton update ,JButton Button ) throws FileNotFoundException {
//
//        Scanner sc = new Scanner(new File("RentInfo.txt"));
//        String[] line = sc.nextLine().split(" ");
//        
//        if (ViewOrder.Update.isVisible()) {
//            ViewOrder.jTextField1.setText(line[2] + " " + line[3]);
//            ViewOrder.jTextField9.setText(line[23] + " " + line[24] + " " + line[25] + " " + line[26] + " " + line[27]);
//            ViewOrder.jTextField17.setText("Process");
//
//        } 
//        
//        else if (ViewOrder.Button.isVisible()) {
//            ViewOrder.jTextField1.setText(null);
//            ViewOrder.jTextField9.setText(null);
//            ViewOrder.jTextField17.setText("Cancelled");
//          
//             JOptionPane.showMessageDialog(null, "Your order has been cancelled !");
//
//        }
//
//    }

    // create Order
//    public void createOrder() {
//
//        BookBikeJ order = new BookBikeJ();
//        boolean create = true;
//        if (order.setBikeType(BikeType) && order.setDate(date) && order.getTime() == create && order.getRentalHours() == create && order.getQty() == create) {
//
//        }
//    }
    // view Order

    public void viewOrder() {



}
    
}
