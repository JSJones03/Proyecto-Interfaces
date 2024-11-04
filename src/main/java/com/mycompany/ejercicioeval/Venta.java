/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioeval;


import java.awt.List;

/**
 *
 * @author alumno
 */
public class Venta {
    private String nombreCliente, localidad,procesador, memoria, discoDuro, monitor;
    private List listaOpciones;
    
    public Venta(String nombre,String localidad,String procesador,String memoria,String discoDuro,String monitor, List opcion){
        this.nombreCliente = nombre;
        this.localidad = localidad;
        this.procesador = procesador;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.listaOpciones = opcion;
    }
    
    String getNombre(){
        return this.nombreCliente;        
    }
    
}
