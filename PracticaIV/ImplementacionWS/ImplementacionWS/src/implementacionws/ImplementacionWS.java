/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacionws;

import java.util.List;

/**
 *
 * @author mslopez
 */
public class ImplementacionWS {
    
    

    /**
     * @param args the command line arguments
     */
    

    public ImplementacionWS() {
    }
    
    //Modificar esto
    public double getMontoFromMatricula(String matricula){
        
        implementacionws.Servicios_Service service = new implementacionws.Servicios_Service();
        implementacionws.Servicios port = service.getServiciosPort();
        return port.listarPago2(matricula);
      //  double monto = 1000; //Sustituir por web service
        //double monto = sumarMontosMatricula(matricula)
    }
    
}
