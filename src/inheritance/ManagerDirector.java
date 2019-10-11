/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * ManagerDirector(Datafields: String Benefit)
 * @author w_ara
 */
public class ManagerDirector extends Director
{
    private String Benefit;
    
    public ManagerDirector (String firstname, String lastname, int age,String Salary, String Policy, String Benefit)
    {
        super(firstname, lastname, age, Salary, Policy);
        this.Benefit = Benefit;
    }
    @Override
    public boolean isOlder()
    {
        return true;
    }
}
