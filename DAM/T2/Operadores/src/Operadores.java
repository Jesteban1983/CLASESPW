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
        int modulo= operandoUno%operandoDos; //me vale para saber un numero es par o impar
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multi);
        System.out.println("El resultado de la division es: " + div);
        System.out.println("El resultado del resto de la division es: " + modulo);

    }
    public void operadoresAsignacion(){
        int operadorUno = 10;
        int operadorDos= 6;
        operadorUno += 5; // en operadorUno guarda la suma de lo que valia operadorUno  + 5
        operadorUno += 15;
        operadorUno += operadorDos;
        System.out.println("El valor de operador 1 es "+operadorUno);
        operadorUno-= 5; //16
        operadorUno*=2; //32
        operadorUno%=2; //0
        System.out.println("El resultado de las asignaciones completas es de "+operadorUno);
    }
    public void operadoresComparacion(){
        // seran usados como condiciones para ejecutar una parte del codigo u otra
        int operandoUno = 10;
        int operandoDos = 20;
        boolean resultado = operandoUno>operandoDos;
        System.out.println("El resultado de la comparacion > es "+resultado);
        resultado = operandoUno<operandoDos;
        System.out.println("El resultado de la comparacion < es "+resultado);
        resultado = operandoUno<=operandoDos;
        resultado = operandoUno>=operandoDos;
        resultado = operandoUno==operandoDos;
        resultado = operandoUno!=operandoDos;
        // cuantos años tienes
        // tienes carnet de conducir
        // cuanto quieres cobrar
    }
    public void operadoresLogicos(){
        int sueldo = 20000;
        int edad = 35;
        boolean conducir = true;
        System.out.println("El candidato puede conducir: "+!conducir);
        // cuando quiere cobrar menos de 30000 y tiene menos de 40 años y puede conducir
        boolean cadidatoValido=sueldo<30000 && edad<40 && conducir;
        System.out.println("El candidato es valido: " +cadidatoValido);// para la logica AND
        cadidatoValido=sueldo<20000 || edad<25 || conducir;
        System.out.println("El candidato es valido: " +cadidatoValido);// para la logica OR
    }
    public void evaluarCandidato(double sueldo, int edad, boolean conducir, String nombre){
        boolean resultado = sueldo<=20000 && edad<40 && conducir;
        System.out.println("Evaluando al candidato: "+nombre);
        System.out.println("La evaluacion del candidato es: "+resultado);
    }
}
