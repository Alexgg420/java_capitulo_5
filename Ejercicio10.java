import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        System.out.println("Introduzca tantos números positivos como desee.");
        System.out.println("Cuando no desee introducir más números, introduzca un número negativo.");
        System.out.println("Tras escribir el número negativo, el programa calculará la media de todos los números introducidos.");
        System.out.println("Por favor, introduzca los números de los que desee conocer la media:");
        Scanner sc = new Scanner(System.in);
        float suma=0;
        float valor=0;
        int cont=0;
        do {
            valor = sc.nextFloat();
            if (valor >= 0){
                suma = suma + valor;
                cont++;
            }
        }while (valor >= 0);
        if (cont > 0){
            System.out.println("La media es "+(suma/cont));
        }
        sc.close();
            
    }
}