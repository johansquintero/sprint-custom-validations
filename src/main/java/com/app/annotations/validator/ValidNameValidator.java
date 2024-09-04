package com.app.annotations.validator;

import com.app.advice.RegularExpressions;
import com.app.annotations.ValidName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class ValidNameValidator implements ConstraintValidator<ValidName,String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if (s==null||s.isEmpty()){
            return false;
        }
        if (s.length()>30 || s.length()<3) {
            return false;
        }
        if (!Character.isUpperCase(s.charAt(0))){
            return false;
        }
        Pattern pattern = Pattern.compile(RegularExpressions.NOT_NUMERIC_EXPRESSION);
        return pattern.matcher(s).matches();
    }
}
