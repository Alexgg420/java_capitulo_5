import java.util.Scanner;
public class Ejercicio68{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextInt();
        long numini = num;
        long rot = 0;
        long volt = 0;
        if (num < 0){
            System.out.println("El número no puede ser negativo");
        }
        else{
            while (num > 0){
                rot = rot * 10;
                if ((num % 2) == 0){
                    rot = rot + (num % 10) + 1;
                }
                if ((num % 2) != 0){
                    rot = rot + (num % 10) - 1;
                }
                num = num / 10;
            }
            while (rot > 0){
                volt = volt * 10;
                volt = volt + (rot % 10);
                rot = rot / 10;
            }
            System.out.println("Dislocando el "+numini+" sale el "+volt);
        }
        sc.close();
    }
}