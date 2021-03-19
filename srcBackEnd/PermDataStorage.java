/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MINH TUAN
 */
public class PermDataStorage {
    JDBCConnection conn = new JDBCConnection();
    public void create(Permission pe)
    {
        String sql = "INSERT INTO CHUCNANG VALUES(?,?)";
        try {
            PreparedStatement st = conn.ConnectDB().prepareStatement(sql);
            st.setString(1,pe.getID());
            st.setString(2,pe.getName());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                
    }
     public void delete(String ID)
    {
        String sql = "DELETE FROM CHUCNANG WHERE MACN = ?";
        try {
            PreparedStatement st = conn.ConnectDB().prepareStatement(sql);
            st.setString(1, ID);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void edit(String ID,String n)
    {
        String sql = "UPDATE CHUCNANG SET TENCN=? WHERE MACN=?";
        try {
            PreparedStatement st = conn.ConnectDB().prepareStatement(sql);
            
            st.setString(1, n);
            st.setString(2, ID);
           
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Permission> load()
    {
        String sql = "SELECT * FROM CHUCNANG";
        ArrayList<Permission> list = new ArrayList<>();
        try {
            PreparedStatement st = conn.ConnectDB().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                Permission pe = new Permission();
                pe.setID(rs.getString(1));
                pe.setName(rs.getString(2));
                list.add(pe);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(EmpDataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
    }
    public static void main(String[] args) {
        
        //new PermDataStorage().create(new Permission("123","them sp"));
    }
}
