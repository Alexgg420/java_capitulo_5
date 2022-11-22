import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el símbolo o carácter con el que formar la pirámide: ");
        String simb = sc.nextLine();
        System.out.print("Introduzca la altura de la pirámide: ");
        int alt = sc.nextInt();
        if (alt < 1){
            System.out.print("La pirámide no puede tener una altura nula o negativa");
        }
        for (int cont = 1; cont <= alt; cont = cont + 1){
            for (int i = alt - cont - 1; i >= 0; i = i - 1){
                System.out.print(" ");
            }
            for (int i = 1; i <= ((cont * 2) - 1); i = i + 1){
                System.out.print(simb);
            }
            System.out.println();
        }
        sc.close();
    }
}