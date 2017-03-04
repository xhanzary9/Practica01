/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
/**
 *
 * @author xhanzary
 */
@Entity
@Table(name="persona")
public class Persona {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @OneToOne(mappedBy="idpersona")
    private int id_persona;
    
    @Column(name = "nombre")
    private String nombre_persona;
    
    @Column(name = "fechanac")
    private Date fecha_nacimiento;
    
    @Column(name = "carrera")
    private String persona_carrera;
    
    public int getPersonaId() {
        return id_persona;
    }

    public void setId_Persona(int idperson) {
        this.id_persona = idperson;
    } 
    
    public String getPersonaNombre() {
        return nombre_persona;
    }

    public void setNombre_Persona(String name) {
        this.nombre_persona = name;
    }
    
    public Date getFechaNacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha) {
        this.fecha_nacimiento = fecha;
    }
    
    public String getCarrera() {
        return persona_carrera;
    }
    
    public void setId_Persona(String carrera) {
        this.persona_carrera = carrera;
    }
    
}
