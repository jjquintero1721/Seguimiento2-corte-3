package function;
import java.util.function.BiFunction;

public class bifunction1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> numeros = (a, b) -> (a+b);
        int operacion = numeros.apply(-35, 17);
        System.out.println("La suma da como resultado: " + operacion);
        if (operacion>=0 && operacion%2==0){
            System.out.println("El resultado de la suma es un número par y positivo");
        }else if(operacion<0 && operacion%2!=0){
            System.out.println("El resultado de la suma es un número impar y negativo");
        }else if(operacion<0 && operacion%2==0){
            System.out.println("El resultado de la suma es un número par y negativo");
        }else if (operacion>=0 && operacion%2!=0){
            System.out.println("El resultado de la suma es un número impar y positivo");
        }
    }
}
