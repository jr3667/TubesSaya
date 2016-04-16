/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import TubesPBO.Aplikasi;
import TubesPBO.Dokumentasi;
import TubesPBO.TugasBesar;
import View.MenuDokumentasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class ControllerMenuDokumentasi implements ActionListener {

    Aplikasi model;
    MenuDokumentasi view;
    Dokumentasi d;

    public ControllerMenuDokumentasi(Aplikasi model, MenuDokumentasi view, Dokumentasi d) {
        this.model = model;
        view = new MenuDokumentasi();
        
        view.setVisible(true);
        view.getBtnaddDokumen().addActionListener(this);
        view.getBtnViewDokumen().addActionListener(this);
        view.getBtnHapusDokumen().addActionListener(this);
        view.getBtnHalamanUtama().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object a = ae.getSource();
        if(a.equals(view.getBtnaddDokumen())) {
            view.dispose();
            new ControllerInputDokumentasi(model);
        }
        else if(a.equals(view.getBtnHalamanUtama())) {
            view.dispose();
            new ControllerHome(model);
        }
        else if(a.equals(view.getBtnViewDokumen())) {
            view.dispose();
            new ControllerViewDokumentasi();
        }
        else if(a.equals(view.getBtnHapusDokumen())) {
            view.dispose();
            new ControllerHapusDokumentasi(model);
        }
    }
    
    
}
