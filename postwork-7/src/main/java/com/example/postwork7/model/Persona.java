package com.example.postwork7.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;



// Definición de la clase Persona que implementa Comparable para la comparación de nombres
public class Persona implements Comparable<Persona> {

    // Atributo para el nombre de la persona con validación de no estar en blanco
    @NotBlank(message = "El nombre de la persona es un campo obligatorio.")
    private String nombre;

    // Atributo para el teléfono con validación de formato usando expresión regular
    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El teléfono debe tener un formato de ##-####-####")
    private String telefono;

    // Métodos getter y setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el teléfono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método toString para representación de la clase como cadena
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    // Método equals para comparar dos objetos Persona por su nombre
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre);
    }

    // Método hashCode para generar un código hash basado en el nombre
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    // Método compareTo para comparar dos personas por su nombre (implementación de Comparable)
    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
}