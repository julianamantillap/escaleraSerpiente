/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author julimantilla
 */
public class Jugador {

    private String nombre;
    private int posicion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.posicion = 0;
    }

    public Jugador() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int echarDado() {
        return (int) (Math.random() * 6) + 1;
    }

    public void moverse(int pasos) {
        this.posicion = this.posicion + pasos;
    }
}
