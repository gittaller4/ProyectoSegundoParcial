/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import proyectofinal.Constantes;
import proyectofinal.Modelos.DAO.CargoDAO;
import proyectofinal.Modelos.DAO.EmpleadoDAO;
import proyectofinal.Modelos.Tablas.Cargo;
import proyectofinal.Modelos.Tablas.Empleado;
import proyectofinal.Vistas.LoginView;

/**
 *
 * @author Luis Andres
 */
public class LoginController {
    
    private static LoginView loginView;
    
    public LoginController(){
        loginView = new LoginView();
        Constantes.ESCENARIO.setTitle("Login");
        Constantes.ESCENARIO.setScene(devolverVistaLogin());
        Constantes.ESCENARIO.show();
    }
    
    public static EventHandler<ActionEvent> ev = new EventHandler<ActionEvent>() {
         @Override
            public void handle(ActionEvent event) {
                entrarSistema(LoginView.userField.getText(), LoginView.passField.getText());
            }
    };
    
    public Scene devolverVistaLogin(){
        return this.loginView.getEscena();
    }
    
    private static void entrarSistema(String user, String pass){
        //Validar datos desde bd
        System.out.println("Entro al controlador del Login");
        EmpleadoDAO datos = new EmpleadoDAO();
        CargoDAO datos2 = new CargoDAO();
        for(Empleado e: datos.getEmpleadosByLogin(user,pass)){
            for(Cargo c: datos2.getCargosById(e.getIdCargo())){
                switch(c.getNombreCargo()){
                    case "Vendedor":
                        VendedorController v = new VendedorController();
                        break;
                    case "Gerente":
                        GerenteController g = new GerenteController();
                        break;
                    case "Jefe de Bodega":
                        JefeBodegaController j = new JefeBodegaController();
                        break;
                    case "Administrador":
                        AdministradorController a = new AdministradorController();
                        break;
                    default:
                        System.out.println("Cargo no reconocido.");
                        break;
                }
            }
        }
    }
}
