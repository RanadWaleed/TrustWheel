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
        
     carsList.add(new Car("SUV ", "CR-V","Honda ", RentalTier.STANDARD, 30.0));
        carsList.add(new Car("Crossover","Rogue" ,"Nissan ", RentalTier.STANDARD,  33.0));
        carsList.add(new Car("Crossover", "Tucson" ,"Hyundai Tucson", RentalTier.STANDARD,28.0));
        carsList.add(new Car("Sedan", "7 Series" ,"BMW ", RentalTier.INTERMEDIATE,28.0));
        carsList.add(new Car("Sedan", "M5" ,"BMW ", RentalTier.INTERMEDIATE, 18.0 ));
        carsList.add(new Car("Truck", "1500 Quad Cab" ,"Ram 1500 Quad Cab", RentalTier.STANDARD,22.0));
        carsList.add(new Car("Hybrid", " Camry" ,"Toyota", RentalTier.INTERMEDIATE, 51.0 ));
        carsList.add(new Car("Coupe ", "LC" ,"Lexus ", RentalTier.ECONOMY,18.0 ));
        carsList.add(new Car("Coupe ", " Mustang" ,"Ford", RentalTier.ECONOMY,23.0 ));
        carsList.add(new Car("Van/Minivan", "Pacifica" ,"Chrysler ", RentalTier.VAN, 22.0));
     }

    public static Car_Database getInstance() {
        if (instance == null) {
            instance = new Car_Database();
        }
        return instance;
    }

    public List<Car> getAllCars() {
    return java.util.Collections.unmodifiableList(carsList); 
   }
}

