import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println(n);
            n = n + 5;
        }
        while (n <= 100);
        sc.close();
    }
}