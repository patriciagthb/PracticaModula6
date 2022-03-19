
package com.yoprogramo.practicamodulo6;

import java.time.LocalDate;

public class Estudiante extends Persona {
    
    private int nroEstudiante;
    private String moduloActual;

    public Estudiante() {
    }

    public Estudiante(int nroEstudiante, String moduloActual, String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.nroEstudiante = nroEstudiante;
        this.moduloActual = moduloActual;
    }

    public int getNroEstudiante() {
        return nroEstudiante;
    }

    public void setNroEstudiante(int nroEstudiante) {
        this.nroEstudiante = nroEstudiante;
    }

    public String getModuloActual() {
        return moduloActual;
    }

    public void setModuloActual(String moduloActual) {
        this.moduloActual = moduloActual;
    }


    
}


    

