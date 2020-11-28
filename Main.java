/**
 * Creado por @autor: angel
 * El  28 de nov. de 2020.
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Proyecto para aprender a hacer un Singleton");


        //Intento instanciar un objeto con el constructor privado
        Singleton miUnicaInstancia = new Singleton();
        // esto es un error
        // Singleton miUnicaInstancia = new Singleton();

        // Creamos un objeto
        Singleton miUnicaInstancia=Singleton.getInstance();
        // Rellenamos los atributos
        miUnicaInstancia.setEdad(20);
        miUnicaInstancia.setNombre("Pepe");

        // Creamos otro objeto Singleton
        // Como la única manera es con getInstance(), este método se encargará
        // de devolvernos el objeto creado anteriormente
        Singleton otraInstanciaSeraLaMisma = Singleton.getInstance();
        // Podemos cambiar la edad
        // Comprobar con el debug que los dos objetos:
        // miUnicaInstancia y otraInstanciaSeraLaMisma son el mismo
        otraInstanciaSeraLaMisma.setEdad(34);

    }
}
