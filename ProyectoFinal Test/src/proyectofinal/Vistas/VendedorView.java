/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import proyectofinal.Constantes;
import proyectofinal.Controladores.VendedorController;

/**
 *
 * @author Luis Andres
 */
public class VendedorView {
    
    private static Scene escena;
    private BorderPane panelP;
    private FlowPane panelCentral;
    
    private Label bienvenida;
    private Button op1;
    private Button op2;
    private Button op3;
    private Button op4;
    private Button op5;
    private Button op6;
    private Button op7;
    
    public VendedorView(){
        inicializarComponentes();
        configurarComponentes();
    }
    
    private void inicializarComponentes(){
        
        panelP = new BorderPane();
        panelCentral = new FlowPane();
        
        bienvenida = new Label();
        op1 = new Button();
        op2 = new Button();
        op3 = new Button();
        op4 = new Button();
        op5 = new Button();
        op6 = new Button();
        op7 = new Button();
        
    }
    
    private void configurarComponentes(){
        
        bienvenida.setText("Bienvenido");
        op1.setText("Ventas");
        op2.setText("Nota Credito");
        op3.setText("Cotizaciones");
        op4.setText("Clientes");
        op5.setText("Entregas");
        op6.setText("Productos");
        op7.setText("Salir");
        
        op1.setOnAction(VendedorController.ev);
        op2.setOnAction(VendedorController.ev2);
        op3.setOnAction(VendedorController.ev3);
        op4.setOnAction(VendedorController.ev4);
        op5.setOnAction(VendedorController.ev5);
        op6.setOnAction(VendedorController.ev6);
        op7.setOnAction(VendedorController.ev7);
        
        panelCentral.getChildren().addAll(op1,op2,op3,op4,op5,op6,op7);
        
        panelP.setTop(bienvenida);
        panelP.setCenter(panelCentral);
        
        escena = new Scene(panelP,Constantes.ANCHO,Constantes.ALTO);
    }
    
    public static Scene getEscena(){
        return escena;
    }
}
