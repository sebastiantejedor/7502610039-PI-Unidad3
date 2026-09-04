package Taller13.Ejercicio3;

public class Pato implements Volador, Nadador {
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}

/*
Codigo erroneo
public class Pato implements Volador, Nadador {
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    // Falta implementar nadar() -> ERROR de compilación
}
 */
