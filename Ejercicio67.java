import java.util.Scanner;
public class Ejercicio67{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de escalones de la escalera: ");
        int esc = sc.nextInt();
        String wesc = "****";
        if (esc <= 0){
            System.out.print("Debe introducir un número de escalones positivo");
        }
        else {
            System.out.print("Introduzca la altura de cada escalón: ");
            int hesc = sc.nextInt();
            if (hesc <= 0){
                System.out.print("La altura mínima de cada escalón es 1");
            }
            else {
                // número de escalones
                for (int i = 1; i <= esc; i++){
                    // altura escalones
                    for (int j = 0; j < hesc; j++){
                        // ancho de escalones
                        for (int k = 0; k < i; k++){
                            System.out.print(wesc);
                        }
                        System.out.println();
                    }
                }
            }
        }
        sc.close();
    }
}