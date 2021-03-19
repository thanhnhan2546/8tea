/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Employee {
    String IDEmployee ;
    String IDPosition ;
    String Name;
    Integer Gender ;
    String Phone ;
    String DOB ;
    String Password;
    Integer Status;
    List<Permission> list ;
    public Employee(String IDEmployee, String IDPosition, String Name, Integer Gender, String Phone, String DOB, String Password,Integer Status) {
        this.IDEmployee = IDEmployee;
        this.IDPosition = IDPosition;
        this.Name = Name;
        this.Gender = Gender;
        this.Phone = Phone;
        this.DOB = DOB;
        this.Password = Password;
        this.Status=Status;
    }


public Employee(){
    this.IDEmployee = null;
        this.IDPosition = null;
        this.Name = null;
        this.Gender = null;
        this.Phone = null;
        this.DOB = null;
        this.Password = null;
        this.list = null;
        this.Status = null;
}    

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getIDEmployee() {
        return IDEmployee;
    }

    public void setIDEmployee(String IDEmployee) {
        this.IDEmployee = IDEmployee;
    }

    public String getIDPosition() {
        return IDPosition;
    }

    public void setIDPosition(String IDPosition) {
        this.IDPosition = IDPosition;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer Gender) {
        this.Gender = Gender;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public List<Permission> getList() {
        return list;
    }

    public void setList(List<Permission> list) {
        this.list = list;
    }
    


}
