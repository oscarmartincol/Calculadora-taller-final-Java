import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora= new Calculadora();
        Scanner input = new Scanner(System.in);
        String operacion;

        do {
            System.out.println("Seleccione la operación que desea realizar:");
            operacion = input.nextLine();
        }while (!operacion.equals("="));

    }
}