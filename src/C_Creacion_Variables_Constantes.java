import java.util.Scanner;

public class C_Creacion_Variables_Constantes {

    // Atajos:
    // psvm: Genera el método public static void main(String[] args) { }.
    // sout: Crea un System.out.println(); para imprimir en consola.
    // fori: Crea un bucle for estándar.

    
    public static void main(String[] args) {
        
        // AL CREAR VARIABLES USAREMOS:

        // --------------Declaración de Variables:-------------
        // La sintaxis básica para declarar variables se presenta de la siguiente manera:
        // tipo identificador;
        // tipo identificador1, identificador2;
        int variableInt;
        String variableString1, variableString2;

        // ------------Inicialización de Variables:------------
        // La sintaxis básica para inicializar variables se presenta de la siguiente manera:
        variableInt = 2024;
        variableString1 = "Hola";
        variableString2 = "Hola, mundo";
        System.out.println(variableInt + variableString1 + variableString2);

        // ------------Instanciación de Clases:-------------
        // Se llama instanciar a la acción de crear un objeto a partir de una clase existente, por tanto cuando 
        // se usa la palabra reservada “new” , se procede a instanciar un objeto de la clase especificada.
        // Usa tanto la declaracion como la inicializacion de objetos.
        Scanner escanner = new Scanner(System.in);
        escanner.close();

        // AL CREAR CONSTANTES USAREMOS:
        // Para indicar que un dato es una constante, solo agregaremos "final" a la sintaxis:
        // final tipo identificador;
        // final tipo identificador1, identificador2;
        final int constanteInt;
        final String constanteString1, constanteString2;

        constanteInt = 2;
        constanteString1 = "Chau";
        constanteString2 = "Chau, mundo";

        System.out.println(constanteInt + constanteString1 + constanteString2);

        // Diferencias Clave entre VARRIABLES y CONSTANTES
        // Cambio de Valor: Las variables pueden cambiar de valor a lo largo del programa, mientras que las constantes 
        // no pueden cambiar una vez que se les asigna un valor.
        
        // Declaración: Las variables se declaran usando tipos de datos como int, double, etc., mientras que las 
        // constantes se declaran con final.
        
        // Uso: Las variables se utilizan para almacenar datos que pueden cambiar, como el estado de un objeto o el 
        // resultado de cálculos. Las constantes se utilizan para valores que deben permanecer constantes y conocidos 
        // en todo el programa, como valores matemáticos fijos o configuraciones inmutables.
    }
}
