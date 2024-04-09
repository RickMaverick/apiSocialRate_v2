package com.example.apiSocialRate_v2.controller.dto;

import com.example.apiSocialRate_v2.model.Tweet;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
public class EventoDTO {
    @Id
    @GeneratedValue
    private String nomeEvento;
    private String setorEvento;
    private List<Tweet> tweetsEvento;
}
