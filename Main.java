import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        //Me creo un objeto Empleado
        Empleado Javi = new Empleado(
                "Javi",
                30,
                "384993N",
                "Recepcionista");

        //getClass nos devuelve el tipo del objeto que es Javi (en este caso, Empleado)
        System.out.println(Javi.getClass());
        //Utilizando un setter podemos controlar cómo modificamos la edad
        Javi.setEdad(40);
        //A través de un getter podemos seguir viendo el atributo, aunque este sea privado
        System.out.println(Javi.getEdad());
    }
}