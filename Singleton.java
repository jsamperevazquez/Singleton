/**
 * Creado por @autor: angel
 * El  28 de nov. de 2020.
 * Solo una instancia
 **/

public class Singleton {
    // atributos para comprobar que siempre es el mismo objeto
    private String nombre;
    private Integer edad;

    // Esta va a ser nuestra única instacia
    private static Singleton instance = null;

    /**
     * Constructor bloqueado con private
     */
    private  Singleton() {}


    /**
     * Según exista o no ya el objeto, lo instanciamos o cambiamos los datos
     *
     * @return la instancia. Si no existe la crea primero
     */

    public static Singleton getInstance() {
      // Compruebo si ya está creada
        if (instance == null){
            // Como no está creada, la creo
            // desde aquí si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Singleton();
        }
        // devuelvo la instancia
        return instance;
    }


    /**
     * Edad de la persona
     * @param edad edad de la persona
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * Nombre de la persona
     * @param nombre nombre de la persona
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
