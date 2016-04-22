/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Penguin
 */
public class Mahasiswa extends Orang {

    private String nim;

    public Mahasiswa() {
        super();
    }

    public TugasBesar getTugasBesar(Asisten a) {
        TugasBesar tb = null; // batasan masalahnya satu mahasiswa hanya bisa mempunyai satu tubes
        for (int i = 0; i < a.getnTubes(); i++) {
            for (int j = 0; j < a.getTugasBesar(i).getnMember(); j++) {
                if (a.getTugasBesar(i).getMember(j).equals(this)) {
                    tb = a.getTugasBesar(i);
                }
            }
        }
        return tb;
    }

    public Mahasiswa(String name, String alamat, String noHP, String jenisKelamin, String nim) {
        super(name, alamat, noHP, jenisKelamin);
        this.nim = nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    
    public String getName() {
        return name;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNIM() {
        return nim;
    }

    public void addTugasBesar(TugasBesar tb) {
        tb.addMember(this);
    }

    public void addDokumentasi(TugasBesar tb, String judul, String isi) {
        tb.createDokumentasi(judul, isi);
    }

    public void removeDokumentasi(TugasBesar tb, int idx) {
        tb.removeDokumentasi(idx);
    }
}
