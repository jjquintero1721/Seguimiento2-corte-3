package predicate;
import java.util.function.Predicate;

public class ejemplo2Main {
    public static void main(String[] args) {
        ejemplo2 x = new ejemplo2(true);

        Predicate<ejemplo2> comprobar = ejemplo2::isSoltero;
        if (comprobar.test(x)){
            System.out.println("Usted está soltero");
        }else{
            System.out.println("Usted no está soltero");
        }
    }
}
