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
public class Mahasiswa extends Orang {
    private String nim;
        
    public TugasBesar getTugasBesar(Asisten a){
        TugasBesar tb = null; // batasan masalahnya satu mahasiswa hanya bisa mempunyai satu tubes
        for (int i = 0; i < a.getnTubes(); i++) {
            for (int j = 0; j < a.getTubes(i).getnMember(); j++) {
                if(a.getTubes(i).getMember(j).equals(this)){
                    tb = a.getTubes(i);
                }
            }
        }
        return tb;
    }

    public Mahasiswa(String nim, String nama, String alamat, String jk, long noHp) {
        super(nama, alamat, jk, noHp);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
    
    public void addTugasBesar(TugasBesar tb){
        tb.addMember(this);
    }
    public void addDokumentasi(TugasBesar tb,String isi){
        tb.createDokumentasi(isi);
    }
    public void removeDokumentasi(TugasBesar tb,int idx){
        tb.removeDokumentasi(idx);
    }
}
