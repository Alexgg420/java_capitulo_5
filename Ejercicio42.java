import java.util.Scanner;
public class Ejercicio42{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        boolean primo;
        for (int i = num; i <= num + 4; i++){
            for (int j = 2; j < i; j++){
                if ((i % j) == 0){
                    primo = false;
                }
            }
            if (primo = false){
                System.out.println("El número "+i+" no es primo");
            }
            else {
                System.out.println("El número "+i+" es primo");
            }
        }
        sc.close();
    }
}