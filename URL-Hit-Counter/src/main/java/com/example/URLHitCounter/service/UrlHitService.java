package com.example.URLHitCounter.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UrlHitService {

    public Integer hitCount =1;
    HashMap<String, Integer> userHitCounts = new HashMap<>();
    public Integer incrementHitCount() {
        return hitCount++;
    }



    public Integer getUserHitCounter(String username) {
        int userHitCount = userHitCounts.getOrDefault(username, 0);
        userHitCount++;
        userHitCounts.put(username, userHitCount);
        hitCount++;
        return userHitCounts.get(username);
    }


}
