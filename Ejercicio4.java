import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int n = 320; n >= 160; n = n - 20){
            System.out.println(n);
        }
        sc.close();
    }
}