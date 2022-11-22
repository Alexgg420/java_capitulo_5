import java.util.Scanner;
public class Ejercicio45{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        long num = sc.nextLong();
        long aux = num;
        long cont;
        cont = 0;
        long cont2;
        cont2 = 0;
        long cont3;
        cont3 = 1;
        System.out.println();
        System.out.print("Introduzca la posición: ");
        long pos = sc.nextLong();
        System.out.println();
        System.out.print("Introduzca el número que quiere insertar en dicha posición: ");
        long numpos = sc.nextLong();
        long longitud = 0;
        while (aux > 0){
            aux = aux / 10;
            longitud++;
        }
        long num1 = (int)(num / Math.pow(10, longitud - pos + 1));
        long num2 = (int)(num % Math.pow(10, longitud - pos + 1));
        num1 = num1 * 10;
        num1 = num1 + numpos;
        while ((num2 % 10) != 0){
            cont = cont * 10;
            cont = cont + (num2 % 10);
            num2 = num2 / 10;
        }
        cont = cont / 10;
        while ((cont % 10) != 0){
            cont3 = cont3 * 10;
            cont2 = cont2 * 10;
            cont2 = cont2 + (cont % 10);
            cont = cont / 10;
        }
        num1 = num1 * cont3;
        num1 = num1 + cont2;
        System.out.printf("El número resultante es: %d", num1);
        sc.close();
    }
}