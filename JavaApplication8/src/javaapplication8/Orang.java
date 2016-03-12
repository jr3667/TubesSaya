/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.tubes;

/**
 *
 * @author Ndas-PC
 */
public abstract class Orang {
    private String nama, alamat, jk;
    private long noHp;   

    public Orang(String nama, String alamat, String jk, long noHp) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk; //Jenis Kelamin
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJk() {
        return jk;
    }

    public long getNoHp() {
        return noHp;
    }
    
}
