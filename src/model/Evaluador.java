package model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Evaluador {

    public List<Empleado> evaluar(
            List<Empleado> listaEmpleados, BiPredicate<Integer, String> predicateEvaluador) {

        List<Empleado> listaEmpAprobados = new ArrayList<>();
        for (Empleado empleado : listaEmpleados) {
            if (predicateEvaluador.test(empleado.getEdad(), empleado.getDepartamento())) {
                listaEmpAprobados.add(empleado);
            }
        }
        return listaEmpAprobados;
    }

    public List<Empleado> evaluarAlContrario(
            List<Empleado> listaEmpleados, Predicate<Empleado> predicateEvaluador) {

        List<Empleado> listaEmpNoAprobados = new ArrayList<>();
        for (Empleado empleado : listaEmpleados) {
            if (predicateEvaluador.negate().test(empleado)) {
                listaEmpNoAprobados.add(empleado);
            }
        }
        return listaEmpNoAprobados;
    }

}
