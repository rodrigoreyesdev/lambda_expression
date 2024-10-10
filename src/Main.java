import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Test");
        // Using method Test to validate expression x < y and return boolean value
       // System.out.println(biPredicate.test(2,3));
    }

}
