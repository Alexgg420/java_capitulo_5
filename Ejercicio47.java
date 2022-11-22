import java.util.Scanner;
public class Ejercicio47{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura del número 8 (número impar mayor o igual a 5): ");
        long h = sc.nextLong();
        if ((h < 5) || ((h % 2) == 0)){
            System.out.print("La altura introducida no es correcta");
        }
        else{
            long cont = ((h - 3) / 2);
            System.out.println("MMMMMM");
            for (long i = 0; i < cont; i++){
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
            for (long i = 0; i < cont; i++){
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
        }
        sc.close();
    }
}