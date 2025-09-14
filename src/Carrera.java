import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void listarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " - Promedio: " + e.getPromedio());
        }
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
}