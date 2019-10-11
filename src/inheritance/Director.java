/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *William:

Finish your inheritance part of the Assignment.
Classes Assigned: Director(Datafields: String Policy),
* Employee(Datafields: String Salary),
* ManagerDirector(Datafields: String Benefit)
 * @author w_ara
 */
public class Director extends Employee 
{
    private String Policy;
    
    public Director (String firstname, String lastname, int age,String Salary, String Policy)
    {
        super(firstname, lastname, age, Salary);
        this.Policy = Policy;
    }
    @Override
    public boolean isOlder()
    {
        return true;
    }
    
}
