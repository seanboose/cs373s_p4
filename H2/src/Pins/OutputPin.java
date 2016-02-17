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

    public String name;
    public Gate parent;
    
    public OutputPin(String name, Gate parent) {
	this.name = name;
        this.parent = parent;
    }
    
    public void addWire(Wire w) {
	    // TODO
    }
    
    public String toString() {
        return parent.name +"."+ this.name;
    }
    
    public String nameOfGate() {
        return parent.name;
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
