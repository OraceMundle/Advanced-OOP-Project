/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package payrollproject;

/**
 *
 * @author student
 */
public class Bank {
    private int hours;
    private double rate;
    private int bankinfoid;
    private String name;
    private String accounttype;
    private String accountnumber;
    
    //Start Constructors
    public Bank() {
    }
    
    public Bank(int bankinfoid, String name, String accounttype, String accountnumber) {
        this.bankinfoid = bankinfoid;
        this.name = name;
        this.accounttype = accounttype;
        this.accountnumber = accountnumber;
    }
    //End Constructors

    //Start Setters
    public void setBankinfoid(int bankinfoid) {
        this.bankinfoid = bankinfoid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }
    //End Setters
    
    //Start Getters
    public int getBankinfoid() {
        return bankinfoid;
    }

    public String getName() {
        return name;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public String getAccountnumber() {
        return accountnumber;
    }
    //End Getters
    
    //Start Custom Methods
    public void display (){
        
    }


    
    
    
    
    
    
    
    
    
    
    
}// end of parttime
