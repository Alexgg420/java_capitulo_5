import java.util.Scanner;
public class Ejercicio51{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long rot = 0;
        long volt = 0;
        long numini = num;
        if (num < 0){
            System.out.print("El número no puede ser negativo");
        }
        else {
            while ((num % 10) != 0){
                rot = rot * 10;
                rot = rot + (num % 10);
                num = num / 10;
            }
            while ((rot % 10) != 0){
                if ((rot % 10) == 0 || (rot % 10) == 8){
                    rot = rot / 10;
                }
                if ((rot % 10) != 0 && (rot % 10) != 8){
                    volt = volt * 10;
                    volt = volt + (rot % 10);
                }
                rot = rot / 10;
            }
            if (numini == volt){
                System.out.print("El gusano numérico no se ha comido ningún número");
            }
            if (numini != volt){
                System.out.print("Después de haber sido comido por el gusano numérico, se queda en: "+volt);
            }
        }
        sc.close();
    }
}