/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que representa a un Animal.
 * 
 * @author jazm6
 */
public class Animal extends Object {
    private String color;
    private int peso;
    private int edad;
    private String nombre;
    private String tamaño;

    /**
     * Constructor por defecto de la clase Animal.
     * Inicializa los atributos con valores predeterminados.
     */
    public Animal() {
        // Constructor vacío
    }

    /**
     * Constructor con parámetros de la clase Animal.
     * 
     * @param color Color del animal.
     * @param peso Peso del animal.
     * @param edad Edad del animal.
     * @param nombre Nombre del animal.
     * @param tamaño Tamaño del animal.
     */
    public Animal(String color, int peso, int edad, String nombre, String tamaño) {
        this.color = color;
        this.peso = peso;
        this.edad = edad;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    /**
     * Obtiene el color del animal.
     * 
     * @return Color del animal.
     */
    public String getColor() {
        return color;
    }

    /**
     * Obtiene el peso del animal.
     * 
     * @return Peso del animal.
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Obtiene la edad del animal.
     * 
     * @return Edad del animal.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Obtiene el nombre del animal.
     * 
     * @return Nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el tamaño del animal.
     * 
     * @return Tamaño del animal.
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * Establece el color del animal.
     * 
     * @param color Nuevo color del animal.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Establece el peso del animal.
     * 
     * @param peso Nuevo peso del animal.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Establece la edad del animal.
     * 
     * @param edad Nueva edad del animal.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Establece el nombre del animal.
     * 
     * @param nombre Nuevo nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el tamaño del animal.
     * 
     * @param tamaño Nuevo tamaño del animal.
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Método que simula que el animal está jugando.
     */
    public void jugar() {
        System.out.println("Estoy jugando");
    }

    /**
     * Método que simula que el animal está comiendo.
     * 
     * @return true si el animal está comiendo.
     */
    public boolean comer() {
        System.out.println("Estoy comiendo");
        return true;
    }

    /**
     * Método que simula que el animal está durmiendo.
     */
    public void dormir() {
        System.out.println("Estoy durmiendo");
    }

    /**
     * Método que devuelve una representación en cadena del animal.
     * 
     * @return Representación en cadena del animal.
     */
    @Override
    public String toString() {
        return "Animal{" + "color=" + color + ", peso=" + peso + ", edad=" + edad + ", nombre=" + nombre + ", tamaño=" + tamaño + '}';
    }
}
