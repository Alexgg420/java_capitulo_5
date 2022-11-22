import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos números enteros positivos. El programa dirá cuántos números con una separación de siete números hay entre los dos.");
        System.out.println("Por lo tanto, se recomienda que la separación entre los dos números sea mayor que 7 para entender mejor la función del programa.");
        System.out.print("Introduzca un número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca otro número entero distinto al anterior: ");
        int num2 = sc.nextInt();
        if(num1 == num2) {
        System.out.print("Los números deben ser distintos");
        }
        if (num1 > num2) {
        System.out.println("El segundo número debe ser mayor que el primero.");
        }
        for(int i = num1; i <= num2; i = i + 7) {
        System.out.print(i + " ");
        }
    }
}