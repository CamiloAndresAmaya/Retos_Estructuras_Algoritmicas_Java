import java.util.Scanner;

public class Presupuesto {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        String Repetir="s";
        int Presupuesto=100000,SumaGastos=0, Intentos=0,Gasto;
        System.out.println("Desea Registrar Un Gasto? s para si o n para salir ");
        Repetir=leer.next();

        while (Repetir.equalsIgnoreCase("s")){
            System.out.println("Digite La Cantidad Del Gasto ");
            Gasto=leer.nextInt();
            Presupuesto=Presupuesto-Gasto;
            System.out.println("El Presupuesto Que Le Queda Es "+Presupuesto);
            Intentos=Intentos+1;
            System.out.println("Lleva "+Intentos+" Intentos, Recuerde Que El Limite Son 3");
            SumaGastos=SumaGastos+Gasto;
            System.out.println("El Total De Gastos Es "+SumaGastos);

            if (Intentos>= 3 || Gasto>100000 || Presupuesto<=0){
                System.out.println("El Presupuesto Que Le Queda Es"+Presupuesto+", Y El Total De Gastos Es "+SumaGastos);
                break;
            }
            else{
                System.out.println("Digite s si desea volver al inicio o n para acabar ");
                Repetir=leer.next();
            }
        }
        leer.close();
    }
}
