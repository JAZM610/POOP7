/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * La clase Perico representa un ave de la especie perico.
 * Extiende la clase Ave y añade el atributo específico de hablar.
 * 
 * @author jazm6
 */
public class Perico extends Ave {
    private String hablar;

    /**
     * Constructor por defecto.
     */
    public Perico() {
    }

    /**
     * Constructor que inicializa el atributo hablar.
     * 
     * @param hablar Capacidad de hablar del perico.
     */
    public Perico(String hablar) {
        this.hablar = hablar;
    }

    /**
     * Constructor que inicializa el atributo hablar y los atributos heredados pico, pluma y patas.
     * 
     * @param hablar Capacidad de hablar del perico.
     * @param pico Tipo de pico del perico.
     * @param pluma Tipo de pluma del perico.
     * @param patas Tipo de patas del perico.
     */
    public Perico(String hablar, String pico, String pluma, String patas) {
        super(pico, pluma, patas);
        this.hablar = hablar;
    }

    /**
     * Constructor que inicializa todos los atributos del perico.
     * 
     * @param hablar Capacidad de hablar del perico.
     * @param pico Tipo de pico del perico.
     * @param pluma Tipo de pluma del perico.
     * @param patas Tipo de patas del perico.
     * @param color Color del perico.
     * @param peso Peso del perico.
     * @param edad Edad del perico.
     * @param nombre Nombre del perico.
     * @param tamaño Tamaño del perico.
     */
    public Perico(String hablar, String pico, String pluma, String patas, String color, int peso, int edad, String nombre, String tamaño) {
        super(pico, pluma, patas, color, peso, edad, nombre, tamaño);
        this.hablar = hablar;
    }

    /**
     * Obtiene la capacidad de hablar del perico.
     * 
     * @return Capacidad de hablar.
     */
    public String getHablar() {
        return hablar;
    }

    /**
     * Establece la capacidad de hablar del perico.
     * 
     * @param hablar Capacidad de hablar.
     */
    public void setHablar(String hablar) {
        this.hablar = hablar;
    }

    @Override
    public String toString() {
        return "Perico{" + "hablar=" + hablar + '}';
    }

    /**
     * Método que simula al perico diciendo una frase.
     * 
     * @return Frase dicha por el perico.
     */
    public String decir() {
        return "Hola, soy un perico";
    }
}
