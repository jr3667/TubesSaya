/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import TubesPBO.Aplikasi;
import View.MenuAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
class ControllerMenuAsisten implements ActionListener {

    MenuAsisten view;
    Aplikasi model;

    public ControllerMenuAsisten(Aplikasi model) {
        this.model = model;
        view = new MenuAsisten();
        view.setVisible(true);
        view.getBtnAdd().addActionListener(this);
        view.getBtnCariAs().addActionListener(this);
        view.getBtnHapusAs().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(view.getBtnCariAs())) {
            new ControllerSubMenuAsisten(model);
            view.setVisible(false);
        } else if (o.equals(view.getBtnAdd())) {
            new ControllerInputDataAsisten(model);
            view.setVisible(false);
        } else if (o.equals(view.getBtnHapusAs())) {
            new ControllerHapusMahasiswa(model);
            view.setVisible(false);
        }
    }
}