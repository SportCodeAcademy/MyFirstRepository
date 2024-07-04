public class A_Punto_de_Entrada { 
    
    // Firma Correcta del Método main:
    // Para ser considerado el punto de entrada de una aplicación Java, el método main debe cumplir con los siguientes requisitos:

    // Nombre del Método: Debe llamarse main.
    // Modificadores: Debe ser public y static.
    // Tipo de Retorno: Debe ser void.
    // Parámetros: Debe aceptar un solo parámetro, que es un arreglo de cadenas de caracteres (String[]).

    // La JVM busca específicamente un método con esta firma para iniciar la ejecución del programa.
    // Si la firma no coincide exactamente, la JVM no podrá encontrar el punto de entrada y lanzará un error.
    public static void main(String[] args) {

        //El contenido será lo que programemos
        System.out.println("Hello, World!");
    }
}
