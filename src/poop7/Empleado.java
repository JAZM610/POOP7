/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que representa a un Empleado.
 * 
 * @author jazm6
 */
public class Empleado extends Object {
    private String nombre;
    private int numEmpleado;
    private float sueldo;

    /**
     * Constructor por defecto de la clase Empleado.
     * Inicializa los atributos con valores predeterminados.
     */
    public Empleado() {
        // Constructor vacío
    }

    /**
     * Constructor con parámetros de la clase Empleado.
     * 
     * @param nombre Nombre del empleado.
     * @param numEmpleado Número de empleado.
     * @param sueldo Sueldo del empleado.
     */
    public Empleado(String nombre, int numEmpleado, float sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    
    /**
     * Obtiene el nombre del empleado.
     * 
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de empleado.
     * 
     * @return Número de empleado.
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Obtiene el sueldo del empleado.
     * 
     * @return Sueldo del empleado.
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre Nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el número de empleado.
     * 
     * @param numEmpleado Nuevo número de empleado.
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * Establece el sueldo del empleado.
     * 
     * @param sueldo Nuevo sueldo del empleado.
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Método para aumentar el sueldo del empleado en un porcentaje dado.
     * 
     * @param porcentajeDeAumento Porcentaje de aumento del sueldo.
     */
    public void aumentarSueldo(int porcentajeDeAumento) {
        sueldo += sueldo * porcentajeDeAumento / 100;
    }

    /**
     * Método que devuelve una representación en cadena del empleado.
     * 
     * @return Representación en cadena del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
}
