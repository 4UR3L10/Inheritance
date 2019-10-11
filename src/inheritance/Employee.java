/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *Employee(Datafields: String Salary),
 * @author w_ara
 */
public class Employee extends Person
{
    private String Salary;

    public Employee (String firstname,String lastname, int age,String Salary)
    {
        super(firstname, lastname, age);
        this.Salary = Salary;
    }
    @Override
    public boolean isOlder()
    {
        return true;
    }

    @Override
    public String toString() 
    {
        return "Employee{" + "Salary=" + Salary +'}';
    }
    
    

    
    
}
