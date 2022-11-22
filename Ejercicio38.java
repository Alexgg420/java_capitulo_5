import java.util.Scanner;
public class Ejercicio38{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura del reloj de arena: ");
        int h = sc.nextInt();
        if (h < 3){
            System.out.print("El reloj debe tener una altura mínima de 3");
        }
        if (h >= 3){
            if ((h % 2) == 0){
                System.out.print("El reloj debe tener una altura impar");
            }
            if ((h % 2) != 0){
                for (int i = 0; i < (h / 2); i++){
                    for (int j = 0; j < i; j++){
                        System.out.print(" ");
                    }
                    for (int j = (h - (2 * i)); j >= 1; j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = ((h / 2) + 1); i <= h; i++){
                    for (int j = h - i - 1; j >= 0; j--){
                        System.out.print(" ");
                    }
                    for (int j = 1; j < ((i * 2) - h + 1); j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}