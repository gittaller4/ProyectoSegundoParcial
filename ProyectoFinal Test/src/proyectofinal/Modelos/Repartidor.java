/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Modelos;

import proyectofinal.Modelos.Tablas.Empleado;

/**
 *
 * @author Luis Andres
 */
public class Repartidor {
    
    private Empleado emp;
    private boolean status;
    
    public Repartidor(){
        emp = new Empleado();
        status = true;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
