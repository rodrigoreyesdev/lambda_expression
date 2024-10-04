import model.Evaluador;
import model.Empleado;

import java.util.Arrays;
import java.util.List;

public class MainEmpleado {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Uno",21, 123.1,"Cobranzas"),
                new Empleado("Dos",32, 456.2,"Ventas"),
                new Empleado("Tres",33, 789.3,"Mostrador"),
                new Empleado("Cuatro", 24,159.4,"Telemarketing"),
                new Empleado("Cinco",25, 753.5,"Compras")
        );

        Evaluador evaluador = new Evaluador();
        List<Empleado> empSalariosAltos = evaluador.evaluar(
                listaEmpleados, empleado->empleado.getSalario()>500);

        for (Empleado empleado : empSalariosAltos) {
            System.out.println("Empleado con salario mayor a 500 : " + empleado.getNombre());
        }
        List<Empleado> empInicianConC = evaluador.evaluar(
                listaEmpleados, empleado->empleado.getNombre().toUpperCase().startsWith("C"));

        for (Empleado empleado : empInicianConC) {
            System.out.println("Empleado inicia su nombre con letra C : " + empleado.getNombre());
        }
        List<Empleado> empJovenes = evaluador.evaluar(
                listaEmpleados, empleado->empleado.getEdad()<25);

        for (Empleado empleado : empJovenes) {
            System.out.println("Empleado joven, menor a 25 : " + empleado.getNombre());
        }
    }

}
