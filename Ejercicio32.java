import java.util.Scanner;
public class Ejercicio32{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num;
        long suma;
        long volt;
        suma = 0;
        volt = 0;
        System.out.print("Introduzca un número: ");
        num = sc.nextLong();
        while (num > 0){
            volt = volt * 10;
            volt = volt + (num % 10);
            num = num / 10;
        }
        System.out.print("Los dígitos pares del número son: ");
        while (volt > 0){
            if ((volt % 2) == 0){
                System.out.print((volt % 10) + " ");
                suma = suma + (volt % 10);
            }
            volt = volt / 10;
        }
        if (suma > 0){
            System.out.print("La suma de los dígitos pares es: "+suma);
        }
        else {
            System.out.print("No existen dígitos pares");
        }
        sc.close();
    }
}