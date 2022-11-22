import java.util.Scanner;
public class Ejercicio57{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int h = sc.nextInt();
        // parte superior
        for (int i = 0; i < h; i++){
            System.out.print("*");
        }
        System.out.println();
        // parte central
        for (int i = 1; i < h - 1; i++){
            for (int j = 1; j < i + 1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 2; j < h - i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        // parte inferior
        for (int i = 0; i < h; i++){
            if (i < (h - 1)){
                System.out.print(" ");
            }
            if (i == (h - 1)){
                System.out.println("*");
            }
        }
        sc.close();
    }
}