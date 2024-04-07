package com.example.apiSocialRate_v2.controller.dto;

import com.example.apiSocialRate_v2.model.Evento;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class TweetDTO {
    private Long idEvento;
    private String textTweet;
    private Long likeCountTweet;
    private Long replyCountTweet;
    private Long retweetsCountTweet;
    private String langTweet;
}
