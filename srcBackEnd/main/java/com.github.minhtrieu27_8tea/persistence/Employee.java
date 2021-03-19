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
        return this;
    }

    public String getIDEmployee() {
        return IDEmployee;
    }

    public void setIDEmployee(String IDEmployee) {
        this.IDEmployee = IDEmployee;
        return this;
    }

    public String getIDPosition() {
        return IDPosition;
    }

    public void setIDPosition(String IDPosition) {
        this.IDPosition = IDPosition;
        return this;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
        return this;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer Gender) {
        this.Gender = Gender;
        return this;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
        return this;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
        return this;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
        return this;
    }

    public List<Permission> getList() {
        return list;
    }

    public void setList(List<Permission> list) {
        this.list = list;
        return this;
    }
    


}
