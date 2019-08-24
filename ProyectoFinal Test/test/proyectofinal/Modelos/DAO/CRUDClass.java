/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Modelos.DAO;

import proyectofinal.Modelos.DAO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis Andres
 */
public class CRUDClass {
    
    private static CRUDClass instance = null;
    public static Connection conn = null;
    
    private CRUDClass(){
        System.out.println("Intentando crear conexion con base de datos");

        /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:33030/dbproyecto", "root", "secret");
            System.out.println("Conexion creada con exito");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Fallo en la conexion.");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static CRUDClass getInstance() throws Exception{
        if(instance==null){
            instance = new CRUDClass();
            for(int i=0;i<3;i++){
                if(conn!=null){
                    return instance;
                }
                instance = new CRUDClass();
            }
            System.out.println("Intentos vencidos para conexion con base de datos.");
            throw new Exception("Conexion no realizada. Saliendo de aplicacion.");
        }
        return instance;
    }
}
