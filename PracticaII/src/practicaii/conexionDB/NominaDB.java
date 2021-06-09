/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaii.conexionDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import practicaii.entity.Nomina;

/**
 *
 * @author manue
 */
public class NominaDB {
    
    public List<Nomina> getNominaAPEC(String periodo){
        List<Nomina> nominas = new ArrayList<Nomina>();
        String consulta = "Select sueldo_bruto, CEDULA from NOMINAAPEC where periodo='" + periodo + "'";
        try {
            Conexion.getConexion();
            ResultSet rs = Conexion.ejecutarConsulta(consulta);
            while(rs.next()){
                Nomina registro = new Nomina();
                registro.setRNC("401005107");
                registro.setTipo_Moneda("DOP");
                registro.setPeriodo(periodo);
                registro.setCedula(rs.getString("CEDULA"));
                registro.setSueldo(rs.getString("SUELDO_BRUTO"));
                
                nominas.add(registro);
            }
            //Conseguir la nomina de base de datos en tabla APEC que tengan el periodo
            //Crear listado de registros de nomina
        } catch (Throwable ex) {
            Logger.getLogger(NominaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nominas;
    }
    
    public void InsertToNominaAPAP(Nomina nomina){
        String insert = "INSERT INTO nominaAPAP (RNC, periodo, sueldo_bruto, cedula, tipo_moneda) values('" +
                        nomina.getRNC() + "','" + nomina.getPeriodo() + "'," + nomina.getSueldo() + ",'" + nomina.getCedula() + "','" + nomina.getTipo_Moneda()
                        + "')";
        try {
            Conexion.getConexion();
            Conexion.ejecutarSentencia(insert);
        } catch (SQLException ex) {
            Logger.getLogger(NominaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Pasarle el registro de la nomina
        //Insertar ese registro en la tabla de APAP
    }
}
