/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura.xml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ui.lectura.LecturaUI;


/**
 *
 * @author noel5
 */
public class LecturaXML {
    String texto1,texto2,texto3,texto4,texto5 = "";
   
    public void LeerXML(File Archivo, LecturaUI lecturaUI, int a){
         try {
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(Archivo);

	doc.getDocumentElement().normalize();

	System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());

	NodeList nList = doc.getElementsByTagName("prestamo");

	System.out.println("----------------------------");
        
        int temp = a;
        if(temp < nList.getLength()){
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        System.out.println(temp);
			Element eElement = (Element) nNode;
                        texto1 = eElement.getElementsByTagName("matricula").item(0).getTextContent();
                        texto2 = eElement.getElementsByTagName("cedula").item(0).getTextContent();
                        texto3 = eElement.getElementsByTagName("carrera").item(0).getTextContent();
                        texto4 = eElement.getElementsByTagName("periodo").item(0).getTextContent();
                        texto5 = eElement.getElementsByTagName("monto").item(0).getTextContent();
                        lecturaUI.insertarATextpane(texto1, texto2, texto3, texto4, texto5);
                       
        }
	/*for (int temp = 0; temp < nList.getLength(); temp++) {
                
		Node nNode = nList.item(temp);

		System.out.println("\nElemento actual :" + nNode.getNodeName());

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
                        texto1 = eElement.getElementsByTagName("matricula").item(0).getTextContent();
                        texto2 = eElement.getElementsByTagName("cedula").item(0).getTextContent();
                        texto3 = eElement.getElementsByTagName("carrera").item(0).getTextContent();
                        texto4 = eElement.getElementsByTagName("periodo").item(0).getTextContent();
                        texto5 = eElement.getElementsByTagName("monto").item(0).getTextContent();
                        lecturaUI.insertarATextpane(texto1, texto2, texto3, texto4, texto5);
                        
                        
			//System.out.println("Matricula: " + eElement.getAttribute("matricula"));
                        System.out.println("Matricula: " + eElement.getElementsByTagName("matricula").item(0).getTextContent());
			System.out.println("Cédula: " + eElement.getElementsByTagName("cedula").item(0).getTextContent());
			System.out.println("Carrera: " + eElement.getElementsByTagName("carrera").item(0).getTextContent());
			System.out.println("Periodo: " + eElement.getElementsByTagName("periodo").item(0).getTextContent());
			System.out.println("Monto: " + eElement.getElementsByTagName("monto").item(0).getTextContent());
            }*/
	}
    } catch (Exception e) {
	e.printStackTrace();
    }
    }
    
}
