import java.util.Scanner;
public class Ejercicio58{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long numini = num;
        long rot = 0;
        long cont = 0;
        float media;
        if (num < 0){
            System.out.print("El número debe ser positivo");
        }
        else{
            while ((num % 10) != 0){
                rot = rot + (num % 10);
                cont++;
                num = num / 10;
            }
            media = (float)rot/(float)cont;
            System.out.printf("La media de la suma de los dígitos del número %d es %.2f", numini, media);
        }
        sc.close();
    }    
}