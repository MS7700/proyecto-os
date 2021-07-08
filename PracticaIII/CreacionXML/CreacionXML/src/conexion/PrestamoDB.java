/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import entity.Estudiante;
import entity.Pago;
import entity.Prestamo;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mslopez
 */
public class PrestamoDB {
    
    public List<Prestamo> getPrestamosDB(){
        List<Prestamo> prestamos = new ArrayList<Prestamo>();
        String consulta = "select MATRICULA, CEDULA, CARRERA, PERIODO, MONTO\n" +
        "from prestamo inner join estudiante \n" +
        "on prestamo.estudianteid = estudiante.estudianteid\n" +
        "INNER JOIN PAGO ON PRESTAMO.PAGOID = PAGO.PAGOID\n" +
        "ORDER BY MATRICULA";
        try {
            Conexion.getConexion();
            ResultSet rs = Conexion.ejecutarConsulta(consulta);
            while(rs.next()){
                
                Estudiante estudiante = new Estudiante();
                estudiante.setCedula(rs.getString("CEDULA"));
                estudiante.setMatricula(rs.getString("MATRICULA"));
                
                Pago pago = new Pago();
                pago.setCarrera(rs.getString("CARRERA"));
                pago.setMonto(rs.getDouble("MONTO"));
                pago.setPeriodo(rs.getInt("PERIODO"));
                
                if(prestamos.size() == 0){
                    Prestamo prestamo = new Prestamo();
                    prestamo.setEstudiante(estudiante);
                    List<Pago> pagos = new ArrayList<Pago>();
                    pagos.add(pago);
                    prestamo.setPagos(pagos);
                
                    prestamos.add(prestamo);
                    continue;
                }
                Prestamo lastPrestamo = prestamos.get(prestamos.size() - 1);
                
                if(lastPrestamo.getEstudiante().getMatricula().equals(estudiante.getMatricula())){
                    List<Pago> pagos = lastPrestamo.getPagos();
                    pagos.add(pago);
                    lastPrestamo.setPagos(pagos);
                }else{
                    Prestamo prestamo = new Prestamo();
                    prestamo.setEstudiante(estudiante);
                    List<Pago> pagos = new ArrayList<Pago>();
                    pagos.add(pago);
                    prestamo.setPagos(pagos);
                
                    prestamos.add(prestamo);
                }
            }
            //Conseguir la nomina de base de datos en tabla APEC que tengan el periodo
            //Crear listado de registros de nomina
        } catch (Throwable ex) {
            Logger.getLogger(PrestamoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prestamos;
    }
    
}
