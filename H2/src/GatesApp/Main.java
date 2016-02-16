package GatesApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import logicGates.Wire;
import logicGates.*;

/**
 *
 * @author don
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aCircuit();
        System.out.println("Done!");
    }


    public static void aCircuit() {
        // is a ^ b ^ c

        if (!Feature.tables) {
            Gate.resetDB();
        }

        InputPort a = new InputPort("a");
        InputPort b = new InputPort("b");
        InputPort c = new InputPort("c");
        OutputPort r = new OutputPort("r");
        And a1 = new And("a1");
        And a2 = new And("a2");

        new Wire(a, a1, "i1");
        new Wire(b, a1, "i2");
        new Wire(a1, a2, "i1");
        new Wire(c, a2, "i2");

        if (!Feature.tables)
            return;
        Gate.printDB();

        // constraint evaluation
        if (!Feature.constraints)
            return;
        boolean result = Gate.verify();
        System.out.println("Model is correct: " + result);
        if (!result) {
            return;
        }

        if (!Feature.eval)
            return;
        // circuit evaluation
        a.setValue(Value.TRUE);
        b.setValue(Value.FALSE);
        c.setValue(Value.TRUE);

        Value rvalue = r.getValue();
        if (rvalue != Value.TRUE) {
            System.out.println("r value is wrong");
        } else {
            System.out.println("\nEvaluation of circuit is Correct!");
        }
    }
}
