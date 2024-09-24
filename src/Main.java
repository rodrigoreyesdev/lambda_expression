public class Main {
    public static void main(String[] args) {

        FunctionalLambda functionalLambda=()->System.out.println("llamando metodo abstracto de la interfaz");
        Main objeto = new Main();
        objeto.miMetodo(functionalLambda);
    }

    public void miMetodo(FunctionalLambda param){
        param.saludar();
    }
}