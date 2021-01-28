package com.company;

public abstract class Persona {
    private String nombre;
    private String dni;
    private String domicilio;

    public Persona(String nombre, String dni, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    public abstract Integer calcularSalario(int numeroTareas);

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }
}
