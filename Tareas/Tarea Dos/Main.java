package com.example.tareados;

public class Main {
    public static void main(String[] args) {
        Nodo<Integer> nodoVeinte = new Nodo<>(20);
        Nodo<Integer> nodoVeintitres = new Nodo<>(23);
        Nodo<Integer> nodoDiecinueve = new Nodo<>(19);
        Nodo<Integer> nodoCincuentaysiete = new Nodo<>(57);
        Nodo<Integer> nodoSesentaysiete = new Nodo<>(67);
        Nodo<Integer> nodoNoventaynueve = new Nodo<>(99);

        nodoVeinte.setPrimerHijo(nodoVeintitres);
        nodoVeinte.setSegundoHijo(nodoDiecinueve);

        nodoVeintitres.setSegundoHijo(nodoCincuentaysiete);

        nodoDiecinueve.setTercerHijo(nodoSesentaysiete);

        nodoSesentaysiete.setSegundoHijo(nodoNoventaynueve);

        ArbolTernario<Integer> arbol = new ArbolTernario<>(nodoVeinte);
        arbol.buscar(99);
        arbol.buscar(57);
    }
}