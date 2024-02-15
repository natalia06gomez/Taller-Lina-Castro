package clasesenerocidad;

/**
 *
 * @author linan
 */
public class Estudiante implements CompararEstudiante<Estudiante>{
    private int semestres,creditos;
    private String nombre;

    public Estudiante(int semestres, int creditos, String nombre) {
        this.semestres = semestres;
        this.creditos = creditos;
        this.nombre = nombre;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void compareTo(Estudiante a) {
        if(this.semestres>a.semestres||this.creditos>a.creditos){
             System.out.println("La estudiante " + this.nombre + " es mayor a " + a.getNombre());
                 }
                if(this.semestres<a.semestres||this.creditos<a.creditos){
             System.out.println("La estudiante " + this.nombre + " es menor a " + a.getNombre());
                 }
                if(this.semestres==a.semestres&&this.creditos==a.creditos){
             System.out.println("La estudiante " + this.nombre + " y la estudiante  " + a.getNombre()+" Tienen la misma edad ");
                 }
    }
    
    
}
