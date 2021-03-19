/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.Employee;

/**
 *
 * @author MINH TUAN
 */
public class EmpDataStorage {
    JDBCConnection conn = new JDBCConnection();
    public void create(Employee e)
    {
        String sql = "INSERT INTO NHANVIEN VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = conn.ConnectDB().prepareStatement(sql);
            st.setString(1, e.getIDEmployee());
            st.setString(2, e.getIDPosition());
            st.setString(3, e.getName());
            st.setInt(4, e.getGender());
            st.setString(5, e.getPhone());
//            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//            Date d = new Date();
//            String dat = formatter.format(d);
            st.setString(6,e.getDOB());
//            System.out.println(dat);
            st.setString(7,e.getPassword());
            st.setInt(8,e.getStatus());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                
    }
    public void delete(String ID)
    {
        String sql = "DELETE FROM NHANVIEN WHERE MaNV = ?";
        try {
            PreparedStatement st = conn.ConnectDB().prepareStatement(sql);
            st.setString(1, ID);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void edit(String ID,Employee e)
    {
        String sql = "UPDATE NHANVIEN SET MaCV=?,HoTen=?,GioiTinh=?,SDT=?,NgaySinh=?,MatKhau=?,TrangThai=? WHERE MaNV=?";
        try {
            PreparedStatement st = conn.ConnectDB().prepareStatement(sql);
            
            st.setString(1, e.getIDPosition());
            st.setString(2, e.getName());
            st.setInt(3, e.getGender());
            st.setString(4, e.getPhone());
            st.setString(5, e.getDOB());
            st.setString(6, e.getPassword());
            st.setInt(7, e.getStatus());
            st.setString(8, ID);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Employee findByID(String ID)
    {
        Employee e = new Employee();
        String sql = "SELECT * FROM NHANVIEN WHERE MaNV=?";
        try {
            PreparedStatement st = conn.ConnectDB().prepareStatement(sql);
            st.setString(1,ID);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                e.setIDEmployee(rs.getString(1));
                e.setIDPosition(rs.getString(2));
                e.setName(rs.getString(3));
                e.setGender(rs.getInt(4));
                e.setPhone(rs.getString(5));
                e.setDOB((rs.getString(6)));
                e.setPassword(rs.getString(7));
                e.setStatus(rs.getInt(8));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(EmpDataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
       return e;
    }
    public ArrayList<Employee> load()
    {
        String sql = "SELECT * FROM NHANVIEN";
        ArrayList<Employee> list = new ArrayList<>();
        try {
            PreparedStatement st = conn.ConnectDB().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                Employee e = new Employee();
                e.setIDEmployee(rs.getString(1));
                e.setIDPosition(rs.getString(2));
                e.setName(rs.getString(3));
                e.setGender(rs.getInt(4));
                e.setPhone(rs.getString(5));
                e.setDOB((rs.getString(6)));
                e.setPassword(rs.getString(7));
                e.setStatus(rs.getInt(8));
                list.add(e);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(EmpDataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setIDEmployee("123id");
        e.setIDPosition("idpo");
        e.setName("Nametest");
        e.setGender(1);
        e.setPhone("0934");
        e.setDOB("12-12-2000");
        e.setPassword("md5pass");
        e.setStatus(0);
        new EmpDataStorage().create(e);
    }
}
