/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioeval;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Venta implements Serializable{

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

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public List<String> getListaOpciones() {
        return listaOpciones;
    }

    public void setListaOpciones(List<String> listaOpciones) {
        this.listaOpciones = listaOpciones;
    }
    

    @Override
    public String toString() {
        return "Venta:\nNombre=" + this.nombreCliente + "\nlocalidad" + this.localidad + "\n procesador=" + this.procesador + "\n memoria=" + this.memoria + "\n discoDuro=" + this.discoDuro + "\n monitor=" + monitor + "\n listaOpciones=" + listaOpciones.toString();
    }

}
