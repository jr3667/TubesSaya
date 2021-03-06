/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerInputDataMahasiswa;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Penguin
 */
public class TambahMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form MasukanDataMahasiswa
     */
    public TambahMahasiswa() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Masukkan Data Asisten");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namaMhsText = new javax.swing.JTextField();
        nohpMhsText = new javax.swing.JTextField();
        nimMhsText = new javax.swing.JTextField();
        BtnSimpanMhs = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        alamatMhsText = new javax.swing.JTextField();
        RadioBtnCowo = new javax.swing.JRadioButton();
        RadioBtnCewe = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        BtnMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namaMhsText.setText("Nama Mahasiswa");

        nohpMhsText.setText("Nomor Handphone Mahasiswa");

        nimMhsText.setText("NIM Mahasiswa");

        BtnSimpanMhs.setText("Simpan");

        jLabel6.setText("NIM");

        jLabel5.setText("Jenis Kelamin");

        jLabel4.setText("Nomor Handphone");

        jLabel3.setText("Alamat");

        jLabel2.setText("Nama");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Masukan Data Mahasiswa");

        alamatMhsText.setText("Alamat Mahasiswa");

        RadioBtnCowo.setText("Laki-Laki");
        RadioBtnCowo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnCowoActionPerformed(evt);
            }
        });

        RadioBtnCewe.setText("Perempuan");

        jLabel7.setText("Menu Utama>Mahasiwa>Tambah Mahasiswa");

        BtnMainMenu.setText("Kembali ke Menu Utama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSimpanMhs)
                        .addGap(42, 42, 42)
                        .addComponent(BtnMainMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nimMhsText)
                                            .addComponent(namaMhsText)
                                            .addComponent(alamatMhsText)
                                            .addComponent(RadioBtnCewe)
                                            .addComponent(RadioBtnCowo)
                                            .addComponent(nohpMhsText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaMhsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alamatMhsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nohpMhsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RadioBtnCowo)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioBtnCewe)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimMhsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSimpanMhs)
                    .addComponent(BtnMainMenu))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioBtnCowoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnCowoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtnCowoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TambahMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TambahMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TambahMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TambahMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TambahMahasiswa().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMainMenu;
    private javax.swing.JButton BtnSimpanMhs;
    private javax.swing.JRadioButton RadioBtnCewe;
    private javax.swing.JRadioButton RadioBtnCowo;
    private javax.swing.JTextField alamatMhsText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField namaMhsText;
    private javax.swing.JTextField nimMhsText;
    private javax.swing.JTextField nohpMhsText;
    // End of variables declaration//GEN-END:variables
    
    public JButton getBtnSimpan() {
        return BtnSimpanMhs;
    }
    
    public String getNama() {
        return namaMhsText.getText();
    }
    public String getAlamat() {
        return alamatMhsText.getText();
    }
  
    public String getNoHp() {
        return nohpMhsText.getText();
    }
    public String getNim() {
        return nimMhsText.getText();
    }

    public JTextField getAlamatMhsText() {
        return alamatMhsText;
    }

    public JTextField getNamaMhsText() {
        return namaMhsText;
    }

    public JTextField getNimMhsText() {
        return nimMhsText;
    }

    public JTextField getNohpMhsText() {
        return nohpMhsText;
    }

    public JButton getBtnSimpanMhs() {
        return BtnSimpanMhs;
    }

    public JRadioButton getRadioBtnCewe() {
        return RadioBtnCewe;
    }

    public JRadioButton getRadioBtnCowo() {
        return RadioBtnCowo;
    }
    
    public void showMessage(Component  c, String s){
        JOptionPane.showMessageDialog(c, s);
    }

    public void addListener(ControllerInputDataMahasiswa aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
