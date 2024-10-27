package br.com.bruno.parking.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @Operation(hidden = true)
    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}
