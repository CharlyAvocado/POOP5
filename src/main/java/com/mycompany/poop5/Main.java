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
public class Main {
    public static void main(String[] args) {
        Circulo cir=new Circulo();
        System.out.println(cir);
        cir.setRadio(5);
        System.out.println(cir);
        System.out.println("Radio de cir = "+cir.getRadio());
        cir.setRadio((float)7.2);//Formas de escribir un float
        cir.setRadio(9.8f);
        cir.setRadio(-7);
        System.out.println(cir);
        System.out.println("#######Composición1########");
        Persona persona1=new Persona();
        persona1.setNombre("Rogelio");
        persona1.setApellido("Aguas");
        Fecha fNac=new Fecha(6,9,1943);
        persona1.setfNacimiento(fNac);
        System.out.println(persona1);
        
        System.out.println("#######Composición2########");
        Fecha fNac2=new Fecha(6,3,1946);
        Persona persona2=new Persona("David","Gilmour",fNac2);
        System.out.println(persona2);
        
        System.out.println("#######Composición3########");
        Persona persona3=new Persona("Richard","Wright",28,7,1943);
        System.out.println(persona3);
        
        System.out.println("#######Actividad########");
        Persona persona4=new Persona("Syd","Barret",6,1,1946);
        CArro carro1=new CArro("Honda","Accord","plata", 1997,1500,true,persona1,persona2,persona3,persona4);
        System.out.println(carro1);
        carro1.serivicio();
        carro1.irLugar("Ciudad universitaria");
        carro1.venderCarro("Simeon Yetarian");
        carro1.recorridoTiempo(1.5f);
        carro1.posiciones(1);
        carro1.posiciones(2);
        carro1.posiciones(4);
        carro1.posiciones(3);


    }

}
