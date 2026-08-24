package com.example.tareados;

import java.util.ArrayList;

public class ArbolTernario<T> {
    private Nodo<T> head;

    public ArbolTernario (Nodo<T> head){
        this.head = head;
    }

    public void buscar(T valorBuscado) {
        ArrayList<T> ruta = new ArrayList<>();
        buscarAux(head, valorBuscado, ruta);
    }

    private void buscarAux(Nodo<T> nodoActual, T valorBuscado, ArrayList<T> ruta){
        if (nodoActual == null) {
            return;
        }
        ruta.add(nodoActual.getValor());

        if (nodoActual.getValor().equals(valorBuscado)) {
            System.out.println(ruta);
            return;
        }

        buscarAux(nodoActual.getPrimerHijo(), valorBuscado, ruta);
        buscarAux(nodoActual.getSegundoHijo(), valorBuscado, ruta);
        buscarAux(nodoActual.getTercerHijo(), valorBuscado, ruta);

        ruta.remove(ruta.size() - 1);
    }
}

class Nodo<T> {
    private T valor;
    private Nodo<T> primerHijo;
    private Nodo<T> segundoHijo;
    private Nodo<T> tercerHijo;

    public Nodo (T valor){
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor){
        this.valor = valor;
    }

    public Nodo<T> getPrimerHijo() {
    return primerHijo;
    }

    public void setPrimerHijo(Nodo<T> primerHijo) {
        this.primerHijo = primerHijo;
    }

    public Nodo<T> getSegundoHijo() {
    return segundoHijo;
    }

    public void setSegundoHijo(Nodo<T> segundoHijo) {
        this.segundoHijo = segundoHijo;
    }

    public Nodo<T> getTercerHijo() {
    return tercerHijo;
    }

    public void setTercerHijo(Nodo<T> tercerHijo) {
        this.tercerHijo = tercerHijo;
    }
}
