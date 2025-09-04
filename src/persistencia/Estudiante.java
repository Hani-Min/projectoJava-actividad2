package persistencia;

public class Estudiante {
    private int calificacionParcial1;
    private int calificacionParcial2;
    private int calificacionLaboratorio;
    
    public Estudiante(int calificacionParcial1, int calificacionParcial2, int calificacionLaboratorio) {
        this.calificacionParcial1 = calificacionParcial1;
        this.calificacionParcial2 = calificacionParcial2;
        this.calificacionLaboratorio = calificacionLaboratorio;
    }

    public int getCalificacionParcial1() {
        return calificacionParcial1;
    }

    public int getCalificacionParcial2() {
        return calificacionParcial2;
    }

    public int getCalificacionLaboratorio() {
        return calificacionLaboratorio;
    }
}
