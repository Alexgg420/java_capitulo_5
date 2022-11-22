import java.util.Scanner;
public class Ejercicio23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tantos números positivos como desee.");
        System.out.println("Conforme introduzca esos números, el programa irá sumándolos hasta que el total sea superior a 10000.");
        System.out.println("En el momento en que se supere la cifra, el programa mostrará la cantidad de números introducidos, el");
        System.out.println("valor total y la media de todos.");
        System.out.println("Introduzca los números deseados:");
        int num;
        int cont;
        int valortotal;
        cont = 0;
        valortotal = 0;
        while (valortotal < 10000){
            num = sc.nextInt();
            cont++;
            valortotal += num;
        }
        if (valortotal >= 10000){
            System.out.println("El valor total es de: "+valortotal);
            System.out.println("La cantidad de números introducidos es de: "+cont);
            System.out.println("La media de los números introducidos es de: "+(valortotal/cont));
        }
        sc.close();
    }
}