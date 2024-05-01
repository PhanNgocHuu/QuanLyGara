/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Users;
import utils.XJdbc;

/**
 *
 * @author KHANH
 */
public class UsersDao extends InterfaceGara<Users,String >{

    @Override
    public void insert(Users entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Users entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Users seleteById(String Id) {
        String sql = "SELECT * FROM Users WHERE Usernames=?";
        List<Users> list = this.seleteBySql(sql, Id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<Users> seleteAll() {
       String sql = "SELECT * FROM Users";
        return seleteBySql(sql);
    }

   @Override
    protected List<Users> seleteBySql(String sql, Object... args) {
        List<Users> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Users entity = new Users();
                    entity.setUsername(rs.getString("Usernames"));
                    entity.setPassword(rs.getString("Passwords"));
                    entity.setRole(rs.getBoolean("Role_ID"));
                
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return list;
    }
    
}
