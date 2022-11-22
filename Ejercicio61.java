import java.util.Scanner;
public class Ejercicio61{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la V (mayor o igual a 3: ");
        int h = sc.nextInt();
        String b = "***";
        if (h < 3){
            System.out.println("La altura mínima es 3");
        }
        else {
            for (int i = 0; i < h; i++){
                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                System.out.print(b);
                for (int j = 0; j < ((2 * h) - (i * 2) - 2); j++){
                    System.out.print(" ");
                }
                System.out.print(b);
                System.out.println();
            }
        }
        sc.close();
    }
}