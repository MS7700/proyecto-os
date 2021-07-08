/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionxml;

import conexion.PrestamoDB;
import entity.Estudiante;
import entity.Pago;
import entity.Prestamo;
import java.io.File;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 *
 * @author mslopez
 */
public class CreacionXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        PrestamoDB db = new PrestamoDB();
//        List<Prestamo> prestamos = db.getPrestamosDB();
//        for(int i = 0; i < prestamos.size(); i++){
//            System.out.println(prestamos.get(i).getEstudiante().getMatricula());
//            System.out.println(prestamos.get(i).getPagos().size());
//            
//        }
        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            PrestamoDB db = new PrestamoDB();
            List<Prestamo> prestamosList = db.getPrestamosDB();
            
             //Raiz 
            Document doc = docBuilder.newDocument();
            Element prestamos = doc.createElement("prestamos");
            doc.appendChild(prestamos);
            
            for(int i = 0; i < prestamosList.size(); i++){
                Estudiante estudianteL = prestamosList.get(i).getEstudiante();
                List<Pago> pagosList = prestamosList.get(i).getPagos();
                
                 //Elementos Prestamo
                Element prestamo = doc.createElement("prestamo");
                prestamos.appendChild(prestamo);
                
                 //Elemento estudiante agregar a prestamo
                Element estudiante = doc.createElement("estudiante");
                prestamo.appendChild(estudiante);

                 //Agregar matricula a estudiante
                Element matricula = doc.createElement("matricula");
                matricula.appendChild(doc.createTextNode(estudianteL.getMatricula()));
                estudiante.appendChild(matricula);

             //Agregar cedula a estudiante
            Element cedula = doc.createElement("cedula");
            cedula.appendChild(doc.createTextNode(estudianteL.getCedula()));
            estudiante.appendChild(cedula);

             //Elemento pagos agregar a estudiante
            Element pagos = doc.createElement("pagos");
            prestamo.appendChild(pagos);
            
            for(int p = 0; p < pagosList.size(); p++){
                Pago pagoL = pagosList.get(p);
                
            //Elemento pago a pagos
            Element pago = doc.createElement("pago");
            pagos.appendChild(pago);

             //Agregar carrera a pago
            Element carrera = doc.createElement("carrera");
            carrera.appendChild(doc.createTextNode(pagoL.getCarrera()));
            pago.appendChild(carrera);

             //Agregar periodo a pago
            Element periodo = doc.createElement("periodo");
            periodo.appendChild(doc.createTextNode(String.valueOf(pagoL.getPeriodo())));
            pago.appendChild(periodo);

             //Agregar monto a pago
            Element monto = doc.createElement("monto");
            monto.appendChild(doc.createTextNode(String.valueOf(pagoL.getMonto())));
            pago.appendChild(monto);
            }
            
            
            }
            
            

            


             //Escribiendo el contenido en el archivo 
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource fuenteDato = new DOMSource(doc);
            StreamResult resultado = new StreamResult(new File("C:\\Users\\manue\\Documents\\estudiantes.xml"));

             //Si quisieramos sacar la salida a la consola para "pruebas"
             //StreamResult resultado = new StreamResult(System.out);
            transformer.transform(fuenteDato, resultado);

            System.out.println("Archivo guardado con exito");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
    
}
