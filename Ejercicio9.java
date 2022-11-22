import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args) {
        System.out.print("Introduzca un número para conocer cuántos dígitos tiene: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long num2 = num;
        int cont = 0;
        do {
            cont++;
            num = num/10;
        } while (num!=0);
        System.out.print("El número "+num2+" tiene "+cont+" dígitos");
        sc.close();
    }
}