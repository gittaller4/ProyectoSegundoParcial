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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectofinal.Modelos.Tablas.Cliente;

/**
 *
 * @author Luis Andres
 */
public class ClienteDAO {
    
    CRUDClass manejador;
    
    private String idCliente = "idCliente";
    private String nombreCliente = "nombreCliente";
    private String cedula = "cedula";
    private String email = "email";
    private String telefono = "telefono";
    private String celular = "celular";
    
    public ClienteDAO(){
        try{
            manejador = CRUDClass.getInstance();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Cliente> getClientesByNombre(String nom){
        try {
            return getClientes("Select * from Cargo where "+nombreCliente+" = "+nom+";");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
    
    public List<Cliente> getClientesAll(){
        try {
            return getClientes("Select * from Cargo;");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
    
    private List<Cliente> getClientes(String sql) throws SQLException{
        
        List<Cliente> result = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            
            preparedStatement = manejador.conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(idCliente);
                String nombr = resultSet.getString(nombreCliente);
                String cedula = resultSet.getString(this.cedula);
                String email = resultSet.getString(this.email);
                String telef = resultSet.getString(telefono);
                String celu = resultSet.getString(celular);

                Cliente obj = new Cliente();
                obj.setIdCliente(id);
                obj.setNombreCliente(nombr);
                obj.setCedula(cedula);
                obj.setEmail(email);
                obj.setTelefono(telef);
                obj.setCelular(celu);

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
