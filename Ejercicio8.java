import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del que desea mostrar la tabla de multiplicar: ");
        int num = sc.nextInt();
        System.out.print("Introduzca hasta qué número desea multiplicar el primer número: ");
        int max = sc.nextInt();
        for (int mul = 1; mul <= max; mul = mul + 1){
            System.out.println(num+" * "+mul+" = "+(num*mul));
        }
        sc.close();
    }
}