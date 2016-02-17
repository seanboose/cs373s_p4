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
public abstract class Gate extends Printable {

    public String name;
    HashMap<String, InputPin> inputs;
    HashMap<String, OutputPin> outputs;

    public Gate(String name) {
	this.name = name;
        inputs = new HashMap<String, InputPin>();
        outputs = new HashMap<String, OutputPin>();
    }

    public InputPin getInput(String name) {
	return inputs.get(name);
    }

    public OutputPin getOutput(String name) {
	    return outputs.get(name);
    }

    public void print(String gateType) {
        System.out.format("%6s gate %8s with inputs ( ", gateType, name);
        boolean comma = false;
        for(InputPin pin : inputs.values()){
            if(comma) System.out.print(", ");
            else if(!comma) comma = true;
            System.out.print(pin.toString());
        }
        comma = false;
        System.out.print(" ) and outputs ( ");
        for(OutputPin pin : outputs.values()){
            if(comma) System.out.print(", ");
            else if(!comma) comma = true;
            System.out.print(pin.toString());
        }
        System.out.println(" ).");
    }

    // TABLE METHODS

    public static void resetDB() {
	    // TODO
    }

    public static void printDB() {
	    // TODO
    }

    public static <G extends Printable> void printTable(String ttype, LinkedList<G> t) {
        for (G g : t) {
            g.print(ttype);
        }
    }

    // CONSTRAINT METHODS

    public boolean extra() {  
	// subclasses override this method if something special needs to be done
        return true;
    }

    public boolean allInputsUsed() {
	    // are all inputs of every gate used?  that is,
	    // is a wire connected to them?
	    // TODO
        return true;
    }

    public boolean allOutputsUsed() {
	    // are all outputs of every gate used?  that is,
	    // is a wire connected to them?
	    // TODO
        return true;
    }

    public static <G extends Gate> boolean verify(String label, LinkedList<G> table) {
	// TODO
	// evaluate the following constraints
	// 1. every gate of type G has a unique name
	// 2. every gate of type G has all of its inputs used (see above)
	// 3. every gate of type G has all of its outputs used (see above)
	// 4. any constraint you might think that is particular to
	//    gates of type G, evaluate it see extra() above

        return true;
    }

    public static boolean verify() {
	    // TODO
	    // evaluate all constraints on all tables
        return true;
    }

    // EVAL METHODS
    
    public abstract Value getValue();  // evaluate gate(inputs)
}
