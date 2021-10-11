package ru.eshmakar.spring.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//класс для аннотации, здесь указывается логика работы
public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    String endsWith;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endsWith = checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endsWith);//строка должна заканчиватся со значением, который указывается в value
    }
}
