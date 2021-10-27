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

public class CArro {
     //Atributos
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private int kilometraje;
    private boolean transmision; //Estándar=true, automático=false
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;

    public CArro() {
    }

    public CArro(String marca, String modelo, String color, int año, int kilometraje, boolean transmision, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.kilometraje = kilometraje;
        this.transmision = transmision;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

   

    
    public void irLugar(String lugar){
        System.out.println("Estoy yendo a "+lugar);
    }
    public void venderCarro(String comprador){
        System.out.println("Vendí mi coche a "+comprador);
    }
    public void gasolina(int porcentaje){
        System.out.println("Tengo "+porcentaje+"%gasolina");
    }
    public void serivicio(){
        if (kilometraje>5000) {
            System.out.println("El carro necesita servicio");
        }else{
            System.out.println("El carro no necesita servicio");
        }
    }
    public void recorridoTiempo(float tiempoHoras){
        System.out.println("El tiempo del recorrido es: "+tiempoHoras+" horas");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isTransmision() {
        return transmision;
    }

    public void setTransmision(boolean transmision) {
        this.transmision = transmision;
    }

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    public void posiciones(int lugar){
        switch(lugar){
            case 1: 
                System.out.println("El chofer es: "+chofer);
                break;
            case 2:
                System.out.println("El copiloto es: "+copiloto);
                break;
            case 3:
                System.out.println("El psajero 1 es: "+pasajero1);
                break;
            case 4:
                System.out.println("El pasajero 2 es: "+pasajero2);
                break;
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", a\u00f1o=" + año + ", kilometraje=" + kilometraje + ", transmision=" + transmision + '}';
    }
    
    
    
}
