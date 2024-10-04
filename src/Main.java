import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (valor) -> valor > 0;
        // Using method Test to validate expression valor > 0 and return boolean value
        System.out.println(predicate.test(123));
    }

}
