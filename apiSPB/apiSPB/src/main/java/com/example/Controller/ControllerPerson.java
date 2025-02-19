package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//indicar la manera en la que vamos a trabajar en este caso apiRest.
@RestController 
public class ControllerPerson {


//definir endpoints

//vacio este devuelve una conexion o sea si no conectamos.
    @GetMapping()
    public String index(){
        return "Estamos conectados";
    }
    
}
