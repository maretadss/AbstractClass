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
public class Surat implements Sendable{

    @Override
    public boolean send() {
       boolean isSend = false;
       int x = 4;
       int y = 5;
       if(x>5) {
           isSend = true;
       }
       return isSend;
    }
    
}
