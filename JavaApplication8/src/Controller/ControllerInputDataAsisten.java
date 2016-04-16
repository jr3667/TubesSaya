/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import TubesPBO.Aplikasi;
import TubesPBO.Asisten;
import View.InputDataAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ControllerInputDataAsisten implements ActionListener, FocusListener {
    Aplikasi model;
    InputDataAsisten view;
    Asisten a;

    public ControllerInputDataAsisten(Aplikasi model) {
        this.model = model;
        view = new InputDataAsisten();
        a = new Asisten();
        view.setVisible(true);
        view.addListener(this);
        this.a = null;
        
        this.view.getNamaAsisText().addFocusListener(this);
        this.view.getAlamatAsisText().addFocusListener(this);
        this.view.getNohpAsisText().addFocusListener(this);
        this.view.getIdAsisText().addFocusListener(this);
        this.view.getJkelaminAsisText().addFocusListener(this);
    }
    
    public ControllerInputDataAsisten(Aplikasi model, Asisten a) {
        this.model = model;
        view = new InputDataAsisten();
        view.setVisible(true);
        view.addListener(this);
        this.a = a;
        view.setName(a.getName());
        view.setAlamat(a.getAlamat());
        view.setIdAssiten(a.getId_asisten());
        view.setJenisKelamin(a.getJenisKelamin());
        view.setNoHp(a.getNoHP());
        view.getBtnSimpan().setText("Simpan");
        view.setTitle("Edit Asisten");
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnSimpan())) {
            String nama = view.getNamaAsisText().getText();
            String alamat = view.getAlamatAsisText().getText();
            String jkelamin = view.getJkelaminAsisText().getText();
            String nohp = view.getNohpAsisText().getText();
            String id = view.getIdAsisText().getText();
        } 
}

    @Override
    public void focusGained(FocusEvent fe) {
    
    }

    @Override
    public void focusLost(FocusEvent fe) {
        Object o = fe.getSource();
        if(o.equals(this.view.getNamaAsisText())) {
            if(this.view.getNamaAsisText().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Mohon Isi Seluruh Data");
            }
        }
    }
}
