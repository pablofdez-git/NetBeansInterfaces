/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import com.mycompany.ej29_pasoinformacionej2_mvc.controller.ClienteController;
import com.mycompany.ej29_pasoinformacionej2_mvc.model.GestionClientes;
import com.mycompany.ej29_pasoinformacionej2_mvc.view.VentanaPrincipal;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author AidaRdgz
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Restaurar el Look & Feel "Nimbus" que configuraba NetBeans por defecto
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        // Para usar un tema de FlatLaf no hace falta try-catch
        // El método .setup() de FlatLaf gestiona internamente UIManager.setLookAndFeel(...) 
        //      y captura posibles excepciones, sustituyendo por completo el bloque que generaba NetBeans
        // FlatLightLaf.setup();
        
        
        // SwingUtilities.invokeLater asegura que la interfaz gráfica se cree
        // en el hilo correcto de eventos de Swing (Event Dispatch Thread - EDT).
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear el Modelo (datos)
                GestionClientes modelo = new GestionClientes();
                
                // Crear la Vista principal (interfaz)
                VentanaPrincipal vista = new VentanaPrincipal();
                
                // Crear el Controlador y le entregamos Modelo y Vista para que los conecte
                new ClienteController(modelo, vista);
                
                // Hacer visible la aplicación
                vista.setVisible(true);
            }
        });
    }
    
}
