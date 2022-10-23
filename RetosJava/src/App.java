import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Definir un objeto
        Scanner leer=new Scanner(System.in);
        //reciba el radio del circulo y carcula su area

        //datos de entrada
        final double PI=3.1416;
        double radio,area;
        System.out.println("Ingrese el radio del circulo");
        radio=leer.nextFloat();

        //procesar la información
        area= PI*radio*radio;

        //salida
        System.out.println("El área del circulo con radio"+radio+"es"+area);
        leer.close();
    }
}
