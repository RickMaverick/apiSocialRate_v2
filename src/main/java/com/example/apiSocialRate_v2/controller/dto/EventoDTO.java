package com.example.apiSocialRate_v2.controller.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class EventoDTO {
    @Id
    @GeneratedValue
    private String nomeEvento;
    private String setorEvento;
}
