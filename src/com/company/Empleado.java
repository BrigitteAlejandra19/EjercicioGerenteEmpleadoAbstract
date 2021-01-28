package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {
    //Atributos
    private List<Tarea> tareasPendientes = new ArrayList<>();
    private List<Tarea> tareasEjecutadas = new ArrayList<>();

    //Constructor
    public Empleado(String nombre, String dni, String domicilio) {
        super(nombre, dni, domicilio);
    }

    //Metodo
    public void ejecutarTarea(Tarea tarea){

        boolean existeLaTarea = false;

        for (int i = 0; i<tareasPendientes.size(); i++){
            Tarea tareaDelMomento = tareasPendientes.get(i);

            if(tareaDelMomento.getId()== tarea.getId()){
             tareasEjecutadas.add(tarea);
             tareasPendientes.remove(tareaDelMomento);
             existeLaTarea = true;
             break;
            }
        }
        if (!existeLaTarea) {
            System.out.println("La tarea que nos pasaste no figura en nuestra lista de tareas pendientes por ejecutar");
        }
    }
    @Override
    public Integer calcularSalario(int numeroTareas) {
        return numeroTareas * 150;
    }

    public void sumarTareaEmpleado(Tarea tarea) {
        if (!tareasPendientes.add(tarea)){
            System.out.println("No se pudo agregar la tarea a la lista del empleado");
        }
    }

    public Integer numeroDeTareasPendientes() {
        return tareasPendientes.size();
    }

    public Integer numeroDeTareasEjecutadas() {
        return tareasEjecutadas.size();
    }
}
