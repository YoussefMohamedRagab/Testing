/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joeguitest;

/**
 *
 * @author USER
 */
public class TestAuthentication {
    
    
    private final String CardPin = "20465";

    public String getCardPin() {
        return CardPin;
    }
    public boolean Validation (String pin){
        
        if(pin.equals(CardPin))
            return true;
        else
            return false;
            
        
    }
    
    
    
    
    
    
}
