import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        int Moneda,Elección;
        
        Moneda=(int)(Math.random()*2)+1;

        System.out.println("digite 1 para escoger Cara o 2 Para Sello ");
        Elección=leer.nextInt();
        if (Moneda==1 && Elección==1){
            System.out.println("Salió Cara, usted escogió cara, Ganaste!...");
        }
        else if(Moneda==1 && Elección==2){
            System.out.println("Salió Cara, usted escogió Sello, Perdiste!...");
        }
        else if(Moneda==2 && Elección==2){
            System.out.println("Salió Sello, usted escogió Sello, Ganaste!...");
        }
        else if(Moneda==2 && Elección==1){
            System.out.println("Salió Sello, usted escogió Cara, Perdiste!...");
        }
        else if(Moneda!=1 || Elección!=2 ){
            System.out.println("Digitaste una opción incorrecta");
        }
        else{
            System.out.println("Datos Incorrectos");
        }
        leer.close();
    }
}
