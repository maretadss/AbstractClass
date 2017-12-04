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
public class PaymentGateway {

    public boolean process(Payment payment) {
        boolean valid = false;
        String delimiter = payment.getDelimiter();
        String data = payment.getPaymentData();
        String[] dataArray = data.split(delimiter);
        if (dataArray.length != 3) {
            return false;
        } else if (dataArray.length == 3) {
            String mataUang = dataArray[0];
            double jumlah = Double.parseDouble(dataArray[1]);
            String peruntukan = dataArray[2];
            //process ke bank atau lainnya
            //jika sukses maka valid
            System.out.println("Pembayaran : " + peruntukan + " sebesar "
                    + mataUang + " " + jumlah);
            valid = true;
        }
        return valid;
    }

}
