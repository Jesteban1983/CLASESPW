public class Ejercicio {
    public void ejecutarEjercicio7(){

        System.out.println("\nEjercicio 7");
        /*Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad)
         en variables y muestre un mensaje de presentación por consola.
         */
        String nombre = "Jonathan";
        String apellido = "Esteban";
        String ciudad = "Barcelona";
        int edad = 42;
        // Usamos la concatenación (+) para unir texto fijo con el valor de las variables.
        System.out.println("\n!Hola¡ Me llamo " + nombre + " " + apellido + ".");
        System.out.println("Tengo " + edad + " años y vivo en "+ ciudad + ".");
    }
    public void ejecutarEjercicio8(){
        System.out.println("\nEjercicio 8");
        /*Desarrolla un programa que calcule el área de un rectángulo.
        Declara variables para la base y la altura, y muestra el resultado del cálculo.
        */
        int base= 5;
        int altura=3;
        int areTotal=base*altura;

        System.out.println("\nBase del rectángulo: "+base);
        System.out.println("Altura del rectángulo: "+altura);
        System.out.println("El área del rectángulo es: "+areTotal);
    }
    public void ejecutarEjercicio9(){
        System.out.println("\nEjercicio 9");
        /*Escribe un programa que almacene la información
        de un producto (nombre, precio, código y disponibilidad)
        y muestre estos datos formateados por consola.*/

        String nombre ="Auriculares Bluetooth";
        double precio=29.99;
        String codigo="AUR-2023";
        boolean disponible=true;
        System.out.println("\nINFORMACIÓN DEL PRODUCTO");
        System.out.println("--------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio +"€");
        System.out.println("Código: "+ codigo);
        System.out.println("Disponible: "+disponible);
    }
    public void ejecutarEjercicio10(){
        System.out.println("\nEjercicio 10");
        /*Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
          Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
          La fórmula para convertir de Celsius a Fahrenheit es:
          F = C × 9/5 + 32*/
        double celsius = 25.00;
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        System.out.println("\nTemperatura en Celsius: "+celsius+" °C");
        System.out.println("Temperatura en Fahrenheit: "+fahrenheit+" °F");
    }
}


