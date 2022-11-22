import java.util.Scanner;
public class Ejercicio37{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número para que el programa lo muestre en el sistema de palotes: ");
        long num = sc.nextLong();
        long numini = num;
        long cont;
        long i;
        i = 0;
        cont = 0;
        if (num < 0){
            System.out.print("El programa funciona con números positivos");
        }
        if (num == 0){
            System.out.print("En el sistema de palotes, el número 0 es: -");
        }
        if (num > 0){
            while ((num % 10) != 0){
                cont = cont * 10;
                cont = cont + (num % 10);
                num = num / 10;
            }
            while ((cont % 10) != 0){
                i = i * 10;
                i = i + (cont % 10);
                cont = cont / 10;
                for (int j = 1; j <= (i % 10); j++){
                    System.out.print("| ");
                    if ((i % 10) == 0){
                        System.out.print("- ");
                    }
                }
                System.out.print("- ");
            }
        }
        sc.close();
    }
}