//Revisar documentacion para conocer la sintaxis:
//https://docs.oracle.com/en/java/javase/22/docs/api/index.html

import java.util.Scanner;
import java.util.ArrayList;

public class D_Tipos_de_Datos {
    static boolean exit = false;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, World!");
        while (!exit) {
            System.out.println("Seleccion un tema:");
            System.out.println("1. Tipos primitivos");
            System.out.println("2. Tipos referentes");
            System.out.println("0. Salir");
            String seleccion = scanner.nextLine();
            switch (seleccion) {
                case "1":
                    tiposPrimitivos();
                    break;
                case "2":
                    tiposReferentes();
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
     // -----------------Tipos de Datos-----------------

        // Datos Primitivos: 
        // Almacenan valores directamente y ocupan un tamaño específico 
        // en memoria. Ejemplos son int, byte, double, etc.

        // Datos de Clase (o de Objeto) o Referentes:
        // Almacenan referencias a objetos y tienen un tamaño
        // fijo en memoria, generalmente 32 o 64 bits dependiendo de la arquitectura.

    // Datos primitivos:
    static void tiposPrimitivos() {
        // 1.-Primitivos enteros:
        byte tipoByte = 100; // –128 a 127 (tamaño de 1 byte)
        short tipoShort = 10000; // –32,768 a 32,767 (tamaño de 2 bytes)
        int tipoInt = 100000; // –2,147,483,648 a 2,147,483,647 (tamaño de 4 bytes)
        long tipoLong = 100000L; // –9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 (tamaño de 8 bytes)
        // 2.-Primitivos decimales y punto flotante:
        float tipoFloat = 234.5f; // 1.4e–045 to 3.4e+038 (tamaño de 4 bytes)
        double tipoDouble = 123.4; // 4.9e–324 to 1.8e+308 (tamaño de 8 bytes)
        // 3.-Primitivos de Caracter
        char tipoChar = 'a'; // 1 sola letra o el numero de caracter ASCII (tamaño de 2 bytes)
        // 4.-Primitivos Boleanos
        boolean tipoBoolean = true; // true o false (generalmente se le asocia con 1 bit)

        // * El bit es la unidad de información electrónica más pequeña y define el mundo digital
        // Uso correcto de los bits y bytes:
        //      Bit o Bits: Representacion para velocidad de transferencia de datos.
        //      Byte o Bytes: Representacion de tamaño de una memoria de almacenamiento.

        // Metodo para imprimir estos datos en consola:
        imprimirDatos(tipoByte, tipoShort, tipoInt, tipoLong, tipoFloat, tipoDouble, tipoChar, tipoBoolean);
    }

    static class Miclase{
    }

    static void tiposReferentes (){
        // 1.-Cadenas de caracteres:
        String texto = "Hola";

        // 2.-Clases y objetos:
        Miclase obj = new Miclase();

        // 3.-Arreglos:
        int[] arreglo = new int[10];

        // 4.-Colecciones:
        ArrayList<Integer> lista = new ArrayList<>();

        // 5.-Clases envolventes (para convertir tipos primitivos en objetos):
        Integer objetoInteger = 10;
        Double objetoDouble = 3.14;
        Character objetoCharacter = '@';
        Boolean objetoBoolean = false;    //Etc...
        
        // Diferencias Clave entre Primitivos y Clases emvolventes:
        // ------------Tipo de datos:------------
        // Integer es una clase de objeto.
        // int es un tipo de dato primitivo.
        
        // --------Capacidad de ser null:--------
        // Integer puede ser null.
        // int no puede ser null.

        // ---------Métodos Disponibles:---------
        // Integer tiene métodos disponibles, como compareTo(), toString(), intValue(), etc.
        // int no tiene métodos disponibles, ya que es un tipo primitivo.
        
        // --------Autoboxing y Unboxing:--------
        // Autoboxing: Conversión automática de un tipo primitivo a su clase envolvente correspondiente. Ejemplo: int a Integer.
        // Unboxing: Conversión automática de una clase envolvente a su tipo primitivo correspondiente. Ejemplo: Integer a int.
        // Integer numero = 10; implica autoboxing.
        // int numero2 = numero; implica unboxing cuando se asigna el valor de un Integer a un int.

        imprimirDatos(texto, obj, arreglo, lista, objetoInteger, objetoDouble, objetoCharacter, objetoBoolean);
    }

    static void imprimirDatos(Object... datosPrimitivos) {
        // Bucle (loop) de iteración sobre un arreglo de objetos
        for (Object datoPrimitivo : datosPrimitivos) {
            System.out.println(datoPrimitivo + " <- Dato " + datoPrimitivo.getClass().getSimpleName());
        }
        System.out.println("----------------------------------");
    }
}