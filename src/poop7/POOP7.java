/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 *
 * @author jazm610
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("oscar", 01, 16f);
        
        
        Empleado empleado2 = new Empleado("Gabo", 25, 17f);
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        
        empleado1.aumentarSueldo(10);
        empleado2.aumentarSueldo(20);
        
        Gerente gerente1 = new Gerente(20, "Diana", 38, 25f);
        System.out.println(gerente1);
        
        Gerente gerente2 = new Gerente();
        System.out.println(gerente2);
        gerente2.setPresupuesto(300);
        System.out.println(gerente2);
        gerente2.setNombre("Yorch");
        gerente2.setNumEmpleado(32);
        gerente2.setSueldo(50f);
        System.out.println(gerente2);
        System.out.println(gerente2.getNombre());
        
        Dalmata dalmata1 = new Dalmata(28, "Muy entrenado", "Blanco y negro", 40, 10, "Pongo", "Grande");
        System.out.println(dalmata1);
        dalmata1.ladrar();
        
        Pastor_Aleman pastor1 = new Pastor_Aleman ("Buen olfato", "No entrenado", "Cafe", 50, 8, "Toby", "Grande");
        System.out.println(pastor1);
        pastor1.dormir();
        
        Perico perico1 = new Perico("Mucho", "Corto", "Corto", "Corto", "Verde", 2, 3, "Pedro", "Pequeño");
        System.out.println(perico1);
        perico1.canto();
        
        Paloma paloma1 = new Paloma("Buena", "Mediano", "Grande", "Grande", "Gris", 2, 4, "Rufus", "Mediana");
        System.out.println(paloma1);
        paloma1.mandarMensaje();
        paloma1.jugar();
    }
}
