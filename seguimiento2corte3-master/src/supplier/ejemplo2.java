package supplier;
import java.util.function.Supplier;

public class ejemplo2<T> {
    private T object;

    public ejemplo2(T object){
        this.object = object;
    }

    public T getObject(){
        return object;
    }

    public static void main(String[] args) {
        ejemplo2<String> x = new ejemplo2<>("Hola, mundo");
        Supplier<ejemplo2<String>> y = () -> x;

        ejemplo2<Integer> z = new ejemplo2<>(2);
        ejemplo2<Integer> e = new ejemplo2<>(56);
        Supplier<ejemplo2<Integer>> p = () -> z;
        Supplier<ejemplo2<Integer>> t = () -> e;

        System.out.println(y.get().getObject());
        System.out.println(p.get().getObject());
        System.out.println(t.get().getObject());
    }
}
