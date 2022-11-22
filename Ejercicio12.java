import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de primeros números de la serie de Fibonacci que quieres que se muestre en pantalla: ");
        int max = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print("0 1");
        for (int i = 1; i <= max; i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }
}