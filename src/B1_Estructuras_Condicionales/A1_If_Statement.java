package B1_Estructuras_Condicionales;

public class A1_If_Statement {
    // Documentation the if statement:
    // https://docs.oracle.com/javase/specs/jls/se22/html/jls-14.html#jls-14.9

    public static void main(String[] args) {
        
        // The If Statement (La sentencia Si-Entonces):
        // Caracteristicas:
        // a): Evaluación de condicion: La sentencia siempre espera evaluar una condicion que sea una "expresion" boolean.
        // En caso la expresion devuelva otro tipo de dato, marcará un error. En caso reciba un Boolean de tipo envolvente, hará unboxing.
        // (En algunos lenguajes de programación como JavaScript, por ejemplo, se pueden usar expresiones que no son booleanas 
        // directamente en contextos booleanos como el de un if. Esto se debe a cómo esos lenguajes manejan la conversión 
        // automática de tipos (coerción de tipos). Que manejan los conceptos de truthy y falsy. En Java no existen estos conceptos) 
        // b): Terminación Abrupta: Si la evaluación de la expresión o la conversión a valor primitivo (unboxing) 
        // se detiene de manera inesperada (por ejemplo, debido a un error), la instrucción if también se detiene de manera inesperada por la misma razón.
        // c): Control de flujo: Permite controlar qué bloques de código se ejecutan en base al resultado de la condición.

        // ¿Que es una expresion?
        // Una expresión es cualquier combinación de variables, operadores y valores que se evalúa para 
        // producir un resultado. En Java, las expresiones pueden incluir operaciones aritméticas, 
        // llamadas a métodos, y accesos a variables.
        // int edad = 18;

        // If-Then (si-entonces) estructura basica:
        // if (condicion booleana) {
        //      Bloque código a ejecutar si la expresión es true
        // }

        // If-Then-Else (si-entonces-de otro modo) estructura:
        // if (condicion booleana) {
        //      Bloque código a ejecutar si la expresión es true
        // } else {
        //      Bloque código alternativo a ejecutar si la expresión es false (no necesita evaluar nada)
        // }

        // Else-If (mas-si): evaluar múltiples condiciones secuenciales después de un If-Then.
        // if (condicion1) {
        //      código a ejecutar si condicion1 es verdadera
        // } else if (condicion2) {
        //      código a ejecutar si condicion1 es falsa y condicion2 es verdadera
        // } else if (condicion3) {
        //      código a ejecutar si condicion1 y condicion2 son falsas y condicion3 es verdadera
        // } else {
        //      código a ejecutar si todas las condiciones anteriores son falsas (no necesita evaluar nada)
        // }

        // Correcto uso de llaves { }:
        // Si el bloque de codigo consta de 1 sola instruccion, se puede omitir las {}.
        // Si el bloque de codigo consta de mas de 1 instruccion, se tiene que encerrar entre {}.

        // **Nota:  Por buenas practicas y claridad de codigo siempre se usan las llaves.
        //          Siempre implementar un else para evitar que el codigo se ejecute de manera inesperada.

        boolean hicisteLosDeberes = true;
        if(hicisteLosDeberes)
            System.out.println("Puedes jugar videojuegos.");
        else
            System.out.println("Quedas castigado 1 mes");

        // Explicación en lenguaje humano:
        // Si es verdad que hiciste los deberes, entonces puedes jugar videojuegos. De lo contrario,
        //  quedas castigado un mes.

        double saldoCuenta = 100.0;
        double precioProducto = 200.0;
        if (saldoCuenta >= precioProducto) {
            System.out.println("Compra realizada con éxito.");
        } else {
            System.out.println("Fondos insuficientes para realizar la compra.");
        }

        // Explicación en lenguaje humano:
        // Si el saldo de la cuenta es mayor o igual al precio del producto, entonces la compra se realiza 
        // con éxito. De lo contrario, los fondos son insuficientes para realizar la compra.

        int edad = 18;
        if (edad < 0) {
            System.out.println("Edad no válida");
        } else if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad < 65) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }

        // Explicación en Lenguaje Humano:
        // "Si la edad es menor que 0, entonces la edad no es válida. De lo contrario, si la edad es menor que 18, 
        // entonces eres menor de edad. De lo contrario, si la edad es menor que 65, entonces eres un adulto. 
        // De lo contrario, eres un adulto mayor."
    }
}
