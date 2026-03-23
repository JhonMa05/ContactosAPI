package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class holamundoController {
    @GetMapping("/print")
    public String saluda(){
        return "hola mundo";
    }
    
    @GetMapping("/saluda2/{nombre}/{edad}")
    public String saludoPerson(@PathVariable String nombre,@PathVariable String edad) {
        return "Saluda" + nombre + "¿Cuál es su edad?" + edad;
    }
    
    
}
