import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        String character;

        System.out.print("Introduce la altura de la pirámide: ");
        height = sc.nextInt();
        System.out.print("Introduce el caracter a utilizar: ");
        character = sc.next();

        for (int i = 1; i <= height; i++) {
            for (int j = height - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(character);
            }
            System.out.println();

        }
        sc.close();
    }
}