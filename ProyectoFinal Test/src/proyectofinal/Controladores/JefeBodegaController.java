/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Controladores;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import proyectofinal.Constantes;
import proyectofinal.Modelos.DAO.EmpleadoDAO;
import proyectofinal.Modelos.DAO.RutaDAO;
import proyectofinal.Modelos.Repartidor;
import proyectofinal.Vistas.JefeBodegaRutaView;
import proyectofinal.Vistas.JefeBodegaView;

/**
 *
 * @author Luis Andres
 */
public class JefeBodegaController {
    
    private JefeBodegaView jefeBodegaView;
    private static JefeBodegaRutaView rutaView;
    
    public JefeBodegaController(){
        jefeBodegaView = new JefeBodegaView();
        rutaView = new JefeBodegaRutaView();
        
        EmpleadoDAO datos = new EmpleadoDAO();
        datos.getEmpleadosByCargo(5).stream().map((e) -> {
            Repartidor r = new Repartidor();
            r.setEmp(e);
            return r;
        }).map((r) -> {
            r.setStatus(true);
            return r;
        }).forEachOrdered((r) -> {
            Constantes.REPARTIDOR.add(r);
        });
        
        inicializarLista();
        Constantes.ESCENARIO.setTitle("Jefe de Bodega");
        Constantes.ESCENARIO.setScene(jefeBodegaView.getEscena());
        Constantes.ESCENARIO.show();
    }
    
    public static ObservableList<String> repartidores = FXCollections.observableArrayList();
    public static ChangeListener changeListener = (ChangeListener<String>) (ObservableValue<? extends String> ov, String old_val, String new_val) -> {
        System.out.println("Diste click en algun item");
    };
    
    public static ObservableList<String> rutas = FXCollections.observableArrayList();
    public static ChangeListener changeListenerRutas = (ChangeListener<String>) (ObservableValue<? extends String> ov, String old_val, String new_val) -> {
        System.out.println("Hubo un cambio en rutas");
    };
    
    public static final EventHandler<ActionEvent> ev = (ActionEvent event) -> {
        System.out.println("Entrando a Rutas por Jefe de Bodega");
        Constantes.ESCENARIO.setTitle("Rutas - Jefe de Bodega");
        Constantes.ESCENARIO.setScene(rutaView.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> agregarRuta = (ActionEvent event) -> {
        String p1 = JefeBodegaRutaView.nombreRuta.getText();
        String p2 = JefeBodegaRutaView.descripcionRuta.getText();
        if(!(p1.isEmpty() || p2.isEmpty())){
            rutas.add("Nombre: "+p1+". Descripcion: "+p2);
        }
        
        //Insertar en BD
    };

    private void inicializarLista() {
        //LLenar con la lista de Empleados de la clase Repartidores
        Constantes.REPARTIDOR.forEach((r) -> {
            if(r.isStatus()){
                repartidores.add(r.getEmp().getNombreEmpleado());
            }
        });
        
        RutaDAO datos = new RutaDAO();
        datos.getRutasAll().forEach((r) -> {
            rutas.add("Nombre: "+r.getNombreRuta()+". Descripcion: "+r.getDescripcionRuta());
        });
    }
    
    
}
