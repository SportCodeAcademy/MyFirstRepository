public class A3_Secuencias_de_Escape {
    
    // SECUENCIAS DE ESCAPE:
    // Las secuencias de escape son combinaciones de caracteres que se utilizan dentro de cadenas 
    // de texto (String) y caracteres literales para representar caracteres especiales o realizar 
    // tareas específicas que de otra manera serían difíciles de expresar directamente. Estas 
    // secuencias comienzan con una barra invertida (\) seguida de uno o más caracteres que 
    // indican el carácter especial deseado.

    // Propósito de las Secuencias de Escape:

    // Incluir Caracteres Especiales:
    // Permite incluir caracteres que de otra manera tendrían un significado especial dentro de 
    // una cadena, como comillas simples (') dentro de una cadena delimitada por comillas simples 
    // o comillas dobles (").
    
    // Control de Formato y Visualización:
    // Facilita la implementación de formatos específicos, como saltos de línea (\n), 
    // tabulaciones (\t), retorno de carro (\r), entre otros, que son esenciales para la 
    // presentación y estructuración del texto en consolas y aplicaciones.
    
    // Caracteres No Imprimibles:
    // Permite representar caracteres que no son imprimibles directamente pero tienen una función 
    // específica, como retroceso (\b), avance de página (\f), y caracteres Unicode (\u00A9).

    // Secuencias de Escape Comunes:

    // \n: Salto de línea (new line). Mueve el cursor a la siguiente línea.
    // \r: Retorno de carro (carriage return). Mueve el cursor al inicio de la línea actual.
    // \t: Tabulación (tab). Inserta un espacio de tabulación.
    // \b: Retroceso (backspace). Retrocede el cursor un espacio.
    // \f: Avance de página (form feed). Salto de página.
    // \': Comilla simple.
    // \": Comilla doble.
    // \\: Barra invertida.
    // Secuencias Unicode:

    // \u00A9: Representa un carácter Unicode especificado por los cuatro dígitos hexadecimales XXXX.
        
    public static void main(String[] args) {
        // Secuencias de escape comunes
        System.out.println("Hola\nMundo"); // Salto de línea entre "Hola" y "Mundo"
        System.out.println("Hola\tJava"); // Tabulación entre "Hola" y "Java"
        System.out.println("Este es un retroceso\b"); // Retroceso después de "un"
        System.out.println("Una comilla simple: \' y una doble: \""); // Uso de comillas simples y dobles dentro de una cadena
        System.out.println("Ruta de archivo: C:\\ruta\\archivo.txt"); // Ruta de archivo con barras invertidas

        // Secuencia Unicode
        System.out.println("\u00A9 Derechos de autor"); // Símbolo de derechos de autor ©
    }
}
