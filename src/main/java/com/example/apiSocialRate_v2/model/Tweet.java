package com.example.apiSocialRate_v2.model;

import com.example.apiSocialRate_v2.controller.dto.TweetDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tweet {
    @Id
    @GeneratedValue
    private Long idTweet;
    private String textTweet;
    private Long likeCountTweet;
    private Long replyCountTweet;
    private Long retweetsCountTweet;
    private String langTweet;

    public Tweet(TweetDTO tweetDTO) {
        this.textTweet = tweetDTO.getTextTweet();
        this.likeCountTweet = tweetDTO.getLikeCountTweet();
        this.replyCountTweet = getReplyCountTweet();
        this.retweetsCountTweet = tweetDTO.getRetweetsCountTweet();
        this.langTweet = tweetDTO.getLangTweet();
    }
}
