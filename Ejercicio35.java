import java.util.Scanner;
public class Ejercicio35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la X: ");
        int h = sc.nextInt();
        int i;
        int j;
        if (h < 3){
            System.out.print("La X debe tener una altura mínima de 3");
        }
        if ((h % 2) == 0){
            System.out.print("La altura debe ser un número impar");
        }
        if (((h % 2) != 0) && (h > 3)){
            for (i = 0; i < (h / 2); i++){
                for (j = 0; j < i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (j = 0; j < h - (2 * (i + 1)); j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (j = 0; j < (h / 2); j++){
                System.out.print(" ");
            }
            System.out.println("*");
            for (i = ((h / 2) - 1); i >= 0; i--){
                for (j = 0; j < i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (j = 0; j < h - (2 * (i + 1)); j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        sc.close();
    }
}