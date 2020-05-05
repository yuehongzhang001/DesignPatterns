/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class Manager {
   private Person p = Employee.createEmoloyee();
   private String department;
   
   public Manager(String d){
       department = d;
   }
   
   public String getName(){
       return p.getName();
   }
   
   public void setName(String n){
       p.setName(n);
   }
}
