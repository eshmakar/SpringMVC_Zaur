package ru.eshmakar.spring.mvc;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    //по умолчанию будет открыватся файл first.view.jsp
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
}
