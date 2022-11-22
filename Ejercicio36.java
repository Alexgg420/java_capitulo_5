import java.util.Scanner;
public class Ejercicio36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo para saber si es capicúa o no: ");
        long num = sc.nextLong();
        long numini = num;
        long cont;
        cont = 0;
        if (num < 0){
            System.out.print("El número no puede ser negativo");
        }
        if (num > 0) {
            while ((num % 10) != 0){
                cont = cont * 10;
                cont = cont + (num % 10);
                num = num / 10;
            }
            if (numini == cont){
                System.out.print("El número es capicúa");
            }
            else{
                System.out.print("El número no es capicúa");
            }
        }
        sc.close();
    }
}