/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import proyectofinal.Constantes;
import proyectofinal.Controladores.JefeBodegaController;

/**
 *
 * @author Luis Andres
 */
public class JefeBodegaView {

    private static Scene escena;
    private BorderPane panelP;
    private VBox vBox;
    
    private ListView<String> listView;
    private Label bienvenida;
    private Button rutas;
    
    public JefeBodegaView(){
        inicializarComponentes();
        configurarComponentes();
    }
    
    private void inicializarComponentes(){
        
        panelP = new BorderPane();
        vBox = new VBox();
        
        listView = new ListView<>();
        bienvenida = new Label();
        rutas = new Button();
        
        
    }
    
    private void configurarComponentes(){
        
        bienvenida.setText("Bienvenido");
        rutas.setText("Rutas");
        rutas.setOnAction(JefeBodegaController.ev);
        listView.setItems(JefeBodegaController.repartidores);
        listView.getSelectionModel().selectedItemProperty().addListener(JefeBodegaController.changeListener);

        panelP.setTop(bienvenida);
        vBox.getChildren().addAll(rutas,listView);
        vBox.setSpacing(10);
        panelP.setCenter(vBox);
        
        escena = new Scene(panelP,Constantes.ANCHO,Constantes.ALTO);
    }
    
    public static Scene getEscena(){
        return escena;
    }
    
}
