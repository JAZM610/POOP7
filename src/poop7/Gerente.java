/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase que representa a un Gerente, que es una extensión de la clase Empleado.
 * 
 * @author jazm6
 */
public class Gerente extends Empleado {
    private float presupuesto;

    /**
     * Constructor por defecto de la clase Gerente.
     * Inicializa los atributos con valores predeterminados.
     */
    public Gerente() {
        // Constructor vacío
    }

    /**
     * Constructor con parámetros de la clase Gerente.
     * 
     * @param presupuesto Presupuesto asignado al gerente.
     * @param nombre Nombre del gerente.
     * @param numEmpleado Número de empleado del gerente.
     * @param sueldo Sueldo del gerente.
     */
    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    
    /*
    public Gerente(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    */
    
    /**
     * Obtiene el presupuesto asignado al gerente.
     * 
     * @return Presupuesto del gerente.
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     * Establece el presupuesto del gerente.
     * 
     * @param presupuesto Nuevo presupuesto del gerente.
     */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    /**
     * Asigna un nuevo presupuesto al gerente.
     * 
     * @param presupuesto Nuevo presupuesto a asignar.
     * @return El presupuesto asignado.
     */
    public float asignarPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
        return presupuesto;
    }

    /**
     * Método que devuelve una representación en cadena del gerente.
     * 
     * @return Representación en cadena del gerente.
     */
    @Override
    public String toString() {
        return super.toString() + " Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
