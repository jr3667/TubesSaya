/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ndas-PC
 */
public abstract class Orang {

    protected String name;
    protected String alamat;
    protected String noHP;
    protected String jenisKelamin;

    public Orang() {

    }

    public Orang(String name, String alamat, String noHP, String jenisKelamin) {
        this.name = name;
        this.alamat = alamat;
        this.noHP = noHP;
        this.jenisKelamin = jenisKelamin;
    }

}
