package B1_Estructuras_Condicionales;

public class B1_Switch_Statement {
    
    public static void main(String[] args) {

        // The Switch Statement (La sentencia de cambiador/interruptor)
        // Las sentencias y expresiones switch en Java permiten ejecutar diferentes bloques de código 
        // basados en el valor de una "expresión":

        // ¿Que es una expresion?
        // Una expresión es cualquier combinación de variables, operadores y valores que se evalúa para 
        // producir un resultado. En Java, las expresiones pueden incluir operaciones aritméticas, 
        // llamadas a métodos, y accesos a variables.
        // int edad = 18;

        // Determinación de Etiquetas: switch ( EXPRESION ):

        // -Valor Nulo: Si el valor es null, se aplica una etiqueta "case" null.
        // -Valores Numéricos y de Caracteres: Para Character, Byte, Short o Integer, se realiza una conversión 
        // de unboxing y se compara con la constante de la etiqueta.
        // -Valores de Tipos Primitivos y Cadenas: Para char, byte, short, int, String o tipos de enumeración, 
        // se compara directamente usando == (o equals para String).

        // Etiquetas con Patrones de Caso: CASE
        // -Se verifica si el valor de la "expresion" coincide con el patron de caso definido. Si coincide y no tiene 
        // "guardias", se ejecuta el bloque de código asociado a ese patron. Si tiene guardias, se evalúan y, si son 
        // verdaderas, se ejecuta el bloque de código asociado a esa patron. Si son falsas, continuara evaluando los patrones siguientes.
        
        // Etiquetas default: DEFAULT
        // -La etiqueta default se aplica si ninguna otra etiqueta coincide.
        
        int diaDeLaSemana = 3;

        switch (diaDeLaSemana) {
            case 1 -> { System.out.println("Hoy es Lunes.");
                        System.out.println("El dia mas pesado"); }
            case 2 -> System.out.println("Hoy es Martes.");
            case 3 -> System.out.println("Hoy es Miércoles.");
            case 4 -> System.out.println("Hoy es Jueves.");
            case 5 -> System.out.println("Hoy es Viernes.");
            case 6 -> System.out.println("Hoy es Sábado.");
            case 7 -> System.out.println("Hoy es Domingo.");
            default -> System.out.println("Día inválido.");
        }
        // Explicación en lenguaje humano:
        // "Dependiendo del valor del día de la semana, hacemos un cambio (switch):

        // Caso (Case) 1: Si el valor es 1, imprimimos 'Hoy es Lunes.' y luego rompemos (break) para salir del cambio.
        // Caso (Case) 2: Si el valor es 2, imprimimos 'Hoy es Martes.' y luego rompemos (break) para salir del cambio.
        // Caso (Case) 3: Si el valor es 3, imprimimos 'Hoy es Miércoles.' y luego rompemos (break) para salir del cambio.
        // Caso (Case) 4: Si el valor es 4, imprimimos 'Hoy es Jueves.' y luego rompemos (break) para salir del cambio.
        // Caso (Case) 5: Si el valor es 5, imprimimos 'Hoy es Viernes.' y luego rompemos (break) para salir del cambio.
        // Caso (Case) 6: Si el valor es 6, imprimimos 'Hoy es Sábado.' y luego rompemos (break) para salir del cambio.
        // Caso (Case) 7: Si el valor es 7, imprimimos 'Hoy es Domingo.' y luego rompemos (break) para salir del cambio.
        // Por defecto (default): Si el valor no coincide con ningún caso, imprimimos 'Día inválido.' y luego rompemos 
        // (break) para salir del cambio."
    }
}
