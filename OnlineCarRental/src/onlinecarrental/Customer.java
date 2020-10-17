/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinecarrental;

import java.util.ArrayList;
import java.util.Date;

public class Customer extends VehicleBooking {
    private String name;
    private String paymentmethod;
    private int rating;
    static ArrayList<Customer> custo = new ArrayList<Customer>();
    
    public Customer() {
        
    }

    public Customer(String name, String paymentmethod, int rating, int vehicleId, Date bookingDate, int DriverId, int CustomerId) {
        super(vehicleId, bookingDate, DriverId, CustomerId);
        this.name = name;
        this.paymentmethod = paymentmethod;
        this.rating = rating;
    }
    
    public void AddCustomer(Customer cus){
        if(custo.contains(cus)) throw new IllegalArgumentException("Customer already exists");
        custo.add(cus);
}
     public void DelCustomer(Customer cus){
        custo.remove(cus);
}
     public ArrayList<Customer> getInfo(){
        return custo;
     }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
 public VehicleBooking getCustomerinfo(){
       return vBook.get(CustomerId) ;
    
      }
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", paymentmethod=" + paymentmethod + ", rating=" + rating + '}';
    }
    

   
    
}
