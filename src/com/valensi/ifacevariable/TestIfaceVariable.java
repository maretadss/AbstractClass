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
public class TestIfaceVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MessageServer ms = new MessageServer();
        Surat surat = new Surat();
        ms.setSendobject(surat);
        
        Sms sms = new Sms();
        ms.setSendobject(sms);
        
        
    }
    
}
