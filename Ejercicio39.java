import java.util.Scanner;
public class Ejercicio39{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        int num = sc.nextInt();
        long fact;
        if (num < 0){
            System.out.print("El número no puede ser negativo");
        }
        if (num == 0){
            System.out.print("0! = 1");
        }
        if (num > 0){
            for (int i = 1; i <= num; i++){
                fact = 1;
                for (int j = 1; j <= i; j++){
                    fact = fact * j;
                }
                System.out.println(i+"! = "+fact);
            }
        }
        sc.close();
    }
}