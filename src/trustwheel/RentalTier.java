/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trustwheel;

/**
 *
 * @author ASUS
 */
public enum RentalTier {
    
    ECONOMY(45.0,4 ,"poor"),
    INTERMEDIATE(50.0, 4 , "Medium"),
    STANDARD(55.0,5,"Good"),
    VAN(70.0,7,"medium");

    private final double dailyRate;
    private final int maxPassengers;
    private final String comfortLevel;

    RentalTier(double dailyRate, int maxPassengers, String comfortLevel) {
        
        this.dailyRate = dailyRate;
        this.maxPassengers = maxPassengers;
        this.comfortLevel = comfortLevel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getComfortLevel() {
        return comfortLevel;
    }
}
