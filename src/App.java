//Revisar documentacion para conocer la sintaxis:
//https://docs.oracle.com/en/java/javase/22/docs/api/index.html

import java.util.Scanner;

public class App {
    
    static boolean exit = false;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, World!");
        while (!exit) {
            System.out.println("Seleccion un tema:");
            System.out.println("1. Datos primitivos");
            System.out.println("0. Salir");
            String seleccion = scanner.nextLine();
            switch (seleccion) {
                case "1":
                    datosPrimitivos();
                    break;
                case "0":
                    exit = true;
                    scanner.close();
                    break;
                default:
                    break;
            }
        }
    }

    // Convencion de Nomenclatura en Java:
    // PascalCase (UpperCamelCase): Para Clases (public class Person)
    // CamelCase (LowerCamelCase): Para variables, parametros, metodos.
    // ScreamingSnakeCase (UpperSnakeCase): Para constantes (final int MAX_LENGHT)

    // Tipos de datos primitivos:
    static void datosPrimitivos() {
        // Primitivos enteros:
        byte datoByte = 100; // –128 a 127
        short datoShort = 10000; // –32,768 a 32,767
        int datoInt = 100000; // –2,147,483,648 a 2,147,483,647
        long datoLong = 100000L; // –9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        // Primitivos flotantes decimales:
        float datoFloat = 234.5f; // 1.4e–045 to 3.4e+038
        double datoDouble = 123.4; // 4.9e–324 to 1.8e+308
        char datoChar = 12; // 1 sola letra o el numero de caracter ASCII
        boolean datoBoolean = true; // true o false

        // Algoritmo de iteracion sobre un arreglo de objetos
        Object[] datosPrimitivos = { datoByte, datoShort, datoInt, datoLong, datoFloat, datoDouble, datoChar,
                datoBoolean };
        for (Object datoPrimitivo : datosPrimitivos) {
            System.out.println(datoPrimitivo + " <- Dato " + datoPrimitivo.getClass().getSimpleName());
        }
        System.out.println("----------------------------------");
    }
}