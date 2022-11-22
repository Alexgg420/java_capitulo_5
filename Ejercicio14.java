import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número como base: ");
        int base = sc.nextInt();
        System.out.print("Introduce un número como exponente de la base: ");
        int expo = sc.nextInt();
        int pot = 1;
        if (expo == 0){
            pot = 1;
            System.out.println(base+" ^ "+expo+" = "+pot);
        }
        if (expo > 1){
            for (int i = 0; i < expo; i++){
            pot *= base;
            }
            System.out.println(base +" ^ "+expo+" = "+pot);
        }
        sc.close();
    }
}