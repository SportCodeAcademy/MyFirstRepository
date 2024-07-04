import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class F_Objetos_Inmutables {
    
    
    public static void main(String[] args) {

        // ------------------------------------------MUTABABLES------------------------------------------

        // En Java, la mayoría de las clases son diseñadas como mutables, lo que significa que su 
        // estado interno puede ser modificado después de su creación. Esto incluye muchas de las 
        // clases proporcionadas en las bibliotecas estándar de Java. Aquí tienes algunos ejemplos 
        // de clases mutables comunes en Java:

        // StringBuilder y StringBuffer: 
        // Estas clases se utilizan para construir cadenas de caracteres de manera eficiente. Puedes 
        // modificar su contenido agregando, insertando o eliminando caracteres.

        StringBuilder sb = new StringBuilder("Hola");
        sb.append(", Mundo"); // Modifica el contenido de sb a "Hola, Mundo"
        
        // ArrayList y otras implementaciones de List: 
        // Las colecciones como ArrayList permiten agregar, eliminar y modificar elementos en la lista 
        // después de su creación.
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10); // Agrega un elemento a la lista
        lista.set(0, 20); // Modifica el elemento en la posición 0 a 20
        
        // HashMap y otras implementaciones de Map:
        // Los mapas como HashMap permiten agregar, eliminar y actualizar pares clave-valor después de 
        // su creación.
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave", 100); // Agrega un par clave-valor al mapa
        mapa.replace("clave", 200); // Actualiza el valor asociado a la clave "clave" a 200
        
        // Date y Calendar: 
        // Aunque java.util.Date y java.util.Calendar han sido reemplazados en gran medida por java.time 
        // en Java 8 y versiones posteriores, son ejemplos de clases mutables que representan fechas y 
        // tiempos y cuyo estado puede ser cambiado.
        Date fecha = new Date();
        fecha.setTime(1);
        
        // Mutable Objects en Programación Orientada a Objetos: 
        // Cualquier clase que tenga métodos que modifiquen sus atributos internos puede considerarse 
        // mutable. Esto es común en clases diseñadas para modelar entidades que pueden cambiar de estado 
        // a lo largo del tiempo.

        // ------------------------------------------INMUTABLES------------------------------------------
        // Algunas clases están diseñadas como inmutables, lo que significa que una vez que se crea un objeto 
        // con un valor específico, ese valor no puede cambiar. Esto promueve la seguridad, la concurrencia y la 
        // predictibilidad en el código. Aquí tienes algunos ejemplos de clases inmutables comunes en Java:

        // String: 
        // La clase String en Java es inmutable. Una vez que se crea un objeto String con un valor, ese valor no 
        // puede ser modificado. Cualquier operación que parezca modificar un String en realidad crea un nuevo 
        // objeto String.
        String str = "Hola";
        str = str + ", Mundo"; // Esto crea un nuevo objeto String con el valor "Hola, Mundo" en el Pool

        // Java String Pool:----------------------------------------
        // Es un almacen de datos que se ubica en el heap, Almacena las cadenas literales en el Pool, son reutilizales.
        // Heap (Montón) Propósito: --------------------------------
        // El heap es utilizado para la asignación dinámica de memoria durante la ejecución del programa. 
        // Aquí es donde se alojan los objetos y estructuras de datos que se crean durante la ejecución del programa.
        // Pila (Stack) Propósito: ---------------------------------
        // La pila se utiliza para almacenar datos temporales como variables locales y referencias a objetos. 
        // Cada hilo de ejecución en un programa Java tiene su propia pila.

        // Integer, Double, etc.:
        // Las clases envolventes para tipos primitivos como Integer, Double, Boolean, etc., son inmutables. Una 
        // vez que se crea un objeto Integer con un valor, ese valor no puede ser modificado.
        Integer numero = 10;
        // numero++; // Esto daría un error de compilación, ya que Integer es inmutable
        numero = numero + 5; // Esto crea un nuevo objeto Integer con el valor 15
        
        // LocalDate, LocalTime, LocalDateTime: 
        // Estas clases en java.time son inmutables y representan fechas, 
        // tiempos y fecha-tiempo respectivamente. Operaciones como ajustar o manipular valores de fecha y tiempo 
        // crean nuevos objetos en lugar de modificar los existentes.
        LocalDate fecha2 = LocalDate.of(2023, 7, 4);
        LocalDate manhiana = fecha2.plusDays(1); // Esto crea un nuevo objeto LocalDate representando el día siguiente
        System.err.println(manhiana);
        
        // BigInteger, BigDecimal: 
        // Estas clases en java.math son inmutables y representan números enteros y decimales de precisión arbitraria. 
        // Operaciones matemáticas con estos objetos crean nuevos objetos en lugar de modificar los existentes.
        BigInteger numeroGrande = new BigInteger("12345678901234567890");
        BigInteger multiplicado = numeroGrande.multiply(new BigInteger("2")); // Esto crea un nuevo objeto BigInteger
        System.err.println(multiplicado);
        
        // Enum: Los tipos enumerados en Java (enum) son inmutables por diseño. Los valores de un enum son constantes 
        // y no pueden ser modificados después de la creación del tipo enumerado.
        enum DiaSemana {
            LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
        }
        DiaSemana dia = DiaSemana.LUNES;
        dia = DiaSemana.MIERCOLES; // Esto es posible, pero los valores individuales (LUNES, MARTES, etc.) no pueden cambiar
        System.err.println(dia);
        
        // Estos son algunos ejemplos de clases inmutables en Java. Utilizar objetos inmutables donde sea posible puede 
        // mejorar la seguridad y la estabilidad del código, especialmente en entornos concurrentes y distribuidos.
    }
}
