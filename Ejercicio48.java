import java.util.Scanner;
public class Ejercicio48{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        long num = sc.nextLong();
        long aux;
        boolean found = false;
        System.out.print("Dígitos que aparecen en el número: ");
        for (int i = 0; i < 10; i++){
            aux = num;
            found = false;
            while (aux > 0){
                if (i == aux % 10){
                    found = true;
                }
                aux = aux / 10;
            }
            if (found){
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
        System.out.print("Dígitos que no aparecen en el número: ");
        for (int i = 0; i < 10; i++){
            aux = num;
            found = false;
            while (aux > 0 && !found){
                if (i == aux % 10){
                    found = true;
                }
                aux = aux / 10;
            }
            if (!found){
                System.out.printf("%d ", i);
            }
        }
        sc.close();
    }
}