/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicGates;

import GatesApp.*;
import java.util.*;

/**
 *
 * @author don
 */
public class And extends Gate {

    public And(String name) {
        super(name);
	/* TODO */
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
    
    // EVALUATION METHODS
    
    public Value getValue() { 
        /* Value v1 = i1.getValue();
           Value v2 = i2.getValue();
           if (v1==Value.TRUE && v2==Value.TRUE)
               return Value.TRUE;
        else
            return Value.FALSE;
        */
        return Value.UNKNOWN;
    }
    
}
