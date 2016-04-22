/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Asisten;
import View.TambahAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ControllerInputDataAsisten implements ActionListener {

    Aplikasi model;
    TambahAsisten view;

    public ControllerInputDataAsisten(Aplikasi model) {
        this.model = model;
        view = new TambahAsisten();

        view.setVisible(true);

        view.getBtnSimpanAsisten().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnSimpanAsisten())) {
            String nama = view.getTextNamaAsisten().getText();
            String alamat = view.getTextAlamatAsisten().getText();
            String jkelamin = view.getButtonGroup1().getSelection().toString();
            String nohp = view.getTextNoHPAsisten().getText();
            String id = view.getTextIDAsisten().getText();
            model.addAsisten(nama, alamat, nohp, jkelamin, id);
            JOptionPane.showMessageDialog(null, "Input Asisten Berhasil");
            view.dispose();
            new ControllerMenuAsisten(model);
        }
    }
}
