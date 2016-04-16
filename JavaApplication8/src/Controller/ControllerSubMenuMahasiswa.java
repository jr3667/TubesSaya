
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import TubesPBO.Aplikasi;
import View.SubMenuMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
class ControllerSubMenuMahasiswa implements ActionListener{

    private SubMenuMahasiswa view;
    Aplikasi model;
    
    public ControllerSubMenuMahasiswa(Aplikasi model) {
        view = new SubMenuMahasiswa();
        view.setVisible(true);
        this.model = model;
        view.getBtnHalamanUtama().addActionListener(this);
        view.getBtnTambahDokumentasiKeTugasBesar().addActionListener(this);
        view.getBtnHapusDokumentasiTugasBesar().addActionListener(this);
        view.getBtnTambahKeTugasBesar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(view.getBtnHalamanUtama())) {
            new ControllerHome(model);
            view.dispose();
        } else if (o.equals(view.getBtnTambahKeTugasBesar())) {
            //tambahkan list pada gui tambahkanketubes
            new ControllerTambahKeTugasBesar(model);
            view.dispose();
        } else if (o.equals(view.getBtnTambahDokumentasiKeTugasBesar())) {
            new ControllerTambahDokumentasiKeTugasBesar(model);
            view.dispose();
        } else if (o.equals(view.getBtnHapusDokumentasiTugasBesar())) {
            new ControllerHapusDokumentasi(model);
            view.dispose();
        } 
    }
}
