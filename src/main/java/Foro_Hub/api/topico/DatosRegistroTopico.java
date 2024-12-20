package Foro_Hub.api.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(

        @NotBlank
        String idUsuario,
        @NotBlank
        String mensaje,
        @NotBlank
        String nombreCurso,
        @NotBlank
        String titulo) {
}
