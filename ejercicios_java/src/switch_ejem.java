public class switch_ejem {
    public static void main(String[] args) {
        var number = 52;
        var numberText = "Valor desconocido";

        switch (number) {
            case 1:
                numberText = "Número uno";
                break;
            case 2:
                numberText = "Número dos";
                break;
            case 3:
                numberText = "Número tres";
                break;
            case 4:
                numberText = "Número cuatro";
                break;
            default:
                numberText = "Caso no encontrado";
        }
        System.out.println("numberText = " + numberText);
    }
}
