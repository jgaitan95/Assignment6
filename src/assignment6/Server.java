/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import assignment6.model.EmployeeList;
import java.util.ArrayList;
/**
 *
 * @author csc190
 */
public class Server {

    protected static void updateSchedule(String val){
        try{
        String qry = "UPDATE employees SET EmployeeSchedule='" + val +"' WHERE name='name'";
        //System.out.println("preupload");
        Utils.execNonQuery(qry);
        System.out.println("Uploaded!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    // Given a skill, day, and time (i.e. "Butcher", "M", "12")
    // It will return all available employees for that time
    protected static String getAvailEmployees(String skills, String day, String hour){
        String qry = "SELECT EmployeeSchedule FROM employees WHERE name='name'";
        String empObjStr = Utils.execQuery(qry);
        
        int time = Integer.parseInt(hour);
        if(empObjStr==null) return "Failure 1";
        EmployeeList emps = (EmployeeList) Utils.toObj(empObjStr);
        if(emps==null) return "Failure 2";
        ArrayList<Integer> empSkills = emps.getEmpBySkill(skills);
        ArrayList<Integer> empSchedule = emps.getEmpBySchedule(day, time);
        
        String names = "";
        for (int i=0; i<empSkills.size(); i++){
            for(int j=0; j<empSchedule.size(); j++){
                if (empSkills.get(i).equals(empSchedule.get(j))){
                    names = emps.getEmpByID(empSchedule.get(j));
                    System.out.println(names);
                }
            }
            
        }
        
        
        return "";
    }
    public static void main(String [] args){
        String op = args[0];
        if(op.equals("uploadEmps")){
            updateSchedule(args[1]);
        }else{
            String available = getAvailEmployees(args[1], args[2], args[3]);
            //String available = getAvailEmps("Butcher", "M12");
            System.out.println(available);
        }
    }
    
    
}
