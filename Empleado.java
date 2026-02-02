public class Empleado {
    //Creo los atributos privados y con un valor por defecto.
    private String nombre = "Empleado";
    private int edad = 0;
    private String DNI = "0";
    private String puesto = "X";

    //Añado un constructor vacío para la clase

    /**
     * Constructor vacío
     */
    public Empleado(){}

    /**
     * Constructor principal, recibiendo todos los datos
     * @param nombre Nombre del empleado
     * @param edad Edad del Empleado
     * @param DNI DNI del empleado
     * @param puesto Puesto de trabajo dentro de la empresa del empleado.
     */
    public Empleado(String nombre,int edad, String DNI, String puesto){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.puesto = puesto;
    }

    /**
     * Getter del nombre. Un Getter es un método_ el cual nos da acceso controlado al método_ privado de una clase. Normalmente es public.
     * @return parámetro nombre del empleado.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Getter de edad.
     * @return parámetro edad del empleado.
     */
    public int getEdad(){
        return edad;
    }

    /**
     * Getter de puesto.
     * @return parámetro puesto del empleado.
     */
    public String getPuesto() {
        return "COMPAÑíA:" + puesto;
    }

    /**
     * Setter de edad. Los setters son métodos de Java los cuales nos permiten cambiar el valor de un atributo que suele ser privado.
     * En este caso, controlaremos que la edad que introduzca el usuario esté entre 0 y 140.
     * @param edad parámetro edad del empleado.
     */
    public void setEdad(int edad){
        if (edad>=0 && edad<140){
            this.edad = edad;
        }
    }

    /**
     * Setter de nombre.
     * @param nombre nuevo nombre del empleado.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
