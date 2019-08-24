/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Modelos.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectofinal.Modelos.Tablas.Empleado;

/**
 *
 * @author Luis Andres
 */
public class EmpleadoDAO {
    
    CRUDClass manejador;
    
    private String idEmpleado = "idEmpleado";
    private String idCargo = "idCargo";
    private String idEdificio = "idEdificio";
    private String nombreUsuario = "nombreUsuario";
    private String passUsuario = "passUsuario";
    private String nombreEmpleado = "nombreEmpleado";
    private String contactoEmpleado = "contactoEmpleado";
    private String fechaContratado = "fechaContratado";
    private String fechaFinContratado = "fechaFinContratado";
    
    public EmpleadoDAO(){
        try{
            manejador = CRUDClass.getInstance();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Empleado> getEmpleadosByLogin(String user, String pass){
        try {
            return getEmpleados("Select * from Empleado where "+nombreUsuario+" = \""+user+"\" and "+passUsuario+" = \""+pass+"\";");
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
    
    public List<Empleado> getEmpleadosByCargo(int id){
        try {
            return getEmpleados("Select * from Empleado where "+idCargo+" = "+id +";");
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
    
    private List<Empleado> getEmpleados(String sql) throws SQLException{
        
        List<Empleado> result = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            
            preparedStatement = manejador.conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(idEmpleado);
                int cargo = resultSet.getInt(idCargo);
                int edificio = resultSet.getInt(idEdificio);
                String user = resultSet.getString(nombreUsuario);
                String pass = resultSet.getString(passUsuario);
                String nom = resultSet.getString(nombreEmpleado);
                String tel = resultSet.getString(contactoEmpleado);
                Date fContr = resultSet.getDate(fechaContratado);
                Date fFContr = resultSet.getDate(fechaFinContratado);

                Empleado obj = new Empleado();
                obj.setIdEmpleado(id);
                obj.setIdCargo(cargo);
                obj.setIdEdificio(edificio);
                obj.setNombreUsuario(user);
                obj.setPassUsuario(pass);
                obj.setNombreEmpleado(nom);
                obj.setContactoEmpleado(tel);
                obj.setFechaContratado(fContr);
                obj.setFechaFinContratado(fFContr);

                result.add(obj);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(resultSet!=null){
                resultSet.close();
            }
            if(preparedStatement!=null){
                preparedStatement.close();
            }   
        }
        
        return result;
        
    }
}
