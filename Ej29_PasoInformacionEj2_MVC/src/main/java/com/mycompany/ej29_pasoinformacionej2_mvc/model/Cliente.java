/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej29_pasoinformacionej2_mvc.model;

import java.util.Date;

/**
 * POJO (Plain Old Java Object) que representa la entidad Cliente.
 * REGLA MVC: Solo contiene datos, getters y setters. No sabe nada sobre
 * tablas, ventanas ni formatos visuales (como SimpleDateFormat).
 */
public class Cliente {
    
    private String nombre;
    private String apellidos;
    private Date fechaAlta;         // El spinner trabaja con Date, no con LocalDate
    private String provincia;

    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaAlta=" + fechaAlta + ", provincia=" + provincia + '}';
    }
    
}
