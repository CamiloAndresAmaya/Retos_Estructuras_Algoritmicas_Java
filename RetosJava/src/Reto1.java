import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //Definir un objeto
        Scanner leer=new Scanner(System.in);
        //reciba el radio del circulo y carcula su area

        //datos de entrada
        float Centigrados;
        int Fahrenheit;
        System.out.println("Ingrese los grados Fahrenheit");
        Fahrenheit=leer.nextInt();
        //procesar la información
        Centigrados=(float) ((Fahrenheit-32)/1.8);

        //salida
        System.out.println("Los " +Fahrenheit+ " (°F) Grados Fahrenheit  Se Convirtieron En " +Centigrados+ " (°C) Grados Centigrados Entonces Puedes Colocar Tu Horno A " +Centigrados+ " (°C) Grados Centigrados");
        leer.close();
    } 
}

