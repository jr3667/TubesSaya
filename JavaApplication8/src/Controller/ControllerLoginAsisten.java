/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Aplikasi;
import View.LoginAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP1000
 */
public class ControllerLoginAsisten implements ActionListener {

    Aplikasi model;
    LoginAsisten view;

    public ControllerLoginAsisten(Aplikasi model) {
        this.model = model;
        view = new LoginAsisten();
        view.setVisible(true);
        view.getBtnloginasisten().addActionListener(this);
        view.getBtnMainMenu1().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnloginasisten())){
            view.dispose(); //masih gatau
        } else if (source.equals(view.getBtnMainMenu1())){
            
        }
        
       
    }
    
    
}
