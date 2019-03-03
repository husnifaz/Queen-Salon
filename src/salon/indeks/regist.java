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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import salon.koneksi.koneksi;

/**
 *
 * @author Muhammad Husni Farid
 */
public final class regist extends javax.swing.JInternalFrame {

    /**
     * Creates new form regist
     */
    public regist() {
        initComponents();
        thairstyle();
        thairtreat();
        tbodytreat();
        tfacetreat();
        thandtreat();
        tpaket();
        tregist();
        AutoNumber();
        cekvitamin.setEnabled(false);
    }
    
        private void tregist(){
       DefaultTableModel tlayanan1 = new DefaultTableModel();
            tlayanan1.addColumn("Kode Pesanan");
            tlayanan1.addColumn("Nama Layanan");
            tlayanan1.addColumn("Nama Member");
            tlayanan1.addColumn("Nama Pelanggan");
            tlayanan1.addColumn("Harga ");
            tlayanan1.addColumn("Tanggal");
           

            try{
                Connection c = koneksi.getConnection();
                String sql="SELECT * FROM tregist";
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next())
                {
                tlayanan1.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                });
                }
                tblregist.setModel(tlayanan1);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Kesalahan pada tabel registrasi");
                }
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
                JOptionPane.showMessageDialog(null,"Ada Kesalahan tabel Hairstyle");
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
                JOptionPane.showMessageDialog(null,"Ada Kesalahan tabel hair treat");
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
                JOptionPane.showMessageDialog(null,"Ada Kesalahan pada body treat");
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
                JOptionPane.showMessageDialog(null,"Ada Kesalahan face treat");
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

        bgrup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cmbtgl2 = new uz.ncipro.calendar.JDateTimePicker();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        jLabel2 = new javax.swing.JLabel();
        kdpesanan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kdlayanan = new javax.swing.JTextField();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        tabbagian = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        thairstyle = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        thairtreat = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbodytreat = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tfacetreat = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        thand = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tpaket = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabcari = new javax.swing.JTable();
        panelGlass3 = new usu.widget.glass.PanelGlass();
        txtharga2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelGlass4 = new usu.widget.glass.PanelGlass();
        tmbinput = new javax.swing.JButton();
        tdelete = new javax.swing.JButton();
        tclear2 = new javax.swing.JButton();
        panelGlass5 = new usu.widget.glass.PanelGlass();
        kdmember = new javax.swing.JTextField();
        radiotidak = new javax.swing.JRadioButton();
        radioya = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelGlass7 = new usu.widget.glass.PanelGlass();
        txtcari = new javax.swing.JTextField();
        tom_cari = new javax.swing.JButton();
        namaregis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblregist = new javax.swing.JTable();
        cekvitamin = new javax.swing.JCheckBox();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrasi");
        setMaximumSize(new java.awt.Dimension(1366, 720));
        setMinimumSize(new java.awt.Dimension(300, 200));

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        cmbtgl2.setDisplayFormat("  yyyy-MM-dd");
        cmbtgl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtgl2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Kode Pesanan");

        kdpesanan.setEditable(false);

        jLabel3.setText("Kode layanan ");

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kdlayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kdpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kdpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kdlayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(21, Short.MAX_VALUE))
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

        tabbagian.addTab("Paket Perawatan", jScrollPane7);

        tabcari.setModel(new javax.swing.table.DefaultTableModel(
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
        tabcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabcariMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabcari);

        tabbagian.addTab("Tabel pencarian", jScrollPane8);

        javax.swing.GroupLayout panelGlass2Layout = new javax.swing.GroupLayout(panelGlass2);
        panelGlass2.setLayout(panelGlass2Layout);
        panelGlass2Layout.setHorizontalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbagian, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGlass2Layout.setVerticalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbagian, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtharga2.setEditable(false);

        jLabel5.setText("Subtotal");

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jLabel7.setText("Total");

        javax.swing.GroupLayout panelGlass3Layout = new javax.swing.GroupLayout(panelGlass3);
        panelGlass3.setLayout(panelGlass3Layout);
        panelGlass3Layout.setHorizontalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass3Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total)
                    .addComponent(txtharga2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        panelGlass3Layout.setVerticalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtharga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        tmbinput.setBackground(new java.awt.Color(255, 255, 51));
        tmbinput.setText("Input");
        tmbinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbinputActionPerformed(evt);
            }
        });

        tdelete.setBackground(new java.awt.Color(255, 255, 51));
        tdelete.setText("Delete");
        tdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdeleteActionPerformed(evt);
            }
        });

        tclear2.setBackground(new java.awt.Color(255, 255, 51));
        tclear2.setText("Clear");
        tclear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclear2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass4Layout = new javax.swing.GroupLayout(panelGlass4);
        panelGlass4.setLayout(panelGlass4Layout);
        panelGlass4Layout.setHorizontalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tdelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tclear2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tmbinput, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelGlass4Layout.setVerticalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tmbinput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tclear2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(tdelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgrup1.add(radiotidak);
        radiotidak.setText("Tidak");

        bgrup1.add(radioya);
        radioya.setText("Ya");
        radioya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioyaActionPerformed(evt);
            }
        });

        jLabel6.setText("Member");

        javax.swing.GroupLayout panelGlass5Layout = new javax.swing.GroupLayout(panelGlass5);
        panelGlass5.setLayout(panelGlass5Layout);
        panelGlass5Layout.setHorizontalGroup(
            panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kdmember, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass5Layout.createSequentialGroup()
                        .addComponent(radioya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radiotidak, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelGlass5Layout.setVerticalGroup(
            panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radioya)
                    .addComponent(radiotidak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kdmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Form Registrasi");

        tom_cari.setText("Cari");
        tom_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tom_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass7Layout = new javax.swing.GroupLayout(panelGlass7);
        panelGlass7.setLayout(panelGlass7Layout);
        panelGlass7Layout.setHorizontalGroup(
            panelGlass7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tom_cari)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGlass7Layout.setVerticalGroup(
            panelGlass7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tom_cari))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Nama Pelanggan");

        tblregist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Pesanan", "Nama Layanan", "Nama Member", "Harga", "Tanggal"
            }
        ));
        tblregist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblregistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblregist);

        cekvitamin.setText("Vitamin");
        cekvitamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekvitaminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelGlass5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(namaregis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cekvitamin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGlass7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbtgl2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cmbtgl2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelGlass7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cekvitamin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelGlass5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaregis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thairstyleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thairstyleMouseClicked
        // TODO add your handling code here:
        int table=thairstyle.getSelectedRow();
        String a=thairstyle.getValueAt(table, 0).toString();
        String b=thairstyle.getValueAt(table, 2).toString();
        kdlayanan.setText(a);
        txtharga2.setText(b);
        cekvitamin.setEnabled(true);
    }//GEN-LAST:event_thairstyleMouseClicked

    private void thairtreatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thairtreatMouseClicked
        // TODO add your handling code here:
        int table=thairtreat.getSelectedRow();
        String a=thairtreat.getValueAt(table, 0).toString();
        String b=thairtreat.getValueAt(table, 2).toString();
        kdlayanan.setText(a);
        txtharga2.setText(b);
    }//GEN-LAST:event_thairtreatMouseClicked

    private void tbodytreatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbodytreatMouseClicked
        // TODO add your handling code here:
        int table=tbodytreat.getSelectedRow();
        String a=tbodytreat.getValueAt(table, 0).toString();
        String b=tbodytreat.getValueAt(table, 2).toString();
        kdlayanan.setText(a);
        txtharga2.setText(b);
    }//GEN-LAST:event_tbodytreatMouseClicked

    private void tfacetreatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfacetreatMouseClicked
        // TODO add your handling code here:
        int table=tfacetreat.getSelectedRow();
        String a=tfacetreat.getValueAt(table, 0).toString();
        String b=tfacetreat.getValueAt(table, 2).toString();
        kdlayanan.setText(a);
        txtharga2.setText(b);
    }//GEN-LAST:event_tfacetreatMouseClicked

    private void thandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thandMouseClicked
        // TODO add your handling code here:
        int table=thand.getSelectedRow();
        String a=thand.getValueAt(table, 0).toString();
        String b=thand.getValueAt(table, 2).toString();
        kdlayanan.setText(a);
        txtharga2.setText(b);
    }//GEN-LAST:event_thandMouseClicked

    private void tmbinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbinputActionPerformed
        // TODO add your handling code here:
        if(radioya.isSelected()){
            try{
            Connection c = koneksi.getConnection();
            String sql = "INSERT INTO `salon`.`registrasi` (`kd_pesanan`, `kd_layanan`, `kd_member`, `harga`, `tgl`) VALUES "
            + "('"+kdpesanan.getText()+"', '"+kdlayanan.getText()+"', '"+kdmember.getText()+"', "
            + " '"+txtharga2.getText()+"', '"+cmbtgl2.getSelectedItem()+"');";
            Statement s = c.createStatement();
            int r = s.executeUpdate(sql);
            tregist();
            AutoNumber();
            kdlayanan.setText("");
            txtharga2.setText(null);
            kdmember.setText("");
            JOptionPane.showMessageDialog(null,"Data sudah diMasukan");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
        }
        }else if(radiotidak.isSelected()){
            try{
            Connection c = koneksi.getConnection();
            String sql = "INSERT INTO `salon`.`registrasi` (`kd_pesanan`, `kd_layanan`, `kd_member`, `Nama`, `harga`, `tgl`) VALUES "
            + "('"+kdpesanan.getText()+"', '"+kdlayanan.getText()+"', 'RD78', '"+namaregis.getText()+"', "
            + " '"+txtharga2.getText()+"', '"+cmbtgl2.getSelectedItem()+"');";
            Statement s = c.createStatement();
            int r = s.executeUpdate(sql);
            tregist();
            AutoNumber();
            kdlayanan.setText("");
            txtharga2.setText(null);
            kdmember.setText("");
            JOptionPane.showMessageDialog(null,"Data sudah diMasukan");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
        }
        }
    }//GEN-LAST:event_tmbinputActionPerformed

    private void tpaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpaketMouseClicked
        // TODO add your handling code here:
        int table=tpaket.getSelectedRow();
        String a=tpaket.getValueAt(table, 0).toString();
        String b=tpaket.getValueAt(table, 2).toString();
        kdlayanan.setText(a);
        txtharga2.setText(b);
    }//GEN-LAST:event_tpaketMouseClicked

    private void cmbtgl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtgl2ActionPerformed
        // TODO add your handling code here:
        int table=tabcari.getSelectedRow();
        String a=tabcari.getValueAt(table, 0).toString();
        String b=tabcari.getValueAt(table, 2).toString();
        kdlayanan.setText(a);
        txtharga2.setText(b);
    }//GEN-LAST:event_cmbtgl2ActionPerformed

    private void tdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdeleteActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = koneksi.getConnection();
            String sql = "DELETE FROM `salon`.`registrasi` WHERE `registrasi`.`kd_pesanan` = '"+kdpesanan.getText()+"';";
            Statement s = c.createStatement();
            int r = s.executeUpdate(sql);
            tregist();
            AutoNumber();
            kdlayanan.setText("");
            txtharga2.setText(null);
            kdmember.setText("");
            JOptionPane.showMessageDialog(null,"Data Telah dihapus");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
        }
    }//GEN-LAST:event_tdeleteActionPerformed

    private void tblregistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblregistMouseClicked
        // TODO add your handling code here:
         int table=tblregist.getSelectedRow();
        String a=tblregist.getValueAt(table, 0).toString();
        kdpesanan.setText(a);
    }//GEN-LAST:event_tblregistMouseClicked

    private void tclear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclear2ActionPerformed
        // TODO add your handling code here:
        kdpesanan.setText("");
        kdlayanan.setText("");
        txtharga2.setText(null);
        kdmember.setText("");
        total.setText(null);
        AutoNumber();
        cekvitamin.setEnabled(false);
    }//GEN-LAST:event_tclear2ActionPerformed

    private void tom_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tom_cariActionPerformed
        // TODO add your handling code here:
            DefaultTableModel tlayanan1 = new DefaultTableModel();
            tlayanan1.addColumn("Kode");
            tlayanan1.addColumn("Nama");
            tlayanan1.addColumn("Harga");
            tlayanan1.addColumn("Jenis Perawatan");         

            try{
                Connection c = koneksi.getConnection();
                String sql="SELECT * FROM `layanan` where nama_layanan like '%"+txtcari.getText()+"%'";
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
                tabcari.setModel(tlayanan1);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Ada Kesalahan");
                }
    }//GEN-LAST:event_tom_cariActionPerformed

    private void tabcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabcariMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabcariMouseClicked

    private void radioyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioyaActionPerformed
        double hitung=0,diskon=0;
        int txtharga7=0;
        String[] kocak = new String[1] ;
        
        if (radioya.isSelected()) {
           txtharga7=Integer.parseInt(txtharga2.getText());
           hitung = txtharga7 * 0.1;
           diskon = txtharga7 - hitung;
           kocak[0] = String.valueOf(diskon); 
           
        }
        
        total.setText(kocak[0]);
        
    }//GEN-LAST:event_radioyaActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void cekvitaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekvitaminActionPerformed
        
        double hitung=0,vitamin =15000;
        int txtharga7=0;
        String[] kocak = new String[1] ;
        
        if (cekvitamin.isSelected()) {
           txtharga7=Integer.parseInt(txtharga2.getText());
           hitung = txtharga7 + vitamin;
           kocak[0] = String.valueOf(hitung); 
           
        }
        
        total.setText(kocak[0]);
    }//GEN-LAST:event_cekvitaminActionPerformed

  public void AutoNumber() {
        try {
            Connection c = koneksi.getConnection();
            Statement stt = c.createStatement();
            String sql = "SELECT * FROM registrasi ORDER BY kd_pesanan DESC";
            try (ResultSet rs = stt.executeQuery(sql)) {
                if (rs.next()) {
                    String kd_pesanan = rs.getString("kd_pesanan").substring(1);
                    String AN = "" + (Integer.parseInt(kd_pesanan) + 1);
                    String Nol = "";
                    
                    if(AN.length()==1)
                    {Nol = "000";}
                    else if(AN.length()==2)
                    {Nol = "00";}
                    else if(AN.length()==3)
                    {Nol = "0";}
                    else if(AN.length()==4)
                    {Nol = "";}
                    kdpesanan.setText("B" + Nol + AN);//sesuaikan dengan variable namenya
                } else {
                    kdpesanan.setText("B0001");//sesuaikan dengan variable namenya
                }
            }
        } catch (SQLException | NumberFormatException e) {
        }
    }
  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrup1;
    private javax.swing.JCheckBox cekvitamin;
    private uz.ncipro.calendar.JDateTimePicker cmbtgl2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField kdlayanan;
    private javax.swing.JTextField kdmember;
    private javax.swing.JTextField kdpesanan;
    private javax.swing.JTextField namaregis;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass2;
    private usu.widget.glass.PanelGlass panelGlass3;
    private usu.widget.glass.PanelGlass panelGlass4;
    private usu.widget.glass.PanelGlass panelGlass5;
    private usu.widget.glass.PanelGlass panelGlass7;
    private javax.swing.JRadioButton radiotidak;
    private javax.swing.JRadioButton radioya;
    private javax.swing.JTabbedPane tabbagian;
    private javax.swing.JTable tabcari;
    private javax.swing.JTable tblregist;
    private javax.swing.JTable tbodytreat;
    private javax.swing.JButton tclear2;
    private javax.swing.JButton tdelete;
    private javax.swing.JTable tfacetreat;
    private javax.swing.JTable thairstyle;
    private javax.swing.JTable thairtreat;
    private javax.swing.JTable thand;
    private javax.swing.JButton tmbinput;
    private javax.swing.JButton tom_cari;
    private javax.swing.JTextField total;
    private javax.swing.JTable tpaket;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtharga2;
    // End of variables declaration//GEN-END:variables

  
}
