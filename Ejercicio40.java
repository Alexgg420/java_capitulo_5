import java.util.Scanner;
public class Ejercicio40{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del rombo: ");
        int h = sc.nextInt();
        if ((h < 3) || ((h % 2) == 0)){
            System.out.print("La altura no puede ser menor a 3 ni un número par");
        }
        else{
            for (int i = 0; i <= (h / 2); i++){
                for (int j = ((h - 2) / 2) - i; j >= 0; j--){
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++){
                    if ((j != 0) && (j != (i * 2))){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for (int i = (h / 2) - 1; i >= 0; i--){
                for (int j = ((h - 2) / 2) - i; j >= 0; j--){
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++){
                    if ((j != 0) && (j != (i * 2))){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}