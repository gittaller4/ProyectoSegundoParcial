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
import proyectofinal.Constantes;
import proyectofinal.Controladores.GerenteController;
import proyectofinal.Controladores.VendedorController;

/**
 *
 * @author Luis Andres
 */
public class GerenteView {
    
    private static Scene escena;
    private BorderPane panelP;
    private FlowPane panelCentral;
    
    private Label bienvenida;
    private Button op1;
    private Button op2;
    private Button op3;
    private Button op4;
    private Button op5;
    
    public GerenteView(){
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
        
        
    }
    
    private void configurarComponentes(){
        
        bienvenida.setText("Bienvenido");
        op1.setText("Usuarios");
        op2.setText("Envios");
        op3.setText("Productos");
        op4.setText("Ventas");
        op5.setText("Permisos");
        
        op1.setOnAction(GerenteController.ev);
        op2.setOnAction(GerenteController.ev);
        op3.setOnAction(GerenteController.ev2);
        op4.setOnAction(GerenteController.ev);
        op5.setOnAction(GerenteController.ev3);
        
        panelCentral.getChildren().addAll(op1,op2,op3,op4,op5);
        
        panelP.setTop(bienvenida);
        panelP.setCenter(panelCentral);
        
        escena = new Scene(panelP,Constantes.ANCHO,Constantes.ALTO);
    }
    
    public static Scene getEscena(){
        return escena;
    }
}
