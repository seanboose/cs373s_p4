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
public class Not extends Gate {

    public Not(String name) {
        super(name);
	// TODO
    }
    
    // TABLE METHODS
    
    static LinkedList<Not> table;
    
    public static void resetTable() {
        // TODO
    }
    
    public static LinkedList<Not> getTable() { 
	// TODO
        return null;
    }
    
    // EVAL METEHODS
    
    public Value getValue() {
	// TODO
        return Value.UNKNOWN;
    }
    
}