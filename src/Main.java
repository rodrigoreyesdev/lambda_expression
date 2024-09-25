public class Main {
    public static void main(String[] args) {
        engine((x,y)->x+y);
        engine((x,y)->x/y);
        engine((x,y)->x*y);
        engine((x,y)->x%y);
    }

    public static void engine(CalculadoraFunctionalLambda calculadora){
        int x= 2, y=4;
        int resultado= calculadora.calcular(x,y);
        System.out.println("resultado: "+resultado);
    }
}