/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package payrollproject;

/**
 *
 * @author student
 */
public class Employee {
    
    private int employeeid;
    private String lastname;    
    private String middlename;
    private String firstname;
    private String dateofbirth;
    private String address;
    private String contact;
    private String status;
    private int positionid;
    private int bankinfoid;
    private int userid;
    private int salaryid;
    
    //Start Constructors
    public Employee() {
    }

    public Employee(int employeeid, String lastname, String middlename, String firstname, String dateofbirth, String address, String contact, String status, int positionid, int bankinfoid, int userid, int salaryid) {
        this.employeeid = employeeid;
        this.lastname = lastname;
        this.middlename = middlename;
        this.firstname = firstname;
        this.dateofbirth = dateofbirth;
        this.address = address;
        this.contact = contact;
        this.status = status;
        this.positionid = positionid;
        this.bankinfoid = bankinfoid;
        this.userid = userid;
        this.salaryid = salaryid;
    }
    //End Constructors

   Employee(String lastname, String firstname, String middlename, String dateofbirth, String address, String contact, String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Start Setters
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPositionid(int positionid) {
        this.positionid = positionid;
    }

    public void setBankinfoid(int bankinfoid) {
        this.bankinfoid = bankinfoid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setSalaryid(int salaryid) {
        this.salaryid = salaryid;
    }
    //End Setters
    
    //Start Getters
    public int getEmployeeid() {
        return employeeid;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMiddlename() {
        return middlename;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getStatus() {
        return status;
    }

    public int getPositionid() {
        return positionid;
    }

    public int getBankinfoid() {
        return bankinfoid;
    }

    public int getUserid() {
        return userid;
    }

    public int getSalaryid() {
        return salaryid;
    }
    //End Getters
    
    //Start Custom Methods
    
    public void display(){
        
    }
    
           

}
