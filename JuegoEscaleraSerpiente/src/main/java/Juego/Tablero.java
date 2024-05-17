/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author julimantilla
 */
public class Tablero {
    
    private String[][] tablero;

    public Tablero(int tamaño) {
        tablero = new String[tamaño][tamaño];
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }
    
    public void crearTablero() {
    int count = 1;
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero.length; j++) {
            tablero[i][j] = Integer.toString(count++);
        }
    }
}


    public String pintarTablero() {

        String mensaje = "";
        for (int i = 0; i < tablero.length; i++) {
            mensaje+="\n";
            mensaje+="\n";
            for (int j = 0; j < tablero.length; j++) {
                mensaje += tablero[i][j] + " - ";
            }
        }
        return mensaje;
    }
}
