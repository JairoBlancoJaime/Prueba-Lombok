package org.iesvdm.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;

}
