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
    
    private int salaryid;
    private int employeeid;
    private int numberofdayswork;
    private int overtimepay;
    private int grosssalary;
    private int nhtcontribution;
    private int totaldeduction;
    private int netpay;
    private int payrollmonth;

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
        

    //Start Setters
    public void setSalaryid(int salaryid) {
        this.salaryid = salaryid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public void setNumberofdayswork(int numberofdayswork) {
        this.numberofdayswork = numberofdayswork;
    }

    public void setOvertimepay(int overtimepay) {
        this.overtimepay = overtimepay;
    }

    public void setGrosssalary(int grosssalary) {
        this.grosssalary = grosssalary;
    }

    public void setNhtcontribution(int nhtcontribution) {
        this.nhtcontribution = nhtcontribution;
    }

    public void setTotaldeduction(int totaldeduction) {
        this.totaldeduction = totaldeduction;
    }

    public void setNetpay(int netpay) {
        this.netpay = netpay;
    }

    public void setPayrollmonth(int payrollmonth) {
        this.payrollmonth = payrollmonth;
    }
    //End Setters
    
    //Start Getters
    public int getSalaryid() {
        return salaryid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public int getNumberofdayswork() {
        return numberofdayswork;
    }

    public int getOvertimepay() {
        return overtimepay;
    }

    public int getGrosssalary() {
        return grosssalary;
    }

    public int getNhtcontribution() {
        return nhtcontribution;
    }

    public int getTotaldeduction() {
        return totaldeduction;
    }

    public int getNetpay() {
        return netpay;
    }

    public int getPayrollmonth() {
        return payrollmonth;
    }
    //End Getters
    
    //Start Custom Methods
    public void display(){
        
    }
    public int calOvertTimePay(){
        //Insert calculation here
        return 10;
    }
        
        
        







}// end of fulltime
