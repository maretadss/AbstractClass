/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.ifacevariable;

/**
 *
 * @author user
 */
public class Sms implements Sendable {

    @Override
    public boolean send() {
        boolean isSend =  false;
        String  message = "Hello";
        if(message.equalsIgnoreCase("hello"))
            isSend = true;
    
    return isSend;
    }
    
    
}
