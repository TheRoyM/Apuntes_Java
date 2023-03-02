import java.util.Scanner;
public class suma_3notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,resultado;

        //pedimos las notas al usuario
        System.out.println("Dijite la primer nota del usuario: ");
         nota1 = entrada.nextFloat();
        System.out.println("Dijite la segunda nota del usuario: ");
         nota2 = entrada.nextFloat();
        System.out.println("Dijite la tercer nota del usuario: ");
         nota3 = entrada.nextFloat();

        resultado = nota1 + nota2 + nota3; //sumamos

        System.out.println("\n La suma de las notas es: "+ resultado);
    }
}
