/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;


/**
 * Event Class
 * @author ksrhi
 */
public class Event extends SuperController{
    /**
     * getEventList method returns eventList ArrayList from model for a specific
     * category of tools.
     * @return 
     */
    public ArrayList getEventList(){
        return data;
    }
    
    /**
     * getEventDateTime method returns eventDateTime from model.
     * @return 
     */
    public ArrayList getEventDateTime(){
        return data;
    }
    
    /**
     * confirmExistingPass returns boolean value is park pass exists for 
     * same day.
     * @return 
     */
    public boolean confirmExistingPass(){
        return data;
    }
    
    /**
     * confirmNewReservation method returns event id(s) of new reservations made
     * @return 
     */
    public ArrayList confirmNewReservation(){
        return data;
    }
}
