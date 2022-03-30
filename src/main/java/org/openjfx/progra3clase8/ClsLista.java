package org.openjfx.progra3clase8;

import java.util.Scanner;

public class ClsLista {
    public Nodo primero;

    public ClsLista(ClsAlumno alum) {
        primero = new Nodo(alum,primero);    
    }

    /*
    private int leerEntero() {
        System.out.println("Ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    */

    /*
    public ClsLista crearLista() {
        int x;
        primero = null;

        do {
            x = leerEntero();
            if (x != -1) {
                primero = new Nodo(x, primero);
            }
        } while (x != -1);

        return this;
    }
    */
    
    public ClsLista insertarCabezaLista(ClsAlumno entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this; //devuelve la lista de ClsLista
    }
    
    public ClsLista insertarUltimoLista(Nodo ultimo, ClsAlumno entrada) {
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        return this;
    }
    
    public Nodo buscarLista(String valorBuscar) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (valorBuscar.equals(indice.dato.carnet)) { //equalsIgnoreCase es como el equals pero que no importen mayusculas
                return indice;
            }
        }
        return null;
    }
    
    public ClsLista insertarLista(String valorBuscarCarnet, ClsAlumno entrada) {
        Nodo nuevo, anterior;
	    anterior = buscarLista(valorBuscarCarnet);
        if (anterior != null) {
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
	    return this;
    }

    public Nodo buscarPosicion(int posicion) {
        Nodo indice;
        int i;
        if (posicion < 0) return null;
        indice = primero;
        for (i = 1; (i < posicion) && (indice != null); i++) {
            indice = indice.enlace;
        }
        return indice;
    }

    public void eliminar(String carnet) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        while ((actual != null) && (!encontrado)) {//por si no ha encontrado el dato
            encontrado = (actual.dato.carnet.equals(carnet));
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }

        if (actual != null) {//si ya encontró el dato
            if (actual.equals(primero) ) { //si el dato es el primero de la lista
                primero = actual.enlace;
            } else { //si encontró el dato pero no es el primero
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }
    
    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.println(n.dato.toString() + " ");
            n = n.enlace;
            k++;
            System.out.print(k % 15 != 0 ? " " : "\n");
        }
    }
    
}
