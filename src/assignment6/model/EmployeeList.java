/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment6.model;

import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class EmployeeList implements java.io.Serializable{
    Employee[] emps;
    public EmployeeList(Employee[] emps){
        this.emps = emps;
    }
    public String getEmpByID(int ID){
        for(int i=0; i<this.emps.length; i++){
            if(this.emps[i].ID == ID){
                return emps[i].Name;
            }
        }
        return null;
    }
    public ArrayList<Integer> getEmpBySchedule(String day, int hour){
        ArrayList<Integer> ids = new ArrayList<>();
        for(int i=0; i< emps.length; i++){
            for(int j=0; j<emps[i].schedule.days.length; j++){
                if(this.emps[i].schedule.days[j].equals(day)){
                    for(int k=0; k<emps[i].schedule.hours.length; k++){
                        if (this.emps[i].schedule.hours[k] == hour) {
                            ids.add(emps[i].ID);
                        }
                    }
                }
            }
        }
        return ids;
    }
    
    public ArrayList<Integer> getEmpBySkill(String skill){
        ArrayList<Integer> ids = new ArrayList<>();
        for(int i=0; i<emps.length; i++){
            for(int j=0; j<emps[i].Skills.length; j++){
                if (emps[i].Skills[j].equals(skill)){
                    ids.add(emps[i].ID);
                }
            }
        }
        return ids;
    }

}