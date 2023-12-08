package org.bedu.java.postwork.postwork4;

import org.bedu.java.postwork.postwork4.model.Persona;
import org.bedu.java.postwork.postwork4.service.FormateadorTelefono;
import org.bedu.java.postwork.postwork4.service.ValidadorTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Postwork4Application implements CommandLineRunner {

    private final ValidadorTelefono validadorTelefono;
    private final FormateadorTelefono formateadorTelefono;

    @Autowired
    public Postwork4Application(ValidadorTelefono validadorTelefono, FormateadorTelefono formateadorTelefono){
        this.validadorTelefono = validadorTelefono;
        this.formateadorTelefono = formateadorTelefono;
    }

    public static void main(String[] args) {

        SpringApplication.run(Postwork4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre. ");
        String nombre = scanner.nextLine();

        System.out.println("Introduce el número: ");
        String numero = scanner.nextLine();

        if (validadorTelefono.isValido(numero)){
            numero = validadorTelefono.limpiaNumero(numero);
            numero = formateadorTelefono.formatea(numero);

            Persona persona = new Persona(nombre, numero);

            System.out.println(persona);
        } else {
            System.out.println("El número no es válido");
        }
    }

}
