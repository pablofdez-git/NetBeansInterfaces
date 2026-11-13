/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej29_pasoinformacionej2.model;

import com.mycompany.ej29_pasoinformacionej2.dto.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class GestionClientes {
    
    // La lista es privada para poder ser modificada unicamente por los métodos de la própia clase
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    //Método que permite añadir unn nuevo cliente al arrayLsit
    public static void aniadirCliente(Cliente c){
        listaClientes.add(c);
    } 
    
    //Método que devuelve el arrayList que contiene a los clientes
    public static ArrayList<Cliente> getListaClientes(){
        return listaClientes;
    }
    
}
