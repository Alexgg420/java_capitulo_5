import java.util.Scanner;
public class Ejercicio22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra los números primos comprendidos entre el 1 y el 100");
        boolean primo;
        for (int num = 2; num <= 100; num++){
            int i;
            i = 2;
            primo = true;
            while(primo && i <= num/2){
                if ((num % i) == 0)
                    primo = false;
                    i++;
            }
            if (primo){
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}