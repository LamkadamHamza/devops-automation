package com.example.devopsintegration.web;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/test")
  public   String    afficher (){
    return "welcomme hamza";
  }
}
