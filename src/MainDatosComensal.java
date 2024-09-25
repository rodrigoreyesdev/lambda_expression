import model.Comensal;

import java.util.function.Function;

public class MainDatosComensal {

    public static void main(String[] args) {
        Comensal comensal = new Comensal("Rodrigo", 256.2,5);
        String nombreComensal= (String) getDatosComensal(comensal, x -> x.getNombre());
        int mesa= (int) getDatosComensal(comensal, x -> x.getMesa());
        // Using method Apply to convert an input into diferent type int the result
        //This example let know that we can work more data to return an specific result different from input
        System.out.println("El nombre del comensal es: "+nombreComensal);
        System.out.println("La mesa del comensal es: "+mesa);

    }

    public static Object getDatosComensal(Comensal comensal, Function<Comensal, Object> function)
    {
     return  function.apply(comensal);

    }
}
