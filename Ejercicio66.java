import java.util.Scanner;
public class Ejercicio66{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la señal: ");
        int h = sc.nextInt();
        if ((h < 3) || ((h % 2) == 0)){
            System.out.println("La altura debe ser un número impar mayor o igual que 3");
        }
        else {
            String esp = "*    *";
            for (int i = 0; i <= (h / 2); i++){
                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                System.out.println(esp);
            }
            for (int i = (h / 2) + 1; i < h; i++){
                for (int j = h - i - 1; j > 0; j--){
                    System.out.print(" ");
                }
                System.out.println(esp);
            }

        }
        sc.close();
    }
}