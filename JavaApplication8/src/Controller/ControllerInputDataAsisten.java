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
        view.setVisible(true);
        view.addListener(this);
        this.a = null;
        
        this.view.getNamaAsisText().addFocusListener(this);
        this.view.getAlamatAsisText().addFocusListener(this);
        this.view.getNohpAsisText().addFocusListener(this);
        this.view.getIdAsisText().addFocusListener(this);
                
        
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
