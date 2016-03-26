/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TubesPBO;

/**
 *
 * @author HP1000
 */
public class Main {
    public static void main(String[] args) {
        Aplikasi a = new Aplikasi();
        a.mainMenu();
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Mahasiswa a = new Mahasiswa("Admining", "Brebes",123456,"Perempuan","1301144174" );
//        Mahasiswa b = new Mahasiswa("Puruhita", "Semarang",123456,"Laki-Laki","130114439");
//        Mahasiswa c = new Mahasiswa("Jonathan", "Jakarta",889431,"Laki-Laki","1301144094");
//        Mahasiswa d = new Mahasiswa("Acil", "Bekasi",889432,"Laki-Laki","1301144764" );
//        Mahasiswa e = new Mahasiswa("Lalu Oldi", "Lombok",889331, "Laki-Laki","1301140004" );
//        Mahasiswa f = new Mahasiswa("Dias", "Bandung",885321, "Laki-Laki","1301144024" );
//        Asisten x = new Asisten("Fatz", "Madiun", 123456,"Laki-Laki", 2);
//        Asisten y = new Asisten("Fatih", "Jakarta", 123456, "Laki-Laki", 3);
//        x.setId_asisten("112244");
//        y.setId_asisten("112233");
//
//        //Membuat tugas besar
//        x.createTugasBesar("Sisfo Inventori Barang",2);
//        x.createTugasBesar("Sisfo Perpustakaan",4);
//        y.createTugasBesar("Sisfo Tubes",3);
//        y.createTugasBesar("Sisfo Manajemen",3);
//        y.createTugasBesar("Games",3);
//
//        //Add Member masing - masing tugas besar
//        x.getTugasBesar(0).addMember(a);
//        x.getTugasBesar(0).addMember(b);
//        c.addTugasBesar(x.getTugasBesar(1));
//        d.addTugasBesar(y.getTugasBesar(0));
//        e.addTugasBesar(y.getTugasBesar(1));
//
//        //Add Dokumentasi
//        a.addDokumentasi(a.getTugasBesar(x),"Tahap 1","Dokumentasi pertama");
//        c.addDokumentasi(c.getTugasBesar(x),"Tahap 2","Dokumentasi pertama");
//
//        //Remove Member dari tubes
//        x.getTugasBesar(0).RemoveMember(0);
//
//        x.getTugasBesar(0).addMember(f);
//
//        for (int i=0;i<x.getnTubes();i++){
//            System.out.println("=================================");
//            System.out.println("Judul         : "+x.getTugasBesar(i).getJudul());
//            System.out.println("Jumlah Member : "+x.getTugasBesar(i).getnMember());
//            System.out.println("=================================");
//            for (int j = 0; j < x.getTugasBesar(i).getnMember(); j++) {
//                System.out.println("Member ke-"+(j+1)+" = "+x.getTugasBesar(i).getMember(j).getName());    
//            }
//            System.out.println("=================================");
//            for (int k = 0; k < x.getTugasBesar(i).getnDokumentasi(); k++) {             
//                System.out.println("Dokumentasi ke-"+(k+1)+" = "+x.getTugasBesar(i).getDokumentasi(k).getIsi());
//            }
//        }
//
//
//        for (int i=0;i<y.getnTubes();i++){
//            System.out.println("=================================");
//            System.out.println("Judul         : "+y.getTugasBesar(i).getJudul());
//            System.out.println("Jumlah Member : "+y.getTugasBesar(i).getnMember());
//            System.out.println("=================================");
//            for (int j = 0; j < y.getTugasBesar(i).getnMember(); j++) {
//                System.out.println("Member ke-"+(j+1)+" = "+y.getTugasBesar(i).getMember(j).getName());    
//            }
//            System.out.println("=================================");
//            for (int k = 0; k < y.getTugasBesar(i).getnDokumentasi(); k++) {             
//                System.out.println("Dokumentasi ke-"+(k+1)+" = "+y.getTugasBesar(i).getDokumentasi(k).getIsi());
//            }
//        }
//        
//        System.out.println("\n");
//        System.out.println("----------------------");
//        System.out.println("Member Berdasarkan NIM");
//        System.out.println("----------------------");
//        System.out.println(y.getTugasBesar(0).getMember("1301144764").getName());
//}
}