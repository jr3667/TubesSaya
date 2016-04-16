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
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ControllerInputDataMahasiswa implements ActionListener {

    private Aplikasi model;
    private MasukanDataMahasiswa view;

    public ControllerInputDataMahasiswa(Aplikasi model) {
        this.model = model;
        view = new MasukanDataMahasiswa();
        view.setVisible(true);
        view.getBtnSimpan().getActionListeners();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnSimpan())) {
            String nama = view.getNamaMhsText().getText();
            String alamat = view.getAlamatMhsText().getText();
            String jkelamin = view.getJkelaminMhsText().getText();
            String nohp = view.getNohpMhsText().getText();
            String nim = view.getNimMhsText().getText();
            model.addMahasiswa(nama, alamat, nohp, jkelamin, nim);
            JOptionPane.showMessageDialog(null, "Input Mahasiswa Berhasil");
            view.setVisible(true);
        }
    }
}
