import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (x,y) -> x<y;
        // Using method Test to validate expression x < y and return boolean value
        System.out.println(biPredicate.test(2,3));
    }

}
