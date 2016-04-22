/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Scanner;
import Database.Database;

/**
 *
 * @author acer, HP1000, Penguin
 */
public class Aplikasi {

    private ArrayList<Asisten> dafAsisten;
    private int nAsisten = 0;
    private ArrayList<Mahasiswa> dafMhs;
    private int nMahasiswa = 0;
    Scanner s = new Scanner(System.in);

    Database db;

    public Aplikasi() {
        db = new Database();
        db.Connect();
        dafAsisten = new ArrayList<Asisten>();
        dafMhs = new ArrayList<Mahasiswa>();
    }

    public void addAsisten(String nama, String alamat, String noHP, String jenisKelamin, String id_asisten) {
        Asisten a = new Asisten(nama, alamat, noHP, jenisKelamin, id_asisten);
        dafAsisten.add(a);
        db.saveAsisten(a);
    }

    public void addMahasiswa(String name, String alamat, String noHP, String jenisKelamin, String nim) {
        Mahasiswa m = new Mahasiswa(name, alamat, noHP, jenisKelamin, nim);
        dafMhs.add(m);
        db.saveMahasiswa(m);
    }

    public Asisten getAsisten(String id_asisten) {
        for (Asisten a : dafAsisten) {
            if (a.getId_asisten() == id_asisten) {
                return a;
            }
        }
        Asisten a = db.getAsisten(id_asisten);
        dafAsisten.add(a);
        return a;
    }

    public Mahasiswa getMahasiswa(String nim) {
        for (Mahasiswa m : dafMhs) {
            if (m.getNIM() == nim) {
                return m;
            }
        }
        Mahasiswa m = db.getMahasiswa(nim);
        dafMhs.add(m);
        return m;
    }

    public void deleteAsisten(String id_asisten) {
        dafAsisten.remove(getAsisten(id_asisten));
    }

    public void deleteMahasiswa(String nim) {
        dafMhs.remove(getMahasiswa(nim));
    }

    public void menuAsisten() {
        System.out.println("====Asisten====");
        System.out.println("1. Tambah Asisten");
        System.out.println("2. Cari Asisten");
        System.out.println("3. Hapus Asisten");
        System.out.println("4. Kembali ke menu utama");
    }

    public void menuShowAllAsisten() {
        for (int i = 0; i < dafAsisten.size(); i++) {
            System.out.println((i + 1) + "." + dafAsisten.get(i).getName());
        }
    }

    public String menuShowAllAsistenTubes() {
        String a = "";
        for (int i = 0; i < dafAsisten.size(); i++) {
            a += "" + dafAsisten.get(i).getId_asisten() + ". " + dafAsisten.get(i).getName();

            for (int j = 0; j < dafAsisten.get(i).getnTubes(); j++) {
                a += "" + dafAsisten.get(i).getTugasBesar(j).getJudul();
                a += "-------------------------";
            }
        }
        return a;
    }

    public void menuMahasiswa() {
        System.out.println("====Mahasiswa====");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Cari Mahasiswa");
        System.out.println("3. Hapus Mahasiswa");
        System.out.println("4. Kembali ke menu utama");
    }

    public void menuSubMenuMahasiswa() {
        System.out.println("1. Tambahkan ke Tugas Besar");
        System.out.println("2. Tambah Dokumentasi Tugas Besar");
        System.out.println("3. Hapus Dokumentasi Tugas Besar");
        System.out.println("4. Kembali ke menu utama");
    }

    public void menuTubes() {
        System.out.println("====Tugas Besar====");
        System.out.println("1. Buat Tugas Besar");
        System.out.println("2. Lihat Tugas Besar");
        System.out.println("3. Hapus Tugas Besar");
        System.out.println("4. Kembali ke menu utama");

    }

    public void menuDokumentasi() {
        System.out.println("====Dokumentasi====");
        System.out.println("1. Tambah Dokumen");
        System.out.println("2. Lihat Dokumen");
        System.out.println("3. Hapus Dokumen");
        System.out.println("4. Kembali ke menu utama");
    }

    void clear() {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

    void tanya() {
        System.out.print("Kembali ke Menu Utama?(Y/N) ");
        String tanya = s.next();
        if (tanya.equals("Y")) {
            clear();
            mainMenu();
        } else {
            System.exit(0);
        }
    }

//    void backToTubes() {
//        System.out.print("Kembali ke Menu Sebelumnya?(Y/N) ");
//        String tanya = s.next();
//        if (tanya.equals("Y")) {
//            menuTubes();
//        }
//        else {
//            tanya();
//        }
//    }
//    
//    void backToAsisten() {
//        System.out.print("Kembali ke Menu Sebelumnya?(Y/N) ");
//        String tanya = s.next();
//        if (tanya.equals("Y")) {
//            menuAsisten();
//        }
//        else {
//            tanya();
//        }
//    }
//    
//    void backToMahasiswa() {
//        System.out.print("Kembali ke Menu Sebelumnya?(Y/N) ");
//        String tanya = s.next();
//        if (tanya.equals("Y")) {
//            menuMahasiswa();
//        }
//        else {
//            tanya();
//        }
//    }
//    
//    void backToSubMahasiswa() {
//        System.out.print("Kembali ke Menu Sebelumnya?(Y/N) ");
//        String tanya = s.next();
//        if (tanya.equals("Y")) {
//            menuSubMenuMahasiswa();
//        }
//        else {
//            tanya();
//        }
//    }
//    
//    void backToDokumentasi() {
//        System.out.print("Kembali ke Menu Sebelumnya?(Y/N) ");
//        String tanya = s.next();
//        if (tanya.equals("Y")) {
//            menuDokumentasi();
//        }
//        else {
//            tanya();
//        }
//    }
    public void mainMenu() {
        System.out.println("MENU UTAMA");
        System.out.println("1. Asisten");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Exit");
        System.out.print("Masukkan Pilihan : ");
        int a = s.nextInt();
        switch (a) {
            case 1:
                menuAsisten();
                System.out.print("Masukkan Pilihan : ");
                int b = s.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("Masukkan Data Asisten : ");
                        System.out.print("Nama : ");
                        String name = s.next();
                        System.out.print("Alamat : ");
                        String alamat = s.next();
                        System.out.print("No HP : ");
                        String no = s.next();
                        System.out.print("Jenis Kelamin : ");
                        String jk = s.next();
                        System.out.print("ID Asisten : ");
                        String id = s.next();
                        addAsisten(name, alamat, no, jk, id);
                        tanya();
                        break;
                    case 2:
                        System.out.println("Masukkan Data Asisten yang dicari");
                        System.out.print("ID Asisten : ");
                        id = s.next();
                        if (getAsisten(id) instanceof Asisten) {
                            System.out.println("Nama Asisten : " + getAsisten(id).getName());
                            menuTubes();
                            System.out.print("Masukkan Pilihan : ");
                            b = s.nextInt();
                            switch (b) {
                                case 1:
                                    System.out.print("Masukkan judul Tugas Besar : ");
                                    String judul = s.next();
                                    getAsisten(id).createTugasBesar(judul);
                                    tanya();
                                    break;
                                case 2:
                                    System.out.print("Lihat data Tugas Besar ke : ");
                                    b = s.nextInt();
                                    getAsisten(id).getTugasBesar(b);
                                    if (getAsisten(id).getTugasBesar(b) instanceof TugasBesar) {
                                        menuDokumentasi();
                                        System.out.print("Masukkan pilihan : ");
                                        int c = s.nextInt();
                                        switch (c) {
                                            case 1:
                                                System.out.println("Masukkan Data Dokumentasi");
                                                System.out.print("Judul : ");
                                                judul = s.next();
                                                System.out.print("Isi : ");
                                                String isi = s.next();
                                                getAsisten(id).getTugasBesar(b).createDokumentasi(judul, isi);
                                                tanya();
                                                break;
                                            case 2:
                                                System.out.print("Lihat dokumentasi ke- ");
                                                int d = s.nextInt();
                                                getAsisten(id).getTugasBesar(b).getDokumentasi(d);
                                                tanya();
                                                break;
                                            case 3:
                                                System.out.print("Hapus dokumentasi ke- ");
                                                d = s.nextInt();
                                                getAsisten(id).getTugasBesar(b).removeDokumentasi(d);
                                                tanya();
                                                break;
                                            case 4:
                                                clear();
                                                mainMenu();
                                                break;
                                            default:
                                                System.out.println("Maaf Pilihan yang Anda Masukkan Salah.");
                                                System.out.println("\n");
                                                tanya();
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.print("Hapus data Tugas Besar ke- ");
                                    b = s.nextInt();
                                    getAsisten(id).removeTugasBesar(b);
                                    tanya();
                                    break;
                                case 4:
                                    clear();
                                    mainMenu();
                                    break;
                                default:
                                    System.out.println("Maaf Pilihan yang Anda Masukkan Salah.");
                                    System.out.println("\n");
                                    tanya();
                                    break;
                            }
                        } else {
                            System.out.println("Tidak ada data Asisten yang ditemukan");
                        }
                        break;
                    case 3:
                        System.out.println("Daftar Data Asisten");
                        for (int i = 0; i < dafAsisten.size(); i++) {
                                        System.out.println((i + 1) + ". " + dafAsisten.get(i).getId_asisten()+" - "+dafAsisten.get(i).getName());
                                    }
                        System.out.println("Masukkan Data Asisten yang Akan di Hapus");
                        System.out.print("ID Asisten : ");
                        id = s.next();
                        getAsisten(id);
                        if (getAsisten(id) instanceof Asisten) {
                            System.out.println("Asisten " + getAsisten(id).getName() + " berhasil di hapus.");
                            deleteAsisten(id);
                        } else {
                            System.out.println("Tidak ada data Asisten yang ditemukan ");
                        }
                        tanya();
                        break;
                    case 4:
                        clear();
                        mainMenu();
                        break;
                    default:
                        System.out.println("Maaf Pilihan yang Anda Masukkan Salah.");
                        System.out.println("\n");
                        tanya();
                        break;
                }
                tanya();
                break;
            case 2:
                menuMahasiswa();
                System.out.print("Masukkan Pilihan : ");
                b = s.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("Masukkan Data Mahasiswa : ");
                        System.out.print("Nama : ");
                        String name = s.next();
                        System.out.print("Alamat : ");
                        String alamat = s.next();
                        System.out.print("No HP : ");
                        String no = s.next();
                        System.out.print("Jenis Kelamin : ");
                        String jk = s.next();
                        System.out.print("NIM : ");
                        String nim = s.next();
                        addMahasiswa(name, alamat, no, jk, nim);
                        tanya();
                        break;
                    case 2:
                        System.out.println("Masukkan data Mahasiswa yang dicari");
                        System.out.print("NIM : ");
                        nim = s.next();
                        if (getMahasiswa(nim) instanceof Mahasiswa) {
                            menuSubMenuMahasiswa();
                            System.out.print("Masukkan pilihan : ");
                            int ab = s.nextInt();
                            switch (ab) {
                                case 1:
                                    System.out.println("Daftar Asisten Praktikum");
                                    menuShowAllAsisten();
                                    System.out.print("Masukkan Pilihan : ");
                                    b = s.nextInt();
                                    for (int i = 0; i < dafAsisten.get(b - 1).getnTubes(); i++) {
                                        System.out.println((i + 1) + ". " + dafAsisten.get(b - 1).getTugasBesar(i).getJudul());
                                    }
                                    System.out.print("Masukkan Pilihan Tugas Besar : ");
                                    int bc = s.nextInt();
                                    TugasBesar c = new TugasBesar(dafAsisten.get(b - 1).getTugasBesar(bc - 1).getJudul());
                                    getMahasiswa(nim).addTugasBesar(dafAsisten.get(b - 1).getTugasBesar(bc));
                                    System.out.println(getMahasiswa(nim).getName() + " berhasil ditambahkan di Tugas Besar " + dafAsisten.get(b - 1).getTugasBesar(bc).getJudul());
                                    tanya();
                                    break;
                                case 2:
                                    System.out.println("Daftar Asisten Praktikum");
                                    menuShowAllAsisten();
                                    System.out.print("Masukkan Pilihan : ");
                                    b = s.nextInt();
                                    for (int i = 0; i < dafAsisten.get(b - 1).getnTubes(); i++) {
                                        System.out.println((i + 1) + ". " + dafAsisten.get(b - 1).getTugasBesar(i));
                                    }
                                    System.out.print("Masukkan Pilihan Tugas Besar : ");
                                    bc = s.nextInt();
                                    TugasBesar d = new TugasBesar(dafAsisten.get(b - 1).getTugasBesar(bc - 1).getJudul());
                                    System.out.print("Judul Dokumentasi : ");
                                    String judul = s.next();
                                    System.out.print("Isi Dokumentasi : ");
                                    String isi = s.next();
                                    getMahasiswa(nim).addDokumentasi(dafAsisten.get(b - 1).getTugasBesar(bc), judul, isi);
                                    System.out.println("Dokumentasi berhasil ditambahkan.");
                                    tanya();
                                    break;
                                case 3:
                                    System.out.println("Daftar Asisten Praktikum");
                                    menuShowAllAsisten();
                                    System.out.print("Masukkan Pilihan : ");
                                    b = s.nextInt();
                                    for (int i = 0; i < dafAsisten.get(b - 1).getnTubes(); i++) {
                                        System.out.println((i + 1) + ". " + dafAsisten.get(b - 1).getTugasBesar(i));
                                    }
                                    System.out.print("Masukkan Pilihan Tugas Besar : ");
                                    bc = s.nextInt();
                                    TugasBesar e = new TugasBesar(dafAsisten.get(b - 1).getTugasBesar(bc - 1).getJudul());
                                    
                                    System.out.print("Hapus dokumentasi ke- ");
                                    int cd = s.nextInt();
                                    getMahasiswa(nim).removeDokumentasi(dafAsisten.get(b - 1).getTugasBesar(bc), cd);
                                    System.out.println("Dokumentasi ke- " + cd + " berhasil di hapus.");
                                    tanya();
                                    break;
                                case 4:
                                    clear();
                                    mainMenu();
                                    break;
                                default:
                                    System.out.println("Maaf Pilihan yang Anda Masukkan Salah.");
                                    System.out.println("\n");
                                    tanya();
                                    break;
                            }
                        } else {
                            System.out.println("Tidak ada data Mahasiswa yang ditemukan");
                        }
                        break;
                    case 3:
                        System.out.println("Masukkan Data Mahasiswa yang Akan di Hapus");
                        System.out.print("NIM : ");
                        nim = s.next();
                        getMahasiswa(nim);
                        if (getMahasiswa(nim) instanceof Mahasiswa) {
                            System.out.println("Mahasiswa " + getMahasiswa(nim).getName() + " berhasil di hapus.");
                            deleteMahasiswa(nim);
                        } else {
                            System.out.println("Tidak ada data Mahasiswa yang ditemukan");
                        }
                        tanya();
                        break;
                    case 4:
                        clear();
                        mainMenu();
                        break;
                    default:
                        System.out.println("Maaf Pilihan yang Anda Masukkan Salah.");
                        System.out.println("\n");
                        tanya();
                        break;
                }
            case 3:
                System.out.println("Terima Kasih!!!");
                System.exit(0);
                break;
            default:
                System.out.println("Maaf Pilihan yang Anda Masukkan Salah.");
                System.out.println("\n");
                tanya();
                break;
        }
    }
}
