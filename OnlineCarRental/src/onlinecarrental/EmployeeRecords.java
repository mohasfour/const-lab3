
package onlinecarrental;
        
import java.util.ArrayList;
import java.io.*;

public class EmployeeRecords {
    private String name;
    private int id;
    private String username;
    private String password;
    private int Salary;
    static ArrayList<EmployeeRecords> mEmployees = new ArrayList<EmployeeRecords>();
    
    public EmployeeRecords(){
        
    }
    public EmployeeRecords(String name, int id, String username, String password, int Salary) {
        this.name = name;
        this.id = id;
        this.username = username;
        this.password = password;
        this.Salary = Salary;
    }

    public String getName() {
        return name;
    }
    public void AddEmployee(EmployeeRecords emp){
        if (mEmployees.contains(emp)) throw new IllegalArgumentException("Employee already exists");
        mEmployees.add(emp);
    }
    public void DelEmployee(EmployeeRecords emp){
         mEmployees.remove(emp);
    }
    public void EditEmployee(EmployeeRecords emp,String name, int id, String username, String password, int Salary){
        EmployeeRecords edit = emp.Search(id);
        edit.setId(id);
        edit.setName(name);
        edit.setPassword(password);
        edit.setUsername(username);
        edit.setSalary(Salary);
        
    }
    
    public EmployeeRecords Search(int id){
        EmployeeRecords info = EmployeeRecords.mEmployees.get(id);
        return info;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "EmployeeRecords{" + "name=" + name + ", id=" + id + ", username=" + username + ", password=" + password + ", Salary=" + Salary + '}';
    }
    
    
    
}
