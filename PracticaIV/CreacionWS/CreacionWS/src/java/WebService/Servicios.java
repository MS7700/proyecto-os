/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Modelo.Pago;
import Modelo.PagosDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hendr
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    /**
     * Web service operation
     */
    PagosDAO dao = new PagosDAO();
    @WebMethod(operationName = "listar")
    public List<Pago> listar() {
        List datos = dao.listar();
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarPago")
    public List<Pago> listarPago(@WebParam(name = "matricula") String matricula) {
        List dato = dao.listarMatricula(matricula);
        return dato;
    }
}
