import java.util.Scanner;
public class Ejercicio53{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int h = sc.nextInt();
        for (int i = 0; i < h; i++){
            for (int j = h - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}