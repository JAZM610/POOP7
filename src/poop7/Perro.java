/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que representa a un Perro, que es una extensión de la clase Animal.
 * 
 * @author jazm6
 */
public class Perro extends Animal {
    private String entrenamiento;

    /**
     * Constructor por defecto de la clase Perro.
     * Inicializa los atributos con valores predeterminados.
     */
    public Perro() {
        // Constructor vacío
    }

    /**
     * Constructor con parámetros de la clase Perro.
     * 
     * @param entrenamiento Nivel de entrenamiento del perro.
     */
    public Perro(String entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    /**
     * Constructor con parámetros de la clase Perro.
     * 
     * @param entrenamiento Nivel de entrenamiento del perro.
     * @param color Color del perro.
     * @param peso Peso del perro.
     * @param edad Edad del perro.
     * @param nombre Nombre del perro.
     * @param tamaño Tamaño del perro.
     */
    public Perro(String entrenamiento, String color, int peso, int edad, String nombre, String tamaño) {
        super(color, peso, edad, nombre, tamaño);
        this.entrenamiento = entrenamiento;
    }

    /**
     * Obtiene el nivel de entrenamiento del perro.
     * 
     * @return Nivel de entrenamiento del perro.
     */
    public String getEntrenamiento() {
        return entrenamiento;
    }

    /**
     * Establece el nivel de entrenamiento del perro.
     * 
     * @param entrenamiento Nuevo nivel de entrenamiento del perro.
     */
    public void setEntrenamiento(String entrenamiento) {
        this.entrenamiento = entrenamiento;
    }
    
    /**
     * Método que simula el ladrido del perro.
     */
    public void ladrar() {
        System.out.println("guau");
    }

    /**
     * Método que devuelve una representación en cadena del perro.
     * 
     * @return Representación en cadena del perro.
     */
    @Override
    public String toString() {
        return super.toString() + " Perro{" + "entrenamiento=" + entrenamiento + '}';
    }
}
