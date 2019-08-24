/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Vistas;

import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import proyectofinal.Constantes;
import proyectofinal.Controladores.GerenteController;

/**
 *
 * @author Luis Andres
 */
public class GerenteTodoView {
    
    private Scene escena;
    
    private VBox panel;
    private ListView listView;
    
    public GerenteTodoView(){
        inicializar();
        configurar();
    }
    
    private void inicializar(){
        panel = new VBox();
        listView =  new ListView();
    }
    
    private void configurar(){
        //listView.setItems(GerenteController.);
        listView.getSelectionModel().selectedItemProperty().addListener(GerenteController.changeListener);
        
        panel.getChildren().addAll(listView);

        escena = new Scene(panel,Constantes.ANCHO,Constantes.ALTO);
    }

    public Scene getEscena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
