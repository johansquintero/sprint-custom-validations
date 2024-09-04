package com.app.advice;

public final class RegularExpressions {
    public static final String NOT_NUMERIC_EXPRESSION = "^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$";

    public static final String PHONE_NUMBER_EXPRESSION = "^\\+?\\d{0,3}?[-.\\s]?(\\(?\\d{1,4}?\\)?[-.\\s]?)?\\d{1,4}[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}$";

    public static final String ONLY_NUMERIC_EXPRESSION = "^\\d+$";

    public static final String EMAIL_EXPRESSION = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

}
