package B1_Estructuras_Condicionales;

public class B1_Switch_Statement {
    
    public static void main(String[] args) {
        
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
                break;
            default:
                System.out.println("Día inválido.");
                break;
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
