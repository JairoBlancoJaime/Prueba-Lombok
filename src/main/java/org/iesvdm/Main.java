package org.iesvdm;

import org.iesvdm.modelo.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Jose");
        persona.setApellido("Martin");
        persona.setEmail("jose.michael@gmail.com");
        persona.setDni("12345678A");
        persona.setTelefono("55555555");

        System.out.println(persona);

        Persona persona1 = Persona.builder()
                                            .nombre("Maria")
                                            .apellido("Gomez")
                                            .email("maria.gomez@gmail.com")
                                            .dni("79054487N")
                                            .telefono("777777777")
                                            .build();

        System.out.println(persona1);
    }
}