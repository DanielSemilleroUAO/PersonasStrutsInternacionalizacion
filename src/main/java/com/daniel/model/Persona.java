/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.model;

/**
 *
 * @author adseglocdom
 */
public class Persona {
    
    private String nombre;
    private Domicilio domicilio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", domicilio=" + domicilio + '}';
    }
    
    
    
    
}
