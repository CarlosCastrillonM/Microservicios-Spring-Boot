package com.example.rsc.webserver.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public String handleError() {
        // Retorna un mensaje o vista personalizada de error.
        return "Pagina no encontrada o error en el servidor.";
    }
}
