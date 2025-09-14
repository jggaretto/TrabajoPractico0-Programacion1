import java.util.List;

public class Universidad {
    private String nombre;
    private String direccion;
    private List<Estudiante> estudiantes;

    public Universidad(String nombre, String direccion, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = estudiantes;
    }
}
