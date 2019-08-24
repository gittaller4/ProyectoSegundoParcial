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
import proyectofinal.Modelos.Tablas.Ruta;

/**
 *
 * @author Luis Andres
 */
public class RutaDAO {
    
    CRUDClass manejador;
    
    private String idRuta = "idRuta";
    private String nombreRuta = "nombreRuta";
    private String descripcionRuta = "descripcionRuta";
    
    public RutaDAO(){
        try{
            manejador = CRUDClass.getInstance();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Ruta> getRutaByNombre(String nom){
        try {
            return getRutas("Select * from Ruta where "+nombreRuta+" = \""+nom+"\""+"\";");
        } catch (SQLException ex) {
            Logger.getLogger(RutaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }return new ArrayList<>();
    }
    
    public List<Ruta> getRutasAll(){
        try {
            return getRutas("Select * from Ruta;");
        } catch (SQLException ex) {
            Logger.getLogger(RutaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }return new ArrayList<>();
    }
    
    private List<Ruta> getRutas(String sql) throws SQLException{
        
        List<Ruta> result = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            
            preparedStatement = manejador.conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int ruta =resultSet.getInt(this.idRuta);
                String nom = resultSet.getString(nombreRuta);
                String desc = resultSet.getString(descripcionRuta);

                Ruta obj = new Ruta();
                obj.setIdRuta(ruta);
                obj.setNombreRuta(nom);
                obj.setDescripcionRuta(desc);

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
