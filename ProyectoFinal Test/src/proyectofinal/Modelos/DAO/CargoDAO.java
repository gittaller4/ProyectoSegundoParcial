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
import proyectofinal.Modelos.Tablas.Cargo;

/**
 *
 * @author Luis Andres
 */
public class CargoDAO {
    
    CRUDClass manejador;
    Logger logger;
    
    private String idCargo = "idCargo";
    private String idEdificio = "idEdificio";
    private String nombreCargo = "nombreCargo";
    
    public CargoDAO(){
        try{
            manejador = CRUDClass.getInstance();
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage());
        }
    }
    
    public List<Cargo> getCargosById(int id){
        try {
            return getCargos("Select * from Cargo where "+idCargo+" = "+id+";");
        } catch (SQLException ex) {
            Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
    
    private List<Cargo> getCargos(String sql) throws SQLException{
        
        List<Cargo> result = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            
            preparedStatement = manejador.conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(idCargo);
                int edificio = resultSet.getInt(idEdificio);
                String cargo = resultSet.getString(nombreCargo);

                Cargo obj = new Cargo();
                obj.setIdCargo(id);
                obj.setIdEdificio(edificio);
                obj.setNombreCargo(cargo);

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
