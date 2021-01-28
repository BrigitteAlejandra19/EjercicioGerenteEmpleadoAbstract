package com.company;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Persona {

    //Atributos

    List<Tarea> tareasPendientes = new ArrayList<>();
    List<Tarea> tareasAsignadas = new ArrayList<>();
    List<Empleado> empleados = new ArrayList<>();

    //Constructor
    public Gerente(String nombre, String dni, String domicilio) {
        super(nombre, dni, domicilio);
    }

    //Metodo
    public void agregarTarea(Tarea tarea) {
        tareasPendientes.add(tarea);
    }

    //Metodo
    public void asignarTarea(Tarea tarea, Empleado empleado) {

        boolean empleadoValido = validarEmpleadoDelGerente(empleado);
        if (!empleadoValido) {
            System.out.println("El empleado no esta dentro de la lista de empleados del Gerente");
            return;
        }

        // Validar que la tarea este en la lista de tareas pendientes de este gerente
        boolean laTareaEsDelGerente = validarTareaDelGerente(tarea);
        if (laTareaEsDelGerente == false) {
            System.out.println("La tarea no esta dentro de la lista de tareas pendientes del Gerente");
            return;
        }
        // como validamo la tarea del generente y SI es esta en tareas pendientes entonces la agrego a tareas adsignadas y la elimino de tareas pendientes.
        tareasAsignadas.add(tarea);
        tareasPendientes.remove(tarea);
        empleado.sumarTareaEmpleado(tarea);

    }

    public boolean validarEmpleadoDelGerente(Empleado empleado) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleadoDeLaLista = empleados.get(i);
            if (empleadoDeLaLista.getDni().equals(empleado.getDni())) {
                return true;
            }
        }
        return false;
    }

    private boolean validarTareaDelGerente(Tarea tarea) {
        for (int i = 0; i < tareasPendientes.size(); i++) {
            Tarea tareaDeLALista = tareasPendientes.get(i);
            if (tareaDeLALista.getId() == tarea.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer calcularSalario(int numTareas) {
        return numTareas * 75;

    }

    public Integer numeroDeTareasPendientes() {
        return tareasPendientes.size();
    }

    public Integer numeroDeTareasAsignadas() {
        return tareasAsignadas.size();
    }

    public void asignarEmpleado(Empleado empleado) {
        empleados.add(empleado);

    }
}