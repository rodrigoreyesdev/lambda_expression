public class Main {
    public static void main(String[] args) {
        // opcion int 1
        engine((int x,int y)->x+y);

        // opcion int 2
        engine((CalculadoraIntFunctionalLambda)(x,y) -> x + y);

        // opcion int 3
        CalculadoraIntFunctionalLambda calI=(x,y)->x+y;
        engine(calI);

        // opcion long 1
        engine((Long x,Long y)->x+y);

        // opcion long 2
        engine((CalculadoraLongFunctionalLambda)(x,y)->x+y);

        // opcion Long 3
        CalculadoraLongFunctionalLambda calL=(x,y)->x+y;
        engine(calL);
    }

    public static void engine(CalculadoraIntFunctionalLambda calculadoraInt){

    }
    public static void engine(CalculadoraLongFunctionalLambda calculadoraLong){

    }
}