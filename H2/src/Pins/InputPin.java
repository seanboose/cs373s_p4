/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pins;

import GatesApp.*;
import logicGates.Gate;
import logicGates.Wire;

/**
 *
 * @author don
 */
public class InputPin {

    public String name;
    public Gate parent;
    public Wire wire;
    
    public InputPin(String name, Gate parent) {
	this.name = name;
        this.parent = parent;
    }
    
    public void addWire(Wire w) {
	wire = w;
    }
    
    public String toString() {
        return nameOfGate() +"."+ this.name;
    }
    
    public String nameOfGate() {
        return parent.name;
    }
    
    // CONSTRAINT METHODS
    
    public boolean isUsed() {
        return (wire != null);
    }
    
    // EVALUATION METHODS
    
    public Value getValue() {
        return wire.getValue(); 
    }
}
