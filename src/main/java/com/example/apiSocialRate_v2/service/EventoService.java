package com.example.apiSocialRate_v2.service;

import com.example.apiSocialRate_v2.controller.dto.EventoDTO;
import com.example.apiSocialRate_v2.model.Evento;
import com.example.apiSocialRate_v2.repository.EventoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {
    private EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository){this.eventoRepository = eventoRepository;}

    //Lista eventos
    public List<Evento> listarTodosEventos(){return eventoRepository.findAll();}

    // Cadastra evento
    @Transactional(propagation = Propagation.REQUIRED)
    public Evento cadastrarEvento(EventoDTO eventoDTO){
        Evento novoEvento = new Evento(eventoDTO);
        return eventoRepository.save(novoEvento);
    }

    //Atualiza evento
    @Transactional(propagation = Propagation.REQUIRED)
    public Optional<Evento> atualizarEvento(Long id, EventoDTO eventoUpdate) {
        Optional<Evento> eventoOptional = eventoRepository.findById(id);
        if (eventoOptional.isPresent()) {
            Evento evento = eventoOptional.get();
             evento.setNomeEvento(eventoUpdate.getNomeEvento());
             evento.setSetorEvento(eventoUpdate.getSetorEvento());
            return Optional.of(eventoRepository.save(evento));
        } else {
            return Optional.empty(); // ou você pode lançar uma exceção, dependendo da lógica do seu aplicativo
        }
    }

    //Deleta eventos
    public void deletarEventoPorId(Long id){eventoRepository.deleteById(id);
    }
}
