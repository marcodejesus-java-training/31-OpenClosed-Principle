public class Main {
    public static void main(String args[]){
        Suma operacion = new Suma();
        operacion.setPrimerValor(2);
        operacion.setSegundoValor(4);

        new Calculadora().calcular(operacion);

        System.out.println(operacion.getResultado());
    }
}
