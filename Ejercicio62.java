import java.util.Scanner;
public class Ejercicio62{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo para saber si es afortunado o no: ");
        long num = sc.nextLong();
        int contaf = 0;
        int contnoaf = 0;
        long numini = num;
        long rot = 0;
        if (num < 0){
            System.out.print("El número no puede ser negativo");
        }
        if (num >= 0){
            while ((num > 0)){
                rot = rot * 10;
                rot = rot + (num % 10);
                num = num / 10;
                if ((num % 10) == 3 || (num % 10) == 7 || (num % 10) == 8 || (num % 10) == 9){
                    contaf++;
                }
                if ((num % 10) == 1 || (num % 10) == 2 || (num % 10) == 4 || (num % 10) == 5 || (num % 10) == 6 || (num % 10) == 0){
                    contnoaf++;
                }
            }
            if (contaf > contnoaf){
                System.out.println("El número "+numini+" es afortunado");
            }
            if (contaf < contnoaf){
                System.out.println("El número "+numini+" no es afortunado");
            }
        }
        sc.close();
    }
}