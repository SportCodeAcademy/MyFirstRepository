public class D1_Operadores_Aritmeticos {

    // OPERADORES ARITMETICOS:
    // Los operadores aritméticos son utilizados para realizar operaciones matemáticas 
    // básicas en variables numéricas. Aquí tienes una lista completa de los operadores 
    // aritméticos disponibles en Java:

    // Suma: +
    // Suma dos operandos.
    //-----------------------------------------------------------------------------------------------------
    // Resta: -
    // Resta el operando derecho del operando izquierdo.
    //-----------------------------------------------------------------------------------------------------
    // Multiplicación: *
    // Multiplica dos operandos.
    //-----------------------------------------------------------------------------------------------------
    // División: /
    // Divide el operando izquierdo por el operando derecho. Si ambos operandos son enteros, el 
    // resultado será un entero (se truncará el resultado si es necesario). Si al menos uno de los 
    // operandos es un número de punto flotante, el resultado será un número de punto flotante.
    //-----------------------------------------------------------------------------------------------------
    // Módulo: %
    // Devuelve el resto de la división del operando izquierdo por el operando derecho.
    // **El "resto" es lo que queda después de una división exacta. Cuando divides un número por otro, el 
    // resto es el valor que indica cuánto sobra o no se puede dividir completamente.
    // Por ejemplo, si divides 10 entre 3:
    // El cociente es 3 (porque 3 cabe exactamente en 10, 3 veces).
    // El resto es 1 (porque después de dividir 10 por 3, queda 1 como sobrante).
    //-----------------------------------------------------------------------------------------------------
    // Incremento: ++
    // Incrementa en 1 el valor de una variable.
    //-----------------------------------------------------------------------------------------------------
    // Decremento: --
    // Decrementa en 1 el valor de una variable.
    //-----------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Suma
        int suma = a + b; // suma = 13

        // Resta
        int resta = a - b; // resta = 7

        // Multiplicación
        int multiplicacion = a * b; // multiplicacion = 30

        // División
        int division = a / b; // division = 3

        // Módulo
        int modulo = a % b; // modulo = 1 (resto de la división de 10 por 3)

        // Incremento
        a++;
        // ahora 'a' es igual a 11

        // Decremento
        b--;
        // ahora 'b' es igual a 2
        System.out.println("La suma es: "+suma+"\n"+
                            "La resta es: "+resta+"\n"+
                            "La Multiplicacion es: "+multiplicacion+"\n"+
                            "La Division es: "+division+"\n"+
                            "El modulo es:"+modulo+"\n"+
                            "El incremento es:"+a+"\n"+
                            "El decremento es:"+b);
    }
}
