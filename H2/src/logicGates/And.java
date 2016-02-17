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
public class And extends Gate {

    public And(String name) {
        super(name);
        inputs.put("i1", new InputPin("i1", this));
        inputs.put("i2", new InputPin("i2", this));
        outputs.put("o", new OutputPin("o", this));
        
        if(table == null) table = new LinkedList<>();
        if(!table.contains(this))table.add(this);
        if(!dbTable.contains(table))dbTable.add(table);
    }
    
    // TABLE METHODS
    
    static LinkedList<Gate> table;
    
    public static void resetTable() {
	table = new LinkedList<>();
    }
    
    public static LinkedList<Gate> getTable() { 
        return table;
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
