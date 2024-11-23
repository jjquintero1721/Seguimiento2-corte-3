package predicate;
import java.util.function.Predicate;


public class ejemplo1 {
    public static void main(String[] args) {
        Predicate<Integer> par = x -> x%2==0;

        boolean num1 = par.test(10);
        System.out.println("¿El número dado es par? : "+ num1);

        boolean num2 = par.test(3);
        System.out.println("¿El número dado es par? : "+ num2);

    }
}
