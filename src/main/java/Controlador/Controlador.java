/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Mapeo.Persona;
import Mapeo.User;
import Modelo.PersonaDAO;
import Modelo.UserDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author xhanzary
 */

@Controller 
public class Controlador {
    
  @Autowired
  PersonaDAO persona_db;
  @Autowired
  UserDAO user_db;
    
    @RequestMapping(value="/")
    public String inicio(){
        return "Mapa";
    }
    
    @RequestMapping("/registro")
    public String registro(){
        return "registro";
    }
    
    /*@RequestMapping(value="/persona", method = RequestMethod.POST)
    public ModelAndView persona(ModelMap model,HttpServletRequest request){
        String cor = request.getParameter("correo");
        String con = request.getParameter("contrasenia");
        model.addAttribute("correo", cor);
        model.addAttribute("password", con);
        return new ModelAndView("persona",model);
    
    }*/
       @RequestMapping(value="/persona", method = RequestMethod.POST)
    public ModelAndView persona(ModelMap model,HttpServletRequest request){
        String email = request.getParameter("correo");
        String password = request.getParameter("contrasenia");
        User user = user_db.getUser(email, password);
        String info = "";
        if (user == null){
            model.addAttribute("info", info+"Tu correo o contraseña son incorrectos");
        }else{
            model.addAttribute("info", info+"La información del usuario es: ");
            model.addAttribute("user", user);
            Persona persona = persona_db.getPersona(user.getPersonaId_user());
            model.addAttribute("persona", persona);
        }
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
        User user = user_db.getUserc(email);
        String info = "";
        if (user != null){
            model.addAttribute("info", info+"Ese correo ya esta registrado");
        }else{
            Persona datosPersona  = new Persona(name, anio + "-" + mes + "-" + dia, carrie);
            System.out.println(datosPersona.getNombre_persona() + datosPersona.getFechaNac_persona() + datosPersona.getCarrera_persona());
            persona_db.guardar(datosPersona);
            System.out.println(datosPersona.getNombre_persona());
            Persona persona = persona_db.getPersonan(datosPersona.getNombre_persona());

            User datosUsuario = new User();
            datosUsuario.setCorreo_user(email);
            datosUsuario.setPassword_user(password);
            datosUsuario.setPersonaId_user(persona.getId_persona());
            user_db.guardar(datosUsuario);
            User usuario = user_db.getUser(datosUsuario.getCorreo_user(), datosUsuario.getPassword_user());
            model.addAttribute("info", info+"Se a registrado a:");
            model.addAttribute("persona", persona);
            model.addAttribute("user", usuario);
        }
        return new ModelAndView("registrado",model);
        
    }
    
    
}


    
