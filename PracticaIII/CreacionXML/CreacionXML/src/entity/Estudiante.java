/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author mslopez
 */
public class Estudiante {
    private String matricula;
    private String cedula;

    public String getMatricula() {
        return matricula;
    }

    public Estudiante() {
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Estudiante(String matricula, String cedula) {
        this.matricula = matricula;
        this.cedula = cedula;
    }
}
