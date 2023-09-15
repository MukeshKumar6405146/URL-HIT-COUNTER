package com.example.URLHitCounter.controller;

import com.example.URLHitCounter.service.UrlHitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")

public class UrlHitController {
private final UrlHitService urlHitService;

public UrlHitController(UrlHitService urlHitService){
    this.urlHitService=urlHitService;
}

@GetMapping("count")
    public Integer getHitCount(){
    return urlHitService.incrementHitCount();
}

    @GetMapping("{username}/count")
    public String getUserHitCount(@PathVariable String username){
    Integer temp = urlHitService.getUserHitCounter(username);
    String s = username + " , \n " + "  HitCount" + " : " + temp;
    return "{ Username" + " : "+s+" }";
    }

}
