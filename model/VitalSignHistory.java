/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mdong
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSigns>history;
    public VitalSignHistory(){
        this.history = new ArrayList<>();//took history and told java to create a new array list with vital signs
        // this object store the history of vital signs that we collect from teh VitalSigns class 
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVitals(){
       VitalSigns newVitals = new VitalSigns();
       history.add(newVitals);
        return newVitals;
        //we created a new method inside the vitlasignhistory and call it newvitals
        //creates and adds new vitals and adds to history
        
    }
}
