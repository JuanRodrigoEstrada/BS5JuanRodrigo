package com.bosonit.BS5JuanRodrigo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Slf4j
public class controlador {

    Logger logger = (Logger)LoggerFactory.getLogger(controlador.class);


    @GetMapping("/error")
    public void getError(){

        logger.error("Hola , este es un mensaje de error");
    }
    @GetMapping("/warning")
    public void getWarning(){
        logger.warn("Hola, este es un mensaje de warning que saldrá por pantalla ");
    }
    @GetMapping("/info")
    public void getInfo(){
        logger.info("Hola , soy un mensaje que sirve para obtener información");
    }

}
