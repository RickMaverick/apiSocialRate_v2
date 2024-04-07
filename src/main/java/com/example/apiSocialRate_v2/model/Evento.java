package com.example.apiSocialRate_v2.model;

import com.example.apiSocialRate_v2.controller.dto.EventoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Evento {
    @Id
    @GeneratedValue
    private Long idEvento;
    private String nomeEvento;
    private String setorEvento;

    //Construtor vazio
    public Evento(){

    }

    //Construtor cheio
    public Evento(Long idEvento, String nomeEvento, String setorEvento){
        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.setorEvento = setorEvento;
    }

    //Construtor DTO
    public Evento(EventoDTO eventoDTO){
        this.nomeEvento = eventoDTO.getNomeEvento();
        this.setorEvento = eventoDTO.getSetorEvento();
    }

}
