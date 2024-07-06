package B1_Estructuras_Condicionales;

public class A3_Operador_Ternario {

    public static void main(String[] args) {

        // Operador Ternario:
        // El operador ternario recibe su nombre porque es el único operador en Java que toma tres operandos. 
        // A diferencia de los operadores unarios (que toman un solo operando) y binarios (que toman dos operandos), 
        // el operador ternario utiliza tres partes para evaluar una condición y devolver un valor basado en esa condición.

        // Sintaxis del Operador Ternario

        // La sintaxis básica del operador ternario es:

        // condición ? expresión1 : expresión2;

        // condición: Es una expresión booleana que se evalúa.
        // expresión1: Es el valor que se devuelve si la condición es true.
        // expresión2: Es el valor que se devuelve si la condición es false.

        // Ejemplos de Uso

        // ----------Asignación de Valores Basada en una Condición----------
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println(max);
        // En este ejemplo, max se asigna a "a" si "a" es mayor que b; de lo contrario, se asigna a b.

        // ----------Asignación Condicional en una Expresión----------
        String resultado = (a % 2 == 0) ? "par" : "impar";
        System.out.println(resultado);
        // Este ejemplo asigna "par" a resultado si "a" es un número par, y "impar" si no lo es.

        // ----------Uso en Impresión Condicional----------
        System.out.println((a > b) ? "a es mayor" : "b es mayor o igual");
        // Imprime "b es mayor o igual" porque a no es mayor que b
        // Aquí, el operador ternario se utiliza directamente en una instrucción println para decidir qué 
        // mensaje imprimir basado en la comparación de a y b.

        // Ventajas y Consideraciones
        
        // Concisión: El operador ternario permite escribir condiciones simples de manera más concisa que 
        // con una estructura if-else.
        // Legibilidad: En situaciones donde la condición y las expresiones son cortas y claras, el operador 
        // ternario puede mejorar la legibilidad del código.

        // Limitaciones: Si la condición o las expresiones son complejas, el uso del operador ternario puede 
        // dificultar la lectura y comprensión del código. En tales casos, es preferible usar un bloque 
        // if-else para mayor claridad.
        // Control de flujo: Tiene una función de control de flujo muy limitada y específica. Su alcance es 
        // mucho más restringido en comparación con estructuras de control de flujo como if-else o switch, que 
        // pueden manejar bloques de código más complejos y múltiples condiciones.
    }
}
