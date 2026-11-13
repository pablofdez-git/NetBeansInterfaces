/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej29_pasoinformacionej2_mvc.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Gestiona la lógica y almacenamiento de los datos de la aplicación.
 * REGLA MVC: No usa 'static' para evitar estados globales rígidos. 
 * Se instanciará como un objeto normal y se pasará al Controlador.
 */
public class GestionClientes {
    
    // La lista es privada para poder ser modificada unicamente por los métodos de la própia clase
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    // Constructor
    public GestionClientes() {
        this.listaClientes = new ArrayList<>();
    }
    
    // Único punto de entrada permitido para añadir nuevos clientes
    public void aniadirCliente(Cliente c){
        listaClientes.add(c);
    }
    
    // Devolvemer una lista de solo lectura (unmodifiableList).
    // Si la Vista o el Controlador intentan hacer .add() o .clear(), saltará un error,
    // garantizando que nadie modifique los datos saltándose las reglas del Modelo.
    public List<Cliente> getListaClientes(){
        return Collections.unmodifiableList(listaClientes);
    }
    
}
