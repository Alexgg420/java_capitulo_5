import java.util.Scanner;
public class Ejercicio29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número positivo: ");
        int num1 = sc.nextInt();
        if (num1 <= 1){
            System.out.println("Por favor, introduzca un número mayor a 1 para que el programa realice bien su función");
        }
        if (num1 > 1){
            System.out.println("El programa calcula los números positivos menores a "+num1+" que no sean divisibles entre");
            System.out.print("otro número que ud. introducirá a continuación: ");
            int num2 = sc.nextInt();
            if (num2 < 1){
                System.out.println("El número debe ser mayor a 0");
            }
            if (num2 == 1){
                System.out.println("Todos los números son divisibles entre 1");
            }
            if (num2 >= num1){
                System.out.println("El número debe ser menor a "+num1);
            }
            if ((num2 > 1) && (num2 < num1)){
                System.out.println("Los números mostrados a continuación son los menores a "+num1+" que no son divisibles entre "+num2+":");
                for (int i = 1; i < num1; i++){
                    if ((i % num2) != 0){
                        System.out.print(i + " ");
                    }
                }
            }
        }
        sc.close();
    }
}