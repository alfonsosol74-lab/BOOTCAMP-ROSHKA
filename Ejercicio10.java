import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String dia = scanner.nextLine().toLowerCase().trim();  
        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día laboral.");
                break;
            case "sábado":  
            case "sabado":
            case "domingo":
                System.out.println("No es un día laboral.");
                break;
            default:
                System.out.println("Día no válido. Por favor, ingresa un día de la semana.");
        }
        scanner.close();
    }
}