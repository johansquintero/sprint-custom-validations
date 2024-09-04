package com.app.dto;

import com.app.annotations.ValidName;
import com.app.annotations.ValidPhone;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    @ValidName
    private String name;

    @ValidName
    private String lastName;

    @Email(message = "{email.error.message}")
    private String email;

    @ValidPhone
    private String phone;

    @Min(value = 18, message = "{age.error.message}")
    private byte age;

    @Digits(integer = 2, fraction = 3, message = "{heigth.error.messag}")
    private double height;

    private boolean married;

    @Past(message = "{past.date.error.message}")
    //@future
    private LocalDate dateOfBirth;

    @Valid
    private DepartmentDTO departmentDTO;
}

//===================VALIDACIONES MAS COMUNES=====================
//@NotNull
//@NotBlank //no vacio y no nulo
//@NotEmpty //listas no vacias
//
//para numeros
//@Min()
//@Max()
//
//tamano de caracteres
//@Size(min =, max =)

//para fechas
//@Past
//@future

//@CreditCardNumber