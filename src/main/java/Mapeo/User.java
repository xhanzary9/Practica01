/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author xhanzary
 */
@Entity
@Table(name = "user")
public class User {
    public User(){}
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int id_user;
    
    @Column(name = "correo")
    private String correo_user;
    
    @Column(name = "password")
    private String password_user;
    
    @Column(name = "persona_id")
    private int personaId_user;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getCorreo_user() {
        return correo_user;
    }

    public void setCorreo_user(String correo_user) {
        this.correo_user = correo_user;
    }

    public String getPassword_user() {
        return password_user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

    public int getPersonaId_user() {
        return personaId_user;
    }

    public void setPersonaId_user(int personaId_user) {
        this.personaId_user = personaId_user;
    }

   
    
}
