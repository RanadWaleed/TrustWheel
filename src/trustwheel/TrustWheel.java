/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trustwheel;

/**
 *
 * @author ASUS
 */
public class TrustWheel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*********************************************************************************");
        System.out.println("             -  WELCOME TO THE TRUSTWHEEL APPLICATION!-                  ");
        System.out.println("         -> Here you can find the best offers for rental cars!     ");
        System.out.println(" NOTE: Our cars are carefully selected with special attention to your comfort <3\n");
        System.out.println(" ******************************************************************************** \n");


        InputValidator validator = new InputValidator();
        int passengers = validator.getPassengers();
        int days = validator.getRentalDays();
        double miles = validator.getMileage();

        new RentialSystem().run(passengers, days, miles);

    }

}
