package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juanito", 5000.00);
        System.out.println("empleado1 = " + empleado1);

       // Cliente cliente1 = new Cliente(new Date(), true, "Roy M", 'M', 23, "Medellin 32c");
      //  System.out.println("cliente1 = " + cliente1);

    }
}