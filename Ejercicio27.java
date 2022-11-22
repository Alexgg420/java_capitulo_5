import java.util.Scanner;
public class Ejercicio27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra la cantidad de múltiplos de 3,");
        System.out.println("sus valores y la suma de todos ellos que hay entre el número 1 y el número que ud. introduzca.");
        System.out.println("Introduzca un número positivo y mayor o igual a 3 para que el programa realice su función: ");
        int num;
        int cont;
        int total;
        total = 0;
        cont = 0;
        num = sc.nextInt();
        if (num < 1){
            System.out.print("El número no puede ser menor que 1");
        }
        if ((num >= 1) && (num < 3)){
            System.out.print("No hay ningún múltiplo de 3 entre el 1 y el número introducido");
        }
        for (int i = 3; i <= num; i++){
            if (i % 3 == 0){
                cont++;
                total = total + i;
                System.out.println(i+" ");
            }
        }
        System.out.println("Entre el número 1 y el número "+num+" hay "+cont+" múltiplos de 3");
        System.out.println("La suma de todos ellos es de: "+total);
        sc.close();
    }
}