package com.mallu.design.chainofresponsibility;

/**
 * Created by golagem on 10/12/17.
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}

