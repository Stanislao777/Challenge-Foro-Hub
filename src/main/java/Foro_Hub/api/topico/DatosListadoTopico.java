package Foro_Hub.api.topico;

public record DatosListadoTopico(String mensaje, String nombreCurso, String titulo) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getMensaje(), topico.getNombreCurso(), topico.getTitulo());
    }
}
