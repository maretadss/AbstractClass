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
 class PaymentWithCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaymentGateway pg = new PaymentGateway();
        CreditCardPayment ccPayment = new CreditCardPayment();
        ccPayment.setCreditCardPaymentData("USD, 2300.0, Ipohone");
        boolean sah = pg.process(ccPayment);
        if(sah) {
            System.out.println("Pembayaran Berhasil");
        }else {
            System.out.println("Payment failed");
        }
        
    }
    
}
