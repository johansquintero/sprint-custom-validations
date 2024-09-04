package com.app.annotations;

import com.app.annotations.validator.ValidNameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented//INSCRIBIR EN EL JAVADOC
@Constraint(validatedBy = ValidNameValidator.class)
@Retention(RetentionPolicy.RUNTIME)//SE EJECUTA LA ANOTACION AL MOMENTO DE CORRER LA APLICACION
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface ValidName {
    String message() default "{name.error.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
