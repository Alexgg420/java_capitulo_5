import java.util.Scanner;
public class Ejercicio25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número. El programa mostrará el mismo número pero al revés.");
        int num = sc.nextInt();
        if (num >= 0){
            int res;
            res = 0;
            while ((num % 10) != 0){
                res = res * 10;
                res = res + (num % 10);
                num = num / 10;
            }
            System.out.print("El número al revés es: "+res);
        }
        else{
            System.out.print("El número no es válido");
        }
        sc.close();
    }
}