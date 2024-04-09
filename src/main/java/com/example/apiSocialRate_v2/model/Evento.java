package com.example.apiSocialRate_v2.model;

import com.example.apiSocialRate_v2.controller.dto.EventoDTO;
import com.example.apiSocialRate_v2.controller.dto.TweetDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
    @Id
    @GeneratedValue
    private Long idEvento;
    private String nomeEvento;
    private String setorEvento;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private List<Tweet> tweetsEvento;

    //Construtor DTO
    public Evento(EventoDTO eventoDTO){
        this.nomeEvento = eventoDTO.getNomeEvento();
        this.setorEvento = eventoDTO.getSetorEvento();
        this.tweetsEvento = eventoDTO.getTweetsEvento();
    }

}
