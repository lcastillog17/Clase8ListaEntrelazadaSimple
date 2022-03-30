package org.openjfx.progra3clase8;

public class Nodo {
    ClsAlumno dato;
    Nodo enlace;

    public Nodo(ClsAlumno alum) {
        dato = alum;
        enlace = null;
    }

    public Nodo(ClsAlumno alum, Nodo n) {
        dato = alum;
        enlace = n;
    }

    public ClsAlumno getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
