import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 360;
        while (n >= 120){
            System.out.println(n);
            n = n - 20;
        }
        sc.close();
    }
}