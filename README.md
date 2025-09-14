# Informe:

## Encapsulamiento
Los atributos de las clases (`Estudiante`, `Materia`, `Carrera` y `Universidad`) fueron declarados como `private`.  
Se implementaron métodos públicos `get` y `set` para acceder y modificar dichos atributos.  
De esta forma se protege el estado interno de los objetos y se controla cómo se asignan los valores.

## Relaciones entre clases
- La clase `Estudiante` tiene una relación con `Materia` a través de una lista de materias.
- La clase `Carrera` contiene una lista de estudiantes y métodos para gestionarlos.
- La clase `Universidad` contiene información general y una lista de estudiantes.

Estas relaciones permiten modelar de manera más realista el sistema académico.

## Validaciones en los setters
- En la clase `Estudiante`:
  - La edad debe ser mayor a 16 años.
  - El promedio debe estar en el rango de 0 a 10.
  - El nombre y apellido no pueden estar vacíos.
- En la clase `Materia`:
  - La calificación debe estar dentro del rango válido (0 a 10).

Estas validaciones aseguran la integridad de los datos y evitan valores incorrectos en los objetos.