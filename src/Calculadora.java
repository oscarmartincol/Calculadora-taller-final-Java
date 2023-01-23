import java.util.Scanner;

public class Calculadora {
    // Atributos
    private double num;
    private  double resultNow;
    private boolean operacionesIniciadas;
    private boolean divisionPorCero;
// Constructor donde se inicializa el atributo resultado en cero.
    public Calculadora(){
        this.resultNow = 0;
        this.operacionesIniciadas = false;
        this.divisionPorCero = false;
    }
    // Metodos de la calculadora

    private void sumar(){
        this.resultNow += this.num;
    }

    private void restar(){
        this.resultNow -= this.num;
    }

    private void multiplicar(){
        this.resultNow *= this.num;
    }

    private void dividir(){
        // Si el número ingresado es diferente de cero se hace la división de lo contrario arroja error.
        if(this.num != 0) {
            this.resultNow /= this.num;
        }else {
            this.divisionPorCero = true;
            System.out.println("Error: no se puede dividir por cero");
        }
    }

    private void modulo(){
        if(this.num != 0.0) {
            this.resultNow %= this.num;
        }
        else {
            this.divisionPorCero = true;
            System.out.println("Error: no se puede dividir por cero");
        }
    }

    public String ejecutarOperacion(String operacion){
        Scanner input = new Scanner(System.in);
        double num2;
        if((this.resultNow > 0.0) || (this.operacionesIniciadas)){
            double resultBefore = this.resultNow;
            seleccionarOperacion(operacion, input);
            if(this.divisionPorCero){
                this.divisionPorCero = false;
                return "División por cero";
            }else{
                return resultBefore + " " + operacion + " " + this.num + " = " + this.resultNow ;
            }

        }else {
            // opción para cuando es la primera operación
            System.out.println("Ingrese el primer número");
            num2 = input.nextDouble();
            this.resultNow = num2;
            seleccionarOperacion(operacion, input);
            this.operacionesIniciadas = true;
            // condición para imprimir verificando la división por cero
            if (divisionPorCero){
                this.divisionPorCero = false;
                return "División por cero";
            }else {
                return num2 + " " + operacion + " " + this.num + " = " + this.resultNow;
            }
        }
    }

    private void seleccionarOperacion(String operacion, Scanner input){
        switch (operacion) {
            case "+" -> {
                System.out.println("Ingrese el número que quiere sumar");
                this.num = input.nextDouble();
                sumar();
            }
            case "-" -> {
                System.out.println("Ingrese el número que quiere restar");
                this.num = input.nextDouble();
                restar();
            }
            case "*" -> {
                System.out.println("Ingrese el número que quiere multiplicar");
                this.num = input.nextDouble();
                multiplicar();
            }
            case "/" -> {
                System.out.println("Ingrese el número que quiere dividir");
                this.num = input.nextDouble();
                dividir();
            }
            default -> {
                System.out.println("Ingrese el número para obtener el módulo");
                this.num = input.nextDouble();
                modulo();
            }
        }

    }

    @Override
    public String toString() {
        return "Resultado final: " + this.resultNow;
    }
}
