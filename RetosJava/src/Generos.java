import java.util.Scanner;

public class Generos {
    public static void main(String[] args) {
        int H=0,M=0;
        String GeneroOpcion;
        String Hombre="h",Mujer="m";
        Scanner leer=new Scanner(System.in);

        for( int i=1; i<=10; i++){
            System.out.println("Eres Hombre O Mujer, Escribe h Si Eres Hombre O m Si Eres Mujer");
            GeneroOpcion=leer.next();

            if (GeneroOpcion.equalsIgnoreCase(Hombre)){
                H=H+1;
                System.out.println("Van "+H+" Hombres");
            }
            else if (GeneroOpcion.equalsIgnoreCase(Mujer)){
                M=M+1;
                System.out.println("Van "+M+" Mujeres");
            }
            else{
                System.out.println("Siga Las instrucciones");
            }  
        }
        System.out.println("el total de hombres es "+H+" y el de mujeres es "+M);
        leer.close();
    }
}