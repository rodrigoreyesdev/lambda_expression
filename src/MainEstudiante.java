import model.Estudiante;
import model.Funciones;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainEstudiante {
    public static void main(String[] args) {
        List<Estudiante> listaEstudiantes = Arrays.asList(
                new Estudiante("Uno", 10),
                new Estudiante("Dos", 20),
                new Estudiante("Tres", 30),
                new Estudiante("Cuatro", 40),
                new Estudiante("Cinco", 50));

        Funciones funciones = new Funciones();
        Consumer<Estudiante> consumer1 =
                e -> System.out.println("Nombre: " + e.getNombre() +
                        " Calificación: " + e.getCalificacion());
        System.out.println("\nEstudiantes sin calificacion actualizada");
        funciones.aceptaTodos(listaEstudiantes, consumer1);
        Consumer<Estudiante> consumer2 =
                e -> e.setCalificacion(e.getCalificacion() * 1.15);
        Consumer<Estudiante> consumer3 =consumer1.andThen(consumer2);
        System.out.println("\nEstudiantes con calificacion actualizada");
        funciones.aceptaTodos(listaEstudiantes, consumer3);


    }
}
