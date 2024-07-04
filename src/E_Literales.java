public class E_Literales {
    
    // ¿Que es un Literal?
    // Un literal es específicamente una representación constante y directa de un valor en el código fuente. 
    // Cualquier cosa que involucre cálculos, referencias a variables, llamadas a métodos o cualquier otra 
    // operación que no sea una simple asignación de valor constante no sería considerado un literal en el 
    // contexto de la programación. Los literales son importantes porque proporcionan valores constantes que 
    // son fácilmente reconocibles y utilizables en el código.

    //Literales:
    int edad = 30; // 30 es un literal de tipo entero.
    double pi = 3.14159; // 3.14159 es un literal de tipo double.
    char letra = 'A'; // 'A' es un literal de tipo caracter.
    String nombre = "Juan"; // "Juan" es un literal de tipo cadena de caracteres.

    //No Literales:
    int suma = 1 + 2;  // '1 + 2' no es un literal, es una expresión que calcula un valor
    int resultado = calcularSuma();  // 'calcularSuma()' no es un literal, es una llamada a un método
    Persona persona = new Persona();  // 'new Persona()' no es un literal, es una creación de objeto
    String mensaje = "Hola" + " " + "Mundo";  // La concatenación de cadenas no es un literal

    //**Tener en cuenta:
    // La variable en sí misma no es un literal (Identificador); más bien, es un contenedor que puede contener diferentes 
    // valores en diferentes momentos durante la ejecución del programa. El valor que se asigna a una variable en este 
    // caso, es el literal que representa de manera constante y directa en el código fuente.

    // Estructura:
    //  [Tipo de Dato]  [Identificador]  =  [Valor];
    //      int              edad        =   30;

    public static void main(String[] args) {
        
    }

    public int calcularSuma(){
        return 5+4;
    }
    public class Persona{
        String nombre;
        int edad;
    }
}
