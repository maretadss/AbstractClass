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
public abstract class Payment {
//jika classnya tanpa method tidak apa apa namun tidak berfungsi
    public abstract String getDelimiter();
    public abstract String getPaymentData();
            
            
            
    public void testPayment(){
        System.out.println("Payment processing test");
    }
    
    //public abstract String getPaymentInfo();
    
    
}
