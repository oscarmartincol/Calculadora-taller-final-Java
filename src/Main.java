import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora= new Calculadora();
        Scanner input = new Scanner(System.in);
        String operacion;

        do {
            // Menú para seleccionar la operación a realizar.
            System.out.println("Seleccione la operación que desea realizar:");
            System.out.println(" + para sumar.");
            System.out.println(" - para restar.");
            System.out.println(" * para multiplicar.");
            System.out.println(" / para dividir.");
            System.out.println(" % para obtener el módulo");
            System.out.println(" = para terminar");
            operacion = input.nextLine();
            // llamado del método que define la operación segun lo ingresado por el usuario
            System.out.println(calculadora.ejecutarOperacion(operacion));
        }while (!operacion.equals("="));

    }
}