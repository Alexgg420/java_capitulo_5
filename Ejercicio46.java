import java.util.Scanner;
public class Ejercicio46{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del rectángulo: ");
        int h = sc.nextInt();
        if (h < 2){
            System.out.print("La altura debe ser como mínimo 2");
        }
        else{
            System.out.print("Introduzca la anchura del rectángulo: ");
            int l = sc.nextInt();
            if (l < 2){
                System.out.print("La anchura debe ser como mínimo 2");
            }
            else{
                for (int i = 1; i <= h; i++){
                    if (i == 1 || i == h){
                        for (int j = 1; j <= l; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    else{
                        for (int j = 1; j <= l; j++){
                            if (j == 1){
                                System.out.print("*");
                            }
                            if (j > 1 && j < l){
                                System.out.print(" ");
                            }
                            if (j == l){
                                System.out.println("*");
                            }
                        }
                    }
                }
            }
        }
        sc.close();
    }
}