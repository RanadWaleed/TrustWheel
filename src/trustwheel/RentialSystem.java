/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trustwheel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class RentialSystem {
  

    public void run (int passengers, int days, double miles) {
        
        List<Car> allCars = Car_Database.getInstance().getAllCars();
        List<Car> currentCars = filterByPassengers(allCars, passengers);

        if (currentCars.isEmpty()) {
            System.out.println("\n  Sorry, no car fits " + passengers + " passengers ");
            return;
        }

        List<Car> bestCars = new ArrayList<>();
        double lowestCost = Double.MAX_VALUE;

        for (Car car : currentCars) {
            
            double currentCost = TotalCost(car, days, miles);
            
            if (currentCost < lowestCost) {
                lowestCost = currentCost;
                bestCars.clear();
                bestCars.add(car);
            } 
            else if (currentCost == lowestCost) {
                Car BestCar = bestCars.get(0);
                int currentComfort = ComfortScore(car.getTier().getComfortLevel());
                int bestComfort = ComfortScore(BestCar.getTier().getComfortLevel());
                
                if (currentComfort > bestComfort) {
                    bestCars.clear();
                    bestCars.add(car);
                } 
                else if (currentComfort == bestComfort) {
                    bestCars.add(car);
                }
            }
        }

        System.out.println("\n              === Best Car(s) for Your Trip : ===         ");
        System.out.println("          ---------------------------------------------   ");
        
        for (Car car : bestCars) {
            
            System.out.println("Make and Model: " + car.getCategrie()); 
            System.out.println("Max Passengers: " + car.getTier().getMaxPassengers());
            System.out.printf("Total Cost: $%.2f\n", lowestCost);
            System.out.println("------------------------------------------------------------");
            System.out.println("************************************************************");

        }
    }
    

    private List<Car> filterByPassengers(List<Car> cars, int passengers) {
        List<Car> potentialCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getTier().getMaxPassengers() >= passengers) {
                potentialCars.add(car);
            }
        }
        return potentialCars;
    }

    private double TotalCost(Car car, int days, double miles) {
        double rentalCost = car.getTier().getDailyRate() * days;
        double gasCost = (miles / car.getMPG()) * 2.25;
        return rentalCost + gasCost;
    }

    private int ComfortScore(String comfortLevel) {
        
        switch (comfortLevel.toLowerCase()) {
            case "poor": return 1;
            case "medium": return 2;
            case "good": return 3;
            default: return 0;
        }
    }
}