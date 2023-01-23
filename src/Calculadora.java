public class Calculadora {
    // Atributos
    private double num;
    private double result;
// Constructor donde se inicializa el atributo resultado en cero.
    public Calculadora(){
        this.result = 0;
    }
// Método para asignar valor al atributo num
    public void setNum(double num) {
        this.num = num;
    }

    // Metodos de la calculadora

    private void sumar(){
        this.result += this.num;
    }

    private void restar(){
        this.result -= this.num;
    }

    private void multiplicar(){
        this.result *= this.num;
    }

    private void dividir(){
        // Si el número ingresado es diferente de cero se hace la división de lo contrario arroja error.
        if(this.num != 0) {
            this.result /= this.num;
        }else {
            System.out.println("Error: no se puede dividor por cero");
        }
    }

    private void modulo(){
        this.result %= this.num;
    }

    private void seleccionarOperacion(String operacion){

    }
}
