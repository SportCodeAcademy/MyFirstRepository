package B1_Estructuras_Condicionales;

public class B1_Switch_Statement {

    public static void main(String[] args) {

        // The Switch Statement (La sentencia de cambiador/interruptor)
        // Permiten ejecutar diferentes bloques de código basados en el valor de una
        // "expresión":

        // ¿Que es una expresion?
        // Una expresión es cualquier asignacion/inicializacion variables, operadores y
        // valores que se evalúa para producir un resultado. En Java, las expresiones
        // pueden incluir operaciones aritméticas, llamadas a métodos, y accesos a
        // variables.
        // int edad = 18;

        // 1.- Funcion de Etiquetas:

        // Sentencia: switch ( EXPRESION ):
        // -Valores Numéricos y de Caracteres: Para Character, Byte, Short o Integer, se
        // realiza una conversión de unboxing y se compara con la constante de la
        // etiqueta.
        // -Valores de Tipos Primitivos y Cadenas: Para char, byte, short, int, String o
        // tipos de enumeración, se compara directamente usando == (o equals para
        // String) de manera interna.

        // Etiquetas con Patrones de Caso: CASE
        // -Compara el valor de la expresion con su valor de patron de caso.
        // -Se verifica si el valor de la "expresion" coincide con el patron de caso
        // definido. Si coincide se ejecuta el bloque de código asociado a ese patron.
        // Si son falsas, continuara evaluando los patrones siguientes.

        // Etiquetas default: DEFAULT
        // -La etiqueta default se aplica si ninguna otra etiqueta coincide.

        // Etiquetas break: BREAK
        // -Finalizar la ejecución de esa estructura y sale de ella inmediatamente y
        // continúa con las instrucciones siguiente fuera de esa estructura.
        int diaDeLaSemana = 3;

        switch (diaDeLaSemana) {
            case 1:
                System.out.println("Hoy es Lunes.");
                break;
            case 2:
                System.out.println("Hoy es Martes.");
                break;
            case 3:
                System.out.println("Hoy es Miércoles.");
                break;
            case 4:
                System.out.println("Hoy es Jueves.");
                break;
            case 5:
                System.out.println("Hoy es Viernes.");
                break;
            case 6:
                System.out.println("Hoy es Sábado.");
                break;
            case 7:
                System.out.println("Hoy es Domingo.");
            default:
                System.out.println("Día inválido."); // No necesita un break al final
                                                     // porque naturalmente es el último
                                                     // caso evaluado en la sentencia
        }

        // 2.- Errores en tiempo de Ejecucion:

        // -Terminacion abrupta: Se evalúa la expresión del switch. Si falla, la
        // sentencia termina abruptamente.
        // -Determinacion de Excepciones:
        // Si el valor del selector es null y no hay una etiqueta case null, se lanza
        // una "NullPointerException".
        // Si no hay coincidencia en los case, se lanza una "MatchException".

        // 3.- Caída a Través de Etiquetas (Fall-Through):

        // -Se refiere al hecho de que si un caso no contiene una instrucción break, la
        // ejecución continuará hacia
        // abajo, ejecutando el código de los casos siguientes, incluso si sus
        // condiciones no se cumplen inicialmente.

        // Desventajas:
        // Si nos olvidamos no intencionalmente de los break, se ejecutaran en caida
        // todos los casos.
        int numero = 1;
        switch (numero) {
            case 1: {
                System.out.println("Imprime numero 1");
            }
            case 2: {
                System.out.println("Imprime numero 2");
            }
        }

        // Ventajas:
        // Usemoslo a nuestro favor: hace que el programa sea eficiente al reducir las
        // comparaciones en ciertos contextos
        // usando el break y default en las posiciones de caida adecuada.
        char letra = 'f';
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vocal");
                break;
            default: {
                System.out.println("Consonante");
            }
        }

        // 4.- Principio de Exhaustividad:

        // Se refiere a la práctica de cubrir todos los posibles valores que puede tomar
        // la expresión evaluada por el switch.
        // Si el valor es null, se aplica una etiqueta "case" null.
        // En este caso el num se esta cubriendo ademas ocn un case null ya que es un
        // tipo envolvente:
        Integer num = 30;

        switch (num) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case null:
                System.out.println("Número es null");
                break;
            default:
                System.out.println("Número no reconocido en los casos");
        }

        // 5.- Sentencia Switch mejorada:

        // Java 14 introdujo una nueva forma de usar la sentencia switch con expresiones
        // lambda. Esto permite una sintaxis más concisa y expresiva para manejar
        // múltiples casos.
        // En este caso usa (->) Arrow Function (Funcion de Flecha) tambien conocida
        // como Arrow Case. Al utilizar Arrow Function ya no es necesario Etiquetar el
        // bloque del caso con un break.

        // Sumando los conceptos de Agrupacion de Patron Case, Lambda Expresion,
        // Exhaustividad, y Fall-Through logramos
        // crear una sentencia Switch mejorada:

        String dia = "HOY";
        String tipoDia;
        switch (dia) {
            case "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" -> tipoDia = "Dia de Semana";
            case "Sábado", "Domingo" -> tipoDia = "Dia de Fin de Semana";
            case null -> tipoDia = "Dia nulo";
            default -> tipoDia = "Dia no valido";
        }
        System.out.println("El dia " + dia + " es un : " + tipoDia);

        // 6.- Pattern Matching:
        // Java 14 incorpora un nuevo tipo de patrón de caso llamado "Pattern Matching"
        // que permite evaluar expresiones con condiciones más complejas. Este tipo de
        // patrón permite expresar condiciones más complejas y desencadenar acciones
        // basadas en el valor de la expresión. Esto permite una sintaxis más concisa y
        // expresiva para manejar múltiples casos.

        Object o = "506L";

        String resultado = switch (o) {
            case Integer i -> "Entero: " + i;
            case Long l -> "Largo: " + l;
            case Double d -> "Doble: " + d;
            case String s when !s.isEmpty() -> "Cadena no vacía: " + s;
            default -> "Objeto desconocido: " + o.toString();
        };

        System.out.println(resultado);

        // Explicación en lenguaje humano:
        // "Dependiendo del valor del día de la semana, hacemos un cambio (switch):

        // Caso (Case) 1: Si el valor es 1, imprimimos 'Hoy es Lunes.' y luego rompemos
        // (break) para salir del cambio.
        // Caso (Case) 2: Si el valor es 2, imprimimos 'Hoy es Martes.' y luego rompemos
        // (break) para salir del cambio.
        // Caso (Case) 3: Si el valor es 3, imprimimos 'Hoy es Miércoles.' y luego
        // rompemos (break) para salir del cambio.
        // Caso (Case) 4: Si el valor es 4, imprimimos 'Hoy es Jueves.' y luego rompemos
        // (break) para salir del cambio.
        // Caso (Case) 5: Si el valor es 5, imprimimos 'Hoy es Viernes.' y luego
        // rompemos (break) para salir del cambio.
        // Caso (Case) 6: Si el valor es 6, imprimimos 'Hoy es Sábado.' y luego rompemos
        // (break) para salir del cambio.
        // Caso (Case) 7: Si el valor es 7, imprimimos 'Hoy es Domingo.' y luego
        // rompemos (break) para salir del cambio.
        // Por defecto (default): Si el valor no coincide con ningún caso, imprimimos
        // 'Día inválido.' y luego rompemos
        // (break) para salir del cambio."
    }
}
