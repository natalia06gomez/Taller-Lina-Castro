package clasesenerocidad;

/**
 *
 * @author linan
 */
public class ClaseComparar  { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Estudiante estudiante1 = new Estudiante(5, 50, "Lina");
        Estudiante estudiante2 = new Estudiante(5, 50, "Natalia");
        estudiante1.compareTo(estudiante2);
    }
    
}