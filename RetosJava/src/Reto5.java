import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre,apellido,nombreCompleto,nomApellido;

        System.out.println("Digite Su Nombre");
        nombre=leer.next();

        System.out.println("Su nombre tiene "+nombre.length()+" Letras, y en mayuscula seria "+nombre.toUpperCase());

        System.out.println("Digite Su Apellido");
        apellido=leer.next();

        System.out.println("Su Apellido tiene "+apellido.length()+" Letras, y en minusculas seria "+apellido.toLowerCase());

        nombreCompleto=nombre+" "+apellido;
        System.out.println("Su nombre completo es "+nombreCompleto );

        leer.close();

        nomApellido=nombre.substring(0,2)+apellido;

        System.out.println("Las Dos Primeras Letras De Tu Nombre Con Tu Apellido Completo Seria "+nomApellido);
    }
}
