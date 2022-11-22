import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 320;
        do{
            System.out.println(n);
            n = n - 20;
        }
        while (n >= 160);
        sc.close();
    }
}