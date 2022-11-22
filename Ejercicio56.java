import java.util.Scanner;
public class Ejercicio56{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int h = sc.nextInt();
        int esp = 0;
        for (int i = 0; i < h; i++){
            for (int j = 0; j < esp; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < h - i; j++){
                System.out.print("*");
            }
            System.out.println();
            esp++;
        }
        sc.close();
    }
}