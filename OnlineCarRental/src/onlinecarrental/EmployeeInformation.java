/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinecarrental;


public class EmployeeInformation {
    private String name;
    private int id;
    private int phone;
    private String Address;
   
    public EmployeeInformation(){
        
    }
    public EmployeeInformation(String name, int id, int phone, String Address) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.Address = Address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "EmployeeInformation{" + "name=" + name + ", id=" + id + ", phone=" + phone + ", Address=" + Address + '}';
    }
    
    
    
}
