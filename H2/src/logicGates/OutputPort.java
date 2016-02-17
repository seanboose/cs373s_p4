/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicGates;

import Pins.*;
import GatesApp.*;
import java.util.*;

/**
 *
 * @author don
 */
public class OutputPort extends Gate {

    public OutputPort(String name) {
        super(name);
        inputs.put("i", new InputPin("i", this));
    }
    
    public InputPin getInput() { 
        return inputs.get("i"); 
    }
    
    // TABLE METHODS
    
    static LinkedList<Gate> table;
    
    public static void resetTable() {
        // TODO
    }
    
    public static LinkedList<Gate> getTable() { 
	// TODO
        return null;
    }
    
    // EVAL METHODS
    
    public Value getValue() {
	// TODO
        return Value.UNKNOWN; 
    }
}
