package com.riki.belajarmaven.web;

import com.riki.belajarmaven.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello/{id}")
    ResponseEntity<String> getHelloMessage(@PathVariable(name = "id") Long id) {

        String helloMessage = "<center><u><h1>" + (helloService.getHello(id)).getHelloMessage() + "</h1></u></center>";
        return new ResponseEntity<>(helloMessage, HttpStatus.OK);

        // return new ResponseEntity<>((helloService.getHello(id)).getHelloMessage(), HttpStatus.OK);

    }
}
