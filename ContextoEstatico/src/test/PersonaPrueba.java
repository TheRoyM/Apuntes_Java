package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Riki");
        //System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Jaimito xxd");
        //System.out.println("persona2 = " + persona2);

        imprimir(persona1);
        imprimir(persona2);
    }

    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }

    public int getContador() {
        imprimir(new Persona("The_Roy"));
        return this.contador;
    }
}
