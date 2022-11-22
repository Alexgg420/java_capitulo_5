import java.util.Scanner;
public class Ejercicio49{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tantos números como desee. El programa terminará cuando introduzca un número primo");
        System.out.println("Comience a introducir números teniendo en cuenta lo anterior:");
        boolean primo = false;
        int cant = 0;
        int max = Integer.MIN_VALUE;
        double med = 0;
        Integer min = Integer.MAX_VALUE;
        do{
            int valor = sc.nextInt();
            primo = true;
            for(int i = 2; i <= (valor / 2) && primo; i++){
                if (valor % i == 0){
                    primo = false;
                }
            }
            if (valor == 1 || !primo){
                if(valor ==1){
                    primo = false;
                }
                if (valor > max){
                    max = valor;
                }
                if (valor < min){
                    min = valor;
                }
                med = med + valor;
                cant++;
            }
        } while (!primo);
        if(cant != 0){
            System.out.printf("Ha introducido %d números no primos\n", cant);
            System.out.printf("El valor máximo es: %d\n", max);
            System.out.printf("El valor mínimo es: %d\n",min);
            System.out.printf("El valor de la media es: %.2f\n", med/cant);
        }
        else{
            System.out.println("No ha introducido ningún valor");
        }
        sc.close();
    }
}