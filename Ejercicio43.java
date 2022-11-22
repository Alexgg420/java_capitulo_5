import java.util.Scanner;
public class Ejercicio43{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont;
        cont = 0;
        long num1;
        num1 = 0;
        long num2;
        num2 = 0;
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long numini;
        numini = num;
        long rot;
        rot = 0;
        while (num > 0) {
            rot = rot * 10;
            rot = rot + (num % 10);
            num = num / 10;
        }
        System.out.print("Introduzca la posición por la que quiere partir el número: ");
        long pos = sc.nextLong();
        do{
            if (cont < pos){
                num1 = num1 * 10;
                num1 = num1 + (rot % 10);
            }
            if (cont >= pos){
                num2 = num2 * 10;
                num2 = num2 + (rot % 10);
            }
            cont++;
            rot = rot / 10;
        } while (rot > 0);
        System.out.println("El número "+numini+" partido por la posición "+pos+" hace que queden los números "+num1+" y "+num2);
        sc.close();
    }
}