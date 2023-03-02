import java.util.Scanner;

public class sistemas_calificaciones {
    public static void main(String[] args) {
        //Pedimos los datos al usuario con Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 1 y 5");
        int nota = Integer.parseInt(scanner.nextLine());

        //Evaluamos con if si esta dentro lo requerido

        if (nota >= 4 && nota <= 5)
            System.out.println("Excelente");

        else if(nota >=3 && nota < 4)
            System.out.println("Sobresaliente");

        else if (nota >=2 && nota < 3)
            System.out.println("Insuficiente");

        else if (nota >= 1 && nota < 2)
            System.out.println("Inaceptable");

        else
            System.out.println("El valor es desconocido");
    }
}
