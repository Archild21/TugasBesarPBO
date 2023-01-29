/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.kasirapp.view;

import com.mycompany.kasirapp.authentication.Auth;
import com.mycompany.kasirapp.controller.controller;
import com.mycompany.kasirapp.model.Barang;
import com.mycompany.kasirapp.model.Cashier;
import com.mycompany.kasirapp.model.Supermarket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
/**
 *
 * @author Acer SPIN
 */
public class goodsPage extends javax.swing.JPanel {
    String dataNamaBrang[] = {"sapi","kambing","batu"};
    private JPanel orderPage,settingsPage,index;
    companyHistoryPage historyPage;
    ResultSet resultData;
    /**
     * Creates new form goodsPage
     */
    public goodsPage() {
        initComponents();
        this.setSize(1280, 832);
        notif.setVisible(false);
        alertHargaBarang.setVisible(false);
        alertNamaBarang.setVisible(false);
        alertStokBarang.setVisible(false);
        labelId.setVisible(false);
//        jComboBox2.setModel(new DefaultComboBoxModel(dataNamaBrang));
    }
    
    public void setIndex(JPanel index) {
        this.index = index;
    }
    public void setOrderPage(JPanel orderPage) {
        this.orderPage = orderPage;
    }

    public void setHistoryPage(companyHistoryPage historyPage) {
        this.historyPage = historyPage;
    }

    public void setSettingsPage(JPanel settingsPage) {
        this.settingsPage = settingsPage;
    }
    public void clearField(){
        inputNamaBarang.setText("");
        inputHargaBarang.setText("");
        inputDiscount.setText("");
        inputStokBarang.setValue(0);
        labelId.setText("");
        labelId.setVisible(true);
    }
    private boolean fieldRequired(JTextField field, boolean required){
        if(required == true) return field.getText().equals("");
        return false;
    }
    private boolean spinnerRequired(JSpinner spin, boolean required){
        if(required == true) return spin.getValue().equals(0);
        return false;
    }
    private void alert(){
        if(fieldRequired(inputNamaBarang, true)){
        alertNamaBarang.setText("Nama barang tidak boleh kosong");
        alertNamaBarang.setVisible(true);
        }else{
            alertNamaBarang.setVisible(false);
        }
        if(fieldRequired(inputHargaBarang, true)){
        alertHargaBarang.setText("Harga barang tidak boleh kosong");
        alertHargaBarang.setVisible(true);
        }else{
            alertHargaBarang.setVisible(false);
        }
        if(spinnerRequired(inputStokBarang, true)){
        alertStokBarang.setText("Stock tidak boleh kosong");
        alertStokBarang.setVisible(true);
        }else{
            alertStokBarang.setVisible(false);
        }
    }
    public void fillTableBarang(List<Barang> barangs){
        Supermarket supermarket = Auth.supermarket;
        Object data[][] = new Object[0][0];
  
        data = new Object[barangs.size()][5];
        for(int i = 0; i < barangs.size(); i++){
            data[i][0] = barangs.get(i).getIdBarang();
            data[i][1] = barangs.get(i).getNamaBarang();
            data[i][2] = barangs.get(i).getStok();
            data[i][3] = barangs.get(i).getHargaBarang();
            data[i][4] = barangs.get(i).getDiscount();
        }
        String judul[] = {"Id Barang","Nama Barang", "Stok", "Harga Barang", "Discount"};
//        JTable a = new JTable(data,judul);
        tableDaftarBarang.setModel(new DefaultTableModel(data, judul));
        jScrollPane5.setViewportView(tableDaftarBarang);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        notif = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        yesbtn = new javax.swing.JButton();
        nobtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        registerLabel = new javax.swing.JLabel();
        labelNamaBarang = new javax.swing.JLabel();
        inputNamaBarang = new javax.swing.JTextField();
        registerLabel1 = new javax.swing.JLabel();
        labelHargaBarang = new javax.swing.JLabel();
        inputHargaBarang = new javax.swing.JTextField();
        inputStokBarang = new javax.swing.JSpinner();
        labelDiscount = new javax.swing.JLabel();
        inputDiscount = new javax.swing.JTextField();
        labelStokBarang = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        goodsBtn = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();
        settingsBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        registerLabel3 = new javax.swing.JLabel();
        inputCariBarang = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableDaftarBarang = new javax.swing.JTable();
        labelCariBarang = new javax.swing.JLabel();
        registerLabel4 = new javax.swing.JLabel();
        alertNamaBarang = new javax.swing.JLabel();
        alertHargaBarang = new javax.swing.JLabel();
        alertStokBarang = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        notif.setBackground(new java.awt.Color(255, 255, 255));
        notif.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apakah anda ingin keluar?");

        yesbtn.setBackground(new java.awt.Color(33, 146, 255));
        yesbtn.setForeground(new java.awt.Color(255, 255, 255));
        yesbtn.setText("YA");
        yesbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesbtnActionPerformed(evt);
            }
        });

        nobtn.setText("No");
        nobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nobtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\danger.png")); // NOI18N

        javax.swing.GroupLayout notifLayout = new javax.swing.GroupLayout(notif);
        notif.setLayout(notifLayout);
        notifLayout.setHorizontalGroup(
            notifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notifLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notifLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
            .addGroup(notifLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(yesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        notifLayout.setVerticalGroup(
            notifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notifLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(notifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(notif, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 301, -1, -1));

        addBtn.setBackground(new java.awt.Color(33, 146, 255));
        addBtn.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.setBorder(null);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setMaximumSize(new java.awt.Dimension(331, 23));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 495, 89, 34));

        registerLabel.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        registerLabel.setText("Barang");
        add(registerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 80, -1, -1));

        labelNamaBarang.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelNamaBarang.setText("Nama Barang");
        add(labelNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 147, -1, -1));

        inputNamaBarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputNamaBarang.setPreferredSize(new java.awt.Dimension(331, 34));
        inputNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaBarangActionPerformed(evt);
            }
        });
        add(inputNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 176, -1, -1));

        registerLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        registerLabel1.setForeground(new java.awt.Color(33, 146, 255));
        registerLabel1.setText("Input ");
        add(registerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, -1, -1));

        labelHargaBarang.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelHargaBarang.setText("Harga Barang");
        add(labelHargaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 228, -1, -1));

        inputHargaBarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputHargaBarang.setPreferredSize(new java.awt.Dimension(331, 34));
        inputHargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHargaBarangActionPerformed(evt);
            }
        });
        add(inputHargaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 257, -1, -1));

        inputStokBarang.setBorder(null);
        inputStokBarang.setPreferredSize(new java.awt.Dimension(80, 22));
        add(inputStokBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 419, -1, -1));

        labelDiscount.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelDiscount.setText("Discount");
        add(labelDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 311, -1, -1));

        inputDiscount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputDiscount.setPreferredSize(new java.awt.Dimension(331, 34));
        inputDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDiscountActionPerformed(evt);
            }
        });
        add(inputDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 338, -1, -1));

        labelStokBarang.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelStokBarang.setText("Stok Barang");
        add(labelStokBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 390, -1, -1));

        jPanel1.setBackground(new java.awt.Color(33, 146, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        goodsBtn.setBackground(new java.awt.Color(33, 146, 255));
        goodsBtn.setForeground(new java.awt.Color(255, 255, 255));
        goodsBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\goods-fill.png")); // NOI18N
        goodsBtn.setContentAreaFilled(false);
        goodsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goodsBtn.setMargin(new java.awt.Insets(30, 15, 0, 15));
        goodsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodsBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(goodsBtn, gridBagConstraints);

        historyBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\history.png")); // NOI18N
        historyBtn.setContentAreaFilled(false);
        historyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historyBtn.setMargin(new java.awt.Insets(30, 15, 0, 15));
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(historyBtn, gridBagConstraints);

        settingsBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\settings.png")); // NOI18N
        settingsBtn.setContentAreaFilled(false);
        settingsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsBtn.setMargin(new java.awt.Insets(30, 15, 0, 15));
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(settingsBtn, gridBagConstraints);

        logoutBtn.setBackground(new java.awt.Color(245, 245, 245));
        logoutBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\logout.png")); // NOI18N
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.setMargin(new java.awt.Insets(30, 15, 0, 15));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 500, 0);
        jPanel1.add(logoutBtn, gridBagConstraints);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        updateBtn.setBackground(new java.awt.Color(33, 146, 255));
        updateBtn.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(33, 146, 255));
        updateBtn.setText("Update");
        updateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 146, 255), 1, true));
        updateBtn.setContentAreaFilled(false);
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.setMaximumSize(new java.awt.Dimension(331, 23));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 495, 89, 34));

        deleteBtn.setBackground(new java.awt.Color(33, 146, 255));
        deleteBtn.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(33, 146, 255));
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(null);
        deleteBtn.setContentAreaFilled(false);
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.setMaximumSize(new java.awt.Dimension(331, 23));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 495, 89, 34));

        registerLabel3.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        registerLabel3.setForeground(new java.awt.Color(33, 146, 255));
        registerLabel3.setText("Daftar");
        add(registerLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 80, -1, -1));

        inputCariBarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputCariBarang.setPreferredSize(new java.awt.Dimension(222, 20));
        inputCariBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCariBarangKeyReleased(evt);
            }
        });
        add(inputCariBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 515, -1, 34));

        searchBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\search.png")); // NOI18N
        searchBtn.setBorder(null);
        searchBtn.setContentAreaFilled(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 515, -1, -1));

        tableDaftarBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Barang", "Nama Barang", "Stock", "Harga Barang", "Discount"
            }
        ));
        tableDaftarBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDaftarBarangMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableDaftarBarang);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 147, 500, 320));

        labelCariBarang.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelCariBarang.setText("Cari Barang");
        add(labelCariBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 486, -1, -1));

        registerLabel4.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        registerLabel4.setText("Barang");
        add(registerLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 80, -1, -1));

        alertNamaBarang.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        alertNamaBarang.setForeground(new java.awt.Color(255, 0, 0));
        alertNamaBarang.setText("jLabel3");
        add(alertNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 210, -1, -1));

        alertHargaBarang.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        alertHargaBarang.setForeground(new java.awt.Color(255, 0, 0));
        alertHargaBarang.setText("jLabel3");
        add(alertHargaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 292, -1, -1));

        alertStokBarang.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        alertStokBarang.setForeground(new java.awt.Color(255, 0, 0));
        alertStokBarang.setText("jLabel3");
        add(alertStokBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 442, -1, -1));

        labelId.setText("jLabel3");
        add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 176, -1, 34));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Supermarket supermarket = Auth.supermarket;
        Cashier kasir = supermarket.belongsToCashier();
        alert();
        if(kasir == null){
            JOptionPane.showMessageDialog(null, "Akun kasir belum dibuat");
        }else{
            Barang barang = new Barang();
            barang.setNamaBarang(inputNamaBarang.getText());
            barang.setIdSupermarket(supermarket.getIdSupermarket());
            barang.setIdKasir(kasir.getIdKasir());
            barang.setHargaBarang(Integer.parseInt(inputHargaBarang.getText()));
            barang.setDiscount(Integer.parseInt(inputDiscount.getText()));
            barang.setStok(Integer.parseInt(inputStokBarang.getValue().toString()));
            supermarket.add(barang);
            fillTableBarang(supermarket.HasManyBarang());
            clearField();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void inputNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaBarangActionPerformed

    private void inputHargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHargaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHargaBarangActionPerformed

    private void inputDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDiscountActionPerformed

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        this.setVisible(false);
        historyPage.setVisible(true);
        historyPage.fillTableHistory();
    }//GEN-LAST:event_historyBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        notif.setVisible(true);
        clearField();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        Supermarket supermarket = Auth.supermarket;
        Barang barang = new Barang();
        alert();
        barang.setIdBarang(Integer.parseInt(labelId.getText()));
        barang.setNamaBarang(inputNamaBarang.getText());
        barang.setHargaBarang(Integer.parseInt(inputHargaBarang.getText()));
        barang.setDiscount(Integer.parseInt(inputDiscount.getText()));
        barang.setStok(Integer.parseInt(inputStokBarang.getValue().toString()));
        supermarket.update(barang);
        JOptionPane.showMessageDialog(null, "Update Succes");
        clearField();
        fillTableBarang(supermarket.HasManyBarang());
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Supermarket supermarket = Auth.supermarket;
        Barang barang = new Barang();
        barang.setIdBarang(Integer.parseInt(labelId.getText()));
        barang.setNamaBarang(inputNamaBarang.getText());
        barang.setHargaBarang(Integer.parseInt(inputHargaBarang.getText()));
        barang.setDiscount(Integer.parseInt(inputDiscount.getText()));
        barang.setStok(Integer.parseInt(inputStokBarang.getValue().toString()));
        supermarket.delete(barang);
        clearField();
        fillTableBarang(supermarket.HasManyBarang());
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
        this.setVisible(false);
        settingsPage.setVisible(true);
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void goodsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goodsBtnActionPerformed

    private void yesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesbtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.index.setVisible(true);
        this.notif.setVisible(false);
        clearField();
    }//GEN-LAST:event_yesbtnActionPerformed

    private void nobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nobtnActionPerformed
        // TODO add your handling code here:
        this.notif.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_nobtnActionPerformed

    private void tableDaftarBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDaftarBarangMouseClicked
        int row = tableDaftarBarang.getSelectedRow();
        List<String> columsList = new ArrayList<String>();
        for (int i = 0; i < tableDaftarBarang.getColumnCount(); i++) {
            columsList.add(tableDaftarBarang.getValueAt(row, i) + "");
        }
        labelId.setVisible(true);
        labelId.setText(columsList.get(0));
        inputNamaBarang.setText(columsList.get(1));
        inputStokBarang.setValue(Integer.valueOf(columsList.get(2)));
        inputHargaBarang.setText(columsList.get(3));
        inputDiscount.setText(columsList.get(4));
        labelId.setVisible(true);                          
    }//GEN-LAST:event_tableDaftarBarangMouseClicked

    private void inputCariBarangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCariBarangKeyReleased
        Supermarket supermarket = Auth.supermarket ;
        String keyw = inputCariBarang.getText();
        fillTableBarang(supermarket.search(keyw));
    }//GEN-LAST:event_inputCariBarangKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel alertHargaBarang;
    private javax.swing.JLabel alertNamaBarang;
    private javax.swing.JLabel alertStokBarang;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton goodsBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JTextField inputCariBarang;
    private javax.swing.JTextField inputDiscount;
    private javax.swing.JTextField inputHargaBarang;
    private javax.swing.JTextField inputNamaBarang;
    private javax.swing.JSpinner inputStokBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelCariBarang;
    private javax.swing.JLabel labelDiscount;
    private javax.swing.JLabel labelHargaBarang;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNamaBarang;
    private javax.swing.JLabel labelStokBarang;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton nobtn;
    private javax.swing.JPanel notif;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel registerLabel1;
    private javax.swing.JLabel registerLabel3;
    private javax.swing.JLabel registerLabel4;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton settingsBtn;
    private javax.swing.JTable tableDaftarBarang;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton yesbtn;
    // End of variables declaration//GEN-END:variables
}
