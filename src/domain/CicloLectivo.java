package domain;

import java.time.LocalDate;

public class CicloLectivo {
    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;

    public CicloLectivo(LocalDate fechaInicio){
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaInicio.plusMonths(4);
    }

    public String getFechaInicio() {
        return fechaInicio.toString();
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion.toString();
    }
}
