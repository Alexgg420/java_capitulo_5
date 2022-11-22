import java.util.Scanner;public class Ejercicio20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el símbolo o caracter con el que formar la pirámide: ");
        String simb = sc.nextLine();
        System.out.print("Introduce la altura de la pirámide: ");
        int alt = sc.nextInt();
        if (alt < 1){
            System.out.print("La altura no puede ser nula o negativa");
        }
        for (int i = 1; i <= alt; i++) {
            for (int j = alt - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if ((j > 1) && (j < i * 2 - 1) && (i < alt)){
                    System.out.print(" ");
                }
                else {
                    System.out.print(simb);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}