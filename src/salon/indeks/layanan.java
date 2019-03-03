/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon.indeks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import salon.koneksi.koneksi;

/**
 *
 * @author Muhammad Husni Farid
 */
public final class layanan extends javax.swing.JInternalFrame {

    /**
     * Creates new form layanan
     */
    public layanan() {
        initComponents();
        thairstyle();
        thairtreat();
        tbodytreat();
        tfacetreat();
        thandtreat();
        tpaket();
        AutoNumber2();
        AutoNumber3();
    }

    private void thairstyle(){
       DefaultTableModel tlayanan1 = new DefaultTableModel();
            tlayanan1.addColumn("Kode");
            tlayanan1.addColumn("Nama");
            tlayanan1.addColumn("Harga");
            tlayanan1.addColumn("Jenis Perawatan");
           

            try{
                Connection c = koneksi.getConnection();
                String sql="SELECT * FROM `layanan` where paket='Hair Styling'";
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next())
                {
                tlayanan1.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                });
                }
                thairstyle.setModel(tlayanan1);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Ada Kesalahan");
                }
    }
    
    private void thairtreat(){
       DefaultTableModel tlayanan1 = new DefaultTableModel();
            tlayanan1.addColumn("Kode");
            tlayanan1.addColumn("Nama");
            tlayanan1.addColumn("Harga");
            tlayanan1.addColumn("Jenis Perawatan");
           

            try{
                Connection c = koneksi.getConnection();
                String sql="SELECT * FROM `layanan` where paket='Hair Treatment'";
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next())
                {
                tlayanan1.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                });
                }
                thairtreat.setModel(tlayanan1);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Ada Kesalahan");
                }
    }
    
    private void tbodytreat(){
       DefaultTableModel tlayanan1 = new DefaultTableModel();
            tlayanan1.addColumn("Kode");
            tlayanan1.addColumn("Nama");
            tlayanan1.addColumn("Harga");
            tlayanan1.addColumn("Jenis Perawatan");
           

            try{
                Connection c = koneksi.getConnection();
                String sql="SELECT * FROM `layanan` where paket='Body Treatment'";
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next())
                {
                tlayanan1.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                });
                }
                tbodytreat.setModel(tlayanan1);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Ada Kesalahan");
                }
    }
    private void tfacetreat(){
       DefaultTableModel tlayanan1 = new DefaultTableModel();
            tlayanan1.addColumn("Kode");
            tlayanan1.addColumn("Nama");
            tlayanan1.addColumn("Harga");
            tlayanan1.addColumn("Jenis Perawatan");
           

            try{
                Connection c = koneksi.getConnection();
                String sql="SELECT * FROM `layanan` where paket='Face Treatment'";
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next())
                {
                tlayanan1.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                });
                }
                tfacetreat.setModel(tlayanan1);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Ada Kesalahan");
                }
    }
    
    private void thandtreat(){
       DefaultTableModel tlayanan1 = new DefaultTableModel();
            tlayanan1.addColumn("Kode");
            tlayanan1.addColumn("Nama");
            tlayanan1.addColumn("Harga");
            tlayanan1.addColumn("Jenis Perawatan");
           

            try{
                Connection c = koneksi.getConnection();
                String sql="SELECT * FROM `layanan` where paket='Hand and Foot Treatment'";
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next())
                {
                tlayanan1.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                });
                }
                thand.setModel(tlayanan1);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Ada Kesalahan");
                }
    }
    
    private void tpaket(){
       DefaultTableModel tlayanan1 = new DefaultTableModel();
            tlayanan1.addColumn("Kode");
            tlayanan1.addColumn("Nama");
            tlayanan1.addColumn("Harga");
            tlayanan1.addColumn("Jenis Perawatan");
           

            try{
                Connection c = koneksi.getConnection();
                String sql="SELECT * FROM `layanan` where paket='Paket Perawatan'";
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next())
                {
                tlayanan1.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                });
                }
                tpaket.setModel(tlayanan1);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Ada Kesalahan");
                }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablayanan = new javax.swing.JTabbedPane();
        daflayanan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        cmbbagian = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnamalayanan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtkdlayanan = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbplus = new javax.swing.JComboBox();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        tmbinput = new javax.swing.JButton();
        tupdate = new javax.swing.JButton();
        tdelete = new javax.swing.JButton();
        tclear = new javax.swing.JButton();
        panelGlass5 = new usu.widget.glass.PanelGlass();
        tabbagian = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        thairstyle = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        thairtreat = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbodytreat = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        thand = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tfacetreat = new javax.swing.JTable();
        dafpaket = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tpaket = new javax.swing.JTable();
        panelGlass3 = new usu.widget.glass.PanelGlass();
        txtnmpaket = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtkdpaket = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtharga2 = new javax.swing.JTextField();
        panelGlass4 = new usu.widget.glass.PanelGlass();
        tmbinput2 = new javax.swing.JButton();
        tdelete2 = new javax.swing.JButton();
        tupdate2 = new javax.swing.JButton();
        tclear1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Form Layanan");

        tablayanan.setBackground(new java.awt.Color(255, 153, 255));
        tablayanan.setMaximumSize(new java.awt.Dimension(1366, 768));
        tablayanan.setPreferredSize(new java.awt.Dimension(720, 720));

        daflayanan.setBackground(new java.awt.Color(255, 153, 255));
        daflayanan.setPreferredSize(new java.awt.Dimension(480, 480));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("DAFTAR LAYANAN SALON ");

        cmbbagian.setBackground(new java.awt.Color(255, 255, 51));
        cmbbagian.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hair Styling", "Hair Treatment", "Face Treatment", "Body Treatment", "Hand and Foot Treatment" }));
        cmbbagian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbagianActionPerformed(evt);
            }
        });

        jLabel6.setText("Jenis Perawatan");

        jLabel1.setText("Nama Layanan ");

        jLabel3.setText("Kode");

        txtkdlayanan.setEditable(false);

        jLabel5.setText("Total Harga");

        cmbplus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "vitamin" }));
        cmbplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbplusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnamalayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkdlayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(cmbbagian, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbplus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelGlass1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbagian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbplus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamalayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkdlayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelGlass1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel6)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );

        tmbinput.setBackground(new java.awt.Color(255, 255, 51));
        tmbinput.setText("Input");
        tmbinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbinputActionPerformed(evt);
            }
        });

        tupdate.setBackground(new java.awt.Color(255, 255, 51));
        tupdate.setText("Update");
        tupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tupdateActionPerformed(evt);
            }
        });

        tdelete.setBackground(new java.awt.Color(255, 255, 51));
        tdelete.setText("Delete");
        tdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdeleteActionPerformed(evt);
            }
        });

        tclear.setBackground(new java.awt.Color(255, 255, 102));
        tclear.setText("Clear");
        tclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass2Layout = new javax.swing.GroupLayout(panelGlass2);
        panelGlass2.setLayout(panelGlass2Layout);
        panelGlass2Layout.setHorizontalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tmbinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tdelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        panelGlass2Layout.setVerticalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tupdate)
                    .addComponent(tdelete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tmbinput, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(tclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        thairstyle.setModel(new javax.swing.table.DefaultTableModel(
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
        thairstyle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thairstyleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(thairstyle);

        tabbagian.addTab("Hair Styling", jScrollPane2);

        thairtreat.setModel(new javax.swing.table.DefaultTableModel(
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
        thairtreat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thairtreatMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(thairtreat);

        tabbagian.addTab("Hair Treatment", jScrollPane3);

        tbodytreat.setModel(new javax.swing.table.DefaultTableModel(
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
        tbodytreat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbodytreatMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbodytreat);

        tabbagian.addTab("Body Treatment", jScrollPane4);

        thand.setModel(new javax.swing.table.DefaultTableModel(
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
        thand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thandMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(thand);

        tabbagian.addTab("Hand and Foot Treatment", jScrollPane6);

        tfacetreat.setModel(new javax.swing.table.DefaultTableModel(
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
        tfacetreat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfacetreatMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tfacetreat);

        tabbagian.addTab("Face Treatment", jScrollPane5);

        javax.swing.GroupLayout panelGlass5Layout = new javax.swing.GroupLayout(panelGlass5);
        panelGlass5.setLayout(panelGlass5Layout);
        panelGlass5Layout.setHorizontalGroup(
            panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbagian)
                .addContainerGap())
        );
        panelGlass5Layout.setVerticalGroup(
            panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tabbagian, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout daflayananLayout = new javax.swing.GroupLayout(daflayanan);
        daflayanan.setLayout(daflayananLayout);
        daflayananLayout.setHorizontalGroup(
            daflayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daflayananLayout.createSequentialGroup()
                .addGroup(daflayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(daflayananLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelGlass5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(daflayananLayout.createSequentialGroup()
                        .addGroup(daflayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(daflayananLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jLabel2))
                            .addGroup(daflayananLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        daflayananLayout.setVerticalGroup(
            daflayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daflayananLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(daflayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGlass5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tablayanan.addTab("Layanan", daflayanan);

        dafpaket.setBackground(new java.awt.Color(255, 153, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("DAFTAR PAKET SALON ");

        tpaket.setModel(new javax.swing.table.DefaultTableModel(
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
        tpaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpaketMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tpaket);

        jLabel11.setText("Nama Paket ");

        jLabel12.setText("Kode");

        jLabel13.setText("Total Harga");

        javax.swing.GroupLayout panelGlass3Layout = new javax.swing.GroupLayout(panelGlass3);
        panelGlass3.setLayout(panelGlass3Layout);
        panelGlass3Layout.setHorizontalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelGlass3Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass3Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(panelGlass3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(30, 30, 30)))
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtharga2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnmpaket, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkdpaket, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelGlass3Layout.setVerticalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnmpaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkdpaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtharga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        tmbinput2.setBackground(new java.awt.Color(255, 255, 51));
        tmbinput2.setText("Input");
        tmbinput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbinput2ActionPerformed(evt);
            }
        });

        tdelete2.setBackground(new java.awt.Color(255, 255, 51));
        tdelete2.setText("Delete");
        tdelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdelete2ActionPerformed(evt);
            }
        });

        tupdate2.setBackground(new java.awt.Color(255, 255, 51));
        tupdate2.setText("Update");
        tupdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tupdate2ActionPerformed(evt);
            }
        });

        tclear1.setBackground(new java.awt.Color(255, 255, 102));
        tclear1.setText("Clear");
        tclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass4Layout = new javax.swing.GroupLayout(panelGlass4);
        panelGlass4.setLayout(panelGlass4Layout);
        panelGlass4Layout.setHorizontalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tmbinput2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(tupdate2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tclear1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(tdelete2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGlass4Layout.setVerticalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdelete2)
                    .addComponent(tupdate2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tmbinput2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(tclear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dafpaketLayout = new javax.swing.GroupLayout(dafpaket);
        dafpaket.setLayout(dafpaketLayout);
        dafpaketLayout.setHorizontalGroup(
            dafpaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dafpaketLayout.createSequentialGroup()
                .addGroup(dafpaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dafpaketLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(dafpaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dafpaketLayout.createSequentialGroup()
                                .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dafpaketLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel10)))
                .addGap(144, 144, 144))
        );
        dafpaketLayout.setVerticalGroup(
            dafpaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dafpaketLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addGap(48, 48, 48)
                .addGroup(dafpaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dafpaketLayout.createSequentialGroup()
                        .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        tablayanan.addTab("Paket", dafpaket);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablayanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablayanan, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tpaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpaketMouseClicked
        // TODO add your handling code here:
        int table=tpaket.getSelectedRow();
    String a=tpaket.getValueAt(table, 0).toString();
    String b=tpaket.getValueAt(table, 1).toString();
    String e=tpaket.getValueAt(table, 2).toString();
    txtkdpaket.setText(a);
    txtnmpaket.setText(b);
    txtharga2.setText(e);
    }//GEN-LAST:event_tpaketMouseClicked

    private void tmbinput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbinput2ActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = koneksi.getConnection();
            String sql = "INSERT INTO `salon`.`layanan` (`kd_layanan`, `nama_layanan`, `harga`, `paket`) VALUES ('"+txtkdpaket.getText()+"', "
            + "'"+txtnmpaket.getText()+"', '"+txtharga2.getText()+"', 'Paket Perawatan');";
            Statement s = c.createStatement();
            int r = s.executeUpdate(sql);
            tpaket();
            AutoNumber3();
            txtnmpaket.setText("");
            txtharga2.setText("");
            JOptionPane.showMessageDialog(null,"Data sudah diMasukan");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
        }
    }//GEN-LAST:event_tmbinput2ActionPerformed

    private void tupdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tupdate2ActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = koneksi.getConnection();
            String sql = "UPDATE `salon`.`layanan` SET `kd_layanan` = '"+txtkdpaket.getText()+"', `nama_layanan` = '"+txtnmpaket.getText()+"', `harga` = '"+txtharga2.getText()+"',"
                        + "`paket` = 'Paket Perawatan' WHERE `layanan`.`kd_layanan` = '"+txtkdpaket.getText()+"';";
            Statement s = c.createStatement();
            int r = s.executeUpdate(sql);
            tpaket();
            JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
        }
    }//GEN-LAST:event_tupdate2ActionPerformed

    private void tdelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdelete2ActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = koneksi.getConnection();
            String sql = "DELETE FROM `salon`.`layanan` WHERE `layanan`.`kd_layanan` = '"+txtkdpaket.getText()+"';";
            Statement s = c.createStatement();
            int r = s.executeUpdate(sql);
            tpaket();
            JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
        }
    }//GEN-LAST:event_tdelete2ActionPerformed

    private void tdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdeleteActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = koneksi.getConnection();
            String sql = "DELETE FROM `salon`.`layanan` WHERE `layanan`.`kd_layanan` = '"+txtkdlayanan.getText()+"';";
            Statement s = c.createStatement();
            int r = s.executeUpdate(sql);
            thairstyle();
            thairtreat();
            tbodytreat();
            tfacetreat();
            thandtreat();
            JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
        }
    }//GEN-LAST:event_tdeleteActionPerformed

    private void tupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tupdateActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = koneksi.getConnection();
            String sql = "UPDATE `salon`.`layanan` SET `kd_layanan` = '"+txtkdlayanan.getText()+"', `nama_layanan` = '"+txtnamalayanan.getText()+"', `harga` = '"+txtharga.getText()+"',"
            + "`paket` = '"+cmbbagian.getSelectedItem()+"' WHERE `layanan`.`kd_layanan` = '"+txtkdlayanan.getText()+"';";
            Statement s = c.createStatement();
            int r = s.executeUpdate(sql);
            thairstyle();
            thairtreat();
            tbodytreat();
            tfacetreat();
            thandtreat();
            JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
        }
    }//GEN-LAST:event_tupdateActionPerformed

    private void tmbinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbinputActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = koneksi.getConnection();
            String sql = "INSERT INTO `salon`.`layanan` (`kd_layanan`, `nama_layanan`, `harga`, `paket`) VALUES ('"+txtkdlayanan.getText()+"', "
            + "'"+txtnamalayanan.getText()+"', '"+txtharga.getText()+"', '"+cmbbagian.getSelectedItem()+"');";
            Statement s = c.createStatement();
            int r = s.executeUpdate(sql);
            thairstyle();
            thairtreat();
            tbodytreat();
            tfacetreat();
            thandtreat();
            AutoNumber2();
            txtnamalayanan.setText("");
            txtharga.setText("");
            JOptionPane.showMessageDialog(null,"Data sudah diMasukan");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
        }
    }//GEN-LAST:event_tmbinputActionPerformed

    private void cmbbagianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbagianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbagianActionPerformed

    private void thandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thandMouseClicked
        // TODO add your handling code here:
        int table=thand.getSelectedRow();
        String a=thand.getValueAt(table, 0).toString();
        String b=thand.getValueAt(table, 1).toString();
        String e=thand.getValueAt(table, 2).toString();
        txtkdlayanan.setText(a);
        txtnamalayanan.setText(b);
        txtharga.setText(e);
    }//GEN-LAST:event_thandMouseClicked

    private void tfacetreatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfacetreatMouseClicked
        // TODO add your handling code here:
        int table=tfacetreat.getSelectedRow();
        String a=tfacetreat.getValueAt(table, 0).toString();
        String b=tfacetreat.getValueAt(table, 1).toString();
        String e=tfacetreat.getValueAt(table, 2).toString();
        txtkdlayanan.setText(a);
        txtnamalayanan.setText(b);
        txtharga.setText(e);
    }//GEN-LAST:event_tfacetreatMouseClicked

    private void tbodytreatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbodytreatMouseClicked
        // TODO add your handling code here:
        int table=tbodytreat.getSelectedRow();
        String a=tbodytreat.getValueAt(table, 0).toString();
        String b=tbodytreat.getValueAt(table, 1).toString();
        String e=tbodytreat.getValueAt(table, 2).toString();
        txtkdlayanan.setText(a);
        txtnamalayanan.setText(b);
        txtharga.setText(e);
    }//GEN-LAST:event_tbodytreatMouseClicked

    private void thairtreatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thairtreatMouseClicked
        // TODO add your handling code here:
        int table=thairtreat.getSelectedRow();
        String a=thairtreat.getValueAt(table, 0).toString();
        String b=thairtreat.getValueAt(table, 1).toString();
        String e=thairtreat.getValueAt(table, 2).toString();
        txtkdlayanan.setText(a);
        txtnamalayanan.setText(b);
        txtharga.setText(e);
    }//GEN-LAST:event_thairtreatMouseClicked

    private void thairstyleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thairstyleMouseClicked
        // TODO add your handling code here:
        int table=thairstyle.getSelectedRow();
        String a=thairstyle.getValueAt(table, 0).toString();
        String b=thairstyle.getValueAt(table, 1).toString();
        String e=thairstyle.getValueAt(table, 2).toString();
        txtkdlayanan.setText(a);
        txtnamalayanan.setText(b);
        txtharga.setText(e);
    }//GEN-LAST:event_thairstyleMouseClicked

    private void tclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclearActionPerformed
        // TODO add your handling code here:
        txtnamalayanan.setText("");
        AutoNumber2();
        txtharga.setText(null);
    }//GEN-LAST:event_tclearActionPerformed

    private void tclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclear1ActionPerformed
        // TODO add your handling code here:
        txtnmpaket.setText("");
        AutoNumber3();
        txtharga2.setText(null);        
    }//GEN-LAST:event_tclear1ActionPerformed

    private void cmbplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbplusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbplusActionPerformed

    public void AutoNumber2() {
        try {
            Connection c = koneksi.getConnection();
            Statement stt = c.createStatement();
            String sql = "SELECT * FROM layanan ORDER BY kd_layanan DESC";
            try (ResultSet rs = stt.executeQuery(sql)) {
                if (rs.next()) {
                    String kd_layanan = rs.getString("kd_layanan").substring(2);
                    String AN = "" + (Integer.parseInt(kd_layanan) + 1);
                    String Nol = "";
                    
                    if(AN.length()==1)
                    {Nol = "00";}
                    else if(AN.length()==2)
                    {Nol = "0";}
                    else if(AN.length()==3)
                    {Nol = "";}
                    txtkdlayanan.setText("PS" + Nol + AN);//sesuaikan dengan variable namenya
                } else {
                    txtkdlayanan.setText("PS001");//sesuaikan dengan variable namenya
                }
            }
        } catch (SQLException | NumberFormatException e) {
        }
    }
    
    public void AutoNumber3() {
        try {
            Connection c = koneksi.getConnection();
            Statement stt = c.createStatement();
            String sql = "SELECT * FROM layanan ORDER BY kd_layanan DESC";
            try (ResultSet rs = stt.executeQuery(sql)) {
                if (rs.next()) {
                    String kd_layanan = rs.getString("kd_layanan").substring(2);
                    String AN = "" + (Integer.parseInt(kd_layanan) + 1);
                    String Nol = "";
                    
                    if(AN.length()==1)
                    {Nol = "00";}
                    else if(AN.length()==2)
                    {Nol = "0";}
                    else if(AN.length()==3)
                    {Nol = "";}
                    txtkdpaket.setText("PA" + Nol + AN);//sesuaikan dengan variable namenya
                } else {
                    txtkdpaket.setText("PA001");//sesuaikan dengan variable namenya
                }
            }
        } catch (SQLException | NumberFormatException e) {
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbbagian;
    private javax.swing.JComboBox cmbplus;
    private javax.swing.JPanel daflayanan;
    private javax.swing.JPanel dafpaket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass2;
    private usu.widget.glass.PanelGlass panelGlass3;
    private usu.widget.glass.PanelGlass panelGlass4;
    private usu.widget.glass.PanelGlass panelGlass5;
    private javax.swing.JTabbedPane tabbagian;
    private javax.swing.JTabbedPane tablayanan;
    private javax.swing.JTable tbodytreat;
    private javax.swing.JButton tclear;
    private javax.swing.JButton tclear1;
    private javax.swing.JButton tdelete;
    private javax.swing.JButton tdelete2;
    private javax.swing.JTable tfacetreat;
    private javax.swing.JTable thairstyle;
    private javax.swing.JTable thairtreat;
    private javax.swing.JTable thand;
    private javax.swing.JButton tmbinput;
    private javax.swing.JButton tmbinput2;
    private javax.swing.JTable tpaket;
    private javax.swing.JButton tupdate;
    private javax.swing.JButton tupdate2;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtharga2;
    private javax.swing.JTextField txtkdlayanan;
    private javax.swing.JTextField txtkdpaket;
    private javax.swing.JTextField txtnamalayanan;
    private javax.swing.JTextField txtnmpaket;
    // End of variables declaration//GEN-END:variables
}
