/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaii.entity;

/**
 *
 * @author manue
 */
public class Nomina {
    public Nomina()
        {
        }

    public Nomina(String RNC, String Periodo, String Sueldo, String Cedula, String Tipo_Moneda) {
        this.RNC = RNC;
        this.Periodo = Periodo;
        this.Sueldo = Sueldo;
        this.Cedula = Cedula;
        this.Tipo_Moneda = Tipo_Moneda;
    }

    public String getRNC() {
        return RNC;
    }

    public void setRNC(String RNC) {
        this.RNC = RNC;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public String getSueldo() {
        return Sueldo;
    }

    public void setSueldo(String Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTipo_Moneda() {
        return Tipo_Moneda;
    }

    public void setTipo_Moneda(String Tipo_Moneda) {
        this.Tipo_Moneda = Tipo_Moneda;
    }

        

        private String RNC;
        private String Periodo;
        private String Sueldo;
        private String Cedula;
        private String Tipo_Moneda;
}
