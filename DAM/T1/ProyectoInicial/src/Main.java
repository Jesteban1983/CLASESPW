import java.sql.SQLOutput;

public class Main {
    //Esto comentario es solo de una linea -> para anotacion o aclaracion BREVE de lo que hace el metodo

    /**
     * Comentario de documentacion Javadoc
     * @param args esto es la informacion de entrada
     * @return int vale para retornar el resultado de la operacion
     * @version 1.0
     * @author Jonathan Esteban
     */
    public static void main(String[] args) {
        //TODO terminar de implementar la funcionalidad del main
        final String NUMERO_DNI = "12345678";
        String nombreCompleto = "Jonathan Esteban Barona"; //Los string son palabras y van encomillados dobles
        nombreCompleto= "Jonathan E. B.";
        char letraCarnet= 'Z';
        char letraCarnetNumero= 342; //este es un caracter raro-> cifrador / descifrador
        boolean experiencia = false;
        int edad = 41;
        edad = edad +1;
        edad = edad +1;
        float altura = 1.55f;
        double peso = 70.23456789;
        System.out.println("MI Numero de DNI es " +NUMERO_DNI );
        System.out.println("Esta impresion lo acabo de hacer");
        System.out.println("Mi nombre completo es "+nombreCompleto);
        System.out.println("Mi edad es " +edad +" años");
        System.out.println("Mi altura es de " +altura +" cm.");
        System.out.println("Mi peso es de " +peso +" kg.");
        System.out.println("La letra de mi DNI es "+letraCarnet);
        System.out.println("Tengo experiencia "+experiencia);
        //System.out.println(letraCarnetNumero);
        /*
        Este comentario lo voy a utilizar si necesito una explicaacion
        un poco mas LARGO de lo que hace el metodo o de la dud que me
        genere el metodo
         */
    }

    public void metodoCarton(){
        //TODO pendiente crear el carton con numeros aleatorios sin repetir

    }
}
