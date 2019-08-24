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
import proyectofinal.Modelos.Tablas.Venta;

/**
 *
 * @author Luis Andres
 */
public class VentasDAO{
    
    CRUDClass manejador;
    
    private String idVenta = "idVenta";
    private String idEmpleado = "idEmpleado";
    private String idCliente = "idCliente";
    private String idFormaPago = "idFormaPago";
    private String idEdificio = "idEdificio";
    private String fechaVenta = "fechaVenta";
    private String fechaFactElectronica = "fechaFactElectronica";
    
    public VentasDAO(){
        try{
            manejador = CRUDClass.getInstance();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void getVentas() throws SQLException{
        
        List<Venta> result = new ArrayList<>();
        String SQL_SELECT = "Select * from Venta";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            
            preparedStatement = manejador.conn.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(idVenta);
                int empl = resultSet.getInt(idEmpleado);
                int cli = resultSet.getInt(idCliente);
                int pago = resultSet.getInt(idFormaPago);
                int edificio = resultSet.getInt(idEdificio);
                Date fVenta = resultSet.getDate(fechaVenta);
                Date fElectro = resultSet.getDate(fechaFactElectronica);

                Venta obj = new Venta();
                obj.setIdVenta(id);
                obj.setIdEmpleado(empl);
                obj.setIdCliente(cli);
                obj.setIdFormaPago(pago);
                obj.setIdEdificio(edificio);
                obj.setFechaVenta(fVenta);
                obj.setFechaFactElectronica(fElectro);

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
        
    }
    
    
}
