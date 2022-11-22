import java.util.Scanner;
public class Ejercicio50{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f1 = "";
        String f2 = "";
        String f3 = "";
        String esptxt = "";
        System.out.print("Introduzca la altura del número 155: ");
        int h = sc.nextInt();
        if (h < 5){
            System.out.print("La altura no puede ser menor a 5");
        }
        if (h >= 5){
            System.out.print("Introduzca la cantidad de espacios entre los números: ");
            int esp = sc.nextInt();
            if (esp < 1){
                System.out.print("El mínimo de espaciado es de 1");
            }
            if (esp >= 1){
                for (int i = 0; i < esp; i++){
                    esptxt = esptxt + " ";
                }
                f1 = "*" + esptxt + "****" + esptxt + "****";
                f2 = "*" + esptxt + "*   " + esptxt + "*   ";
                f3 = "*" + esptxt + "   *" + esptxt + "   *";
                System.out.println(f1);
                System.out.println(f2);
                System.out.println(f1);
                for (int i = 4; i < h; i++){
                    System.out.println(f3);
                }
                System.out.println(f1);
            }
        }
        sc.close();
    }
}