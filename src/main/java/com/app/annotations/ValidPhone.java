package com.app.annotations;

import com.app.annotations.validator.ValidPhoneValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ValidPhoneValidator.class)
public @interface ValidPhone {
    String message() default "{phone.error.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
