/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop5;

/**
 *
 * @author Hyperion
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

    public Persona(String nombre, String apellido,int dia, int mes,int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        //Opción 1 (Gasto de memoria
        /*)
        Fecha fesha=new Fecha(dia,mes,año);
        this.fNacimiento=fesha;
        
        //Opción 2
        fNacimiento=new Fecha();
        fNacimiento.setDia(dia);
        fNacimiento.setMes(mes);
        fNacimiento.setAño(año);
        */
        //Opción 3 (recomendada)
        fNacimiento=new Fecha(dia,mes,año); 

    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
}
