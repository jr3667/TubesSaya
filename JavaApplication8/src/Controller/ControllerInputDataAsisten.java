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
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ControllerInputDataAsisten implements ActionListener {

    Aplikasi model;
    InputDataAsisten view;

    public ControllerInputDataAsisten(Aplikasi model) {
        this.model = model;
        view = new InputDataAsisten();

        view.setVisible(true);

        view.getBtnSimpan().getActionListeners();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnSimpan())) {
            String nama = view.getNamaAsisText().getText();
            String alamat = view.getAlamatAsisText().getText();
            String jkelamin = view.getJkelaminAsisText().getText();
            String nohp = view.getNohpAsisText().getText();
            String id = view.getIdAsisText().getText();
            model.addAsisten(nama, alamat, nohp, jkelamin, id);
            JOptionPane.showMessageDialog(null, "Input Asisten Berhasil");
            view.dispose();
            new ControllerMenuAsisten(model);
        }
    }
}
