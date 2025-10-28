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
}
