package com.example.postwork7.controller;


import com.example.postwork7.model.Persona;
import com.example.postwork7.service.AgendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


// Anotación que indica que esta clase es un controlador de Spring MVC
@Controller
public class AgendaController {

    // Inyección de dependencia del servicio de la agenda
    private final AgendaService agendaService;

    // Constructor que permite la inyección de dependencia
    @Autowired
    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    // Maneja las solicitudes GET a las rutas "/" o "/index"
    @GetMapping({"/", "/index"})
    public String formularioRegistro(Model model) {
        // Añade un objeto Persona vacío al modelo para el formulario
        model.addAttribute("persona", new Persona());
        // Añade la lista de personas al modelo
        model.addAttribute("listaPersonas", agendaService.getPersonas());

        // Devuelve el nombre de la vista (template) a ser renderizado por Spring MVC
        return "index";
    }

    // Maneja las solicitudes POST a la ruta "/registro"
    @PostMapping("/registro")
    public ModelAndView registra(@Valid Persona persona) {
        // Guarda la persona utilizando el servicio de la agenda
        agendaService.guardaPersona(persona);

        // Crea y configura un objeto ModelAndView para la vista "index"
        ModelAndView mav = new ModelAndView("index");
        // Añade la lista actualizada de personas al modelo
        mav.addObject("listaPersonas", agendaService.getPersonas());
        // Devuelve el objeto ModelAndView
        return mav;
    }
}