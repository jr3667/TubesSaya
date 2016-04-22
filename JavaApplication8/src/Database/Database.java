/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Asisten;
import Model.Mahasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP1000
 */
public class Database {

    private Connection conn = null;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/sisfo_tubes";
    private String user = "root";
    private String pass = "";
    private Statement st = null;
    private ResultSet rs = null;

    public void Connect() {
        try {
            conn = DriverManager.getConnection(url, user, pass);
            st = conn.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void manipulate(String SQLString) {
        try {
            st.executeUpdate(SQLString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = st.executeQuery(SQLString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void saveMahasiswa(Mahasiswa m) {
        String query = "insert into mahasiswa values ('" + m.getNIM() + "','" + m.getName() + "','" + m.getAlamat() + "'," + m.getNoHP() + ",'" + m.getJenisKelamin() + "')";
        manipulate(query);
    }

    public Mahasiswa getMahasiswa(String nim) {
        Mahasiswa m = null;

        try {
            String query = "select * from mahasiswa where nim='" + nim + "'";
            ResultSet rs = getData(query);
            while (rs.next()) {
                String nim_mhs = rs.getString("nim");
                m.setNim(nim_mhs);
                String name = rs.getString("nama_mhs");
                m.setName(name);
                String alamat = rs.getString("alamat_mhs");
                m.setAlamat(alamat);
                String noHP = rs.getString("noHP_mhs");
                m.setNoHP(noHP);
                String jk = rs.getString("jk_mhs");
                m.setJenisKelamin(jk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return m;
    }

    public void deleteMahasiswa(String nim) {
        String query = "Delete * from mahasiswa where nim = '" + nim + "'";
        if (getMahasiswa(nim) != null) {
            manipulate(query);
            System.out.println("Data Mahasiswa dengan nim " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }

    }

    public void saveAsisten(Asisten a) {
        String query = "insert into asisten values ('" + a.getId_asisten() + "','" + a.getName() + "','" + a.getAlamat() + "','" + a.getNoHP() + "','" + a.getJenisKelamin() + "')";
        manipulate(query);
    }

    public Asisten getAsisten(String id) {

        Asisten a = null;

        try {
            String query = "select * from asisten where id_asisten='" + id + "'";
            ResultSet rs = getData(query);
            while (rs.next()) {
                String id_asisten = rs.getString("id_asisten");
                a.setId_asisten(id_asisten);
                String nama = rs.getString("nama_asisten");
                a.setName(nama);
                String alamat = rs.getString("alamat_asisten");
                a.setAlamat(alamat);
                String noHP = rs.getString("noHP_asisten");
                a.setNoHP(noHP);
                String jk = rs.getString("jk_asisten");
                a.setJenisKelamin(jk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    public void deleteAsisten(String id) {
        String query = "Delete * from asisten where id_asisten = '" + id + "'";
        ResultSet rs = getData(query);
        if (getAsisten(id) != null) {
            manipulate(query);
            System.out.println("Data Asisten dengan nim " + id + " berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }

    }
}
