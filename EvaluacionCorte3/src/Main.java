import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Estudiante> estudiantes = new HashMap<>();
        ArrayList<Estudiante> estudiante = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int[] matriculas = {173602, 173616, 173620, 173625, 182629, 182633, 193626, 192020, 213610};
        boolean salir = true;
        do{
            System.out.println("Menú:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante por matrícula");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Imprimir estudiantes ordenados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la matrícula del estudiante a agregar: ");
                    int nuevaMatricula = scanner.nextInt();
                    int inicio = 0;
                    int fin = matriculas.length - 1;
                    boolean aleta = true;
                    while (inicio <= fin) {
                        int medio = inicio + (fin - inicio) / 2;
                        if (matriculas[medio] == nuevaMatricula) {
                            System.out.print("Ingrese el nombre del estudiante: ");
                            scanner.nextLine();
                            String nombre = scanner.nextLine();
                            System.out.print("Ingrese la carrera del estudiante: ");
                            String carrera = scanner.nextLine();
                            System.out.println("Estudiante agregado con éxito.");
                            Estudiante nuevoEstudiante = new Estudiante(nuevaMatricula,nombre,carrera);
                            estudiante.add(nuevoEstudiante);
                            aleta = false;
                            break;
                        } else if (matriculas[medio] < nuevaMatricula) {
                            inicio = medio + 1;
                        } else {
                            fin = medio - 1;
                        }
                    }
                    if (aleta) {
                        System.out.println("Matrícula inválida");
                    }
                    if (aleta == true){
                        System.out.println("Matrícula inválida");
                    }
                    break;
                case 2:
                    for (int matricula : matriculas) {
                        for (Estudiante item:estudiante){
                            estudiantes.put(matricula,item);
                        }
                    }
                    System.out.print("Ingrese la matrícula del estudiante a buscar: ");
                    int matriculaBuscar = scanner.nextInt();
                    Estudiante estudianteBuscado = estudiantes.get(matriculaBuscar);
                    if (estudianteBuscado != null) {
                        System.out.println("Estudiante encontrado: " + estudianteBuscado);
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la matrícula del estudiante a eliminar: ");
                    int matriculaEliminar = scanner.nextInt();
                    inicio = 0;
                    fin = matriculas.length - 1;
                    boolean encontrado = true;
                    while (inicio <= fin) {
                        int medio = inicio + (fin - inicio) / 2;

                        if (matriculas[medio] == matriculaEliminar) {
                            System.out.print("¿Está seguro que desea eliminar al estudiante? (s/n): ");
                            String confirmacion = scanner.next();
                            if (confirmacion.equalsIgnoreCase("s")) {
                                estudiantes.remove(matriculaEliminar);
                                System.out.println("Estudiante eliminado con éxito");
                                encontrado = false;
                            } else {
                                System.out.println("Eliminación cancelada.");
                            }
                            break;
                        } else if (matriculas[medio] < matriculaEliminar) {
                            inicio = medio + 1;
                        } else {
                            fin = medio - 1;

                        }
                    }
                    if (encontrado==true){
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 4:
                    List<Integer> matriculasOrdenadas = new ArrayList<>(estudiantes.keySet());
                    int mat=0;
                    for (int i = 0; i < matriculas.length - 1; i++) {
                        for (int j = 1; j < matriculas.length - i - 1; j++) {
                            if (matriculas[j] < matriculas[i]) {
                                mat = matriculas[j];
                                matriculasOrdenadas.add(mat);
                            }
                        }
                    }
                    System.out.println("Estudiantes ordenados por matrícula ascendente:");
                    for (int matricula : matriculasOrdenadas) {
                        System.out.println(estudiantes.get(matricula));
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir? (s/n): ");
                    String confirmacionSalir = scanner.next();
                    if (confirmacionSalir.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo...");
                        salir = false;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }while (salir == true);
    }
}
