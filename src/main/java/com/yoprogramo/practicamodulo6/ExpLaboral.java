package com.yoprogramo.practicamodulo6;

import java.time.LocalDate;


public class ExpLaboral {
    
    String sitio;
    String puesto;
    LocalDate fecha_inicio;
    LocalDate fecha_fin;

    public ExpLaboral() {
    }

    public ExpLaboral(String sitio, String puesto, LocalDate fecha_inicio, LocalDate fecha_fin) {
        this.sitio = sitio;
        this.puesto = puesto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    
      
    
    
}
