import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Double ValorNotas,SubtotalNotas=0.0,TotalNotas=0.0;
        Scanner leer=new Scanner(System.in);

        for( int i=1; i<=4; i++){
            System.out.println("Digite El Valor De La Nota De 1 A 5 ");
            ValorNotas=leer.nextDouble();
            SubtotalNotas=SubtotalNotas+ValorNotas;
        }
        TotalNotas=SubtotalNotas/4;
        if (TotalNotas<=0.0 ||TotalNotas<=2.9){
            System.out.println("Reprobaste La Asignatura Con Una Nota De "+TotalNotas);
        }
        else if (TotalNotas<=3.0 || TotalNotas<=4.0){
            System.out.println("Pasaste Raspando La Asignatura Con Una Nota De "+TotalNotas);
        }
        else if (TotalNotas<=4.0|| TotalNotas<=5.0){
           System.out.println("Aprobaste Con Buenos Resultados Con Una Nota De "+TotalNotas);
        }
        else
        System.out.println("Digite Nuevamente Las Notas");
        leer.close();
    }
}
