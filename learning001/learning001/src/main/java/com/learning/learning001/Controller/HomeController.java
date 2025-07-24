package com.learning.learning001.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @PostMapping("/post")
    public String post(){
        return null;
    }
    @PutMapping("/put")
    public String put(){
        return null;
    }
    @DeleteMapping("/delete")
    public String delete(){
        return "deleted";
    }
    @PatchMapping("/patch")
    public String patch(){
        return null;
    }
    @GetMapping
    public String massage(){
        return "This is home page";
    }


}
