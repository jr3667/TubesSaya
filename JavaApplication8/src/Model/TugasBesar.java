/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author HP1000
 */
public class TugasBesar {
    private String judul;
    private Dokumentasi[] dokumentasi = new Dokumentasi[20];
    private Mahasiswa[] member;
    private int nMember = 0;
    private int maxMember;
    private int nDokumentasi = 0;

    public TugasBesar(String judul) {
        this.judul = judul;
        member = new Mahasiswa[5];
    }

    public TugasBesar(String judul, int maxMember) {
        this.judul = judul;
        member = new Mahasiswa[maxMember];
    }
    
    public void createDokumentasi(String judul, String isi) {
        if (nDokumentasi < dokumentasi.length) {
            dokumentasi[nDokumentasi] = new Dokumentasi(judul, isi);
            nDokumentasi++;
        } else {
            System.out.println("Dokumentasi penuh!");
        }
    }
    

    public void addMember(Mahasiswa m) {
        if (nMember < member.length) {
            this.member[nMember] = m;
            nMember++;
            System.out.println(m.getName()+" telah ditambahkan ke "+this.getJudul());
        } else {
            System.out.println("Member penuh");
        }
    }

    public Mahasiswa getMember(int n) {
        if (n < nMember) {
            return member[n];
        } else {
            return null;
        }
    }

    public Mahasiswa getMember(String id) {
        Mahasiswa a = null;
        for (int n = 0; n < member.length; n++) {
            if (this.member[n].getNIM().equals(id)) {
                a = member[n];  
            }
            break;
        }
        return a;
    }

    public void removeMember(int n) {
        if ((n < member.length) && (n >= 0)) {
            System.out.println(member[n].getName()+ " telah dihapus dari tubes "+this.getJudul());
            member[n] = null;

            for (int i=n;i<member.length;i++){
                member[n]=member[n+1];
            }
            nMember--;
        } else {
            System.out.println("Member tidak bisa dihapus");
        }
    }

    public Dokumentasi getDokumentasi(int n) {
        if (n < nDokumentasi) {
            return dokumentasi[n];
        } else {
            return null;
        }
    }

    public void removeDokumentasi(int n) {
        if((n<dokumentasi.length) && (n>=0)){
            System.out.println("Dokumentasi ke-"+(n)+" telah dihapus.");
            dokumentasi[n]=null;

            for (int i=n;i<dokumentasi.length;i++){
                dokumentasi[n]=dokumentasi[n+1];
            }
            nDokumentasi--;
        }else{
            System.out.println("Dokumentasi tidak dapat dihapus");
        }
    }

    public String getJudul() {
        return judul;
    }

    public int getnDokumentasi() {
        return nDokumentasi;
    }
    
    public int getnMember(){
        return nMember;
    }
}
