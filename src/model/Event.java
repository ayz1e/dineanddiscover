/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sammy
 */
public class Event {
    
    /**
     * getSQLEventList pulls the list of events from SQL, populates it into 
     * an ArrayList, and returns it
     * @return
     */
    public ArrayList getSQLEventList(){
        return data;
    }
    
    /**
     * getSQLEventDateTime method pulls the list of event times from SQL for a
     * specific event, and populates it into an ArrayList, and returns it 
     * @return 
     */
    public ArrayList getSQLEventDateTime(){
        return data;
    }
    
    /**
     *confirmExistingPass method makes new reservation and returns the event id 
     * if a park pass exists for a specific user on the same day as the selected event.
     * If a pass does exist, the requested reservation is allowed, returns 1 event id
     * If a pass does not exist, the requested reservation + a park pass is allowed, returns 2 event ids
     * 
     * @return 
     */
    public ArrayList confirmExistingPass(){
        return data;
    }
    
    
}
