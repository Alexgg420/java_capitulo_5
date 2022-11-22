import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número para conocer el cuadrado y el cubo de ese número y de los cuatro números consecutivos: ");
        int num = sc.nextInt();
        int max = num + 4;
        for (int i = num; i <= max ; i++){
            System.out.printf("%-8s %-10s %-10s", i, i*i, i*i*i);
            System.out.println("");
        }
        sc.close();
    }
}