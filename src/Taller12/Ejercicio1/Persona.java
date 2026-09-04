package Taller12.Ejercicio1;

public class Persona implements Hablador, Trabajador {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está hablando con sus compañeros.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando en sus tareas.");
    }
}
