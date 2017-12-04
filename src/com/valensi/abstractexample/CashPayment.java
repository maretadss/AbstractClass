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
public class CashPayment extends Payment {
    
    private String cashPaymentData;
   

    @Override
    public String getDelimiter() {
        return ":";
    }

    @Override
    public String getPaymentData() {
        return processCash();
    }
    
    private String processCash(){
    return getCashPaymentData();
    }
    
    
    /**
     * @return the cashPaymentData
     */
    public String getCashPaymentData() {
        return cashPaymentData;
    }

    /**
     * @param cashPaymentData the cashCardpaymentData to set
     */
    public void setCashPaymentData(String cashPaymentData) {
        this.cashPaymentData = cashPaymentData;
    }
    
}
