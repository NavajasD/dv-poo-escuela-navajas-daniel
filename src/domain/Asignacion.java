package domain;

import java.util.List;

public class Asignacion {
    private Materia materia;
    private Alumno alumno;
    private Integer parcial1;
    private Integer parcial2;
    private Integer trabajoPractico;


    public Asignacion(Materia materia, Alumno alumno) {
        this.materia = materia;
        this.alumno = alumno;
    }
    private boolean chequearAprobado(){
        if(promedio() >= 6)
            return true;
        return false;
    }
    private Integer promedio(){
        if(!chequearNotas())
            return null;
        return (parcial1 + parcial2 + trabajoPractico)/3;
    }
    private boolean chequearNotas(){
        if (parcial1==null||parcial2==null||trabajoPractico==null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        String mensaje = "Alumno: "+ alumno.getNombre()+
                        "\nMateria: "+materia.getNombre()+
                        "\nCuatrimestre: "+materia.getCicloLectivo().getFechaInicio().toString();

        var promedio = promedio();
        if(promedio == null)
            mensaje = mensaje + "\nFALTAN NOTAS";
        else {
            String aprobado;
            if(chequearAprobado())
                aprobado = "Aprobado";
            else
                aprobado = "Desaprobado";
            mensaje = mensaje +
                    "\nParcial 1: " + parcial1.toString() +
                    "\nParcial 2: " + parcial2.toString() +
                    "\nTrabajo Practico: " + trabajoPractico.toString() +
                    "\nPromedio: " + promedio.toString() +
                    "\nAprobado: " + aprobado;
        }
        return mensaje;
    }

    public void setParcial1(Integer parcial1) {
        this.parcial1 = parcial1;
    }

    public void setParcial2(Integer parcial2) {
        this.parcial2 = parcial2;
    }

    public void setTrabajoPractico(Integer trabajoPractico) {
        this.trabajoPractico = trabajoPractico;
    }
}
