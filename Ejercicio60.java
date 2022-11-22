import java.util.Scanner;
public class Ejercicio60{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de los calcetines: ");
        int h = sc.nextInt();
        String f1 = "***     ***";
        String f2 = "******  ******";
        if (h < 4){
            System.out.println("La altura debe ser mayor o igual a 4");
        }
        if (h >= 4){
            for (int j = 0; j < (h - 2); j++){
                System.out.println(f1);
            }
            for (int j = (h - 2); j < h; j++){
                System.out.println(f2);
            }
        }
        sc.close();
    }
}