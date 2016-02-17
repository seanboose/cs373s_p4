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
        
        if(table == null) table = new LinkedList<>();
        if(!table.contains(this))table.add(this);
        if(!dbTable.contains(table))dbTable.add(table);
    }
    
    public InputPin getInput() { 
        return inputs.get("i"); 
    }
    
    // TABLE METHODS
    
    static LinkedList<Gate> table;
    
    public static void resetTable() {
        table = new LinkedList<>();
    }
    
    public static LinkedList<Gate> getTable() { 
        return table;
    }
    
    // EVAL METHODS
    
    public Value getValue() {
	// TODO
        return getInput().getValue(); 
    }
}
