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
public class Address {
    private String namaJalan;
    private String namaKota;

    /**
     * @return the namaJalan
     */
    
    public Address() {
    }

    public Address(String namaJalan, String namaKota) {
        this.namaJalan = namaJalan;
        this.namaKota = namaKota;
    }

    
    public String getNamaJalan() {
        return namaJalan;
    }

    /**
     * @param namaJalan the namaJalan to set
     */
    public void setNamaJalan(String namaJalan) {
        this.namaJalan = namaJalan;
    }

    /**
     * @return the namaKota
     */
    public String getNamaKota() {
        return namaKota;
    }

    /**
     * @param namaKota the namaKota to set
     */
    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }
    
}
