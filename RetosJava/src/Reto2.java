import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        
        //Definir un objeto
        Scanner leer=new Scanner(System.in);
        //reciba el radio del circulo y carcula su area

        //datos de entrada
        double PesoBebe,MesesBebe;
        int DosisVacuna;
        System.out.println("Ingrese el peso del bebe");
        PesoBebe=leer.nextDouble();
        System.out.println("Ingrese los meses del bebe");
        MesesBebe=leer.nextDouble();
        //procesar la información
        DosisVacuna=(int)((PesoBebe+10)/(MesesBebe*10)*8);

        //salida
        System.out.println("Las Dosis De Vacuna Que Se Debe Aplicar Al Bebe Es "+DosisVacuna);
        leer.close();
    }
}
