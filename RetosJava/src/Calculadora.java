import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op,num1,num2;
        String ContraseñaJennifer="12345678#",UsuarioJennifer="jfajardo",ContraseñaCabrera="tcabrera",UsuarioCabrera="qwerty2022";
        String UsuarioPrueba= JOptionPane.showInputDialog("Digite su Usuario");
        String ContraseñaPrueba= JOptionPane.showInputDialog("Digite su Contraseña");

        if (UsuarioPrueba.equalsIgnoreCase(UsuarioJennifer) && ContraseñaPrueba.equalsIgnoreCase(ContraseñaJennifer) || UsuarioPrueba.equalsIgnoreCase(UsuarioCabrera) && ContraseñaPrueba.equalsIgnoreCase(ContraseñaCabrera)){
            System.out.println("todo bien");
            System.out.println("Menú Opciones \n 1. Suma \n 2. Resta \n 3. Multiplicar \n 4.Divisíon \n 5.Potenciación \n 6. Raíz Cuadrada \n Ingrese el número de la opción que desea realizar");
            op=leer.nextInt();

            System.out.println("Ingrese el numero 1");
            num1=leer.nextInt();
            System.out.println("Ingrese el número 2");
         num2=leer.nextInt();

         switch (op){
            case 1:
                int Suma=num1+num2;
                System.out.println("La suma entre el numero "+num1+" y el numero "+num2+" es " +Suma);
            break;
            
            case 2:
                int Resta=num1-num2;
                System.out.println("La suma entre el numero "+num1+" y el numero "+num2+" es " +Resta);
            break;

            case 3:
                int Multiplicar=num1*num2;
                System.out.println("El numero "+num1+" se multiplico con el numero "+num2+ "y el resultado de esta multiplicación es " +Multiplicar);
            break;

            case 4:
                int Divisíon=num1/num2;
                System.out.println("El numero "+num1+" se dividió entre el numero"+num2+ "y el resultado de esta división es " +Divisíon);
            break;

            case 5:
                int Potenciación=num1^num2;
                System.out.println("El numero "+num1+" se elevo a la potenciación "+num2+ "y el resultado de esta potenciación es " +Potenciación);
            break;

            case 6:
                Double RaízCuadrada1= Math.sqrt(num1) ;
                Double RaízCuadrada2= Math.sqrt(num2);
                System.out.println("La Raíz Cuadrada del numero "+num1+" es "+RaízCuadrada1+" y la de el numero "+num2+" es "+RaízCuadrada2);
            break;
            default:
                System.out.println("Sea serio socio");
            break;
            }
        } 
        else if (UsuarioPrueba.equalsIgnoreCase(UsuarioJennifer) && ContraseñaPrueba!=equalsIngnoreCase(ContraseñaJennifer) || UsuarioPrueba.equalsIgnoreCase(UsuarioCabrera) && ContraseñaPrueba!=equalsIngnoreCase(ContraseñaCabrera)){
            System.out.println("Tu contraseña no es correcta");
        }
        else if (UsuarioPrueba!=equalsIngnoreCase(UsuarioJennifer) && ContraseñaPrueba.equalsIgnoreCase(ContraseñaJennifer) || UsuarioPrueba!=equalsIngnoreCase(UsuarioCabrera) && ContraseñaPrueba.equalsIgnoreCase(ContraseñaCabrera)){
            System.out.println("Usuario no existe, no está registrado");
        }
        else{
            System.out.println("Credenciales acceso incorrectas");
        }
        
        leer.close();
     
    }

    private static String equalsIngnoreCase(String usuarioJennifer) {
        return null;
    }
}