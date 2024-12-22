package Foro_Hub.api.controller;

import Foro_Hub.api.topico.DatosListadoTopico;
import Foro_Hub.api.topico.DatosRegistroTopico;
import Foro_Hub.api.topico.Topico;
import Foro_Hub.api.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosListadoTopico> listadoTopicos(@PageableDefault(size = 2) Pageable paginacion) {
        //return topicoRepository.findAll(paginacion).map(DatosListadoTopico::new);
        Pageable paginacionConOrden = PageRequest.of(paginacion.getPageNumber(), paginacion.getPageSize(), Sort.by(Sort.Order.desc("id")));
        return topicoRepository.findAll(paginacionConOrden).map(DatosListadoTopico::new);
    }

    @PutMapping
    public void actualizarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {}
}
