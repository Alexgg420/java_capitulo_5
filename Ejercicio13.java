import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca diez números, ya sean positivos o negativos, y el programa leerá cuántos positivos y negativos hay:");
        int cant =  10;
        int pos = 0;
        int neg = 0;
        int cero = 0;
        for (int i = 0; i < cant; i++){
            int n = sc.nextInt();
            if (n < 0){
                neg++;
            }
            if (n > 0){
                pos++;
            }
            if (n == 0){
                cero++;
            }
        }
        System.out.print("Hay "+pos+" positivos, "+neg+" negativos y "+cero+" ceros");
        sc.close();
    }
}