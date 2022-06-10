package domain;

import java.time.LocalDate;
import java.time.Period;

public class Alumno{
    private LocalDate fechaNacimiento;
    private String nombre;

    public Alumno(LocalDate fechaNacimiento, String nombre) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public Integer getEdad() {
        if(fechaNacimiento == null)
            return null;
        Period tiempo = fechaNacimiento.until(LocalDate.now());
        return tiempo.getYears();
    }
}
