/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej29_pasoinformacionej2_mvc.controller;

import com.mycompany.ej29_pasoinformacionej2_mvc.model.Cliente;
import com.mycompany.ej29_pasoinformacionej2_mvc.model.GestionClientes;
import com.mycompany.ej29_pasoinformacionej2_mvc.view.FormularioAlta;
import com.mycompany.ej29_pasoinformacionej2_mvc.view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Intermediario entre el Modelo y las Vistas.
 * REGLA MVC: Contiene el flujo de la aplicación. Escucha los eventos de las vistas,
 * pide operaciones al Modelo y ordena actualizar las pantallas.
 */
public class ClienteController {
    
    private final GestionClientes modelo;
    private final VentanaPrincipal vistaPrincipal;

    public ClienteController(GestionClientes modelo, VentanaPrincipal vistaPrincipal) {
        this.modelo = modelo;
        this.vistaPrincipal = vistaPrincipal;

        // Conectar el botón "Añadir cliente" de la ventana princiapl
        this.vistaPrincipal.addAniadirClienteListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioAlta();
            }
        });

        // Conectar el botón "Salir" de la ventana principal
        this.vistaPrincipal.addSalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaPrincipal.dispose();       // Cierre limpio con liberación de recursos
            }
        });
    }

    private void abrirFormularioAlta() {
        // Crear el diálogo modal pasandole la ventana principal como padre
        final FormularioAlta dialogo = new FormularioAlta(vistaPrincipal, true);

        // Conectar el botón "Confirmar alta" de la venta formulario antes de mostarlo
        dialogo.addConfirmarAltaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {        // Recoger los datos y crear el DTO
                Cliente nuevo = new Cliente(
                    dialogo.getNombre(),
                    dialogo.getApellidos(),
                    dialogo.getFechaAlta(),
                    dialogo.getProvincia()
                );
                modelo.aniadirCliente(nuevo);       // Guardar el nuevo registro en el modelo
                dialogo.dispose();                  // Cerrar el dialogo de forma limpia
                vistaPrincipal.refrescarTabla(modelo.getListaClientes());   // Pedir los datos actualizados al modelo y refrescar la vista
            }
        });

        dialogo.setVisible(true);       // Mostrar el dialogo (bloquea el flijo hasta que se cierre)
    }
    
}
