/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.kasirapp.view;

import com.mycompany.kasirapp.authentication.Auth;
import com.mycompany.kasirapp.controller.controller;
import com.mycompany.kasirapp.model.Supermarket;
import com.mycompany.kasirapp.model.Cashier;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Acer SPIN
 */
public class settingsPage extends javax.swing.JPanel {
    private JPanel goodsPage, orderPage, historyPage,index;
    /**
     * Creates new form settingsPage
     */
    public settingsPage() {
        initComponents();
        this.setSize(1280,832);
        usernameAlert.setVisible(false);
        passwordAlert.setVisible(false);
        notif.setVisible(false);
    }

    public void setGoodsPage(goodsPage goodsPage) {
        this.goodsPage = goodsPage;
    }

    public void setOrderPage(orderPage orderPage) {
        this.orderPage = orderPage;
    }

    public void setHistoryPage(companyHistoryPage historyPage) {
        this.historyPage = historyPage;
    }
    public void setIndex(JPanel index) {
        this.index = index;
    }
    private void clearFieldKasir(){
        usernameAlert.setVisible(false);
        passwordAlert.setVisible(false);
        inputCashierUsername.setText("");
        inputCashierPass.setText("");
    }
    private void clearFieldSupermarket(){
        inputNamaSupermarket.setText("");
        inputOldPass.setText("");
        inputNewPass.setText("");
    }
    private boolean fieldRequired(JTextField field, boolean required){
        if(required == true) return field.getText().equals("");
        return false;
    }
    private boolean fieldMinLength(JTextField field, int minLength){
        int fieldLength = field.getText().length();
        
//        if(maksUsername == true){
//            inputUsername.setText(supermarket.getUsername()
//            .substring(0, supermarket.getUsername().length() - (supermarket.getUsername().length() - 10)));
//        }
//        if(maksNamaSupermarket == true){
//            inputSupermarket.setText(supermarket.getNamaSupermarket()
//            .substring(0, supermarket.getNamaSupermarket().length() - (supermarket.getNamaSupermarket().length() - 15)));
//        }
        return minLength > fieldLength;
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
        jPanel1 = new javax.swing.JPanel();
        goodsBtn = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();
        settingsBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        settingsLabel = new javax.swing.JLabel();
        supermarketLabel = new javax.swing.JLabel();
        labelNamaBarang = new javax.swing.JLabel();
        inputNamaSupermarket = new javax.swing.JTextField();
        labelNamaBarang2 = new javax.swing.JLabel();
        inputOldPass = new javax.swing.JTextField();
        inputNewPass = new javax.swing.JTextField();
        labelNamaBarang3 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        btnMakeCashAcc = new javax.swing.JButton();
        changePassLabel1 = new javax.swing.JLabel();
        labelNamaBarang4 = new javax.swing.JLabel();
        inputCashierUsername = new javax.swing.JTextField();
        inputCashierPass = new javax.swing.JTextField();
        labelNamaBarang5 = new javax.swing.JLabel();
        usernameAlert = new javax.swing.JLabel();
        passwordAlert = new javax.swing.JLabel();
        updateBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 245));
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

        add(notif, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 301, 220, 120));

        jPanel1.setBackground(new java.awt.Color(33, 146, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        goodsBtn.setBackground(new java.awt.Color(33, 146, 255));
        goodsBtn.setForeground(new java.awt.Color(255, 255, 255));
        goodsBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\goods--outline.png")); // NOI18N
        goodsBtn.setContentAreaFilled(false);
        goodsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goodsBtn.setMargin(new java.awt.Insets(30, 15, 0, 15));
        goodsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(goodsBtn, new java.awt.GridBagConstraints());

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

        settingsBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer SPIN\\OneDrive\\Dokumen\\NetBeansProjects\\kasirApp\\src\\main\\java\\com\\mycompany\\kasirapp\\icons\\settings--fill.png")); // NOI18N
        settingsBtn.setContentAreaFilled(false);
        settingsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsBtn.setMargin(new java.awt.Insets(30, 15, 0, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(settingsBtn, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 511, 0);
        jPanel1.add(logoutBtn, gridBagConstraints);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        settingsLabel.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        settingsLabel.setText("Settings");
        add(settingsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 80, -1, -1));

        supermarketLabel.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        supermarketLabel.setText("Supermarket ");
        add(supermarketLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 157, -1, -1));

        labelNamaBarang.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelNamaBarang.setText("Nama supermarket");
        add(labelNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 198, -1, -1));

        inputNamaSupermarket.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputNamaSupermarket.setPreferredSize(new java.awt.Dimension(331, 34));
        inputNamaSupermarket.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputNamaSupermarketFocusGained(evt);
            }
        });
        add(inputNamaSupermarket, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 227, -1, -1));

        labelNamaBarang2.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelNamaBarang2.setText("Old password");
        add(labelNamaBarang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 267, -1, -1));

        inputOldPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputOldPass.setPreferredSize(new java.awt.Dimension(331, 34));
        inputOldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputOldPassActionPerformed(evt);
            }
        });
        add(inputOldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 296, -1, -1));

        inputNewPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputNewPass.setPreferredSize(new java.awt.Dimension(331, 34));
        inputNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNewPassActionPerformed(evt);
            }
        });
        add(inputNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 371, -1, -1));

        labelNamaBarang3.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelNamaBarang3.setText("New password");
        add(labelNamaBarang3, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 342, -1, -1));

        updateBtn.setBackground(new java.awt.Color(33, 146, 255));
        updateBtn.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 146, 255), 0, true));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.setMaximumSize(new java.awt.Dimension(331, 23));
        updateBtn.setPreferredSize(new java.awt.Dimension(90, 19));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 435, -1, 34));

        btnMakeCashAcc.setBackground(new java.awt.Color(33, 146, 255));
        btnMakeCashAcc.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        btnMakeCashAcc.setForeground(new java.awt.Color(255, 255, 255));
        btnMakeCashAcc.setText("Make  Account");
        btnMakeCashAcc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 146, 255), 0, true));
        btnMakeCashAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakeCashAcc.setMaximumSize(new java.awt.Dimension(331, 23));
        btnMakeCashAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeCashAccActionPerformed(evt);
            }
        });
        add(btnMakeCashAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 723, 165, 34));

        changePassLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        changePassLabel1.setText("Cashier Account");
        add(changePassLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 509, -1, -1));

        labelNamaBarang4.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelNamaBarang4.setText("Username");
        add(labelNamaBarang4, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 550, -1, -1));

        inputCashierUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputCashierUsername.setPreferredSize(new java.awt.Dimension(331, 34));
        inputCashierUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCashierUsernameFocusGained(evt);
            }
        });
        inputCashierUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCashierUsernameKeyReleased(evt);
            }
        });
        add(inputCashierUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 579, -1, -1));

        inputCashierPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputCashierPass.setPreferredSize(new java.awt.Dimension(331, 34));
        add(inputCashierPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 663, -1, -1));

        labelNamaBarang5.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        labelNamaBarang5.setText("Password");
        add(labelNamaBarang5, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 634, -1, -1));

        usernameAlert.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        usernameAlert.setForeground(new java.awt.Color(255, 0, 0));
        usernameAlert.setText("jLabel1");
        add(usernameAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 615, -1, -1));

        passwordAlert.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        passwordAlert.setForeground(new java.awt.Color(255, 0, 0));
        passwordAlert.setText("jLabel1");
        add(passwordAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 698, -1, -1));

        updateBtn1.setBackground(new java.awt.Color(33, 146, 255));
        updateBtn1.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        updateBtn1.setForeground(new java.awt.Color(33, 146, 255));
        updateBtn1.setText("Update");
        updateBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 146, 255)));
        updateBtn1.setContentAreaFilled(false);
        updateBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn1.setMaximumSize(new java.awt.Dimension(331, 23));
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });
        add(updateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 723, 89, 34));
    }// </editor-fold>//GEN-END:initComponents

    private void goodsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodsBtnActionPerformed
        this.setVisible(false);
        goodsPage.setVisible(true);
    }//GEN-LAST:event_goodsBtnActionPerformed

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        this.setVisible(false);
        historyPage.setVisible(true);
    }//GEN-LAST:event_historyBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        notif.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void inputOldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputOldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputOldPassActionPerformed

    private void inputNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNewPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNewPassActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        Supermarket supermarket = Auth.supermarket;
        String newPass = inputNewPass.getText();
        String oldPass = inputOldPass.getText();
        supermarket.setNamaSupermarket(inputNamaSupermarket.getText());       
        if(oldPass.equals(supermarket.getPass())){
           supermarket.setPass(newPass);
           supermarket.update(supermarket);
           clearFieldSupermarket();
        }else{
            JOptionPane.showMessageDialog(null, "Password lama salah!");
        }   
    }//GEN-LAST:event_updateBtnActionPerformed

    private void btnMakeCashAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeCashAccActionPerformed
        Cashier kasir = new Cashier();
        Supermarket supermarket = Auth.supermarket;
        kasir.setIdSupermark(supermarket.getIdSupermarket());
        kasir.setUsername(inputCashierUsername.getText());
        kasir.setPassword(inputCashierPass.getText());
        
        if(fieldRequired(inputCashierUsername, true)){
            usernameAlert.setText("Field tidak boleh kosong");
            usernameAlert.setVisible(false);
        }else{
            usernameAlert.setVisible(false);
        }
        if(fieldRequired(inputCashierPass, true)){
            passwordAlert.setText("Field tidak boleh kosong");
            passwordAlert.setVisible(false);
        }else{
            passwordAlert.setVisible(false);
        }
        if(fieldMinLength(inputCashierUsername, 3)){
            usernameAlert.setText("Panjang character minimal 3");
            usernameAlert.setVisible(true);
        }else{
            usernameAlert.setVisible(false);
        }
        if(fieldMinLength(inputCashierPass, 8)){
            passwordAlert.setText("Panjang character minimal 8");
            passwordAlert.setVisible(true);
        }else{
            passwordAlert.setVisible(false);
        }
        if(supermarket.isRegistered(kasir) == true){
            JOptionPane.showMessageDialog(null, "Username telah dipakai");
        }else{
            if(supermarket.belongsToCashier() != null){
                JOptionPane.showMessageDialog(null, "Akun telah ada");
            }else{
                if(!fieldRequired(inputCashierUsername, true) && 
                !fieldRequired(inputCashierPass, true) && 
                !fieldMinLength(inputCashierUsername, 3) && 
                !fieldMinLength(inputCashierPass, 8) && 
                !fieldMinLength(inputCashierPass, 8)){
                    supermarket.register(kasir);
                    clearFieldKasir();
                }    
            }
        }
        
 
    }//GEN-LAST:event_btnMakeCashAccActionPerformed

    private void yesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesbtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        btnMakeCashAcc.setText("Make Account");
        this.index.setVisible(true);
        this.notif.setVisible(false);
        clearFieldKasir();
        clearFieldSupermarket();
    }//GEN-LAST:event_yesbtnActionPerformed

    private void nobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nobtnActionPerformed
        // TODO add your handling code here:
        this.notif.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_nobtnActionPerformed

    private void inputNamaSupermarketFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputNamaSupermarketFocusGained
        Supermarket supermarket = Auth.supermarket;
        inputNamaSupermarket.setText(supermarket.getNamaSupermarket());
    }//GEN-LAST:event_inputNamaSupermarketFocusGained

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        Supermarket supermarket = Auth.supermarket;
        if(supermarket.belongsToCashier() == null){
            JOptionPane.showMessageDialog(null, "Akun kasir belum dibuat");
        }else{
            Cashier kasir = supermarket.belongsToCashier();
            kasir.setPassword(inputCashierPass.getText());
            supermarket.update(kasir);
            clearFieldKasir();
        }
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void inputCashierUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCashierUsernameFocusGained
        try {
            Cashier kasir = Auth.supermarket.belongsToCashier();
            inputCashierUsername.setText(kasir.getUsername());
        } catch (Exception e) {}
    }//GEN-LAST:event_inputCashierUsernameFocusGained

    private void inputCashierUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCashierUsernameKeyReleased
        try {
            Cashier kasir = Auth.supermarket.belongsToCashier();
            inputCashierUsername.setText(kasir.getUsername());  
        } catch (Exception e) {}

    }//GEN-LAST:event_inputCashierUsernameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMakeCashAcc;
    private javax.swing.JLabel changePassLabel1;
    private javax.swing.JButton goodsBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JTextField inputCashierPass;
    private javax.swing.JTextField inputCashierUsername;
    private javax.swing.JTextField inputNamaSupermarket;
    private javax.swing.JTextField inputNewPass;
    private javax.swing.JTextField inputOldPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNamaBarang;
    private javax.swing.JLabel labelNamaBarang2;
    private javax.swing.JLabel labelNamaBarang3;
    private javax.swing.JLabel labelNamaBarang4;
    private javax.swing.JLabel labelNamaBarang5;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton nobtn;
    private javax.swing.JPanel notif;
    private javax.swing.JLabel passwordAlert;
    private javax.swing.JButton settingsBtn;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JLabel supermarketLabel;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateBtn1;
    private javax.swing.JLabel usernameAlert;
    private javax.swing.JButton yesbtn;
    // End of variables declaration//GEN-END:variables
}

