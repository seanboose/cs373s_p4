/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicGates;

import Pins.*;
import GatesApp.*;
import java.util.LinkedList;

/**
 *
 * @author don
 */
public class Not extends Gate {

    public Not(String name) {
        super(name);
        inputs.put("i1", new InputPin("i1", this));
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
    
    // EVAL METEHODS
    
    public Value getValue() {
	if(inputs.get("i1").getValue() == Value.TRUE) return Value.FALSE;
        return Value.TRUE;
    }
    
}
