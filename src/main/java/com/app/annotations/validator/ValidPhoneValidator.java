package com.app.annotations.validator;

import com.app.advice.RegularExpressions;
import com.app.annotations.ValidPhone;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneValidator implements ConstraintValidator<ValidPhone, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern = Pattern.compile(RegularExpressions.PHONE_NUMBER_EXPRESSION);
        return s != null && !s.isEmpty() && pattern.matcher(s).matches();
    }
}
