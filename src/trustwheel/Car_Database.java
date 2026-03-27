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
public class Car_Database {

    
    private static Car_Database instance;
    
    private List<Car> carsList;


    private Car_Database() {
        carsList = new ArrayList<>();
        
        carsList.add(new Car("Honda CR-V ", "SUV", RentalTier.STANDARD, 30.0));
        carsList.add(new Car("Nissan Rogue", "Crossover", RentalTier.STANDARD,  33.0));
        carsList.add(new Car("Hyundai Tucson", "Crossover", RentalTier.STANDARD,28.0));
        carsList.add(new Car("BMW 7 Series", "Sedan", RentalTier.INTERMEDIATE,28.0));
        carsList.add(new Car("BMW M5", "Sedan", RentalTier.INTERMEDIATE, 18.0 ));
        carsList.add(new Car("Ram 1500 Quad Cab", "Truck", RentalTier.STANDARD,22.0));
        carsList.add(new Car("Toyota Camry", "Hybrid", RentalTier.INTERMEDIATE, 51.0 ));
        carsList.add(new Car("Lexus LC ", "cope", RentalTier.ECONOMY,18.0 ));
        carsList.add(new Car("Chrysler Pacifica", "Van/Minivan", RentalTier.VAN, 22.0));
    }

    public static Car_Database getInstance() {
        if (instance == null) {
            instance = new Car_Database();
        }
        return instance;
    }

    public List<Car> getAllCars() {
        return carsList;
    }
}

