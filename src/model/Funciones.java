package model;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Funciones {
    public void aceptaTodos(List<Estudiante> estudiantes, Consumer<Estudiante> consumer) {
        for (Estudiante estudiante : estudiantes) {
            consumer.accept(estudiante);
        }
    }
}
