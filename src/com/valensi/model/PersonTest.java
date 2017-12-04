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
public class PersonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test method showPersonData();
        
        Address a =  new Address("Daan Mogot", "Jakarta");
        //Person p =  new Person("Indocyber", a);
        //p.showPersonData();
        EducationReal er = new EducationReal("University");
        BadmintonHobby bh = new BadmintonHobby();
        Person staf =  new Person();
        staf.setNama("Mareta");
        staf.setAddress(a); //penting
        staf.showPersonData();
        staf.setEducation(er);
        staf.showPersonEducation();
        staf.setHobby(bh);
        staf.showPersonHobby();     
              
    }
    
}
