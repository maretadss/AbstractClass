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
public class Person {
    private String nama;
    private Address address;
    private Education education;
    private Hobby hobby;

    public Person() {
    }

    public Person(String nama, Address address) {
        this.nama = nama;
        this.address = address;
    }
    
    public void showPersonData(){
        String info = "Nama \t\t: " + this.getNama() + "\nNama Jalan \t: " + this.getAddress().getNamaJalan()+ 
                "\nNama Kota \t: " + this.getAddress().getNamaKota(); //concatenate nama + alamat
        System.out.println(info);
        
    }
    
    public void showPersonEducation(){
    //print nama dan pendidikan
        String info = "Edukasi \t: "+ getEducation().GetEducationLevel();
        System.out.println(info);
    
    }
    
    public void kindOfEducation (Education education) {
   
    }
    
    public void showPersonHobby(){
        String info =  "Hobby \t\t: " + getHobby().getTheHobby();
        System.out.println(info);
    }
    
    
    

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return the education
     */
    public Education getEducation() {
        return education;
    }

    /**
     * @param education the education to set
     */
    public void setEducation(Education education) {
        this.education = education;
    }

    /**
     * @return the hobby
     */
    public Hobby getHobby() {
        return hobby;
    }

    /**
     * @param hobby the hobby to set
     */
    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

   
    
    
    
}
