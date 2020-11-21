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
    public ArrayList<String> cancelBike() {
       if (ViewOrder.jButton4.isEnabled()) {
            ViewOrder.jTextField4.setText(null);
            ViewOrder.jTextField12.setText(null);
            ViewOrder.jTextField20.setText("Cancelled");

            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
        return fileList;
    }
    
        // CancelOrder
    public ArrayList<String> cancelFix() {
        if (ViewOrder.jButton5.isEnabled()) {
            ViewOrder.jTextField5.setText(null);
            ViewOrder.jTextField13.setText(null);
            ViewOrder.jTextField21.setText("Cancelled");
            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
        return fileList;
    }




}
