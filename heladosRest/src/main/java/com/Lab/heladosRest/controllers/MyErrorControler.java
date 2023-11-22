package com.Lab.heladosRest.controllers;

import java.util.Enumeration;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
/*
@RestController
public class MyErrorControler implements ErrorController{

    @RequestMapping("/error")
    public String errorManage(HttpServletRequest request){
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        return "Error " +  status + " en el Servidor";
    }
}*/
