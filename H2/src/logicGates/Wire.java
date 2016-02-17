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
public class Wire extends Printable {
    
    OutputPin startsAt;
    InputPin endsAt;
    
    public Wire( OutputPin o, InputPin i ) {
        startsAt = o;
        endsAt = i;
        o.addWire(this);
        i.addWire(this);

        // Static table stuff
        if(table == null) table = new LinkedList<>();
        if(!table.contains(this))table.add(this);
        
        if(dbTable == null) dbTable = new LinkedList<>();
        if(!dbTable.contains(table))dbTable.add(table);
    }
    
    public Wire( InputPort o, Gate i, String name) {
        this(o.getOutput(), i.getInput(name));
    }
    
    public Wire( Gate from, String frompin, Gate to, String topin ) {
       this(from.getOutput(frompin), to.getInput(topin));
    }
    
    public Wire( Gate from, Gate to, String topin ) {
        this(from.getOutput("o"), to.getInput(topin));
    }
    
    public Wire( Gate from, OutputPort port) {
       this(from.getOutput("o"), port.getInput());
    }
    
    public void print(String x) {
        System.out.print("wire from ");
        System.out.print(startsAt.toString() + " to ");
        System.out.println(endsAt.toString());
    }
    
    // TABLE METHODS
    
    static LinkedList<Wire> table;
    
    public static void resetTable() {
        table = new LinkedList<>();
    }
    
    public static LinkedList<Wire> getTable() { 
       return table; 
    }
    
    // CONSTRAINT METHODS
    
    public boolean isUsed() {
	    // is there an wire connected to pins that are used?
	    // TODO
        return false;
    }
    
    public static boolean verify() {
	// TODO
	return true;
    }
    
    // EVAL METHODS
    
    public Value getValue() {
        //  return o.getValue();
        // TODO
        return Value.UNKNOWN;
    }
}
