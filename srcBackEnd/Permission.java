/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author Admin
 */
public class Permission {
    String ID;
    String Name;

    public Permission(String ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }
    
    public Permission(){
       this.ID = null;
       this.Name = null;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
