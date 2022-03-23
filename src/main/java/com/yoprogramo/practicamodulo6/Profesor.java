
package com.yoprogramo.practicamodulo6;

import java.time.LocalDate;
import java.util.ArrayList;



public class Profesor extends Persona{
    
    private int categoria;

    public Profesor() {
    }

    public Profesor(int categoria, String nombre, ArrayList experienciaLaboral, LocalDate fechaNacimiento) {
        super(nombre, experienciaLaboral, fechaNacimiento);
        this.categoria = categoria;
    }



    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }


    
    
}
