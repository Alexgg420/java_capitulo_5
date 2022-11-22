import java.util.Scanner;
public class Ejercicio54{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altua de la pirámide: ");
        int h = sc.nextInt();
        // parte superior
        for (int i = 0; i < h; i++){
            System.out.print("*");
        }
        System.out.println();
        // parte central
        for (int i = 1; i < (h - 1); i++){
            System.out.print("*");
            for (int j = 0; j < (h - i - 2); j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        // parte inferior
        System.out.print("*");
        sc.close();
    }
}