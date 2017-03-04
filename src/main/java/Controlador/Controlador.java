/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Mapeo.Persona;
import Modelo.PersonaDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonathan
 */

@Controller 
public class Controlador {
    
  @Autowired
  PersonaDAO persona_db;
    
    @RequestMapping(value="/")
    public String inicio(){
        return "inicio";
    }
    
    @RequestMapping("/registro")
    public String registro(){
        return "registro";
    }
    
@RequestMapping(value="/persona", method = RequestMethod.POST)
    public ModelAndView persona(ModelMap model,HttpServletRequest request){
        String cor = request.getParameter("correo");
        String con = request.getParameter("contrasenia");
        model.addAttribute("correo", cor);
        model.addAttribute("password", con);
        return new ModelAndView("persona",model);
    
    }

@RequestMapping(value="/registrar", method = RequestMethod.GET)
    public ModelAndView registrado(ModelMap model,HttpServletRequest request){
        String name = request.getParameter("nombre");
        String carrie = request.getParameter("carrera");
        String dia = request.getParameter("dia");
        String mes = request.getParameter("mes");
        String anio = request.getParameter("anio");
        String email = request.getParameter("correo");
        String password = request.getParameter("contrasenia");
       // persona_db.guardar(name, carrie, dia); 
        model.addAttribute("nombre", name);
        model.addAttribute("carrera", carrie);
        model.addAttribute("dia", dia);
        model.addAttribute("mes", mes);
        model.addAttribute("anio", anio);
        model.addAttribute("correo", email);
        model.addAttribute("contrasenia", password);
        return new ModelAndView("registrado",model);
        
    }
    
    
}
