package domain;

import java.util.ArrayList;

public class Escuela {
    private ArrayList<Asignacion> asignaciones;

    public Escuela(ArrayList<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public void printAsignaciones(){
        for(Asignacion asignacion : asignaciones)
        {
            System.out.println(asignacion.toString());
            System.out.println("-------");
        }
    }

}
