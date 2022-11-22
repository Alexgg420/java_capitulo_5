import java.util.Scanner;
public class Ejercicio64{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = 3;
        int w = 6;
        int option;
        int aux;
        do {
            for (int i = 0; i < h; i++){
                if (i == 0 || i == (h - 1)){
                    for (int j = 0; j < w; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                if (i > 0 && i < (h - 1)){
                    for (int j = 0; j < w; j++){
                        if (j == 0 || j == (w - 1)){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            System.out.println("Indique qué quiere hacer con el rectángulo:");
            option = sc.nextInt();
            switch(option){
                case 1:
                    h++;
                    w++;
                    break;

                case 2:
                    if (h > 2 && w > 2){
                        h--;
                        w--;
                    }
                    break;

                case 3:
                    aux = h;
                    h = w;
                    w = aux;
                    break;
            }
        } while (option != 4);
        sc.close();
    }
}