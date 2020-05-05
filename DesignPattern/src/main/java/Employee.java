/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class Employee implements Person{
    private String name;
    public Employee(String n){
        name=n;
    }
    
    public Person clone(){
        return new Employee(this.name);
    }
    
    public static Employee createEmoloyee(){
        return new Employee("Tom");
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
