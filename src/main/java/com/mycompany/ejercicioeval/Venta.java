/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioeval;


import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Venta {
    String nombreCliente, localidad,procesador, memoria, discoDuro, monitor;
   // List<String> listaOpciones;
    
    public Venta(String nombre,String localidad,String procesador,String memoria,String discoDuro,String monitor, ArrayList<String> opcion){
        this.nombreCliente = nombre;
        this.localidad = localidad;
        this.procesador = procesador;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
       // listaOpciones = opcion;
    }
    
    String getNombre(){
        return this.nombreCliente;        
    }
    
}
