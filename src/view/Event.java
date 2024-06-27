/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author sammy
 */
public class Event {
    
    /**
     * displayForm method will display the default form.
     */
    public void displayForm(){};
  
    /**
     * displayEventList method will display the list of possible events
     */
    public void displayEventList(){};
    
    /**
     * displayEventDateTime will display the list of possible Date/Times for a
     * specific event id
     */
    public void displayEventDateTime(){};
    
    /**
     * displayReservationCOnfirmation will display the shopping cart confirmation
     * If an existing park pass exists for the event day requested, only the newly requested
     * event will display.
     * If an existing park pass does not exist for the event day requested,
     * the newly requested event and the park pass will display.
     */
    public void displayReservationConfirmation(){};
}
