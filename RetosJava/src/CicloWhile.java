import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        int precio,cantidad,referencias=0,subtotal,Total=0;
        String seguir="s";
        Scanner leer=new Scanner(System.in);
        while (seguir.equals("s")){
            System.out.println("Digite el precio del producto");
            precio=leer.nextInt();
            System.out.println("Digite la cantidad del producto");
            cantidad=leer.nextInt();

            subtotal=precio*cantidad;
            System.out.println(cantidad+" del producto de precio "+precio+" es "+subtotal);
            //iniciar el contador de minutos de la compra
            referencias=referencias+1;
            //iniciamos acumulador para el total de la compra
            Total=Total+subtotal;

            System.out.println("Desea registrar otro producto");
            seguir=leer.nextLine();
        }
        leer.close();
    }
}
