package ru.eshmakar.spring.mvc.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//создаем собственные аннотации
@Target(ElementType.FIELD)//чтобы применять в поле String
@Retention(RetentionPolicy.RUNTIME)//как долго должна жить, runtime - пока прога работает
@Constraint(validatedBy = CheckEmailValidator.class)//из какого класса создать аннотацию
public @interface CheckEmail {
    public String value() default "xyz.com";//значение по умолчании
    public String message() default "must be ends with xyz.com";//сообщение по умолчании

    public Class<?>[] groups() default {};//без этого не сработает
    public Class<? extends Payload>[] payload() default {};//без этого не сработает

}
