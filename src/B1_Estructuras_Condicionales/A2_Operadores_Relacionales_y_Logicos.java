package B1_Estructuras_Condicionales;

public class A2_Operadores_Relacionales_y_Logicos {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean t = true;
        boolean f = false;

        //-------------------------------------------------------------------------------------
        // Operadores Relacionales:
        // Se utilizan para comparar dos valores.

        // Igualdad (==): Verifica si dos valores son iguales.
        boolean isEqual = a == b; // false

        // Desigualdad (!=): Verifica si dos valores no son iguales.
        boolean isNotEqual = a != b; // true

        // Mayor que (>): Verifica si el primer valor es mayor que el segundo.
        boolean isGreater = a > b; // true

        // Menor que (<): Verifica si el primer valor es menor que el segundo.
        boolean isLesser = a < b; // false

        // Mayor o igual que (>=): Verifica si el primer valor es mayor o igual que el segundo.
        boolean isGreaterOrEqual = a >= b; // true

        // Menor o igual que (<=): Verifica si el primer valor es menor o igual que el segundo.
        boolean isLesserOrEqual = a <= b; // false

        //-------------------------------------------------------------------------------------
        // Operadores Lógicos:
        // Se utilizan para combinar múltiples condiciones booleanas.

        // AND Lógico (&&): Verdadero si ambos operandos son verdaderos.
        boolean and = t && f; // false

        // OR Lógico (||): Verdadero si al menos uno de los operandos es verdadero.
        boolean or = t || f; // true

        // **NOT Lógico (!) **: Invierte el valor booleano del operando.
        boolean nott = !t; // false
        boolean notf = !f; // false

        //-------------------------------------------------------------------------------------
        System.out.println("A es igual que B: "+isEqual+"\n"+
                            "A es diferente que B: "+isNotEqual+"\n"+
                            "A es mayor que B: "+isGreater+"\n"+
                            "A es menor que B: "+isLesser+"\n"+
                            "A es mayor/igual que B: "+isGreaterOrEqual+"\n"+
                            "A es menor/igual que B: "+isLesserOrEqual+"\n"+
                            "-----------------------------------"+"\n"+
                            "Verdadero y Falso da:"+and+"\n"+
                            "Verdadero o Falso da:"+or+"\n"+
                            "Negacion de verdadero es:"+nott+"\n"+
                            "Negacion de falso es:"+notf+"\n");
    }
}
