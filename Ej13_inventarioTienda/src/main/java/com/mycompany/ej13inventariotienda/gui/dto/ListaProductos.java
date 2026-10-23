/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej13inventariotienda.gui.dto;

/**
 *
 * @author Alumno
 */
public class ListaProductos {
    
    private String nombre;
    private int cantidad;
    private Double precio;

    public ListaProductos(String nombre, int cantidad, Double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String[] toArrayString(){
        String[] filaTabla = new String[4];
        filaTabla[0] = nombre;
        filaTabla[1] = Integer.toString(cantidad);
        filaTabla[2] = Double.toString(precio);
        return filaTabla;
    }   
}
