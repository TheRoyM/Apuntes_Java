package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.name = "Roy";
        persona1.lastname = "M Rodriguez";
        persona1.age = "23";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        persona2.name = "Jeff";
        persona2.lastname = "Duran M";
        persona2.age = "20";
        persona2.desplegarInformacion();
    }
}

