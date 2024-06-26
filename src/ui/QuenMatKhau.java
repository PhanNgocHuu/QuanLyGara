/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import utils.MsgBox;

/**
 *
 * @author huuph
 */
public class QuenMatKhau extends javax.swing.JDialog {

    private static final String url = "jdbc:sqlserver://PHAN_NGOC_HUU\\SQLEXPRESS:1433;databaseName=DUAN1new;encrypt=false;";
    private static final String user = "sa";
    private static final String password = "123";

    /**
     * Creates new form QuenMK
     */
    public QuenMatKhau(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        setUndecorated(true);

        initComponents();
        setLocationRelativeTo(this);
    }

    private static boolean checkTenTk(String TenTk) {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM heThong WHERE username=?");
            ps.setString(1, TenTk);
            ResultSet rs = ps.executeQuery();

            // Kiểm tra xem có kết quả trả về không
            boolean exists = rs.next();

            // Đóng kết nối
            conn.close();

            return exists;
        } catch (SQLException ex) {
            System.out.println("Lỗi khi thực hiện truy vấn: " + ex.getMessage());
            return false;
        }
    }

    private String generateRandomCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10)); // Sinh số ngẫu nhiên từ 0 đến 9
        }
        return sb.toString();
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
        txtGuiMa = new javax.swing.JButton();
        btnNhap = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtTaiKhoan = new swing.TextField();
        txtEmail = new swing.PasswordField();
        txtCode = new swing.TextField();
        lblThoat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtGuiMa.setText("GỬI MÃ");
        txtGuiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuiMaActionPerformed(evt);
            }
        });

        btnNhap.setText("TIỀN HÀNH ĐỔI MẬT KHẨU MỚI");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        jLabel4.setText("Nhập Mã Vừa Được Gửi Qua Email :");

        jSeparator1.setForeground(new java.awt.Color(255, 102, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("QUÊN MẬT KHẨU");

        txtTaiKhoan.setForeground(new java.awt.Color(0, 0, 0));
        txtTaiKhoan.setHint("Tài Khoản");
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });

        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setHint("Email");

        txtCode.setForeground(new java.awt.Color(0, 0, 0));
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        lblThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblThoat.setText("Exit");
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThoatMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(txtGuiMa)))
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnNhap)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(51, 51, 51)
                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtGuiMa)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnNhap)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        // TODO add         your handling code here:
        VerifyCode();
    }//GEN-LAST:event_btnNhapActionPerformed

    private void txtGuiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuiMaActionPerformed
        // TODO add your handling code here:
        String TenTk = txtTaiKhoan.getText();

        if (!TenTk.isEmpty()) {
            if (checkTenTk(TenTk)) {
                SendCode();
            } else {
                MsgBox.alert(this, "Tên tài khoản không tồn tại trong cơ sở dữ liệu.");
            }
        } else {
            MsgBox.alert(this, "Vui lòng nhập tên tài khoản.");
        }
        
        
        

    }//GEN-LAST:event_txtGuiMaActionPerformed

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        // TODO add your handling code here:
        exitFrom();
    }//GEN-LAST:event_lblThoatMouseClicked

    private void lblThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseEntered
        // TODO add your handling code here:
        lblThoat.setForeground(Color.RED);
    }//GEN-LAST:event_lblThoatMouseEntered

    private void lblThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseExited
        // TODO add your handling code here:
        lblThoat.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblThoatMouseExited

    private void exitFrom() {

        this.dispose();

    }

    private boolean checFrom() {
        if (txtTaiKhoan.getText().equals("")) {
            MsgBox.alert(this, "Vui Lòng Nhập Tài Khoản");
            return false;
        }
        if (txtEmail.getText().equals("")) {
            MsgBox.alert(this, "Vui Lòng Nhập Email");
            return false;
        }
        try {

        } catch (Exception e) {

        }
        return true;
    }

    private String receivedCode; // biến dùng để lưu mã được gửi về gmail

    private void SendCode() {
        try {

            // Khởi tạo properties cho việc gửi email
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", 587);

            // Thông tin tài khoản email
            String username = "esysedupoly@gmail.com";
            String password = "eqerajvlvcgftebi";

            // Tạo phiên session
            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(username, password);
                }
            });

            // Địa chỉ email của nhân viên
            String to = txtEmail.getText();

            // Tiêu đề và nội dung email
            String subject = "Mã Xác Nhận Đổi Mật Khẩu";
            String randomCode = generateRandomCode(); // Tạo mã xác nhận ngẫu nhiên
            String message = "Mã Xác Nhận Của Bạn Là: " + randomCode;

            // Tạo đối tượng MimeMessage
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(username));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(subject);
            msg.setText(message);

            // Gửi email
            Transport.send(msg);

            // Lưu mã xác nhận vào biến instance
            receivedCode = randomCode;

            // Hiển thị thông báo gửi mã thành công
            MsgBox.alert(this, "Mã Xác Thực Đã Gửi Về Mail Thành Công");

            // Bật trường nhập mã và nút tiếp tục
//            txtCode.setEnabled(true);
        } catch (Exception e) {
            // Hiển thị thông báo lỗi
            System.out.println(e);
            MsgBox.alert(this, "Lỗi Hệ Thống");
        }
    }

    private void VerifyCode() {
        try {
            // Lấy mã nhập từ người dùng
            String enteredCode = txtCode.getText();

            // Kiểm tra xem mã nhập vào có trùng khớp với mã nhận được từ email không
            if (enteredCode.equals(receivedCode)) {
                // Nếu trùng khớp, cho phép người dùng đổi mật khẩu mới
                dispose();
                String taiKhoan = txtTaiKhoan.getText();
                doimk(taiKhoan);
            } else {
                // Nếu không trùng khớp, hiển thị thông báo lỗi
                MsgBox.alert(this, "Mã Xác Nhận Không Đúng");
            }
        } catch (Exception e) {
            // Xử lý ngoại lệ nếu cần
        }
    }

    public void doimk(String taiKhoan) {
//        new DoiMK(null, true).setVisible(true);
        doiMatKhauMoi doiMK = new doiMatKhauMoi(null, true);
        doiMK.setTaiKhoan1(taiKhoan);
        doiMK.setVisible(true);
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
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuenMatKhau dialog = new QuenMatKhau(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhap;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblThoat;
    private swing.TextField txtCode;
    private swing.PasswordField txtEmail;
    private javax.swing.JButton txtGuiMa;
    private swing.TextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
