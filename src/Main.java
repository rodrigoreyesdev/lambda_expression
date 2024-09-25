public class Main {
    public static void main(String[] args) {

        CalculadoraLongFunctionalLambda calL = (x, y) -> x + y;
        System.out.println(create().calcular(2L, 2L));
    }

    public static CalculadoraLongFunctionalLambda create() {
        return ((x, y) -> x / y);
    }
}