/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author jazm6
 */
public class Dalmata extends Perro{
    private int manchas;

    public Dalmata() {
    }

    public Dalmata(int manchas) {
        this.manchas = manchas;
    }

    public Dalmata(int manchas, String entrenamiento) {
        super(entrenamiento);
        this.manchas = manchas;
    }

    public Dalmata(int manchas, String entrenamiento, String color, int peso, int edad, String nombre, String tamaño) {
        super(entrenamiento, color, peso, edad, nombre, tamaño);
        this.manchas = manchas;
    }

    public int getManchas() {
        return manchas;
    }

    public void setManchas(int manchas) {
        this.manchas = manchas;
    }

    @Override
    public String toString() {
        return super.toString()+ "Dalmata{" + "manchas=" + manchas + '}';
    }
    
    
    
}
