/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;

/**
 *
 * @author Penguin
 */
public class MenuTugasBesarMhs extends javax.swing.JFrame {

    /**
     * Creates new form SubMenuMahasiswa
     */
    public MenuTugasBesarMhs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnTambahKeTugasBesar = new javax.swing.JButton();
        BtnTambahDokumentasiKeTugasBesar = new javax.swing.JButton();
        BtnHapusDokumentasiTugasBesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnHalamanUtama = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnTambahKeTugasBesar.setText("Tambah Ke tugas besar");

        BtnTambahDokumentasiKeTugasBesar.setText("Tambah Dokumentasi ke tugas besar");
        BtnTambahDokumentasiKeTugasBesar.setToolTipText("");

        BtnHapusDokumentasiTugasBesar.setText("Hapus dokumentasi tugas besar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Menu Tugas Besar Mahasiswa");

        BtnHalamanUtama.setText("Kembali Ke Menu Utama");

        jLabel7.setText("Menu Utama>Mahasiwa>Login Mahasiswa>Sub Menu Mahasiswa");

        jLabel2.setText(">Tugas Besar Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnHalamanUtama))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnTambahKeTugasBesar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnTambahDokumentasiKeTugasBesar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnHapusDokumentasiTugasBesar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1)))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addComponent(BtnTambahKeTugasBesar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnTambahDokumentasiKeTugasBesar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(BtnHapusDokumentasiTugasBesar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BtnHalamanUtama)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHalamanUtama;
    private javax.swing.JButton BtnHapusDokumentasiTugasBesar;
    private javax.swing.JButton BtnTambahDokumentasiKeTugasBesar;
    private javax.swing.JButton BtnTambahKeTugasBesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
    public JButton getBtnHalamanUtama() {
        return BtnHalamanUtama;
    }

    public JButton getBtnTambahDokumentasiKeTugasBesar() {
        return BtnTambahDokumentasiKeTugasBesar;
    }

    public JButton getBtnHapusDokumentasiTugasBesar() {
        return BtnHapusDokumentasiTugasBesar;
    }

    public JButton getBtnTambahKeTugasBesar() {
        return BtnTambahKeTugasBesar;
    }


}
