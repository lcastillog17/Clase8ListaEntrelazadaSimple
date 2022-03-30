package org.openjfx.progra3clase8;

public class ClsAlumno {

    public String carnet;
    public String nombre;
    public double promedio;
    
    //el metodo toString es para que tenga un formato de salida los datos
    @Override
    public String toString() {
        return "[ " + this.carnet + " " + this.nombre + " " + this.promedio + " ]";
    }
}
