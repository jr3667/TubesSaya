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
public class SubMenuMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form SubMenuMahasiswa
     */
    public SubMenuMahasiswa() {
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

        TombolLogout = new javax.swing.JButton();
        TmblTambahTubes = new javax.swing.JButton();
        TmblTambahDokTubes = new javax.swing.JButton();
        TmblHapusDokTubes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TmblMenuUtama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TombolLogout.setText("Log out");

        TmblTambahTubes.setText("Tambah Ke tugas besar");

        TmblTambahDokTubes.setText("Tambah Dokumentasi ke tuas besar");
        TmblTambahDokTubes.setToolTipText("");

        TmblHapusDokTubes.setText("Hapus dokumentasi tugas besar");

        jLabel1.setText("Sub Menu Mahasiswa");

        TmblMenuUtama.setText("Kembali Ke Menu Utama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TmblTambahTubes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TmblHapusDokTubes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TmblTambahDokTubes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TmblMenuUtama)
                    .addComponent(TombolLogout))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(TombolLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TmblTambahTubes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TmblTambahDokTubes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TmblHapusDokTubes)
                .addGap(44, 44, 44)
                .addComponent(TmblMenuUtama)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public JButton getTmblHapusDokTubes() {
        return TmblHapusDokTubes;
    }

    public JButton getTmblMenuUtama() {
        return TmblMenuUtama;
    }

    public JButton getTmblTambahDokTubes() {
        return TmblTambahDokTubes;
    }

    public JButton getTmblTambahTubes() {
        return TmblTambahTubes;
    }

    public JButton getTombolLogout() {
        return TombolLogout;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TmblHapusDokTubes;
    private javax.swing.JButton TmblMenuUtama;
    private javax.swing.JButton TmblTambahDokTubes;
    private javax.swing.JButton TmblTambahTubes;
    private javax.swing.JButton TombolLogout;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
