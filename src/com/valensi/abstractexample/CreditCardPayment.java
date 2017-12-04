/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.abstractexample;

/**
 *
 * @author user
 */
public class CreditCardPayment extends Payment{

    private String creditCardPaymentData;
    
    @Override
    public String getDelimiter() {
       return ",";
    }

    @Override
    public String getPaymentData() {
        return processCreditCard();
       
    }
    
    private String processCreditCard() {
        return getCreditCardPaymentData();
    }

    /**
     * @return the creditCardPayment
     */
    public String getCreditCardPaymentData() {
        return creditCardPaymentData;
    }

    /**
     * @param creditCardPayment the creditCardPayment to set
     */
    public void setCreditCardPaymentData(String creditCardPaymentData) {
        this.creditCardPaymentData = creditCardPaymentData;
    }

    
    
}
