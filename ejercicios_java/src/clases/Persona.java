package clases;

public class Persona {
    //Atributos de la clase
    String name;
    String lastname;
    String  age;

    //Metodos de la clase
    public void desplegarInformacion(){
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastname);
        System.out.println("Edad: " + age);
    }
}
