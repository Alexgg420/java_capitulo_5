import java.util.Scanner;
public class Ejercicio52{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long aux = num;
        int longitud = 0;
        while (aux > 0){
            aux = aux / 10;
            longitud++;
        }
        int num1 = (int)(num / Math.pow(10, longitud - 1));
        int res = (int)(num % Math.pow(10, longitud - 1));
        System.out.printf("El número resultado es: %d", res * 10 + num1);
        sc.close();
    }
}