/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

/**
 *
 * @author xhanzary
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="user")
public class User {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int id_user;
    
    @Column(name = "correo")
    private String correo_user;
    
    @Column(name = "password")
    private String password_user;
    
    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona_user;

    public int getUserId() {
        return id_user;
    }

    public void setId_User(int iduser) {
        this.id_user = iduser;
    } 
    
    public String getUserCorreo() {
        return correo_user;
    }

    public void setCorreo_User(String correo) {
        this.correo_user = correo;
    }
    
    public String getUserPassword() {
        return password_user;
    }

    public void setPass_User(String pass) {
        this.password_user = pass;
    }
    
    public Persona getIdPersona() {
        return persona_user;
    }
    
    public void setId_Persona(Persona persona) {
        this.persona_user = persona;
    }
}
   