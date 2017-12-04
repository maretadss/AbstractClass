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
class PaymentWithCash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PaymentGateway pg = new PaymentGateway();
        CashPayment cashPayment = new CashPayment();
        cashPayment.setCashPaymentData("USD : 4000.0 : Laptop");
        boolean sah = pg.process(cashPayment);
        if(sah) {
            System.out.println("Pembayaran Berhasil");
        }else {
            System.out.println("Pembayaran Gagal");
        } 
        
    }
    
}
