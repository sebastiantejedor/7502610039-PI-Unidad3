package Taller13.Ejercicio2;

public class Pato implements Volador, Nadador {
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando por el aire.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando en el agua.");
    }
}