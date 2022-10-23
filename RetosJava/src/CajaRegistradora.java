import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        int precio,cantidad,referencias=0,subtotal,Total=0,PagoCliente,Cambio;
        String Si="si";
        String VerificaciónTelefonia;
        Scanner leer=new Scanner(System.in);
        
        for( int i=1; i<=5; i++){
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
        }
        System.out.println("El total de su compra es "+Total);
        System.out.println("La cantidad de minutos de la compra es "+referencias);

        System.out.println("Escriba la cantidad con la que pagara la compra");
        PagoCliente=leer.nextInt();

        Cambio=PagoCliente-Total;
        System.out.println("Usted pago con "+PagoCliente+" pesos y la compra costaba "+Total+" por lo tanto su cambio es "+Cambio+" pesos");

        System.out.println("Cuenta con telefonia movil? \n si \n no");
        VerificaciónTelefonia=leer.next();

        

        if (VerificaciónTelefonia.equalsIgnoreCase(Si)){
           System.out.println("La cantidad de minutos de la compra es "+referencias);
        }
        else{
            System.out.println("No pierdas más minutos, adquiere ya tu telefonía móvil éxito.");
        }
        leer.close();
    }

}
