/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package payrollproject;

/**
 *
 * @author student
 */
public class Position {

        private int NoOfEmployee;
        
        private int positionid;
        private String positionname;
        private int dailyrate;
        private int monthlyrate;
        private int workingdayspermonth;
        
       
        public int getNoEmployees(){

                return NoOfEmployee;
        }

    public Position() {
    }

    public Position(int positionid, String positionname, int dailyrate, int monthlyrate, int workingdayspermonth) {
        this.positionid = positionid;
        this.positionname = positionname;
        this.dailyrate = dailyrate;
        this.monthlyrate = monthlyrate;
        this.workingdayspermonth = workingdayspermonth;
    }

    public void setPositionid(int positionid) {
        this.positionid = positionid;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    public void setDailyrate(int dailyrate) {
        this.dailyrate = dailyrate;
    }

    public void setMonthlyrate(int monthlyrate) {
        this.monthlyrate = monthlyrate;
    }

    public void setWorkingdayspermonth(int workingdayspermonth) {
        this.workingdayspermonth = workingdayspermonth;
    }

    public int getPositionid() {
        return positionid;
    }

    public String getPositionname() {
        return positionname;
    }

    public int getDailyrate() {
        return dailyrate;
    }

    public int getMonthlyrate() {
        return monthlyrate;
    }

    public int getWorkingdayspermonth() {
        return workingdayspermonth;
    }
        
    


}// end of marketing
