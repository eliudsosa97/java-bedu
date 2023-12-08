package com.example.postwork7.service;

import com.example.postwork7.model.Persona;
import com.example.postwork7.persistence.AgendaMemoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

// Definición de la clase que proporciona servicios relacionados con la agenda
@Service
public class AgendaService {

    // Instancia de ValidadorTelefono para validar y limpiar números de teléfono
    private final ValidadorTelefono validadorTelefono;

    // Instancia de AgendaMemoryDao para acceder a las operaciones de almacenamiento en memoria
    private final AgendaMemoryDao agendaDao;

    // Constructor que recibe un ValidadorTelefono y un AgendaMemoryDao al ser creado el objeto AgendaService
    public AgendaService(ValidadorTelefono validadorTelefono, AgendaMemoryDao agendaDao) {
        this.validadorTelefono = validadorTelefono;
        this.agendaDao = agendaDao;
    }

    // Método para guardar una persona en la agenda, valida y limpia el número de teléfono antes de almacenarlo
    public Persona guardaPersona(Persona persona) {
        // Limpia y valida el número de teléfono usando el validador
        String telefono = validadorTelefono.limpiaNumero(persona.getTelefono());
        // Actualiza el número de teléfono en la persona
        persona.setTelefono(telefono);
        // Guarda la persona en el repositorio de memoria
        return agendaDao.guardaPersona(persona);
    }

    // Método para obtener todas las personas de la agenda
    public Set<Persona> getPersonas() {
        return agendaDao.getPersonas();
    }
}