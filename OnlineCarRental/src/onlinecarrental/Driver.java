/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinecarrental;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dell
 */
public class Driver extends VehicleBooking  {
    String name;
    boolean free;
    int rating;
     static ArrayList<Driver> driv = new ArrayList<Driver>();
    public Driver() {
        
    }

    public String getName() {
        return name;
    }
    public void AddDriver(Driver cus){
        if(driv.contains(cus)) throw new IllegalArgumentException("Driver already exists");
        driv.add(cus);
}
     public void DelDriver(Driver cus){
        driv.remove(cus);
}

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Driver(String name, boolean free, int rating, int vehicleId, Date bookingDate, int DriverId, int CustomerId) {
        super(vehicleId, bookingDate, DriverId, CustomerId);
        this.name = name;
        this.free = free;
        this.rating = rating;
    }

    public ArrayList<Driver> getinfo(){
       return driv;
       
    }

    /**
     *
     * @return
     */
    @Override
    public VehicleBooking getDriverinfo(){
       return vBook.get(DriverId) ;
    
      }

    @Override
    public String toString() {
        return "Driver{" + "name=" + name + ", free=" + free + ", rating=" + rating + '}';
    }
    
    
    
}
