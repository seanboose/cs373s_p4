/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicGates;

import GatesApp.*;
import java.util.LinkedList;

/**
 *
 * @author don
 */
public class Or extends Gate {

    public Or(String name) {
        super(name);
	// TODO
    }
    
    // TABLE METHODS
    
    static LinkedList<Or> table;
    
    public static void resetTable() {
        // TODO
    }
    
    public static LinkedList<Or> getTable() { 
	// TODO
        return null;
    }
    
    // EVAL METHODS
            
    public Value getValue() { 
        // TODO
        return Value.UNKNOWN;
    }
}
