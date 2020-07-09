/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yeong Yong Sheng
 */
public class Employee {
private String name;
  private double salary;

  Employee(){
    name = " ";
    salary = 0.0;
}
  Employee(String employeeName){
        name = employeeName;
        salary = 0.0;
    }
  Employee(String employeeName, double currentSalary) {
    name = employeeName;
    salary = currentSalary;
  }
  void raiseSalary(double percent){
    salary = salary + (salary * percent / 100.0);
  }
  public String getName(){
     return name;
    }
    
    public double getSalary(){
        return salary;    
    }
    
    public void setName(String employeeName){
        name = employeeName;
    }
    
    public void setSalary(double currentSalary){
        salary = currentSalary;
    }
}
