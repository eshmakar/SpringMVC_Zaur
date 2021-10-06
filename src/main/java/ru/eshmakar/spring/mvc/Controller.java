package ru.eshmakar.spring.mvc;

import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@org.springframework.stereotype.Controller
public class Controller {

    //по умолчанию будет открыватся файл first.view.jsp
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-employee-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    //все что ввели юзер в поле ввода текста это HttpServletRequest и через request мы получаем данные
//    //то что получили через request, сохраняем в переменную и добавляем в модел, чтобы потом использовать с модели эти данные
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);//добавляем в модель по имени nameAttribute - то что ввел юзер
//        model.addAttribute("description", " - udemy instructor");//можем добавить сколько угодно моделей
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    //вместо HttpServletRequest можно использовать @RequestParam, в скобках указывается переменная employeeName, а так же переменная String
    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr. " + empName + "!";
        model.addAttribute("nameAttribute", empName);
        return "show-emp-details-view";
    }

}
