import java.util.Scanner;
public class Ejercicio59{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca la altura del árbol: ");
        int h = sc.nextInt();
        // estrella
        for (int i = 0; i < (h - 3); i++){
            System.out.print(" ");
        }
        System.out.println("*");
        // árbol
        for (int i = 0; i < h - 3; i++){
            // espacios
            for (int j = (h - i - 3); j > 0; j--){
                System.out.print(" ");
            }
            // hojas superiores
            for (int j = 0; j < (i * 2) + 1; j++){
                if ((j == 0) || (j == (i * 2))){
                    System.out.print("^");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i == (h - 4)){
                for (int j = 0; j < ((i * 2) + 3); j++){
                    System.out.print("^");
                }
            }
        }
        System.out.println();
        // tronco
        for (int i = 0; i < (h - 3); i++){
            System.out.print(" ");
        }
        System.out.println("Y");
        sc.close();
    }
}