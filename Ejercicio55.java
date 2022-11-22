import java.util.Scanner;
public class Ejercicio55{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long volt = 0;
        long volt2 = 0;
        long res = 0;
        while (num > 0){
            volt = volt * 10;
            volt = volt + (num % 10);
            num = num / 10;
        }
        res = (volt % 10);
        volt = volt / 10;
        while (volt > 0){
            volt2 = volt2 * 10;
            volt2 = volt2 + (volt % 10);
            volt = volt / 10;
        }
        volt2 = volt2 * 10;
        volt2 = volt2 + res;
        System.out.printf("El número desplazado es %d", volt2);
        sc.close();
    }
}