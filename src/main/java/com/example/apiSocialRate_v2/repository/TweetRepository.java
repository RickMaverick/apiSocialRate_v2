package com.example.apiSocialRate_v2.repository;

import com.example.apiSocialRate_v2.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
