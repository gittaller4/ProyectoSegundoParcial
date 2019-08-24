/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import proyectofinal.Constantes;
import proyectofinal.Vistas.ProductoView;
import proyectofinal.Vistas.VendedorClientesView;
import proyectofinal.Vistas.VendedorCotizacionesView;
import proyectofinal.Vistas.VendedorEntregasView;
import proyectofinal.Vistas.VendedorNCreditoView;
import proyectofinal.Vistas.VendedorVentasView;
import proyectofinal.Vistas.VendedorView;

/**
 *
 * @author Luis Andres
 */
public class VendedorController {
    
    private VendedorView vendedorView;
    private static VendedorVentasView ventas;
    private static VendedorNCreditoView nCredito = new VendedorNCreditoView();
    private static VendedorCotizacionesView cotizaciones = new VendedorCotizacionesView();
    private static VendedorClientesView clientes = new VendedorClientesView();
    private static VendedorEntregasView entregas = new VendedorEntregasView();
    private static ProductoView productos = new ProductoView();
    public VendedorController(){
        vendedorView = new VendedorView();
        ventas = new VendedorVentasView();
        nCredito = new VendedorNCreditoView();
        cotizaciones = new VendedorCotizacionesView();
        clientes = new VendedorClientesView();
        entregas = new VendedorEntregasView();
        productos = new ProductoView();
        
        Constantes.ESCENARIO.setTitle("Vendedor");
        Constantes.ESCENARIO.setScene(vendedorView.getEscena());
        Constantes.ESCENARIO.show();
    }
    
    public static final EventHandler<ActionEvent> ev = (ActionEvent event) -> {
        System.out.println("Entrando a ventas por Vendedor");
        Constantes.ESCENARIO.setTitle("Vendedor - Ventas");
        Constantes.ESCENARIO.setScene(ventas.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev2 = (ActionEvent event) -> {
        System.out.println("Entrando a Nota Credito por Vendedor");
        Constantes.ESCENARIO.setTitle("Vendedor - Notas De Credito");
        Constantes.ESCENARIO.setScene(nCredito.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev3 = (ActionEvent event) -> {
        System.out.println("Entrando a Cotizaciones por Vendedor");
        Constantes.ESCENARIO.setTitle("Vendedor - Cotizaciones");
        Constantes.ESCENARIO.setScene(cotizaciones.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev4 = (ActionEvent event) -> {
        System.out.println("Entrando a Clientes por Vendedor");
        Constantes.ESCENARIO.setTitle("Vendedor - Clientes");
        Constantes.ESCENARIO.setScene(clientes.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev5 = (ActionEvent event) -> {
        System.out.println("Entrando a Entregas por Vendedor");
        Constantes.ESCENARIO.setTitle("Vendedor - Entregas");
        Constantes.ESCENARIO.setScene(entregas.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev6 = (ActionEvent event) -> {
        System.out.println("Entrando a Productos por Vendedor");
        Constantes.ESCENARIO.setTitle("Vendedor - Productos");
        Constantes.ESCENARIO.setScene(productos.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev7 = (ActionEvent event) -> {
        System.out.println("Saliendo de Vendedor");
        new LoginController();
    };
}
