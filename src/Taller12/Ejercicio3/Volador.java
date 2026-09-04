package Taller12.Ejercicio3;

public interface Volador {
    void volar();
}
/*
public interface Volador {
    void volar();
}

public class Piedra implements Volador {
    @Override
    public void volar() {
        System.out.println("La piedra vuela");
    }
}

Por qué es mala práctica:

se rompe la lógica del contrato (una Piedra que "vuela" no representa la realidad).
se termina con métodos vacíos o con comportamiento inventado que confunde a quien use la clase.
Es señal de mal diseño: una interfaz debe representar una capacidad real de la clase, no algo forzado solo porque el compilador lo permite.

En una línea: que el código compile no significa que el diseño esté bien hecho.

 */
