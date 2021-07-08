/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author hendr
 */
public class Pago {
    String matricula;
    double montoPagado;

    public Pago() {
    }

    public Pago(String matricula, double montoPagado) {
        this.matricula = matricula;
        this.montoPagado = montoPagado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    
    
}
