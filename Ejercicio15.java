import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();
        System.out.print("Introduzca el mayor exponente: ");
        int maxexpo = sc.nextInt();
        int res;
        int exponente;      
        for (int i = 1; i <= maxexpo; i++) {
          res = 1;
          exponente = i;
          for (int j = 0; j < exponente; j++) {
            res *= base;
          }
          System.out.println(base + "^" + i + " = " + res);
        }
        sc.close();
    }
}