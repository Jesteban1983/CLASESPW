public class Ejercicio {
    public void ejecutarEjercicio1() {
        System.out.println("Ejecucion del ejercicio 1");
        /*Ejercicio 1: Definir y mostrar variables: Crea un programa que
                       defina tres variables: nombre, edad y ciudad.
                       Asigna valores a cada una y muestra su contenido en la consola.*/

        String nombre = "Jonathan";
        int edad = 42;
        String ciudad = "Barcelona";
        System.out.println("Hola, mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años");
        System.out.println("Vivo en " + ciudad);
    }


    public void ejecutarEjercicio2() {
        System.out.println("\nEjecucion del Ejercicio 2");
        /*Crea un programa que defina una variable llamada puntuación con valor inicial 0.
         Luego, modifica su valor tres veces y muestra el resultado final.
         */
        int puntuacion = 0 ;
        System.out.println("Puntuacion Inicial: " +puntuacion);
        puntuacion = puntuacion +10;
        System.out.println("Despues de la primera modificacion: " +puntuacion);
        puntuacion = puntuacion -3;
        System.out.println("Despues de la segunda modificacion: " +puntuacion);
        puntuacion = puntuacion *2;
        System.out.println("Puntuacion final: " +puntuacion);
    }

    public void ejecutarEjercicio3() {
        System.out.println("\nEjecucion del Ejercicio 3");
        String nombre="Carlos";
        int edad= 30;
        boolean esEstuduante=true;
        double altura= 1.75;
        char letraInicial= 'C';
        System.out.println("Nombre: " + nombre + " - tipo: "+ "String");
        System.out.println("Edad: " + edad + " - tipo: "+ " Int");
        System.out.println("¿Es estudiante?: " + esEstuduante + " - tipo: "+ "Boolean");
        System.out.println("Altura: " + altura + " - tipo: "+ "Double");
        System.out.println("Inicial: " + letraInicial + "- tipo: "+ "Char");
    }
    public void ejecutarEjercicio4(){
        System.out.println("\nEjecucion del Ejercicio 4");
        /*Crea un programa que simule la información de un libro usando variables con
        nombres descriptivos. Muestra toda la información del libro en la consola.
        */
        String titulo="Don Quijote de la Mancha";
        String autor="MIguel de Cervantes";
        int aPublicacion=1605;
        int nuPaginas=863;
        boolean esDisponible=true;

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + aPublicacion);
        System.out.println("Numero de paginas: " + nuPaginas);
        System.out.println("¿Esta Disponible?: " + esDisponible);

    }
    public void ejecutarEjercicio5(){
        System.out.println("\nEjecucion del Ejercicio 5");
        /*Crea un programa que use constantes para almacenar información
        que no debe cambiar (como el valor de PI o el nombre de una aplicación)
        y variables para información que puede cambiar. Muestra todos los valores.
        */
        final String app="MiApp";
        String version="1.0.0";
        final double pi= Math.PI;
        String usuario="Laura";
        int nivel= 1;
        int puntuacion=0;
        System.out.println("Aplicacion: "+app);
        System.out.println("Versión: "+version);
        System.out.println("Valor de PI: "+pi);
        System.out.println("Usuario actual: "+usuario);
        System.out.println("Nivel: "+nivel);
        System.out.println("Puntuación: "+puntuacion);

        usuario="Miguel";
        nivel=2;
        puntuacion=150;
        System.out.println("Usuario actualizado: "+usuario);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuación actualizada: "+puntuacion);
    }
    public void ejecutarEjercicio6(){
        System.out.println("\nEjecucion del Ejercicio 6");
        /*Escribe un programa que declare dos variables numéricas,
        realice las operaciones básicas (suma, resta, multiplicación y división)
        y muestre los resultados por consola.*/

        int num1= 10;
        int num2=5;

        int suma=num1 + num2;
        int resta=num1-num2;
        int multiplicacion = num1 * num2;
        double division= num1 / num2;
        System.out.println("Numero 1: "+num1);
        System.out.println("Numero 2: "+num2);
        System.out.println("Suma: " +suma);
        System.out.println("Resta: " +resta);
        System.out.println("Multiplicacion: " +multiplicacion);
        System.out.println("Division: " +division);
    }
}
