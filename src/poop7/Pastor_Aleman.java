/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * La clase Pastor_Aleman representa un perro de raza pastor alemán.
 * Extiende la clase Perro y añade el atributo específico de olfato.
 * 
 * @author jazm6
 */
public class Pastor_Aleman extends Perro {
    private String olfato;

    /**
     * Constructor por defecto.
     */
    public Pastor_Aleman() {
    }

    /**
     * Constructor que inicializa el atributo olfato.
     * 
     * @param olfato Nivel de olfato del pastor alemán.
     */
    public Pastor_Aleman(String olfato) {
        this.olfato = olfato;
    }

    /**
     * Constructor que inicializa el atributo olfato y el entrenamiento.
     * 
     * @param olfato Nivel de olfato del pastor alemán.
     * @param entrenamiento Nivel de entrenamiento del pastor alemán.
     */
    public Pastor_Aleman(String olfato, String entrenamiento) {
        super(entrenamiento);
        this.olfato = olfato;
    }

    /**
     * Constructor que inicializa todos los atributos del pastor alemán.
     * 
     * @param olfato Nivel de olfato del pastor alemán.
     * @param entrenamiento Nivel de entrenamiento del pastor alemán.
     * @param color Color del pastor alemán.
     * @param peso Peso del pastor alemán.
     * @param edad Edad del pastor alemán.
     * @param nombre Nombre del pastor alemán.
     * @param tamaño Tamaño del pastor alemán.
     */
    public Pastor_Aleman(String olfato, String entrenamiento, String color, int peso, int edad, String nombre, String tamaño) {
        super(entrenamiento, color, peso, edad, nombre, tamaño);
        this.olfato = olfato;
    }

    /**
     * Obtiene el nivel de olfato del pastor alemán.
     * 
     * @return Nivel de olfato.
     */
    public String getOlfato() {
        return olfato;
    }

    /**
     * Establece el nivel de olfato del pastor alemán.
     * 
     * @param olfato Nivel de olfato.
     */
    public void setOlfato(String olfato) {
        this.olfato = olfato;
    }

    @Override
    public String toString() {
        return super.toString() + "Pastor_Aleman{" + "olfato=" + olfato + '}';
    }
}
