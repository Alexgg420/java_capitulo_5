import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont = 4;
        do {
        System.out.print("Introduzca la combinación de la caja fuerte: ");
        String comb = sc.nextLine();
        if (comb.equals("1007")){
            System.out.print("La caja fuerte ha sido abierta satisfactoriamente");
            cont=1;
        }
        else {
            System.out.println("Lo siento, esta no es la combinación");
        }
        cont--;
        } while(cont > 0);
        sc.close();
    }
}