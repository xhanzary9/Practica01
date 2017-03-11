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
@Table(name = "persona")
public class Persona {
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private int  id_persona;
    
    @Column(name = "nombre")
    private String nombre_persona;
    
    @Column(name = "fechanac")
    private String fechaNac_persona;
    
    @Column(name = "carrera")
    private String carrera_persona;
    
    public Persona(){}
    
    public Persona(String nombre, String fechanac, String carrera){
        this.nombre_persona = nombre;
        this.fechaNac_persona = fechanac;
        this.carrera_persona = carrera;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getFechaNac_persona() {
        return fechaNac_persona;
    }

    public void setFechaNac_persona(String fechaNac_persona) {
        this.fechaNac_persona = fechaNac_persona;
    }

    public String getCarrera_persona() {
        return carrera_persona;
    }

    public void setCarrera_persona(String carrera_persona) {
        this.carrera_persona = carrera_persona;
    }
    
    
}
