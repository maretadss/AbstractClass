/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.ifacevariable;

import com.valensi.ifacevariable.Sendable;
import java.util.List;

/**
 *
 * @author user
 */
public class MessageServer {
    
    private Sendable sendobject;
    //private List<OrderItem> = ArrayList();

    /**
     * @return the sendobject
     */
    public Sendable getSendobject() {
        return sendobject;
    }

    /**
     * @param sendobject the sendobject to set
     */
    public void setSendobject(Sendable sendobject) {
        this.sendobject = sendobject;
    }
    
    
}
