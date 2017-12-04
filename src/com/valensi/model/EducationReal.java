/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

/**
 *
 * @author user
 */
public class EducationReal extends Education {
    
    private String level;

    public EducationReal() {
    }

    public EducationReal(String level) {
        this.level = level;
    }

    
    
    @Override
    public String GetEducationLevel() {
        
        return getLevel();
  }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }
    
}
