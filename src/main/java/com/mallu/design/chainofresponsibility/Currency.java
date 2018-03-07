package com.mallu.design.chainofresponsibility;

/**
 * Created by golagem on 10/12/17.
 */
public class Currency {

    private int amount;

    public Currency(int amt){
        this.amount=amt;
    }

    public int getAmount(){
        return this.amount;
    }
}
