/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Modelos.Tablas;

import java.util.Date;

/**
 *
 * @author Luis Andres
 */
public class Log {
    
    private int idLog;
    private String descripcionLog;
    private Date fechaLog;

    public Log(int idLog, String descripcionLog, Date fechaLog) {
        this.idLog = idLog;
        this.descripcionLog = descripcionLog;
        this.fechaLog = fechaLog;
    }

    public int getIdLog() {
        return idLog;
    }

    public void setIdLog(int idLog) {
        this.idLog = idLog;
    }

    public String getDescripcionLog() {
        return descripcionLog;
    }

    public void setDescripcionLog(String descripcionLog) {
        this.descripcionLog = descripcionLog;
    }

    public Date getFechaLog() {
        return fechaLog;
    }

    public void setFechaLog(Date fechaLog) {
        this.fechaLog = fechaLog;
    }
    
    
}
