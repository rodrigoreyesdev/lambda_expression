import model.Evaluador;
import model.Empleado;
import model.Funciones;

import java.util.Arrays;
import java.util.List;

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
        List<Empleado> empSalariosAltos = evaluador.evaluar(
                listaEmpleados, empleado -> empleado.getSalario() > 500);
        System.out.println("" +
                "\nEmpleado con salario mayor a 500 ");
        for (Empleado empleado : empSalariosAltos) {
            System.out.println("Empleado : " + empleado.getNombre());
        }
        List<Empleado> empInicianConC = evaluador.evaluar(
                listaEmpleados, empleado -> empleado.getNombre().toUpperCase().startsWith("C"));
        System.out.println("" +
                "\nEmpleado inicia su nombre con letra C ");
        for (Empleado empleado : empInicianConC) {
            System.out.println("Empleado : " + empleado.getNombre());
        }
        List<Empleado> empJovenes = evaluador.evaluar(
                listaEmpleados, empleado -> empleado.getEdad() < 25);
        System.out.println("" +
                "\nEmpleado joven menor a 25 ");
        for (Empleado empleado : empJovenes) {
            System.out.println("Empleado : " + empleado.getNombre());
        }

        Funciones funciones = new Funciones();
        for (Empleado empleado : empJovenes) {
            double nuevoSalario = funciones.incrementaSalario(
                    empleado, 10,
                    (salario, incremento) -> salario + (salario * (incremento / 100)));
            empleado.setSalario(nuevoSalario);
        }
        System.out.println("" +
                "\nSalarios actualizados para los empleados jovenes ");
        for (Empleado empleado : empJovenes) {
            System.out.println("Empleado menor a 25 " + empleado.getNombre() + " con salario actualizado : " + empleado.getSalario());
        }
        List<Empleado> empMayores = evaluador.evaluarAlContrario(
                listaEmpleados, empleado -> empleado.getEdad() < 25);
        System.out.println("\nEmpleados mayores ");
        for (Empleado empleado : empMayores) {
            System.out.println("Empleado mayor a 25 " + empleado.getNombre());
        }
    }

}
