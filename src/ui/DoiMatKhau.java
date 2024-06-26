/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.MsgBox;

/**
 *
 * @author huuph
 */
public class DoiMatKhau extends javax.swing.JFrame {

    private static final String url = "jdbc:sqlserver://PHAN_NGOC_HUU\\SQLEXPRESS:1433;databaseName=Duan1;encrypt=false;";
    private static final String user = "sa";
    private static final String password = "123";

    /**
     * Creates new form DoiMatKhau
     */
    public DoiMatKhau() {
        setUndecorated(true);

        initComponents();

        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtXNMKM1 = new javax.swing.JPasswordField();
        txtMKMOI1 = new javax.swing.JPasswordField();
        txtMKHT1 = new javax.swing.JPasswordField();
        btnHuy1 = new javax.swing.JButton();
        btnMoi1 = new javax.swing.JButton();
        btnDoiMK1 = new javax.swing.JButton();
        btnQMK1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTenTK1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnHuy1.setText("Hủy Bỏ");
        btnHuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuy1ActionPerformed(evt);
            }
        });

        btnMoi1.setText("Làm Mới");
        btnMoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoi1ActionPerformed(evt);
            }
        });

        btnDoiMK1.setText("Đồng Ý");
        btnDoiMK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMK1ActionPerformed(evt);
            }
        });

        btnQMK1.setText("Quên Mật Khẩu");
        btnQMK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQMK1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("ĐỔI MẬT KHẨU");

        jLabel7.setText("Xác Nhận Mật Khẩu Mới");

        jLabel8.setText("Mật Khẩu Mới");

        jLabel9.setText("Mật Khẩu Hiện Tại");

        jLabel10.setText("Tài Khoản");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnMoi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQMK1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoiMK1)
                .addGap(18, 18, 18)
                .addComponent(btnHuy1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(137, 137, 137))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(247, 247, 247))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTenTK1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMKMOI1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMKHT1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtXNMKM1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenTK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMKHT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMKMOI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtXNMKM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQMK1)
                    .addComponent(btnMoi1)
                    .addComponent(btnDoiMK1)
                    .addComponent(btnHuy1))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuy1ActionPerformed
        // TODO add your handling code here:
        exitFrom();
    }//GEN-LAST:event_btnHuy1ActionPerformed

    private void exitFrom() {
        if (MsgBox.confirm(this, "Bạn Có Muốn Hủy Bỏ Chương Trình Không ?")) {
            this.dispose();
        }
    }

    private void btnMoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoi1ActionPerformed
        txtTenTK1.setText("");
        txtMKHT1.setText("");
        txtMKMOI1.setText("");
        txtXNMKM1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoi1ActionPerformed

    private void btnDoiMK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMK1ActionPerformed
        // TODO add your handling code here:
        String tenTaiKhoan = txtTenTK1.getText();
        String matKhauCu = new String(txtMKHT1.getPassword());
        String matKhauMoi = new String(txtMKMOI1.getPassword());
        String xacNhanMatKhauMoi = new String(txtXNMKM1.getPassword());

        // Kiểm tra tính hợp lệ của các trường nhập liệu
        if (tenTaiKhoan.isEmpty() || matKhauCu.isEmpty() || matKhauMoi.isEmpty() || xacNhanMatKhauMoi.isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        // Kiểm tra xem mật khẩu mới và xác nhận mật khẩu mới có trùng khớp không
        if (!matKhauMoi.equals(xacNhanMatKhauMoi)) {
            MsgBox.alert(this, "Mật khẩu mới và xác nhận mật khẩu mới không trùng khớp!");
            return;
        }

        // Thực hiện cập nhật mật khẩu trong cơ sở dữ liệu
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = conn.prepareStatement("UPDATE TaiKhoan SET MatKhau = ? WHERE MaTk = ? AND MatKhau = ?");
            ps.setString(1, matKhauMoi);
            ps.setString(2, tenTaiKhoan);
            ps.setString(3, matKhauCu);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                MsgBox.alert(this, "Đổi mật khẩu thành công!");
            } else {
                MsgBox.alert(this, "Tên tài khoản hoặc mật khẩu cũ không đúng!");
            }

            conn.close();
        } catch (SQLException ex) {
            MsgBox.alert(this, "Lỗi khi cập nhật mật khẩu: " + ex.getMessage());
        }


    }//GEN-LAST:event_btnDoiMK1ActionPerformed


    private void btnQMK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQMK1ActionPerformed
        // TODO add your handling code here:
        dispose();
        openQuenMK();
    }//GEN-LAST:event_btnQMK1ActionPerformed

    private void openQuenMK() {
        new QuenMatKhau(null, true).setVisible(true);
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMK1;
    private javax.swing.JButton btnHuy1;
    private javax.swing.JButton btnMoi1;
    private javax.swing.JButton btnQMK1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtMKHT1;
    private javax.swing.JPasswordField txtMKMOI1;
    private javax.swing.JTextField txtTenTK1;
    private javax.swing.JPasswordField txtXNMKM1;
    // End of variables declaration//GEN-END:variables
}
