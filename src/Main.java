public class Main {
    public static void main(String[] args) {

        OperacionesFunctionalLambda operacionesFunctionalLambda =(num1, num2)->System.out.println("realizando operacion con parametros "+ num1+num2);
        Main objeto = new Main();
        //objeto.miMetodo(operacionesFunctionalLambda,25,30);
        //Funcionalidad especializada
        objeto.miMetodo((num1,num2) ->
                System.out.println("parametro1:"+num1+" parametro2:"+num2),25,30);
    }

    public void miMetodo(OperacionesFunctionalLambda opParam, int num1, int num2){
        opParam.imprimeOperacion(num1,num2);
    }
}