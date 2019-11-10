
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import javax.swing.JTable;

public class Home extends javax.swing.JFrame {

    public Home() {
    	setTitle("Form Pendaftaran Event");
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mr. AL\\Downloads\\person_100.png"));
    	getContentPane().setBackground(Color.WHITE);
    	setPreferredSize(new Dimension(1200, 596));
    	getContentPane().setSize(new Dimension(900, 600));
    	getContentPane().setBounds(new Rectangle(0, 0, 900, 600));
    	setSize(new Dimension(1200, 596));
        initComponents();
        load_table();
        kosong();
    }

    private void load_table() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO. ");
        model.addColumn("NAMA");
        model.addColumn("NIM");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("INSTITUSI");
        model.addColumn("EMAIL");

        //menampilkan data database kedalam tabel
        try {
            String sql = "select * from peserta2019";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6)});
            }
            jTable1.setModel(model);
        } catch (Exception e) {
        }

    }

    private void kosong() {
        txt_noreg.setText(null);
    	txt_institusi.setText(null);
        txt_nama.setText(null);
        txt_nim.setText(null);
        txt_email.setText(null);
        jComboBox1.setModel(new DefaultComboBoxModel(new String[] {"Laki-laki", "Perempuan"}));
        jComboBox1.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBorder(null);
        jScrollPane1.setBackground(Color.WHITE);
        jScrollPane1.setBounds(327, 170, 821, 342);
        jTable1 = new javax.swing.JTable();
        jTable1.setSelectionForeground(Color.WHITE);
        jTable1.setSelectionBackground(Color.DARK_GRAY);
        jTable1.setGridColor(Color.DARK_GRAY);
        jTable1.setBackground(Color.WHITE);
        jTable1.setFont(new Font("Arial", Font.PLAIN, 14));
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(Color.DARK_GRAY);
        jPanel1.setBounds(0, 0, 291, 557);
        txt_email = new javax.swing.JTextField();
        txt_email.setForeground(Color.DARK_GRAY);
        txt_email.setFont(new Font("Arial", Font.PLAIN, 14));
        txt_email.setBounds(47, 503, 192, 24);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(48, 225, 192, 18);
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setFont(new Font("Candara", Font.BOLD, 18));
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox1.setBackground(Color.WHITE);
        jComboBox1.setForeground(Color.DARK_GRAY);
        jComboBox1.setFont(new Font("Arial", Font.PLAIN, 14));
        jComboBox1.setBorder(null);
        jComboBox1.setBounds(48, 377, 192, 24);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(47, 483, 192, 18);
        jLabel5.setForeground(Color.WHITE);
        jLabel5.setFont(new Font("Candara", Font.BOLD, 18));
        txt_nama = new javax.swing.JTextField();
        txt_nama.setForeground(Color.DARK_GRAY);
        txt_nama.setFont(new Font("Arial", Font.PLAIN, 14));
        txt_nama.setBackground(Color.WHITE);
        txt_nama.setBounds(48, 242, 192, 24);
        txt_nim = new javax.swing.JTextField();
        txt_nim.setForeground(Color.DARK_GRAY);
        txt_nim.setFont(new Font("Arial", Font.PLAIN, 14));
        txt_nim.setBounds(48, 310, 192, 24);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(48, 359, 192, 18);
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setFont(new Font("Candara", Font.BOLD, 18));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(48, 293, 192, 18);
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setFont(new Font("Candara", Font.BOLD, 18));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(48, 424, 192, 18);
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setFont(new Font("Candara", Font.BOLD, 18));
        txt_institusi = new javax.swing.JTextField();
        txt_institusi.setForeground(Color.DARK_GRAY);
        txt_institusi.setFont(new Font("Arial", Font.PLAIN, 14));
        txt_institusi.setBounds(47, 437, 192, 24);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pnoneActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel5.setText("Email");

        jLabel3.setText("Jenis Kelamin");

        jLabel2.setText("NIM");

        jLabel4.setText("Institusi");
        
        JLabel jLabel6 = new JLabel("No. Registrasi");
        jLabel6.setBounds(48, 157, 192, 18);
        jLabel6.setForeground(Color.WHITE);
        jLabel6.setFont(new Font("Candara", Font.BOLD, 18));
        
        txt_noreg = new JTextField();
        txt_noreg.setFont(new Font("Arial", Font.PLAIN, 14));
        txt_noreg.setDisabledTextColor(new Color(255, 255, 255));
        txt_noreg.setCaretColor(Color.WHITE);
        txt_noreg.setBounds(48, 178, 192, 24);
        txt_noreg.setBackground(Color.WHITE);
        txt_noreg.setForeground(Color.DARK_GRAY);
        txt_noreg.setEditable(false);
        txt_noreg.setColumns(10);
        getContentPane().setLayout(null);
        getContentPane().add(jScrollPane1);
        getContentPane().add(jPanel1);
        jPanel1.setLayout(null);
        jPanel1.add(jLabel4);
        jPanel1.add(jComboBox1);
        jPanel1.add(jLabel6);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel5);
        jPanel1.add(txt_email);
        jPanel1.add(txt_institusi);
        jPanel1.add(txt_noreg);
        jPanel1.add(txt_nim);
        jPanel1.add(txt_nama);
        
        labelicon = new JLabel("");
        labelicon.setIcon(new ImageIcon("C:\\Users\\Mr. AL\\Documents\\Eclipse\\EventFormReg\\person-100.png"));
        labelicon.setBorder(null);
        labelicon.setBackground(Color.DARK_GRAY);
        labelicon.setBounds(91, 27, 101, 100);
        jPanel1.add(labelicon);
        btn_tambah = new javax.swing.JButton();
        btn_tambah.setIcon(new ImageIcon("C:\\Users\\Mr. AL\\Documents\\Eclipse\\EventFormReg\\plus-32.png"));
        btn_tambah.setBackground(Color.DARK_GRAY);
        btn_tambah.setBorder(null);
        btn_tambah.setForeground(Color.WHITE);
        btn_tambah.setFont(new Font("Candara", Font.BOLD, 16));
        btn_tambah.setBounds(414, 109, 76, 38);
        getContentPane().add(btn_tambah);
                btn_edit = new javax.swing.JButton();
                btn_edit.setIcon(new ImageIcon("C:\\Users\\Mr. AL\\Documents\\Eclipse\\EventFormReg\\edit-32.png"));
                btn_edit.setForeground(Color.WHITE);
                btn_edit.setFont(new Font("Candara", Font.BOLD, 16));
                btn_edit.setBackground(Color.DARK_GRAY);
                btn_edit.setBorder(null);
                btn_edit.setBounds(500, 109, 76, 38);
                getContentPane().add(btn_edit);
                        btn_hapus = new javax.swing.JButton();
                        btn_hapus.setIcon(new ImageIcon("C:\\Users\\Mr. AL\\Documents\\Eclipse\\EventFormReg\\delete-32.png"));
                        btn_hapus.setForeground(Color.WHITE);
                        btn_hapus.setFont(new Font("Candara", Font.BOLD, 16));
                        btn_hapus.setBackground(Color.DARK_GRAY);
                        btn_hapus.setBorder(null);
                        btn_hapus.setBounds(586, 109, 76, 38);
                        getContentPane().add(btn_hapus);
                                btn_clear = new javax.swing.JButton();
                                btn_clear.setIcon(new ImageIcon("C:\\Users\\Mr. AL\\Documents\\Eclipse\\EventFormReg\\backspace-32.png"));
                                btn_clear.setForeground(Color.WHITE);
                                btn_clear.setFont(new Font("Candara", Font.BOLD, 16));
                                btn_clear.setBorder(null);
                                btn_clear.setBackground(Color.DARK_GRAY);
                                btn_clear.setBounds(327, 109, 76, 38);
                                getContentPane().add(btn_clear);
                                        
                                        panel = new JPanel();
                                        panel.setBorder(null);
                                        panel.setBackground(Color.LIGHT_GRAY);
                                        panel.setBounds(290, 0, 894, 79);
                                        getContentPane().add(panel);
                                        panel.setLayout(null);
                                        
                                        JLabel jLabel7 = new JLabel("FORM PENDAFTARAN EVENT");
                                        jLabel7.setBounds(36, 26, 424, 42);
                                        panel.add(jLabel7);
                                        jLabel7.setAlignmentY(0.0f);
                                        jLabel7.setHorizontalTextPosition(SwingConstants.CENTER);
                                        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
                                        jLabel7.setFont(new Font("Candara", Font.BOLD, 34));
                                        btn_clear.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                btn_clearActionPerformed(evt);
                                            }
                                        });
                                btn_hapus.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btn_hapusActionPerformed(evt);
                                    }
                                });
                        btn_edit.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_editActionPerformed(evt);
                            }
                        });
                btn_tambah.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_tambahActionPerformed(evt);
                    }
                });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pnoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pnoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pnoneActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String noreg = jTable1.getValueAt(baris, 0).toString();
        txt_noreg.setText(noreg);
        String nama = jTable1.getValueAt(baris, 1).toString();
        txt_nama.setText(nama);
        String nim = jTable1.getValueAt(baris, 2).toString();
        txt_nim.setText(nim);

        String jr = jTable1.getValueAt(baris, 3).toString();
        jComboBox1.setSelectedItem(jr);
        String institusi = jTable1.getValueAt(baris, 4).toString();
        txt_institusi.setText(institusi);
        String email = jTable1.getValueAt(baris, 5).toString();
        txt_email.setText(email);

    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO peserta2019 VALUES (0,'" + txt_nama.getText() + "','" + txt_nim.getText() + "','" + jComboBox1.getSelectedItem() + "','" + txt_institusi.getText() + "','" + txt_email.getText() + "')";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="UPDATE peserta2019 SET nama = '"+txt_nama.getText()+"', nim = '"+txt_nim.getText()+"', gender = '"+jComboBox1.getSelectedItem()+"',institusi= '"+txt_institusi.getText()+"',email= '"+txt_email.getText()+"' WHERE noreg = '"+txt_noreg.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // bersihkan form
        kosong();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:  
        try {
            String sql ="delete from peserta2019 where noreg='"+txt_noreg.getText()+"'";
            String sql1 ="ALTER TABLE `peserta2019` DROP `noreg`";
            String sql2 ="ALTER TABLE `peserta2019` AUTO_INCREMENT = 1"; 
            String sql3 ="ALTER TABLE `peserta2019` ADD `noreg` INT(14) NOT NULL AUTO_INCREMENT FIRST, ADD PRIMARY KEY (`noreg`)";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql2);
            java.sql.PreparedStatement pst3=conn.prepareStatement(sql3);
            pst.execute();
            pst1.execute();
            pst2.execute();
            pst3.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_btn_hapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_institusi;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nim;
    private javax.swing.JTextField txt_email;
    private JTextField txt_noreg;
    private JPanel panel;
    private JLabel labelicon;
}
