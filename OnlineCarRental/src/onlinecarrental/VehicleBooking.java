/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinecarrental;

import java.util.ArrayList;
import java.util.Date;

public class VehicleBooking {
    private int vehicleId;
    private Date bookingDate;
    int DriverId;
    int CustomerId;

    static ArrayList<VehicleBooking> vBook = new ArrayList<VehicleBooking>();
    
     public VehicleBooking(){
         
     }
    public VehicleBooking(int vehicleId, Date bookingDate, int DriverId, int CustomerId) {
        this.vehicleId = vehicleId;
        this.bookingDate = bookingDate;
        this.DriverId = DriverId;
        this.CustomerId = CustomerId;
    }
    public void AddBooking(VehicleBooking inf){
        if(vBook.contains(inf)) throw new IllegalArgumentException("booking already exists");
        vBook.add(inf);
    }
    public void DelBooking(VehicleBooking inf){
        vBook.remove(inf);
        
    }
     public ArrayList<VehicleBooking> ViewBooking(){
        
        return vBook;
     }
      public VehicleBooking getDriverinfo(){
       return vBook.get(DriverId) ;
    
      }
      public VehicleBooking getCustomerinfo(){
       return vBook.get(CustomerId) ;
    
      }
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getDriverId() {
        return DriverId;
    }

    public void setDriverId(int DriverId) {
        this.DriverId = DriverId;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }
    
    
}
