import model.Empleado;
import model.Evaluador;
import model.Funciones;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class MainEmpleado {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Uno", 21, 123.1, "Cobranzas"),
                new Empleado("Dos", 32, 456.2, "Ventas"),
                new Empleado("Tres", 33, 789.3, "Mostrador"),
                new Empleado("Cuatro", 24, 159.4, "Telemarketing"),
                new Empleado("Cinco", 25, 753.5, "Compras")
        );

        Evaluador evaluador = new Evaluador();
        BiPredicate<Integer, String> primerCriterio =
                (edad, departamento) ->
                        (edad >= 25) && (departamento.equals("Ventas"));
        BiPredicate<Integer, String> segundoCriterio =
                (edad, departamento) ->
                        (edad >= 25) && (departamento.equals("Mostrador"));
        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);
        List<Empleado> empActualizada = evaluador.evaluar(
                listaEmpleados,criterio);
        System.out.println("" +
                "\nEmpleado  de Ventas mayores a 25 años");
        for (Empleado empleado : empActualizada) {
            System.out.println("Empleado : " + empleado.getNombre()+" Edad : " + empleado.getEdad()+" Departamento : " + empleado.getDepartamento());
        }

    }
}
