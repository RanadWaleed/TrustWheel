    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trustwheel;

/**
 *
 * @author ASUS
 */
public class Car {
    
    
    private String categrie; 
    private String model;
    private String make;
    private RentalTier tier;
    private double MPG;

    public Car(String categrie, String model,String make, RentalTier tier, double MPG) {
        this.categrie = categrie;
        this.model = model;
        this.tier = tier;
        this.MPG = MPG;
        this.make=make;
    }

    public String getCategrie() {
        return categrie;
    }
    public String getmake() {
        return make;
    }
    public String getModel() {
        return model;
    }

  

    public RentalTier getTier() {
        return tier;
    }

    public double getMPG() {
        return MPG;
    }



  
    







}