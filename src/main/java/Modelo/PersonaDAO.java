/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Mapeo.Persona;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author xhanzary
 */
public class PersonaDAO {
    //Atributo para una nueva sesion 
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    /**
     * Guarda a una persona de la base de datos.
     * @param p 
     */
    public void guardar(Persona p) {
    
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        System.out.println("hola");
        try {
           System.out.println("entra1");
           tx = session.beginTransaction();
           System.out.println("entra2");
           session.persist(p);
           System.out.println("entra3");
           //
           tx.commit();
        }
        catch (Exception e) {
            System.out.println("valio");
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
    
    }
    
    /**
     * Actualiza a una persona de la base de datos.
     * @param p
     */
    public void actualizar(Persona p) {
    
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.update(p);
           
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
    
    }
    
    
    /**
     * Elimina a una persona de la base de datos.
     * @param p
     */
    public void eliminar(Persona p) {
    
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.delete(p);
           
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
    
    }
    
    public Persona getPersonan(String nombre) {
        Persona p = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
            String hql = " from Persona where nombre = :nombre";
            Query query = session.createQuery(hql);
            query.setParameter("nombre", nombre);
            p = (Persona)query.uniqueResult();
            tx.commit();
           
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return p;
    }
    
    public Persona getPersona(int id) {
        Persona p = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
            String hql = " from Persona where idpersona = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            p = (Persona)query.uniqueResult();
            tx.commit();
           
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return p;
    }
}
