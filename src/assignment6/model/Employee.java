/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6.model;


/**
 *
 * @author csc190
 */
public class Employee implements java.io.Serializable{
    protected int ID;
    protected String Name;
    protected String[] Skills;
    protected EmployeeSchedule schedule;
    public Employee(int ID, String Name, String[] Skills, EmployeeSchedule schedule){
        this.ID = ID;
        this.Name = Name;
        this.Skills = Skills;
        this.schedule = schedule;
    }

}