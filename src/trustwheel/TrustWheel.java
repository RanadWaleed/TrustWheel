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
        // TODO code application logic here
        System.out.println("welcom to TrustWheel Applcation");
        InputValidator validator = new InputValidator();
        int passengers = validator.getPassengers();
        int days = validator.getRentalDays();
        double miles = validator.getMileage();

        new RentialSystem().run(passengers, days, miles);

    }

}
