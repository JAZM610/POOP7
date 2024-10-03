/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * La clase Ave representa un ave con atributos específicos como pico, pluma y patas.
 * Extiende la clase Animal y añade métodos específicos para el canto y el vuelo.
 * 
 * @author jazm6
 */
public class Ave extends Animal {
    private String pico;
    private String pluma;
    private String patas;

    /**
     * Constructor por defecto.
     */
    public Ave() {
    }

    /**
     * Constructor que inicializa los atributos pico, pluma y patas.
     * 
     * @param pico Tipo de pico del ave.
     * @param pluma Tipo de pluma del ave.
     * @param patas Tipo de patas del ave.
     */
    public Ave(String pico, String pluma, String patas) {
        this.pico = pico;
        this.pluma = pluma;
        this.patas = patas;
    }

    /**
     * Constructor que inicializa todos los atributos del ave.
     * 
     * @param pico Tipo de pico del ave.
     * @param pluma Tipo de pluma del ave.
     * @param patas Tipo de patas del ave.
     * @param color Color del ave.
     * @param peso Peso del ave.
     * @param edad Edad del ave.
     * @param nombre Nombre del ave.
     * @param tamaño Tamaño del ave.
     */
    public Ave(String pico, String pluma, String patas, String color, int peso, int edad, String nombre, String tamaño) {
        super(color, peso, edad, nombre, tamaño);
        this.pico = pico;
        this.pluma = pluma;
        this.patas = patas;
    }

    /**
     * Obtiene el tipo de pico del ave.
     * 
     * @return Tipo de pico.
     */
    public String getPico() {
        return pico;
    }

    /**
     * Obtiene el tipo de pluma del ave.
     * 
     * @return Tipo de pluma.
     */
    public String getPluma() {
        return pluma;
    }

    /**
     * Obtiene el tipo de patas del ave.
     * 
     * @return Tipo de patas.
     */
    public String getPatas() {
        return patas;
    }

    /**
     * Establece el tipo de pico del ave.
     * 
     * @param pico Tipo de pico.
     */
    public void setPico(String pico) {
        this.pico = pico;
    }

    /**
     * Establece el tipo de pluma del ave.
     * 
     * @param pluma Tipo de pluma.
     */
    public void setPluma(String pluma) {
        this.pluma = pluma;
    }

    /**
     * Establece el tipo de patas del ave.
     * 
     * @param patas Tipo de patas.
     */
    public void setPatas(String patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Ave{" + "pico=" + pico + ", pluma=" + pluma + ", patas=" + patas + '}';
    }

    /**
     * Método que simula el canto del ave.
     */
    public void canto() {
        System.out.println("Estoy cantando");
    }

    /**
     * Método que simula el vuelo del ave.
     */
    public void volar() {
        System.out.println("Estoy volando");
    }
}
