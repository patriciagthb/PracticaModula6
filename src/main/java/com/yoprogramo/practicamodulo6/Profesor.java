
package com.yoprogramo.practicamodulo6;

import java.time.LocalDate;



public class Profesor extends Persona{
    
    private int categoria;

    public Profesor() {
    }

    public Profesor(int categoria, String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }


    
    
}
