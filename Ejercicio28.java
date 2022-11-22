import java.util.Scanner;
public class Ejercicio28{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para conocer su factorial: ");
        int num;
        double fact;
        fact = 1;
        num = sc.nextInt();
        if (num < 1){
            System.out.print("El número debe de ser mayor a 0");
        }
        for (int i = num; i >= 1; i--){
            fact = fact * i;
        }
        System.out.print("El factorial de "+num+" es "+fact);
        sc.close();
    }
}