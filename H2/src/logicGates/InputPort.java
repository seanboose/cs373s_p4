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
public class InputPort extends Gate {

    public InputPort(String name) {
        super(name);
        outputs.put("o", new OutputPin("o", this));
        
        if(table == null) table = new LinkedList<>();
        if(!table.contains(this))table.add(this);
        if(!dbTable.contains(table))dbTable.add(table);
    }
    
    public OutputPin getOutput() {
        return outputs.get("o");  // return lone output
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
            
    Value value = Value.UNKNOWN;
        
    public void setValue(Value v) {
         // TODO
    }
    
    public Value getValue() {
	 // TODO
        return Value.UNKNOWN;
    }
}
