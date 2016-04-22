/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author acer
 */
public class Asisten extends Orang {

    private String id_asisten;
    private TugasBesar[] tugasbesar;
    private int nTubes = 0;
    private int maxTubes;

    public Asisten() {
        super();
    }

    public Asisten(String nama, String alamat, String noHP, String jenisKelamin, String id_asisten) {
        super(nama, alamat, noHP, jenisKelamin);
        tugasbesar = new TugasBesar[12];
        this.id_asisten = id_asisten;
    }

    public Asisten(String nama, String alamat, String noHP, String jenisKelamin, int maxTubes) {
        super(nama, alamat, noHP, jenisKelamin);
        tugasbesar = new TugasBesar[maxTubes];

    }

    public void setId_asisten(String id_asisten) {
        this.id_asisten = id_asisten;
    }

    public String getId_asisten() {
        return id_asisten;
    }

    public void createTugasBesar(String judul) {
        if (nTubes < tugasbesar.length) {
            tugasbesar[nTubes] = new TugasBesar(judul);
            nTubes++;
        } else {
            System.out.println("Maaf, tugas besar sudah penuh");
        }
    }

    public void createTugasBesar(String judul, int maxTubes) {
        if (nTubes < tugasbesar.length) {
            tugasbesar[nTubes] = new TugasBesar(judul, maxTubes);
            nTubes++;
        } else {
            System.out.println("Maaf, tugas besar sudah penuh");
        }
    }

    public TugasBesar getTugasBesar(int i) {
        return tugasbesar[i];
    }

    public void removeTugasBesar(int x) {
        if ((x < tugasbesar.length) && (x >= 0)) {
            System.out.print("Tubes dengan judul " + tugasbesar[x].getJudul() + " berhasil dihapus");
            tugasbesar[x] = null;
            for (int y = x; x < tugasbesar.length; x++) {
                tugasbesar[x] = tugasbesar[x + 1];
            }
            nTubes--;
        } else {
            System.out.println("Tugas besar tidak dapat dihapus");
        }

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

    public int getMaxTubes() {
        return maxTubes;
    }

    public int getnTubes() {
        return nTubes;
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

}
