/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class XJdbc {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//<<<<<<< HEAD
    private static String dburl = "jdbc:sqlserver://localhost;database=QLBuyGara;user=sa;password=123";
//=======
//    private static String dburl = "jdbc:sqlserver://localhost;database=GaraOto1;user=sa;password=123";
//>>>>>>> abd0351d25af16361002e4d76f70469d59917bc3

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(dburl);
        PreparedStatement pstmt = null;
        if (sql.trim().startsWith("{")) {
            pstmt = connection.prepareCall(sql);
        } else {
            pstmt = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pstmt.setObject(i + 1, args[i]);
        }
        return pstmt;
    }

    public static void update(String sql, Object... args) {
        try {
            PreparedStatement stmt = XJdbc.getStmt(sql, args);
            try {
                stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
            
        }
    }

    public static ResultSet query(String sql, Object... args) {
        try {
            PreparedStatement stmt = XJdbc.getStmt(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = XJdbc.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
            
        }
    }

    public static void connect() throws SQLException {
        Connection connection = DriverManager.getConnection(dburl);
        if (connection != null) {
            JOptionPane.showMessageDialog(null, "Connected!");
        }
    }
    public static void main(String[] args) {
        try {
            XJdbc.connect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
