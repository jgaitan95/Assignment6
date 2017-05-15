/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import assignment6.model.Employee;
import assignment6.model.EmployeeList;
import assignment6.model.EmployeeSchedule;

/**
 *
 * @author csc190
 */
public class Client {
    protected static EmployeeList buildSchedule(){
 // Create Schedules
        String[] DrEvil = {"M", "W", "F"};
        String[] MiniMe = {"T", "W", "F"};
        String[] NumberTwo = {"M", "F"};
        String[] AustinPowers = {"T", "R"};
        
        int[] DrEvil2 = {9, 10, 11, 12, 19, 20};
        int[] MiniMe2 = {9, 10, 12, 14, 15, 16, 17, 18};
        int[] NumberTwo2 = {12, 13, 14, 15, 16, 17, 18};
        int[] AustinPowers2 = {8, 9, 10, 11, 12, 13, 14};
        
        EmployeeSchedule[] Schedule_Arr = new EmployeeSchedule[]{
        new EmployeeSchedule(DrEvil, DrEvil2),
        new EmployeeSchedule(MiniMe, MiniMe2),
        new EmployeeSchedule(NumberTwo, NumberTwo2),
        new EmployeeSchedule(AustinPowers, AustinPowers2)
        };
        
        //Creates Skills
        String[] EmpSkill1 = {"Butcher", "Saucier", "Baker"};
        String[] EmpSkill2 = {"Saucier", "Baker"};
        String[] EmpSkill3 = {"Butcher", "Dishwasher"};
        String[] EmpSkill4 = {"Baker", "Saucier"};
        
        //Create Employees
        Employee[] Employee_Arr = {
            new Employee(101, "Dr. Evil",      EmpSkill1, Schedule_Arr[0]),
            new Employee(102, "Mini Me",       EmpSkill2, Schedule_Arr[1]),
            new Employee(103, "Number Two",    EmpSkill3, Schedule_Arr[2]),
            new Employee(104, "Austin Powers", EmpSkill4, Schedule_Arr[3])
        }; 
        EmployeeList emplist = new EmployeeList(Employee_Arr);
        return emplist;
    }
    
    public static void main(String[] args) throws Exception {
        String op = args[0];

        EmployeeList schedule = buildSchedule();
        String url = "http://localhost/datasel.php";
        String ScheduleContent = Utils.toStr(schedule);
        //System.out.println(empContent);
        String datastr;
        
        
        
        if (op.equals("1")){
            //System.out.println("here1");
            datastr = "op=uploadEmps&EmployeeSchedule=" + ScheduleContent;
        } else {
            //System.out.println("here2");
            datastr = "op=getAvailEmps&skills="+args[1]+"&day=" +args[2]+"&hour=" +args[3];
            System.out.println("Looking for a: " + args[1] + " Who can work at: " + args[2] + args[3]);
        }   
            

            String response = Utils.httpsPost(url, datastr);
            System.out.println(response);

    }
}
