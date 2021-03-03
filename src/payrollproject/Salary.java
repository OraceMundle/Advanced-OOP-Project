/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package payrollproject;

/**
 *
 * @author student
 */
public class Salary extends Employee {

        private int annualSalary;
        
        public Salary(){
        
        
        
        }
    public Salary(String name, int idnum, int hours, double rate, int annualSalary){
                super(name, idnum);

    this.annualSalary=annualSalary;



    }
        public SalarylSalary(){

        return annualSalary;


        }

        public void calculatePay(){

                pay=annualSalary/12;

        }
        







}// end of fulltime
