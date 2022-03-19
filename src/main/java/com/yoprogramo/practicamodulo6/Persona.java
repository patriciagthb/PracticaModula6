package com.yoprogramo.practicamodulo6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.Period;


public class Persona {
    
    private String nombre;
    private ArrayList <ExpLaboral> experienciaLaboral = new ArrayList();
    private LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ExpLaboral> getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(ArrayList<ExpLaboral> experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

/* error en el return*/
    public void calcularEdad(LocalDate fechaNacimiento){
        Period edad = Period.between(fechaNacimiento, LocalDate.now()); 
        System.out.println("la edad es de : " + edad);
    }  
}
