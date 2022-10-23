import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {

        //Definir un objeto
        Scanner leer=new Scanner(System.in);

        //datos de entrada
        int Dado1,Dado2;
        
        Dado1=(int)(Math.random()*6)+1;
        Dado2=(int)(Math.random()*6)+1;

        //procesar la información
        if (Dado1==1 && Dado2==1){
         System.out.println ("El Lanzamiento Arrojo "+Dado1+" y "+Dado2+ " , Salió Un Par de Unos En Los Dados, Ganaste!...");
        }
        else if (Dado1+Dado2==3){
         System.out.println("El Lanzamiento Arrojo "+Dado1+" y "+Dado2+" , Salió Un Total De Tres En Los Dados, Ganaste!...");
        }
        else if (Dado1+Dado2==11){
         System.out.println("El Lanzamiento Arrojo "+Dado1+" y "+Dado2+" , Salió Un Total De Once En Los Dados, Ganaste!...");
        }
        else if (Dado1+Dado2==2) {
         System.out.println("El Lanzamiento Arrojo "+Dado1+" y "+Dado2+" , Salió Un Total De Doce En Los Dados, Ganaste!...");
        }
        else if (Dado1+Dado2==7){
         System.out.println("El Lanzamiento Arrojo "+Dado1+" y "+Dado2+" , Salió Un Total De Siete En Los Dados, Ganaste!...");
        }
        else{
         System.out.println("El Lanzamiento Arrojo "+Dado1+" y "+Dado2+" , En El Lanzamiento No Cayo En Ninguna Situación Para Ganar, Perdiste!...");
        }

        leer.close();
    }
}
