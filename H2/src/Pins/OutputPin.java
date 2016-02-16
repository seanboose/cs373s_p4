/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pins;

import logicGates.*;
import GatesApp.*;
import logicGates.Wire;

/**
 *
 * @author don
 */
public class OutputPin {
    // look at class diagram to see what fields need to be added
    
    public OutputPin(String name, Gate parent) {
	    // TODO
    }
    
    public void addWire(Wire w) {
	    // TODO
    }
    
    public String toString() {
	    // TODO
        return null;
    }
    
    public String nameOfGate() {
	    // TODO
        return null;
    }
    
    // CONSTRAINT METHODS
    
    public boolean isUsed() {
	    // TODO
        return false;
    }
    
    // EVALUATION METHODS
    
    public Value getValue() {
        // TODO
        return Value.UNKNOWN;
    }
}
