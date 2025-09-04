package presentacion;

import java.util.Scanner;
import persistencia.Estudiante;

public class CalculadoraCalificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calificación parcial 1:");
        int calificacionParcial1 = sc.nextInt();
        
        System.out.println("Calificación parcial 2:");
        int calificacionParcial2 = sc.nextInt();
        
        System.out.println("Calificación de laboratorio:");
        int calificacionLaboratorio = sc.nextInt();
        
        // Crear un objeto Estudiante con las calificaciones proporcionadas
        Estudiante estudiante = new Estudiante(calificacionParcial1, calificacionParcial2, calificacionLaboratorio);
        
        // Calcular el promedio de los dos primeros parciales
        double promedioParciales = (estudiante.getCalificacionParcial1() + estudiante.getCalificacionParcial2()) / 2.0;
        
        double promedioMateria = promedioParciales * 0.7 + estudiante.getCalificacionLaboratorio() * 0.3;
        
        // Calificación mínima requerida para aprobar
        int calificacionMinima = 60;
        
        // Calcular la calificación necesaria en el tercer parcial para alcanzar 60 en la materia
        int calificacionParcial3Necesaria = (int) Math.ceil((calificacionMinima - promedioMateria) / 0.7);
        
        System.out.println("Necesitas obtener " + calificacionParcial3Necesaria + " en el parcial 3.");
    }
}