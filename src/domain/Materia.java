package domain;

public class Materia {
    private CicloLectivo cicloLectivo;
    private String nombre;

    public Materia(CicloLectivo cicloLectivo, String nombre) {
        this.cicloLectivo = cicloLectivo;
        this.nombre = nombre;
    }

    public CicloLectivo getCicloLectivo() {
        return cicloLectivo;
    }

    public String getNombre() {
        return nombre;
    }
}
