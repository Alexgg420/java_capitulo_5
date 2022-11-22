import java.util.Scanner;
public class Ejercicio26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int dig;
        int res;
        int cont;
        cont = 1;
        res = 0;
        System.out.print("Introduzca un número positivo: ");
        num = sc.nextInt();
        if (num < 0){
            System.out.print("El número no es válido");
        }
        else{
            System.out.print("Introduzca un dígito del número anterior: ");
            dig = sc.nextInt();
            if (dig < 0){
                System.out.print("El número no es válido");
            }
            else{
                while ((num % 10) != 0){
                    res = res * 10;
                    res = res + (num % 10);
                    num = num / 10;
                }
                while (res > 0) {
                    if (res % 10 == dig) {
                        System.out.println("Posición "+cont);
                    }
                    res = res / 10;
                    cont++;
                }
            }
        }
        sc.close();
    }
}