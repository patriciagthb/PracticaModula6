package com.yoprogramo.practicamodulo6;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

public class main {


    public static void main(String[] args) {
        
        
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante(1, "moduloActual", "nombre", (ArrayList) Arrays.asList("sitio", "lugar", LocalDate.of(2019, 01, 10), LocalDate.of(2019, 02, 10)), LocalDate.of(2002, Month.MARCH, 3));
        Profesor profesor1 = new Profesor();
        Profesor profesor2 = new Profesor(2, "Dave Evans", (ArrayList) Arrays.asList("sitio", "lugar", LocalDate.of(2019, 01, 10), LocalDate.of(2019, 02, 10)), LocalDate.of(1977, 12, 04));

 
        
                

    }
 
}
