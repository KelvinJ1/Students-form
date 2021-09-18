
package com.mycompany.gui;


public class Estudiantes {
    
   private int identificacion;
   private String nombre, genero, ciclo, materias;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

   //Getters and setters
    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenéro() {
        return genero;
    }

    public void setGenéro(String genero) {
        this.genero = genero;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
   
    //ToString

     @Override
    public String toString() {
        return "Estudiante{" + "identificacion=" + identificacion + "\n nombre=" + nombre + "\n genero=" + genero + "\n ciclo=" + ciclo + "\n materias=" + materias + '}';
    }

    
    
    
    
}
