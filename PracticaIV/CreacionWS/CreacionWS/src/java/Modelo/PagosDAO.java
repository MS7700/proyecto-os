/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hendr
 */
public class PagosDAO implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();

    @Override
    public List listar() {
        List<Pago> datos = new ArrayList<>();
        String sql = "SELECT * FROM PagosFundapec";
        
        try{
            con = conex.getConnection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            
            while(rs.next()) {
                Pago p = new Pago();
                p.setMatricula(rs.getString("matricula"));
                p.setMontoPagado(rs.getDouble("MontoPagado"));
                
                datos.add(p);
            }
        }
        catch (Exception e){
        
        }
        return datos;
    }

    @Override
    public List listarMatricula(String matricula) {
        
        List<Pago> datos = new ArrayList<>();
        String sql = "SELECT * FROM PagosFundapec WHERE Matricula = '"+matricula+"'";
        
        try{
            con = conex.getConnection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            
            while(rs.next()) {
                Pago p = new Pago();
                p.setMatricula(rs.getString("matricula"));
                p.setMontoPagado(rs.getDouble("MontoPagado"));
                
                datos.add(p);
            }
        }
        catch (Exception e){
        
        }
        return datos; 
    }
}
