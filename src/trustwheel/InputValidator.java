/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trustwheel;
import java.util.Scanner;


/**
 *
 * @author ragha
 */
public class InputValidator {
    
      private static final Scanner SCANNER = new Scanner(System.in);
 
    public int getPassengers() { 
        return readInt("Enter number of passengers (1-7): ", 1, 7); }
    
    public int getRentalDays() { 
        return readInt("Enter number of rental days (1-365): ", 1, 365); }
    
    public double getMileage() {
        return readDouble("Enter approximate trip mileage: ", 1, 100000); }
    
   private int readInt(String prompt, int min , int max) {
       
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value < min || value > max) {
                    System.err.println(" Error: Must be between " + min + " and " + max + ".");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.err.println(" Error: Invalid input Please enter a valid whole number.");
            }
        }
    }
    
 private double readDouble(String prompt, double min, double max) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (value < min || value > max) {
                    System.err.println(" Error: Must be between " + min + " and " + max + ".");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.err.println(" Error: Invalid input. Please enter a valid number.");
            }
        }
 }}
    