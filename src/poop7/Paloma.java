/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * La clase Paloma representa un ave de la especie paloma.
 * Extiende la clase Ave y añade el atributo específico de orientación.
 * 
 * @author jazm6
 */
public class Paloma extends Ave {
    private String orientacion;

    /**
     * Constructor por defecto.
     */
    public Paloma() {
    }

    /**
     * Constructor que inicializa el atributo orientación.
     * 
     * @param orientacion Capacidad de orientación de la paloma.
     */
    public Paloma(String orientacion) {
        this.orientacion = orientacion;
    }

    /**
     * Constructor que inicializa el atributo orientación y los atributos heredados pico, pluma y patas.
     * 
     * @param orientacion Capacidad de orientación de la paloma.
     * @param pico Tipo de pico de la paloma.
     * @param pluma Tipo de pluma de la paloma.
     * @param patas Tipo de patas de la paloma.
     */
    public Paloma(String orientacion, String pico, String pluma, String patas) {
        super(pico, pluma, patas);
        this.orientacion = orientacion;
    }

    /**
     * Constructor que inicializa todos los atributos de la paloma.
     * 
     * @param orientacion Capacidad de orientación de la paloma.
     * @param pico Tipo de pico de la paloma.
     * @param pluma Tipo de pluma de la paloma.
     * @param patas Tipo de patas de la paloma.
     * @param color Color de la paloma.
     * @param peso Peso de la paloma.
     * @param edad Edad de la paloma.
     * @param nombre Nombre de la paloma.
     * @param tamaño Tamaño de la paloma.
     */
    public Paloma(String orientacion, String pico, String pluma, String patas, String color, int peso, int edad, String nombre, String tamaño) {
        super(pico, pluma, patas, color, peso, edad, nombre, tamaño);
        this.orientacion = orientacion;
    }

    /**
     * Obtiene la capacidad de orientación de la paloma.
     * 
     * @return Capacidad de orientación.
     */
    public String getOrientacion() {
        return orientacion;
    }

    /**
     * Establece la capacidad de orientación de la paloma.
     * 
     * @param orientacion Capacidad de orientación.
     */
    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    @Override
    public String toString() {
        return "Paloma{" + "orientacion=" + orientacion + '}';
    }

    /**
     * Método que simula a la paloma mandando un mensaje.
     */
    public void mandarMensaje() {
        System.out.println("Estoy mandando un mensaje");
    }
}
