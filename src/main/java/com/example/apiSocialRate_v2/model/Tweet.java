package com.example.apiSocialRate_v2.model;

import com.example.apiSocialRate_v2.controller.dto.TweetDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Tweet {
    @Id
    @GeneratedValue
    private Long idTweet;
    private Long idEvento;
    private String textTweet;
    private Long likeCountTweet;
    private Long replyCountTweet;
    private Long retweetsCountTweet;
    private String langTweet;

    //Contstrutor vazio
    public Tweet(){

    }

    //Construtor Cheio
    public Tweet(Long idTweet, Long idEvento, String textTweet, Long likeCountTweet, Long replyCountTweet, Long retweetsCountTweet, String langTweet) {
        this.idTweet = idTweet;
        this.idEvento = idEvento;
        this.textTweet = textTweet;
        this.likeCountTweet = likeCountTweet;
        this.replyCountTweet = replyCountTweet;
        this.retweetsCountTweet = retweetsCountTweet;
        this.langTweet = langTweet;
    }

    //Construtor DTO
    public Tweet(TweetDTO tweetDTO) {
        this.idEvento = tweetDTO.getIdEvento();
        this.textTweet = tweetDTO.getTextTweet();
        this.likeCountTweet = tweetDTO.getLikeCountTweet();
        this.replyCountTweet = tweetDTO.getReplyCountTweet();
        this.retweetsCountTweet = tweetDTO.getRetweetsCountTweet();
        this.langTweet = tweetDTO.getLangTweet();
    }
}
