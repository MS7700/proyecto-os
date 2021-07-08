/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 *
 * @author mslopez
 */
public class Prestamo {
    private Estudiante estudiante;
    private List<Pago> pagos;

    public Prestamo() {
    }

    

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    public Prestamo(Estudiante estudiante, List<Pago> pagos) {
        this.estudiante = estudiante;
        this.pagos = pagos;
    }
}
