/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Modelos.DAO;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyectofinal.Modelos.Tablas.Empleado;

/**
 *
 * @author Luis Andres
 */
public class EmpleadoDAOTest {
    
    public EmpleadoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEmpleadosByLogin method, of class EmpleadoDAO.
     */
    @Test
    public void testGetEmpleadosByLogin() {
        System.out.println("getEmpleadosByLogin");
        EmpleadoDAO instance = new EmpleadoDAO();
        
        //Primer Caso
        List<Empleado> expResult = new ArrayList<>();
        List<Empleado> result = instance.getEmpleadosByLogin("pruebaTest", "pruebasTest");
        assertEquals(expResult, result);
        
        //Segundo Caso
        expResult = new ArrayList<>();
        Empleado e = new Empleado();
        e.setIdCargo(0);
        e.setIdEdificio(0);
        e.setIdEmpleado(0);
        e.setNombreEmpleado("prueba");
        e.setNombreUsuario("prueba");
        e.setPassUsuario("prueba");
        expResult.add(e);
        result = instance.getEmpleadosByLogin("prueba", "prueba");
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmpleadosByCargo method, of class EmpleadoDAO.
     */
    @Test
    public void testGetEmpleadosByCargo() {
        System.out.println("getEmpleadosByCargo");
        EmpleadoDAO instance = new EmpleadoDAO();
       //Primer Caso
        List<Empleado> expResult = new ArrayList<>();
        List<Empleado> result = instance.getEmpleadosByLogin("pruebaTest", "pruebasTest");
        assertEquals(expResult, result);
        
        //Segundo Caso
        expResult = new ArrayList<>();
        Empleado e = new Empleado();
        e.setIdCargo(0);
        e.setIdEdificio(0);
        e.setIdEmpleado(0);
        e.setNombreEmpleado("prueba");
        e.setNombreUsuario("prueba");
        e.setPassUsuario("prueba");
        expResult.add(e);
        result = instance.getEmpleadosByLogin("prueba", "prueba");
        assertEquals(expResult, result);
    }
    
}
