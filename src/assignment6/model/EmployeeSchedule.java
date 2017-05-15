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
public class EmployeeSchedule implements java.io.Serializable{
    protected String[] days;
    protected int[] hours;
    public EmployeeSchedule(String[] days, int[] hours){
        this.days = days;
        this.hours = hours;
    }
}