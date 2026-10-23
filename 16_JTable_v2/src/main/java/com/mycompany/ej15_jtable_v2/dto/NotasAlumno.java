/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej15_jtable_v2.dto;

/**
 *
 * @author AidaRdgz
 */
public class NotasAlumno {
    
    private double nota1trim;
    private double nota2trim;
    private double nota3trim;
    private double notaMedia;       // Este atributo no seria necesario, es mejor recalcularlo en base a los otros tres

    public NotasAlumno(double nota1trim, double nota2trim, double nota3trim, double notaMedia) {
        this.nota1trim = nota1trim;
        this.nota2trim = nota2trim;
        this.nota3trim = nota3trim;
        this.notaMedia = notaMedia;
    }

    public double getNota1trim() {
        return nota1trim;
    }

    public void setNota1trim(double nota1trim) {
        this.nota1trim = nota1trim;
    }

    public double getNota2trim() {
        return nota2trim;
    }

    public void setNota2trim(double nota2trim) {
        this.nota2trim = nota2trim;
    }

    public double getNota3trim() {
        return nota3trim;
    }

    public void setNota3trim(double nota3trim) {
        this.nota3trim = nota3trim;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // Convierte los datos del objeto en un array de 4 String
    // Los valores pueden ser todos String porque solo es la representación de estos para mostrarlos
    // La lectura de datos se hace desde la lista de objetos, nunca desde la vista
    public String[] toArrayString(){
        String[] filaTabla = new String[4];
        filaTabla[0] = String.format("%.2f", nota1trim);        // formateo para que se muestre con dos decimales y con el separador decimal de la configuración regional
        filaTabla[1] = String.format("%.2f", nota2trim);
        filaTabla[2] = String.format("%.2f", nota3trim);
        filaTabla[3] = String.format("%.2f", notaMedia);
        
        return filaTabla;
    }
    
}
