package ru.eshmakar.spring.mvc;

import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-employee-details-view";
    }


    @RequestMapping("/showDetails")
    //@ModelAttribute("employee") - объект Employee будем хранить по бину employee
    public String showEmpDetails(@ModelAttribute("employee") Employee empl) {
        //при желании можно менять данные)
        empl.setName("Mr. "+empl.getName());
        empl.setSurname(empl.getSurname()+"!");
        empl.setSalary(empl.getSalary()*10);

        return "show-emp-details-view";
    }

}
