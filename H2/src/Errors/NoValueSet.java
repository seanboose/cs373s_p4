/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errors;

/**
 *
 * @author don
 */
public class NoValueSet extends RuntimeException {
    public NoValueSet(String error) {
        super(error);
    }
}
