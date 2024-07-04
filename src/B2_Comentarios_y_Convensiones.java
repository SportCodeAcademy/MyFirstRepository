public class B2_Comentarios_y_Convensiones {
    /*-------------------------------------------------------------------------------------------------*/
    // Comentarios:
    // 1.- Comentarios de línea: “//”, es comentario hasta final de línea
    // EJEMPLO:
            //Hola Mundo
    /*-------------------------------------------------------------------------------------------------*/
    // 2.- Comentarios de bloque: “/*” ... “*/”
    // EJEMPLO:
    /*
            Hola Mundo
     */
    /*-------------------------------------------------------------------------------------------------*/
    // 3.- Comentarios de documentación: “/**” ...”*/”. Se utiliza para documentar los aspectos públicos
    // de las clases; mediante la herramienta javadoc.exe se genera documentación en formato HTML
    // con el contenido
    // EJEMPLO:
    /**
     @param args
     */
    /*-------------------------------------------------------------------------------------------------*/
    public static void main(String[] args) {
        // Imprimir un mensaje en la consola
        System.out.println("Hello World!");
        eliminar_nuevo_usuario(1);
    }

    // Convencion de Nomenclatura en Java:

    // 1.- PascalCase (UpperCamelCase): Para Clases (public class Usuario)

    public class Usuario { }

    // 2.- CamelCase (LowerCamelCase): Para identificadores, parametros, metodos.

    public Object[] agregarNuevoUsuario(int idUsuario, Usuario nuevoUsuario) {
        String mensajeDeOperacion = "Se creó el nuevo usuario";
        boolean estadoDeOperacion = true;

        return new Object[]{mensajeDeOperacion, estadoDeOperacion};
    }

    // 3.- SnakeCase (LowerSnakeCase): Para identificadores y metodos privados.

    private static String mensaje_de_operacion;
    private static boolean estado_de_operacion;

    private static Object[] eliminar_nuevo_usuario(int idUsuario) {
        mensaje_de_operacion = "Se creó el nuevo usuario";
        estado_de_operacion = true;
        
        return new Object[]{mensaje_de_operacion, estado_de_operacion};
    }

    // 4.- ScreamingSnakeCase (UpperSnakeCase): Para constantes (final int MAX_LENGHT)

    final float PI = 3.14f;
    final double ESTATURA_MINIMA = 1.7;
}
