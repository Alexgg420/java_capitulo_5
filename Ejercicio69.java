import java.util.Scanner;
public class Ejercicio69{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int h = sc.nextInt();
        for (int i = 0; i < h; i++){
            for (int j = (h - i) - 1; j > 0; j--){
                System.out.print(" ");
            }
            if ((i % 2) == 0){
                for (int j = 0; j < (i * 2) + 6; j++){
                    System.out.print("*");
                }
            }
            else {
                for (int j = 0; j < (i * 2) + 6; j++){
                    if (j < i + 1 || j > i + 4){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}