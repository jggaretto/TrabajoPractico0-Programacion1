# Informe:

## Encapsulamiento
En mi solución usé atributos privados en las clases para que no se puedan modificar directamente.  
Después hice métodos getters y setters, así controlo cómo se cambian los valores.  

## Relaciones entre clases
- El estudiante tiene una lista de materias.  
- La carrera guarda varios estudiantes.  
- La universidad también tiene estudiantes y datos propios.  

De esta forma se puede ver cómo se relacionan entre sí.  

## Validaciones en los setters
- En Estudiante: verifiqué que la edad sea mayor a 16, que el promedio esté entre 0 y 10 y que nombre/apellido no estén vacíos.  
- En Materia: la nota tiene que estar también entre 0 y 10.  

Estas validaciones evitan que se carguen datos incorrectos.