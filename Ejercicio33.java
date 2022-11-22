import java.util.Scanner;
public class Ejercicio33{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la atura de la U: ");
        int h = sc.nextInt();
        for (int i = 0; i < (h - 1); i++){
            System.out.print("* ");
            for (int j = 0; j < (h - 2); j++){
                System.out.print(" "+" ");
            }
            System.out.println("*");
        }
        System.out.print(" "+" ");
        for (int j = 0; j < (h - 2); j++){
            System.out.print("* ");
        }
        System.out.println(" "+" ");
        sc.close();
    }
}