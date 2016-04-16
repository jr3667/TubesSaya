/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import TubesPBO.Aplikasi;
import TubesPBO.Mahasiswa;
import View.MasukanDataMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ControllerInputDataMahasiswa implements ActionListener, FocusListener{
    Aplikasi model;
    MasukanDataMahasiswa view;
    Mahasiswa m;
    
    public ControllerInputDataMahasiswa(Aplikasi model) {
        this.model = model;
        view = new MasukanDataMahasiswa();
        view.setVisible(true);
        view.addListener(this);
        this.m = null;
        
        this.view.getNamaMhsText().addFocusListener(this);
        this.view.getAlamatMhsText().addFocusListener(this);
        this.view.getJkelaminMhsText().addFocusListener(this);
        this.view.getNohpMhsText().addFocusListener(this);
        this.view.getNimMhsText().addFocusListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnSimpan())) {
            String nama = view.getNama();
            String alamat = view.getAlamat();
            String jkelamin = view.getJenisKelamin();
            String nohp = view.getNoHp();
            String nim = view.getNim();
        }
    }

    @Override
    public void focusGained(FocusEvent fe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent fe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
