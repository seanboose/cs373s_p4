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
    
    public Wire( OutputPin o, InputPin i ) {
	    /* TODO */
    }
    
    public Wire( InputPort o, Gate i, String name) {
        this(o.getOutput(), i.getInput(name));
    }
    
    public Wire( Gate from, String frompin, Gate to, String topin ) {
       //TODO 
    }
    
    public Wire( Gate from, Gate to ,String topin ) {
       // TODO 
    }
    
    public Wire( Gate from, OutputPort port) {
       // TODO 
    }
    
    public void print(String x) {
        // ignore x for this method
        // TODO
    }
    
    // TABLE METHODS
    
    static LinkedList<Wire> table;
    
    public static void resetTable() {
        // TODO
    }
    
    public static LinkedList<Wire> getTable() { 
       // TODO 
       return null; 
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
