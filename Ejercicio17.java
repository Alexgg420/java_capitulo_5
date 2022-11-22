import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número positivo para sumar los 100 números siguientes a este: ");
        int n1 = sc.nextInt();
        if (n1 < 0){
            System.out.println("El número debe ser positivo");
        }
        if (n1 >= 0){
            int suma = 0;
            for(int i = n1; i < (n1 + 100); i++) {
                suma += i;
            }
            System.out.print("La suma de los 100 números siguientes a ");
            System.out.println(n1 + " es " + suma + ".");
        }
        sc.close();
    }
}