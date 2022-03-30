/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.progra3clase8;

/**
 *
 * @author jeant
 */
public class Main {
    public static void main(String[] args) {

        /*
        ClsLista lista = new ClsLista();
        
        lista.insertarCabezaLista(80);        
        lista.insertarCabezaLista(40);
        lista.insertarCabezaLista(6);
        lista.insertarCabezaLista(88);
        lista.insertarCabezaLista(89);
        lista.insertarCabezaLista(99);
        System.out.println("--------------------------------------------");
        lista.visualizar();
        lista.insertarLista(6, 10);
        System.out.println("--------------------------------------------");
        lista.visualizar();
        lista.eliminar(88);
        System.out.println("--------------------------------------------");
        lista.visualizar();
        */

        ClsAlumno al = new ClsAlumno();
        System.out.println("\n \n -------------------------------------------- \n -Inserta todos los datos por cabeza \n");
        al.carnet="010";
        al.nombre="dani";
        al.promedio=76;
        ClsLista lista = new ClsLista(al);
        
        //insertar por cabeza
        al=new ClsAlumno();
        al.carnet="011";
        al.nombre="Linda";
        al.promedio=98;
        lista.insertarCabezaLista(al);

        al=new ClsAlumno();
        al.carnet="012";
        al.nombre="Antonio";
        al.promedio=99;
        lista.insertarCabezaLista(al);

        al=new ClsAlumno();
        al.carnet="013";
        al.nombre="Carlos";
        al.promedio=88.2;
        lista.insertarCabezaLista(al);

        al=new ClsAlumno();
        al.carnet="014";
        al.nombre="Maria";
        al.promedio=20.6;
        lista.insertarCabezaLista(al);

        al=new ClsAlumno();
        al.carnet="015";
        al.nombre="Juana";
        al.promedio=79.4;
        lista.insertarCabezaLista(al);

        al=new ClsAlumno();
        al.carnet="016";
        al.nombre="Josefa";
        al.promedio=54.9;
        lista.insertarCabezaLista(al);
        
        al=new ClsAlumno();
        al.carnet="017";
        al.nombre="Diego";
        al.promedio=33.3;
        lista.insertarCabezaLista(al);

        al=new ClsAlumno();
        al.carnet="018";
        al.nombre="Daniela";
        al.promedio=65.3;
        lista.insertarCabezaLista(al);

        al=new ClsAlumno();
        al.carnet="019";
        al.nombre="Pamela";
        al.promedio=79.65;
        lista.insertarCabezaLista(al);

        al=new ClsAlumno();
        al.carnet="020";
        al.nombre="Meyllin";
        al.promedio=22.4;
        lista.insertarCabezaLista(al);
        lista.visualizar();
        System.out.println("--------------------------------------------");
        

        //BuscarPorDatoIngresado
        System.out.println("\n \n -------------------------------------------- \n -Busca segun el carnet \n");
        Nodo DatoEncontradoPorCarnet;
        DatoEncontradoPorCarnet=lista.buscarLista("020");
        System.out.println("El dato encontrado por carnet es: "+ DatoEncontradoPorCarnet.dato.toString());
        System.out.println("--------------------------------------------");


        //insertar por cola y buscar por posicion
        System.out.println("\n \n -------------------------------------------- \n -Ingresa en la cola de la lista \n");
        Nodo IngresarCola;
       IngresarCola= lista.buscarPosicion(11);
       al=new ClsAlumno();
       al.carnet="021";
       al.nombre="Jose";
       al.promedio=12;
       lista.insertarUltimoLista(IngresarCola, al);
       lista.visualizar();
       System.out.println("--------------------------------------------");

       //Eliminar dato de la lista
       System.out.println("\n \n -------------------------------------------- \n -Elimina un dato segun el carnet enviado en este caso es el carnet 015 \n");
       lista.eliminar("015");
       lista.visualizar();
       System.out.println("--------------------------------------------");

       //Ingresar en medio de dos datos
       System.out.println("\n \n -------------------------------------------- \n -Ingresa en medio de dos datos en este caso es despues del 017 \n");
       al=new ClsAlumno();
       al.carnet="099";
       al.nombre="Telma";
       al.promedio=100;
       lista.insertarLista("017", al);
       lista.visualizar();
       System.out.println("--------------------------------------------");
    }
}
