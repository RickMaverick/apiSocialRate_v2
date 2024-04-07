package com.example.apiSocialRate_v2.controller;

import com.example.apiSocialRate_v2.controller.dto.EventoDTO;
import com.example.apiSocialRate_v2.model.Evento;
import com.example.apiSocialRate_v2.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    private EventoService eventoService;

    @Autowired
    public EventoController(EventoService eventoService){this.eventoService = eventoService;}

    @GetMapping
    public ResponseEntity<List<Evento>> getTodosEventos(){
        return ResponseEntity.ok(eventoService.listarTodosEventos());
    }

    @PostMapping
    public ResponseEntity<Evento> postEvento(@RequestBody EventoDTO eventoDTO){
        return ResponseEntity.ok(eventoService.cadastrarEvento(eventoDTO));
    }

}
