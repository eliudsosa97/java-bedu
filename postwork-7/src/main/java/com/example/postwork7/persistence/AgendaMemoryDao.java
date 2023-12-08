package com.example.postwork7.persistence;

import com.example.postwork7.model.Persona;
import com.example.postwork7.service.FormateadorTelefono;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Definición de la clase que actúa como repositorio en memoria para personas
@Repository
public class AgendaMemoryDao {

    // Conjunto ordenado de personas (usando TreeSet para ordenar automáticamente por nombre)
    private static final SortedSet<Persona> personas = new TreeSet<>();

    // Instancia de FormateadorTelefono para formatear números de teléfono
    private final FormateadorTelefono formateadorTelefono;

    // Constructor que recibe un FormateadorTelefono al ser creado el objeto AgendaMemoryDao
    public AgendaMemoryDao(FormateadorTelefono formateadorTelefono) {
        this.formateadorTelefono = formateadorTelefono;
    }

    // Método para guardar una persona en el repositorio
    public Persona guardaPersona(Persona persona) {
        // Formatea el teléfono usando el formateador antes de agregarlo al conjunto
        persona.setTelefono(formateadorTelefono.formatea(persona.getTelefono()));
        // Agrega la persona al conjunto ordenado
        personas.add(persona);
        // Devuelve la persona guardada
        return persona;
    }

    // Método para obtener todas las personas del repositorio
    public Set<Persona> getPersonas() {
        return personas;
    }
}