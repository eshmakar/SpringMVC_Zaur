package ru.eshmakar.spring.mvc;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


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
    //@Valid - используется для проверки валидности введенных данных
    //BindingResult - с помощью этого интерфейса можем получить состояние, произошла ошибка при заполнении данных или нет
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee empl, BindingResult bindingResult) {
        if (bindingResult.hasErrors())//если есть ошибка, возвращаем эту жу страницу
            return "ask-employee-details-view";
        else
            return "show-emp-details-view";
    }
}
