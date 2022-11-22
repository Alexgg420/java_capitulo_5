import java.util.Scanner;
public class Ejercicio30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia1;
        int dia2;
        int hora1;
        int hora2;
        int horas;
        horas = 0;
        boolean directo;
        directo = true;
        System.out.println("Por favor, introduzca el primer día y hora.");
        System.out.print("Día: (número que le corresponde) ");
        dia1 = sc.nextInt();
        if ((dia1 < 1) || (dia1 > 7)){
            System.out.print("El día no existe");
        }
        else {
            System.out.print("Hora: ");
            hora1  = sc.nextInt();
            if ((hora1 < 0) || (hora1 > 23)){
                System.out.print("La hora no existe");
            }
            else{
                System.out.println("Por favor, introduzca el segundo día y hora.");
                System.out.print("Día: (número que le corresponde) ");
                dia2 = sc.nextInt();
                if ((dia2 < 1) || (dia2 > 7)){
                    System.out.print("El día no existe");
                }
                else{
                    System.out.print("Hora: ");
                    hora2 = sc.nextInt();
                    if ((hora2 < 0) || (hora2 > 23)){
                        System.out.print("La hora no existe");
                    }
                    else{
                        if (dia2 < dia1){
                            dia2 = dia2 + 7;
                        }
                        if (hora2 < hora1){
                            if (dia2 <= dia1){
                                System.out.print("Datos incorrectos");
                                directo = false;
                            }
                            else {
                                horas = 24 - hora1 + hora2;
                                horas = horas + ((dia2 - dia1 - 1) * 24);
                            }
                        }
                        else {
                            horas = hora2 - hora1;
                            horas = horas + ((dia2-dia1) * 24);
                        }
                        if (directo){
                            System.out.print("Entre las "+hora1+" del día "+dia1+" y las "+hora2+" del día "+dia2+" hay "+horas+" horas de separación");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}