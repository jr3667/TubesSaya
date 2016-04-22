/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class ControllerHome implements ActionListener {

    private Home view;
    private Aplikasi model;

    public ControllerHome(Aplikasi model) {
        this.model = model;
        view = new Home();
        view.setVisible(true);

        view.getAsisten().addActionListener(this);
        view.getMahasiswa().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o.equals(view.getMahasiswa())) {
            new ControllerMenuMahasiswa(model);
            view.dispose();
        } else if (o.equals(view.getAsisten())) {
            new ControllerMenuAsisten(model);
            view.dispose();
        }
    }

}
