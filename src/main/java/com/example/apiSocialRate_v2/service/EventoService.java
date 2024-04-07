package com.example.apiSocialRate_v2.service;

import com.example.apiSocialRate_v2.controller.dto.EventoDTO;
import com.example.apiSocialRate_v2.model.Evento;
import com.example.apiSocialRate_v2.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {
    private EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository){this.eventoRepository = eventoRepository;}

    public List<Evento> listarTodosEventos(){return eventoRepository.findAll();}

    public Evento cadastrarEvento(EventoDTO eventoDTO){
        Evento novoEvento = new Evento(eventoDTO);
        return eventoRepository.save(novoEvento);
    }
}
