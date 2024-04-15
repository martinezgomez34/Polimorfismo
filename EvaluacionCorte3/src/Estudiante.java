import java.util.*;

class Estudiante {
    private int matricula;
    private String nombre;
    private String carrera;

    public Estudiante(int matricula, String nombre, String carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public int getMatricula() {
        return matricula;
    }

    public String toString() {
        return "Matricula: " + matricula + ", Nombre: " + nombre + ", Carrera: " + carrera;
    }
}

