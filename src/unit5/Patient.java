/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit5;

/**
 *
 * @author dani3700
 */
public class Patient {
           private String name;
       
        private String Condition;
        
        public Patient (String nm, String condi) {
        name = nm;
        Condition = condi;
    }

 
    

    public String getName(){
        return name;
    }

    
    public String getCondition() {
        return Condition;
    }
    
    public String toString() {
        return ("Name: " + name + "\tCondition: " + Condition);
    }
    
  
    public boolean validate()
    {
        if(name== null || name=="")
            return false;
        else 
            return true;
    }
    
        
}

