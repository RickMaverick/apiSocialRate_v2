package com.example.apiSocialRate_v2.controller.dto;

import lombok.Data;

@Data
public class TweetDTO {
    private String textTweet;
    private Long likeCountTweet;
    private Long replyCountTweet;
    private Long retweetsCountTweet;
    private String langTweet;
}
