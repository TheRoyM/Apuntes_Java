package operaciones;

public class Aritmetica {
    //Atributos de mi clase
    int a;
    int b;

    //constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando el constructor");
    }

    public Aritmetica(int a, int b){
     this.a = a;
     this.b = b;
     System.out.println("Ejecutando constructor con argumentos");
    }

    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumaConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }

    public  int sumarConArgumentos(int a, int b){
        this.a = a;//El argumento a se asigna al atributo this.a
        this.b = b;
        //return a + b;
        return this.sumaConRetorno();
    }
}
