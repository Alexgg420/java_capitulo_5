import java.util.Scanner;
public class Ejercicio65{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la A: ");
        int h = sc.nextInt();
        int cont = 0;
        if (h < 3){
            System.out.println("La altura mínima es 3");
        }
        else {
            System.out.print("Introduzca la altura de la barra horizontal de la A: ");
            int pal = sc.nextInt();
            if (pal <= 1 || pal >= h){
                System.out.println("La barra horizontal debe situarse en una altura inferior a la altura de la A y mayor a 1");
            }
            else {
                // altura de la A
                for (int i = 0; i < h; i++){
                    cont++;
                    // bucle de espacios de delante de la A
                    for (int j = 0; j < (h - i); j++){
                        System.out.print(" ");
                    }
                    // diagonal izquierda de la A
                    System.out.print("*");
                    // bucles espacios interiores de la A
                        // Cuando no es la altura de la barra horizontal
                    if (cont != pal + 1){
                        for (int j = h + 1; j < h + (2 * i); j++){
                            System.out.print(" ");
                        }
                    }
                        // cuando es la altura de la barra horizontal
                    if (cont == pal + 1){
                        for (int j = h + 1; j < h + (2 * i); j++){
                            System.out.print("*");
                        }
                    }
                    // diagonal derecha de la A
                    if (i != 0){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}