import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante();
        e1.setNombre("Juan");
        e1.setApellido("García");
        e1.setEdad(20);
        e1.setCarrera("Ingeniería");
        e1.setPromedio(0);

        Estudiante e2 = new Estudiante("Ana", "Martínez", 22, "Medicina", 0);
        Estudiante e3 = new Estudiante("Luis", "Fernández", 19, "Derecho", 0);

       
        Materia m1 = new Materia("Matemáticas", "MAT101", 4, 8);
        Materia m2 = new Materia("Historia", "HIS201", 3, 7);
        Materia m3 = new Materia("Programación", "PRG301", 5, 9);

        e1.agregarMateria(m1);
        e1.agregarMateria(m2);

        e2.agregarMateria(m1);
        e2.agregarMateria(m3);

        e3.agregarMateria(m2);
        e3.agregarMateria(m3);

        
        e1.calcularPromedio();
        e2.calcularPromedio();
        e3.calcularPromedio();

        
        Estudiante[] estudiantes = {e1, e2, e3};

      
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " - Promedio: " + e.getPromedio());
        }

        Carrera ingenieria = new Carrera("Ingeniería");
        ingenieria.agregarEstudiante(e1);
        ingenieria.agregarEstudiante(e2);

        System.out.println("\nEstudiantes en la carrera de Ingeniería:");
        ingenieria.listarEstudiantes();
    }
}