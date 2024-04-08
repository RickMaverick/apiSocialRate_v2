package com.example.apiSocialRate_v2.controller;

import com.example.apiSocialRate_v2.controller.dto.TweetDTO;
import com.example.apiSocialRate_v2.model.Tweet;
import com.example.apiSocialRate_v2.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tweet")
public class TweetController {
    private TweetService tweetService;

    @Autowired
    public TweetController(TweetService tweetService){this.tweetService = tweetService;}

    @GetMapping
    public ResponseEntity<List<Tweet>> getTodosTweets(){
        return ResponseEntity.ok(tweetService.listarTodosTweets());
    }

    @PostMapping
    public ResponseEntity<Tweet> postTweet(@RequestBody TweetDTO tweetDTO){
        return ResponseEntity.ok(tweetService.cadastrarTweet(tweetDTO));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteTweetPorId(@PathVariable Long id){
        tweetService.deletarTweetPorId(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
