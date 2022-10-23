import java.util.Scanner;
public class Alcancia {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        String Repetir="s";
        int Alcancia=0,Plata;

        while (Repetir.equalsIgnoreCase("s")){
            System.out.println("ingrese el valor a ahorrar");
            Plata=leer.nextInt();
            Alcancia=Alcancia+Plata;

            if (Alcancia<=100000){
                System.out.println("Desea ingresar mas dinero S, o N para salir");
                Repetir=leer.next();
            }
            else{
                break;
            }
        }
        System.out.println("El total ahorrado es "+Alcancia);
        leer.close();
    }
}
