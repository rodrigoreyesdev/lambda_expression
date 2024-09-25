import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
       Function<Integer, String> convertidor = x -> Integer.toString(x);
       // Using method Apply to convert an input into diferent type int the result
        System.out.println(convertidor.apply(3).length());
        System.out.println(convertidor.apply(30).length());
    }


    /*Description method apply of Function interface
    Function<Integer,String> convertidor1= new Function<Integer, String>() {
        @Override
        public String apply(Integer integer) {return "";}
    };
 */
}