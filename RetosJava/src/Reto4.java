import java.util.Scanner;
 
public class Reto4{
    public static void main(String args[])
    {
        System.out.println("Bienvenido Al Juego De Piedra-Papel-Tijera, Tu Contrincante Sera La Maquina");
        Scanner leer= new Scanner(System.in);
 
        int computadora = (int)(Math.random() * 3) + 1;
        System.out.println("La Maquina Ya Escogio Que Sacara....");
 
        System.out.print("Es Tu Turno, Escoge\n 1. Piedra \n 2. Papel \n 3. Tijeras\n ");
        int Usuario = leer.nextInt();
 
        System.out.print("La computadora habia escogido: ");
        switch ( computadora )
        {
            case 1:
                System.out.println("Piedra");
                switch ( Usuario )
                {
                   case 1: System.out.println("Empate!..., Ambos Eligieron Piedra"); break;
                   case 2: System.out.println("Ganaste!..., Papel Gana Contra Piedra"); break;
                   case 3: System.out.println("La Computadora Gana!..., Piedra Gana Contra Tijeras"); break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( Usuario )
                {
                   case 1: System.out.println("La Computadora Gana!..., Papel Gana Contra Piedra"); break;
                   case 2: System.out.println("Empate!..., Ambos Eligieron Papel"); break;
                   case 3: System.out.println("Ganaste!..., Tijeras Gana Contra Papel"); break;
                }
                break;
 
            case 3:
                System.out.println("Tijeras");
                switch ( Usuario )
                {
                   case 1: System.out.println("Ganaste!..., Piedra Gana Contra Tijeras"); break;
                   case 2: System.out.println("La Computadora Gana!..., Tijeras Gana Contra Papel"); break;
                   case 3: System.out.println("Empate!..., Ambos Eligieron Tijeras"); break;
                }
                break;
        }
        leer.close();
    }
}
