public class B1_Identificadores {

    // IDENTIFICADORES:
    // En Java, un identificador es un nombre utilizado para identificar una variable, método, clase, 
    // o cualquier otro elemento definido por el programador. Los identificadores siguen ciertas reglas:

    // 1.- Composición:
    // Deben comenzar con una letra (mayúscula o minúscula), un signo de dólar ($), o un guion bajo (_).
    // Los caracteres subsiguientes pueden ser letras, dígitos, signos de dólar, o guiones bajos.
    // No pueden comenzar con un dígito.

    // 2.- Palabras reservadas:
    // No pueden ser palabras clave/reservadas de Java (por ejemplo, int, class, if, else, etc.).
    
    // 3.- Sensibilidad a mayúsculas y minúsculas (CaseSensitive):
    // Java distingue entre mayúsculas y minúsculas, por lo que Variable y variable son dos identificadores distintos.

    // -------------Ejemplos válidos de identificadores:-------------
    // miVariable
    // nombre
    // Edad
    // _contador
    // $valor

    // -------------Ejemplos inválidos de identificadores:-----------
    // 2variable (comienza con un dígito)
    // class (palabra reservada)
    // nombre-apellido (contiene un guion, que no es válido)
    
    // --------------------------------------------------------------
    // ESTRUCTURA BASICA DE VARIABLE:
    //  [Tipo de Dato]  [Identificador]  =  [Valor];
             int              edad        =   30;
}
