/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionxml;

import java.io.File;
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
        
        
        
        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Raiz 
            Document doc = docBuilder.newDocument();
            Element prestamos = doc.createElement("prestamos");
            doc.appendChild(prestamos);

            // Elementos Prestamo
            Element prestamo = doc.createElement("prestamo");
            prestamos.appendChild(prestamo);

            // Elemento estudiante agregar a prestamo
            Element estudiante = doc.createElement("estudiante");
            prestamo.appendChild(estudiante);

            // Agregar matricula a estudiante
            Element matricula = doc.createElement("matricula");
            matricula.appendChild(doc.createTextNode("20190154"));
            estudiante.appendChild(matricula);

            // Agregar cedula a estudiante
            Element cedula = doc.createElement("cedula");
            cedula.appendChild(doc.createTextNode("0112223334"));
            estudiante.appendChild(cedula);

            // Elemento pagos agregar a estudiante
            Element pagos = doc.createElement("pagos");
            prestamo.appendChild(pagos);

            //Elemento pago a pagos
            Element pago = doc.createElement("pago");
            pagos.appendChild(pago);

            // Agregar carrera a pago
            Element carrera = doc.createElement("carrera");
            carrera.appendChild(doc.createTextNode("Ingenieria de Software"));
            pago.appendChild(carrera);

            // Agregar periodo a pago
            Element periodo = doc.createElement("periodo");
            periodo.appendChild(doc.createTextNode("1"));
            pago.appendChild(periodo);

            // Agregar monto a pago
            Element monto = doc.createElement("monto");
            monto.appendChild(doc.createTextNode("50000"));
            pago.appendChild(monto);


            // Escribiendo el contenido en el archivo 
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource fuenteDato = new DOMSource(doc);
            StreamResult resultado = new StreamResult(new File("f:/empleados.xml"));

            // Si quisieramos sacar la salida a la consola para "pruebas"
            // StreamResult resultado = new StreamResult(System.out);
            transformer.transform(fuenteDato, resultado);

            System.out.println("Archivo guardado con exito");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
    
}
