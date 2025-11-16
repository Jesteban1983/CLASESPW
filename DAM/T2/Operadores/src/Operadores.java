public class Operadores {
    public void operadoresAritmeticos(){
        //unarios
        int operandoUno = 5;
        //incremento -> para poder hacer un contador
        operandoUno++; //le suma uno al valor que ya tenia
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("El valor del operando  uno despues de los incrementos es " +operandoUno);
        //decremento -> ñe resta uno al valor que ya tenia
        operandoUno--;
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("El valor del operando uno despues de los decrementos es " +operandoUno);

        //binarios -> dos operadores: suma (+) resta(-) multi (*) div (/) modulo-resto division (%)
        operandoUno= 8;
        int operandoDos= 3;
        int suma= operandoUno + operandoDos;
        int resta=operandoUno-operandoDos;
        int multi=operandoUno*operandoDos;
        double div= (double)operandoUno / operandoDos;
        int modulo= operandoUno%operandoDos;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multi);
        System.out.println("El resultado de la division es: " + div);
        System.out.println("El resultado del resto de la division es: " + modulo);
    }
}
