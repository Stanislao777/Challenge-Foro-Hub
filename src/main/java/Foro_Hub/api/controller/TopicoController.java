package Foro_Hub.api.controller;

import Foro_Hub.api.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<DatosListadoTopico> registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
        // Guardar el nuevo Topico en la base de datos
        Topico nuevoTopico = topicoRepository.save(new Topico(datosRegistroTopico));
        // Crear el DTO para devolver con los datos del nuevo Topico
        return ResponseEntity.status(HttpStatus.CREATED)
                             .body(new DatosListadoTopico(nuevoTopico));
    }

    @GetMapping
    public Page<DatosListadoTopico> listadoTopicos(@PageableDefault(size = 2) Pageable paginacion) {
        //return topicoRepository.findAll(paginacion).map(DatosListadoTopico::new);
        Pageable paginacionConOrden = PageRequest.of(paginacion.getPageNumber(), paginacion.getPageSize(), Sort.by(Sort.Order.desc("id")));
        return topicoRepository.findAll(paginacionConOrden).map(DatosListadoTopico::new);
    }

    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
    }
}
