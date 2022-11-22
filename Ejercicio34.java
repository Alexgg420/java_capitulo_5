import java.util.Scanner;
public class Ejercicio34{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduca un número: ");
        long n1 = sc.nextInt();
        System.out.println("Introduzca otro número: ");
        long n2 = sc.nextInt();
        long n = n1;
        long m = n2;
        int pares = 0;
        int impares = 0;
        long mezcla = 0;
        int v = 0;
        while (n != 0){
            v = (int)(n % 10);
            mezcla = mezcla * 10 + v;
            if(v%2 == 0){
                pares++;
            }
            else {
                impares++;
            }
            v = (int)(m % 10);
            mezcla = mezcla * 10 + v;
            if (v%2 == 0){
                pares++;
            }
            else {
                impares++;
            }
            n = n / 10;
            m = m / 10;
        }
        System.out.println("La mezcla de los dos números introducidos es: "+mezcla);
        System.out.printf("Pares: %d, Impares: %d", pares, impares);
        System.out.println();
        int cont = 1;
        int valores = (pares + impares);
        long npar = 0;
        long nimpar = 0;
        int contpares = 1;
        int contimpares = 1;
        while (cont <= (valores)){
            v = (int)(mezcla % 10);
            if(v% 2== 0){
                npar = npar+(long)(v*Math.pow(10, (pares-contpares)));
                contpares++;
            }
            else {
                nimpar = nimpar+(long)(v*Math.pow(10, (impares-contimpares)));
                contimpares++;
            }
            mezcla = mezcla / 10;
            cont++;
        }
        System.out.println("El número formado por los dígitos pares es: "+npar);
        System.out.println("El número formado por los dígitos impares es: "+nimpar);
        sc.close();
    }
}