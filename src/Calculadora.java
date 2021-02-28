import java.security.InvalidParameterException;

public class Calculadora {
    public void calcular(OperacionDeLaCalculadora operacion){
        if(operacion == null){
            throw new InvalidParameterException("No se puede realizar la operación");
        }

        operacion.realizar();
    }
}
