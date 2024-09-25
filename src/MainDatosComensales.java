import model.Comensal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainDatosComensales {
    public static void main(String[] args) {
        List<Comensal> listaComensales = Arrays.asList(
                new Comensal("Uno", 123.1, 1),
                new Comensal("Dos", 456.2, 2),
                new Comensal("Tres", 789.3, 3),
                new Comensal("Cuatro", 950.4, 4),
                new Comensal("Cinco", 753.5, 5));
        List<Object> nombresComensal =
                getDatosComensales(listaComensales, x -> x.getNombre());
        List<Object> montosComensal =
                getDatosComensales(listaComensales, x -> x.getMonto_pedido());
        for(Object comensales : nombresComensal){
            System.out.println("El nombre del comensal es: " + comensales);
        }
        for(Object montosComensales : montosComensal){
            System.out.println("El monto pedido del comensal es: " + montosComensales);
        }
    }

    public static List<Object> getDatosComensales
            (List<Comensal> listaMainComensales, Function<Comensal, Object> function) {
        List<Object> listaDatos = new ArrayList<>();
        for (Comensal comensal : listaMainComensales) {
            listaDatos.add(function.apply(comensal));
        }
        return listaDatos;

    }
}
