import java.util.Scanner;
public class Ejercicio41{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        long num = sc.nextLong();
        if (num < 0){
            System.out.print("El número debe ser positivo");
        }
        else {
            long numini = num;
            long cont;
            cont = 0;
            long par;
            par = 0;
            long impar;
            impar = 0;
            while ((num % 10) != 0){
                cont = cont + (num % 10);
                num = num / 10;
                if ((cont % 2) == 0){
                    par++;
                }
                if ((cont % 2) != 0){
                    impar++;
                }
                cont = cont / 10;
            }
            System.out.println("El número "+numini+" posee "+par+" cifras pares y "+impar+" cifras impares");
        }
        sc.close();
    }
}