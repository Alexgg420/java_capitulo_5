import java.util.Scanner;
public class Ejercicio21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba tantos números positivos como desee.");
        System.out.println("Cuando desee dejar de introducir números, escriba un número negativo.");
        System.out.println("El programa mostrará la cantidad de números introducidos, la media de los impares, y el mayor de los pares.");
        System.out.println("Introduzca los números que desee:");
        int cont;
        int maxpar;
        int totalimp;
        int contimp;
        int num;
        cont = 0;
        maxpar = 0;
        totalimp = 0;
        contimp = 0;
        do {
            num = sc.nextInt();
            if (num >= 0){
                if (num % 2 == 0){
                    if (num > maxpar){
                        maxpar = num;
                    }
                }
                if (num % 2 != 0){
                    totalimp = totalimp + num;
                    contimp++;
                }
                cont++;
            }
        }
        while (num >= 0);
        System.out.println("La cantidad de números introducidos es de: "+cont);
        System.out.println("El número par más alto es: "+maxpar);
        if (contimp > 0){
            System.out.println("La media de los números impares introducidos es: "+ (float)(totalimp / contimp));
        }
        else {
            System.out.println("No se han introducido números impares");
        }
        sc.close();
    }
}