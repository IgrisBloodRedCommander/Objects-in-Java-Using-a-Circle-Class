/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.test;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FinalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         boolean back = true;
      // Array of radii
        do {double[] radii = {1.0, 2.5, 4.0, 7.5};
JOptionPane.showMessageDialog(null, "The Arraylist: {1, 2.5, 4, 7.5}", "Test Functionality", JOptionPane.PLAIN_MESSAGE);
        // Loops through each radius in the array
        for (double radius : radii) {
            // Creates a Circle object
           testFinal circle = new testFinal(radius);

            // Calculate area and circumference
            double area = circle.calculateArea();
            double circumference = circle.calculateCircumference();

            // Displays the results using JOptionPane
            String message = String.format(
                "For a circle with radius %.2f:\nArea: %.2f\nCircumference: %.2f",
                radius, area, circumference
            );

            JOptionPane.showMessageDialog(null, message, "Test Functionality", JOptionPane.PLAIN_MESSAGE);
             
            
                       
        } String[] set = {"Yes","Exit"};
                                int setting = JOptionPane.showOptionDialog(
                                        null,
                                        "Do you want to see the test again? ",
                                        "Test Successful",
                                        JOptionPane.DEFAULT_OPTION, -1, null, set, set[0]);
                                if (setting == 0){
                                back = true;
                                } else {System.exit(0);}
    }while (back = true);
    }
    
}
