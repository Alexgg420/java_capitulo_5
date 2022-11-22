import java.util.Scanner;
public class Ejercicio31{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la letra L: ");
        int h = sc.nextInt();
        int cant = ((h / 2) + 1);
        for (int i = 0; i < (h - 1); i++){
            System.out.println("*");
        }
        for (int i = 0; i < cant; i++){
            System.out.print("* ");
        }
        sc.close();
    }
}