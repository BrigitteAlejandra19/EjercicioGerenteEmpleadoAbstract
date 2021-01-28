package com.company;

public class Main {

    public static void main(String[] args) {
        Tarea tarea1 = new Tarea(1);
        Tarea tarea2 = new Tarea(2);
        Tarea tarea3 = new Tarea(3);
        Tarea tarea4 = new Tarea(4);

        Empleado empleado1 = new Empleado( "Andres", "95684526", "Recoleta");

        Gerente gerente1 = new Gerente ( "Rafael" , "94958116", "Alamgro");

        gerente1.asignarEmpleado(empleado1);

        gerente1.agregarTarea(tarea1);
        gerente1.agregarTarea(tarea2);
        gerente1.agregarTarea(tarea3);

        gerente1.asignarTarea(tarea1, empleado1);
        gerente1.asignarTarea(tarea4, empleado1);

        System.out.println("El Gerente 1 tiene las siguientes tareas pendientes: " + gerente1.numeroDeTareasPendientes());
        System.out.println("El gerente tiene las siguientes tareas asignadas: " + gerente1.numeroDeTareasAsignadas());

        System.out.println("El Empleado " + empleado1.getDni() + " tiene un total de tareas pendientes de: " + empleado1.numeroDeTareasPendientes());
        empleado1.ejecutarTarea(tarea4);
        empleado1.ejecutarTarea(tarea1);
        System.out.println("El Empleado " + empleado1.getDni() + " tiene un total de tareas pendientes de: " + empleado1.numeroDeTareasPendientes());
        System.out.println("El Empleado " + empleado1.getDni() + " tiene un total de tareas ejecutadas de: " + empleado1.numeroDeTareasEjecutadas());

    }
}

