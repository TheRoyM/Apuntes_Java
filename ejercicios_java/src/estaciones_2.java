import java.util.Scanner;
public class estaciones_2 {
    // _______ _              ______
    //(_______) |            (_____ \
    //    _   | |__  _____    _____) )___  _   _
    //   | |  |  _ \| ___ |  |  __  // _ \| | | |
    //   | |  | | | | ____|  | |  \ \ |_| | |_| |
    //   |_|  |_| |_|_____)  |_|   |_\___/ \__  |
    //                                    (____/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mes ;
       // var mes = 7;
        var estacion = "Estacion desconocida";
        System.out.println("Dijite la estacion del año");
        mes = entrada.nextInt();
        switch (mes) {
            case 1, 2, 12 -> estacion = "Invierno";
            case 3, 4, 5 -> estacion = "Primavera";
            case 6, 7, 8 -> estacion = "Verano";
            case 9, 10, 11 -> estacion = "Otoño";
        }
        System.out.println("estacion = " + estacion);
    }
}
