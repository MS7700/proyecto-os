/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaii;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import practicaii.conexionDB.NominaDB;
import practicaii.entity.Nomina;

/**
 *
 * @author manue
 */
public class Escritura {
//    private void writeFileLine(String fileName, String pLine) throws IOException {
//        File file = null;
//        BufferedWriter bw = null;
//        FileWriter fw = null;
//        try {
//            file = new File(fileName);
//            fw = new FileWriter(file);
//            bw = new BufferedWriter(fw);
//            String data = pLine;
//            bw.append(data);
//            //bw.writeLine(data);
//            bw.close();
//            System.out.println("Escritura de archivo realizada ...");
//        } catch (IOException e) {
//        } finally {
//            try {
//                if (bw != null) {
//                    bw.close();
//                }
//            } catch (IOException e) {
//            }
//        }
//    }
    
    
    public void CrearTXT(String periodo, File directory){
        //Usar NominaDB.getNominaAPEC(periodo) para coseguir listado de nomina de la base de datos
        NominaDB db = new NominaDB();
        List<Nomina> nomina = db.getNominaAPEC(periodo);
        File fileTXT = new File(directory,"nominaAPEC.txt");
        BufferedWriter bw = null;
        FileWriter fw;
        String fileName = fileTXT.getPath();
        try{
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            for (Nomina registro : nomina) {
            String line = registro.getRNC() + "," + 
                          registro.getPeriodo() + "," +
                          registro.getSueldo() + "," + 
                          registro.getCedula() + "," + 
                          registro.getTipo_Moneda() + "\n";
            System.out.println(line);
            bw.append(line);
        } 
        }catch (IOException e) {
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
            }
        }
        
        
        JOptionPane.showMessageDialog(null,"Registros guardados correctamente");
    }
}
