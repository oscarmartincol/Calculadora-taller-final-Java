import java.util.Scanner;

public class Calculadora {
    // Atributos
    private double num;
    private double resultBefore;
    private  double resultNow;
// Constructor donde se inicializa el atributo resultado en cero.
    public Calculadora(){
        this.resultNow = 0;
    }
// Método para asignar valor al atributo num
    public void setNum(double num) {
        this.num = num;
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
            System.out.println("Error: no se puede dividir por cero");
        }
    }

    private void modulo(){
        this.resultNow %= this.num;
    }

    public String ejecutarOperacion(String operacion){
        Scanner input = new Scanner(System.in);
        double num2 = 0;
        if(this.resultNow > 0.0){
            this.resultBefore = this.resultNow;
            seleccionarOperacion(operacion, input);
            return this.resultBefore + operacion + this.num + "=" + this.resultNow ;
        }else {
            System.out.println("Ingrese el primer número");
            num2 = input.nextDouble();
            this.resultNow = num2;
            seleccionarOperacion(operacion, input);
            return num2 + operacion + this.num + "=" + this.resultNow;
        }
    }

    private void seleccionarOperacion(String operacion, Scanner input){
        if(operacion.equals("+")){
            System.out.println("Ingrese el número que quiere sumar");
            this.num = input.nextDouble();
            sumar();
        }
    }

}
