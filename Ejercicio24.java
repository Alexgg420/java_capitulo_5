import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[] args){
        int h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        h = sc.nextInt();
        
        for (int i = 0; i < h; i++){
            for (int j = h - i - 1; j >= 0; j--){
                System.out.print(" ");
            }
            for (int j =  1; j <= ((i*2+1)/2)+1; j++){
                System.out.print(j);
            }
            for (int j = ((i*2+1)/2); j >= 1; j--){
                System.out.print(j);
            }
            System.out.println("");
        }
        sc.close();
    }
}