import java.util.Scanner;

public class A2_System_y_Scanner {
    // System:
    // La clase System proporciona acceso a ciertas variables y métodos que son útiles para el control del entorno
    // de ejecución. Es una clase final y todos sus métodos y variables son estáticos.

    // 1.- System.out:
    // Es una instancia de PrintStream que se utiliza para imprimir mensajes en la consola.
    // EJEMPLO:
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Imprime "Hello, World!" en la consola.
    }

    // 2.- System.err:
    // Es una instancia de PrintStream que se utiliza para imprimir mensajes de error en la consola.
    // EJEMPLO:
    public static void main3(String[] args) {
        System.err.println("Este es un mensaje de error."); // Imprime un mensaje de error en la consola.
    }
    //* Nota:
    // Aunque técnicamente no habría un conflicto al usar System.out.println para mensajes de error, 
    // es recomendable seguir las convenciones establecidas y utilizar System.err.println para mensajes de error 
    // para mantener la claridad y facilitar la depuración de tu código.

    // 3.- System.in:
    // Es una instancia de InputStream que se utiliza para leer datos de entrada del usuario desde la consola.
    // Por sí solo, System.in no es muy útil; normalmente se usa junto con la clase Scanner.
    // EJEMPLO:
    public static void main2(String[] args) throws Exception {
        // Scanner:
        // La clase Scanner se utiliza para leer la entrada del usuario de diversas fuentes, como la consola,
        // archivos, cadenas de texto, etc. Es muy útil para recoger datos del usuario.

        // 1.- Creación de un objeto Scanner:
        // Para leer datos desde la consola, necesitamos crear un objeto Scanner utilizando System.in como fuente.
        Scanner scanner = new Scanner(System.in);

        // 2.- Leer una línea completa de texto:
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine(); // Lee una línea completa de entrada del usuario.
        System.out.println("Hola, " + nombre);

        // 3.- Leer diferentes tipos de datos:
        // Leer un entero:
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt(); // Lee un entero de la entrada del usuario.
        System.out.println("Tu edad es: " + edad);

        // Leer un número de punto flotante:
        System.out.println("Ingrese su altura en metros:");
        double altura = scanner.nextDouble(); // Lee un número de punto flotante de la entrada del usuario.
        System.out.println("Tu altura es: " + altura + " metros");

        // 4.- Cerrar el objeto Scanner:
        // Es importante cerrar el objeto Scanner cuando ya no se necesita para liberar recursos.
        scanner.close();

        // Uso incorrecto de Scanner después de cerrarlo:
        // System.out.println("Ingrese otro nombre:");
        // String otroNombre = scanner.nextLine(); // Esto lanzará una excepción porque el Scanner ya está cerrado.

        // Para más información sobre la clase Scanner, visita:
        // https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Scanner.html
    }

}

    // SIMILITUDES CON C#
    // Si vienes de .net c# te preguntaras...
    // System.out.println("Hello, World!");
    // int edad = System.in.read();
    // Pero no se podria hacer asi?
   
    // System.in.read():

    // -Lectura de un solo byte: System.in.read() lee un solo byte de datos de entrada. 
    // Por lo tanto solo toma el primer caracter de tu texto para convertirlo a codigo ASCII.

    // -Valor ASCII y conversión: En Java, cuando lees un byte usando System.in.read(), 
    // obtienes el codigo ASCII del carácter ingresado. Por ejemplo:
    
    // Caracteres ASCII alfanumericos imprimibles (no funciona con No imprimibles)
    // codigo ascii 48 = 0 ( caracter cero )
    // codigo ascii 49 = 1 ( caracter uno )
    // codigo ascii 50 = 2 ( caracter dos )
    // codigo ascii 51 = 3 ( caracter tres )
    // codigo ascii 52 = 4 ( caracter cuatro )
    // codigo ascii 53 = 5 ( caracter cinco )
    // codigo ascii 54 = 6 ( caracter seis )
    // codigo ascii 55 = 7 ( caracter siete )
    // codigo ascii 56 = 8 ( caracter ocho )
    // codigo ascii 57 = 9 ( caracter nueve )
    // codigo ascii 184 = © ( caracter Símbolo Copyright, bajo derecho de autor )
    // codigo ascii 64 = @ ( caracter Arroba )
    // ETC...

