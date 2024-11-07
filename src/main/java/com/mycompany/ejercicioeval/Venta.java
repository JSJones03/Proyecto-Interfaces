/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioeval;

import java.util.List;

/**
 *
 * @author alumno
 */
public class Venta {

    private String nombreCliente = null, localidad = null, procesador = null, memoria = null, discoDuro = null, monitor = null;
    private List<String> listaOpciones = null;
    
    public Venta(){
    };

    public Venta(String nombre, String localidad, String procesador, String memoria, String discoDuro, String monitor, List opcion) {
        this.nombreCliente = nombre;
        this.localidad = localidad;
        this.procesador = procesador;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.monitor = monitor;
        this.listaOpciones = opcion;
    }

    String getNombre() {
        return this.nombreCliente;
    }

    @Override
    public String toString() {
        return "Venta:\n localidad=" + this.localidad + "\n procesador=" + this.procesador + "\n memoria=" + this.memoria + "\n discoDuro=" + this.discoDuro + "\n monitor=" + monitor + "\n listaOpciones=" + listaOpciones.toString();
    }

}
