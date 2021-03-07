/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollproject;

/**
 *
 * @author OraceMundle
 */
public class Users {
    
    private int userid;
    private String username;
    private String password;
    private String accounttype;

    // Start Constructors
    
    public Users() {
    }

    public Users(int userid, String username, String password, String accounttype) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.accounttype = accounttype;
    }
    //End Constructors
    
    //Start Setters
    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }
    //End Setters
    
    //Start Getters
    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccounttype() {
        return accounttype;
    }
    //End Getters
    
    //Custom Methods
    public void display(){
        
    }

    
    
}
