package Foro_Hub.api.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private String idUsuario;
    @Getter
    private String mensaje;
    @Getter
    private String nombreCurso;
    @Getter
    private String titulo;

    @Column(name = "fechaCreacion", updatable = false)
    private LocalDateTime fechaCreacion;

    public Topico(@Valid DatosRegistroTopico datosRegistroTopico) {
        this.mensaje = datosRegistroTopico.mensaje();
        this.nombreCurso = datosRegistroTopico.nombreCurso();
        this.titulo = datosRegistroTopico.titulo();
    }

    // Método para asignar la fecha y hora al momento de la persistencia
    @PrePersist
    public void prePersist() {
        this.fechaCreacion = LocalDateTime.now();  // Asigna la fecha y hora al momento de la persistencia
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
    }
}
