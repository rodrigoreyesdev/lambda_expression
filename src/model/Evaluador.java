package model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Evaluador {

    public List<Empleado> evaluar(
            List<Empleado> listaEmpleados, Predicate<Empleado> predicateEvaluador) {

        List<Empleado> listaEmpAprobados = new ArrayList<>();
        for (Empleado empleado : listaEmpleados) {
            if (predicateEvaluador.test(empleado)) {
                listaEmpAprobados.add(empleado);
            }
        }
        return listaEmpAprobados;
    }

}
