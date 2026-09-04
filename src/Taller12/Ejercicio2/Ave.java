package Taller12.Ejercicio2;

public class Ave implements Volador, Cantante {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando por el cielo.");
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " está cantando una hermosa melodía.");
    }
}
