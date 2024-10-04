package model;

import java.util.function.BiFunction;

public class Funciones {
    public double incrementaSalario(Empleado empleado, double incremento, BiFunction<Double, Double, Double> biFunction) {
        return biFunction.apply(empleado.getSalario(), incremento);
    }
}
