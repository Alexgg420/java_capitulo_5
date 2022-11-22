import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber si es primo o no: ");
        int n1 = sc.nextInt();
        boolean primo = true;
        for (int i = 2; i < n1; i++){
            if ((n1 % i) == 0){
                primo = false;
            }
        }
        if (primo) {
            System.out.println("El número es primo");
        }
        else {
            System.out.println("El número no es primo");
        }
        sc.close();
    }
}