/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.internal.util.StaticProperty.userName;
 
/**
 *
 * @author Genuine
 */
public class CRUD {
 
    /**
     * @return 
     */
  public static Statement getTheStatement()
    {
        String connString="";
        String userName="";
        String pwd="";
        Statement state=null;
        Connection conn;
              
                         
         try {
	       Class.forName("com.mysql.jdbc.Driver"); //load JDBC Driver
               conn = DriverManager.getConnection(connString,userName,pwd);
               state= conn.createStatement();
               
         } catch(ClassNotFoundException | SQLException ex) {System.out.print(ex.toString()); }
        
       return state;  
         
    }
    
public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in); 
         
         int select=-1;        
        while(select!=5){
            System.out.println("Please select desired operation:\n\n"
                + "1 - Create\n"
                + "2 - Update\n"
                + "3 - Delete\n"
                + "4 - Select\n"
                + "5 - End");
            select=scan.nextInt();
            
            if(select==1){
                try {
                    Employee aEmployee=new Employee ("lastname","middlename","firstname","dateofbirth","address","contact","status");                    
                    String query="Insert Into employee (lastname,middlename,firstname,dateofbirth,address,telephone,status)"
                            + "Values('"+ aEmployee.getLastname() + "',"
                            + "'" + aEmployee.getMiddlename() + "',"
                            + "'" + aEmployee.getFirstname() + "',"
                            + "'" + aEmployee.getDateofbirth() + "',"
                            + "'" + aEmployee.getAddress() + "',"
                            + "'" + aEmployee.getContact()+ "',"
                            + "'" + aEmployee.getStatus() + "')";
                    
                    getTheStatement().execute(query);
                     
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
            
                        
            else if(select==2){
                try {
                    Employee secondEmployee=new Employee ("lastname","middlename","firstname","dateofbirth","address","contact","status");
                    String query1="Update employee Set lastname='" + secondEmployee.getLastname() 
                            + "', middlename = '" + secondEmployee.getMiddlename() 
                            + "', firstname='"+ secondEmployee.getFirstname()
                            + "', dateofbirth='"+ secondEmployee.getDateofbirth()
                            + "', address='"+ secondEmployee.getAddress()
                            + "', contact='"+ secondEmployee.getContact()
                            +"', status = '" + secondEmployee.getStatus() + "'";
                                       
                    getTheStatement().execute(query1);
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(select==3){
                try {
                    String query2="Delete from employee where employeeid = ''"; //make dynamic
                                     
                    getTheStatement().execute(query2);
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (select==4)
            {
                try {
                    ResultSet rs = getTheStatement().executeQuery("Select * From employee");
                    
                    while(rs.next()){
                        System.out.print("Lastname: " + rs.getString("lastname")+ "\n");
                        System.out.print("Middlename: " + rs.getString("middlename")+ "\n");
                        System.out.print("Firstname: " + rs.getString("firstname")+ "\n");
                        System.out.print("Date of Birth: " + rs.getString("dateofbirth")+ "\n");
                        System.out.print("Address: " + rs.getString("address")+ "\n");
                        System.out.print("Contact: " + rs.getString("contact")+ "\n");
                        System.out.print("Status: " + rs.getString("status")+ "\n");
                        System.out.print("\n");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(select==5){
                System.exit(0);
            }
            
          
}
     }
       
    }
      
    
     
    
    