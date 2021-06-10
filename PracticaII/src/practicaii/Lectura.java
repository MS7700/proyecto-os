/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package practicaii;
import java.io.BufferedReader;
import practicaii.conexionDB.NominaDB;
import javax.swing.JFileChooser;
import java.io.File;      
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import practicaii.entity.Nomina;
/**
 *
 * @author manue
 */
public class Lectura {
    NominaDB nominaIn = new NominaDB();
    public void LeerTXTaDB(File Archivo){
        // InsertToNominaAPAP(Nomina nomina);
        //Crear un while lopp con los datos que se lea del TXT, cada registro es una Nomina
        //Usar dentro del loop NominaDB.InsertToNominaAPAP(Nomina nomina) con cada Nomina
        
        //Redundante verificar si el archivo existe, lo pongo por si acaso.
        if(Archivo.exists()){
        try{
        BufferedReader vBR = new BufferedReader(new FileReader(Archivo));
        String Linea;
        
        //Loop donde se insertarán los registros a la DB
        while((Linea = vBR.readLine())!= null){ 
            
        String[] Registro = Linea.split(",");
        Nomina nomina = new Nomina();
        nomina.setRNC(Registro[0]);
        nomina.setPeriodo(Registro[1]);
        nomina.setSueldo(Registro[2]);
        nomina.setCedula(Registro[3]);
        nomina.setTipo_Moneda(Registro[4]);
        
        nominaIn.InsertToNominaAPAP(nomina);
        }
        JOptionPane.showMessageDialog(null,"Registros guardados correctamente");
        }
        catch(IOException e){
        
        System.out.println(e.getMessage());
        }
        }
        
    }
    
}
