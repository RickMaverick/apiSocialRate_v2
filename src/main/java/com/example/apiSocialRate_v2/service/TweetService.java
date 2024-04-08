package com.example.apiSocialRate_v2.service;

import com.example.apiSocialRate_v2.controller.dto.TweetDTO;
import com.example.apiSocialRate_v2.model.Tweet;
import com.example.apiSocialRate_v2.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TweetService {
    private TweetRepository tweetRepository;

    @Autowired
    public TweetService(TweetRepository tweetRepository){this.tweetRepository = tweetRepository;}

    public List<Tweet> listarTodosTweets(){return tweetRepository.findAll();}

    @Transactional(propagation = Propagation.REQUIRED)
    public Tweet cadastrarTweet(TweetDTO tweetDTO){
        Tweet novoTweet = new Tweet(tweetDTO);
        return tweetRepository.save(novoTweet);
    }

    public void deletarTweetPorId(Long id){tweetRepository.deleteById(id);}
}
