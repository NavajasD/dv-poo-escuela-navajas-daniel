package test.Escuela;

import domain.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        var fechaInicio = LocalDate.parse("2020-02-03");
        var cuatrimestre = new CicloLectivo(fechaInicio);
        var materia1 = new Materia(cuatrimestre, "Programacion Orientada a Objetos");
        var materia2 = new Materia(cuatrimestre, "Bases de Datos 1");
        var materia3 = new Materia(cuatrimestre, "Programacion Web 2");
        var alumno1 = new Alumno(
                LocalDate.parse("1997-05-22"),
                "Raul Gomez");
        var alumno2 = new Alumno(
                LocalDate.parse("1992-02-15"),
                "Natalia Antunez");
        var alumno3 = new Alumno(
                LocalDate.parse("1994-08-09"),
                "Miguel Lopez");
        var asignaciones = new ArrayList<Asignacion>();

        var asignacion1 = new Asignacion(materia1, alumno1);
        asignacion1.setParcial1(7);
        asignacion1.setParcial2(4);
        asignacion1.setTrabajoPractico(7);
        asignaciones.add(asignacion1);

        var asignacion2 = new Asignacion(materia1, alumno2);
        asignacion2.setParcial1(9);
        asignacion2.setParcial2(7);
        asignacion2.setTrabajoPractico(6);
        asignaciones.add(asignacion2);

        var asignacion3 = new Asignacion(materia2, alumno3);
        asignacion3.setParcial1(8);
        asignacion3.setParcial2(9);
        asignacion3.setTrabajoPractico(10);
        asignaciones.add(asignacion3);

        var asignacion4 = new Asignacion(materia2, alumno1);
        asignacion4.setParcial1(8);
        asignacion4.setParcial2(5);
        asignacion4.setTrabajoPractico(6);
        asignaciones.add(asignacion4);

        var asignacion5 = new Asignacion(materia3, alumno2);
        asignacion5.setParcial1(8);
        asignacion5.setParcial2(5);
        asignacion5.setTrabajoPractico(8);
        asignaciones.add(asignacion5);

        var asignacion6 = new Asignacion(materia3, alumno3);
        asignacion6.setParcial1(2);
        asignacion6.setParcial2(4);
        asignacion6.setTrabajoPractico(2);
        asignaciones.add(asignacion6);

        var escuela = new Escuela(asignaciones);

        escuela.printAsignaciones();

    }
}
