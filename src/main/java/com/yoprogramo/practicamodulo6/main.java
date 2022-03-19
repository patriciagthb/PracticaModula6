package com.yoprogramo.practicamodulo6;

import java.time.LocalDate;

public class main {


    public static void main(String[] args) {
        
        
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante(123, "moduloActual", "nombre", LocalDate.of(2005, 06, 22));
        Profesor profesor1 = new Profesor();
        Profesor profesor2 = new Profesor(10, "Dave Evans", LocalDate.of(1975, 12, 4));

 
        
                

    }
 
}
